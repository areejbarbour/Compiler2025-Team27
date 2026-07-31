"""
app.py التشغيلي لمجلد output/
يعمل على ملفات HTML المولَّدة (بدون Jinja).
بعد كل إضافة/تعديل/حذف يعيد كتابة ملفات HTML على القرص.
"""

import json
import os
from flask import Flask, request, redirect, url_for

BASE_DIR = os.path.dirname(os.path.abspath(__file__))
DATA_FILE = os.path.join(BASE_DIR, "products_data.json")

app = Flask(__name__, static_folder=BASE_DIR, static_url_path="")

DEFAULT_PRODUCTS = [
    {
        "name": "Laptop",
        "price": 1800,
        "details": "High performance laptop",
        "image": "https://sm.mashable.com/t/mashable_sea/feature/r/rip-macboo/rip-macbook-apples-ultimate-lightweight-workhorse_uyk2.2496.png",
    },
    {
        "name": "Phone",
        "price": 1300,
        "details": "Smartphone with good camera",
        "image": "https://m.media-amazon.com/images/I/71ddhabs2mL._AC_SL1500_.jpg",
    },
    {
        "name": "Headphones",
        "price": 300,
        "details": "Noise-cancelling",
        "image": "https://www.dealmonday.co.uk/image/cache/wp/gp/Apple/apple-airpods-max-usbc-midnight-3-2400x2400.webp",
    },
]


# ==================== تخزين البيانات ====================
def load_products():
    if not os.path.exists(DATA_FILE):
        save_products(DEFAULT_PRODUCTS)
        return list(DEFAULT_PRODUCTS)
    with open(DATA_FILE, "r", encoding="utf-8") as f:
        return json.load(f)


def save_products(products):
    with open(DATA_FILE, "w", encoding="utf-8") as f:
        json.dump(products, f, ensure_ascii=False, indent=2)


def find_product(products, name):
    for p in products:
        if p["name"] == name:
            return p
    return None


# ==================== بناء HTML ====================
PAGE_HEAD = """<!DOCTYPE html>
<html lang="ar">
<head>
    <meta charset="UTF-8">
    <title>{title}</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
<div class="container">
"""

PAGE_TAIL = """</div>
</body>
</html>
"""


def render_index(products):
    cards = []
    for p in products:
        src = p.get("image") or "https://placehold.co/120x120/e8eaf0/888?text=No+Image"
        cards.append(f"""        <div class="product-card">
            <img src="{src}" alt="{p['name']}" class="product-image-thumb"
                 onerror="this.onerror=null;this.src='https://placehold.co/120x120/e8eaf0/888?text=No+Image'">
            <div class="product-info">
                <h3>{p['name']}</h3>
                <p class="price">السعر: {p['price']}</p>
                <p>{p['details']}</p>
                <a href="/products/{p['name']}" class="btn btn-primary">تفاصيل</a>
                <a href="/edit_product/{p['name']}" class="btn btn-secondary">تعديل</a>
                <a href="/delete_product/{p['name']}" class="btn btn-danger">حذف</a>
            </div>
        </div>""")
    body = (
            "    <h1>قائمة المنتجات</h1>\n"
            '    <a href="/add_product" class="btn btn-primary">إضافة منتج</a>\n\n'
            '    <div class="products-list">\n' + "\n".join(cards) + "\n    </div>\n"
    )
    return PAGE_HEAD.format(title="قائمة المنتجات") + body + PAGE_TAIL


def render_add_product():
    body = """    <h1>إضافة منتج</h1>
    <form method="POST" action="/add_product" class="product-form">
        <label>اسم المنتج</label>
        <input type="text" name="name" required>

        <label>السعر</label>
        <input type="number" name="price" required>

        <label>التفاصيل</label>
        <textarea name="details"></textarea>

        <label>رابط الصورة</label>
        <input type="text" name="image" placeholder="https://placehold.co/400x300?text=Product">
        <p class="field-hint">الصق رابط صورة مباشر ليتم عرضها في القائمة والتفاصيل.</p>

        <button type="submit" class="btn btn-primary">إضافة</button>
        <a href="/products" class="btn btn-secondary">رجوع</a>
    </form>
"""
    return PAGE_HEAD.format(title="إضافة منتج") + body + PAGE_TAIL


def render_edit_product(product):
    if product is None:
        body = (
            '    <p>المنتج غير موجود</p>\n'
            '    <a href="/products" class="btn btn-secondary">رجوع للقائمة</a>\n'
        )
        return PAGE_HEAD.format(title="تعديل منتج") + body + PAGE_TAIL

    src = product.get("image") or "https://placehold.co/280x180/e8eaf0/888?text=No+Image"
    body = f"""    <h1>تعديل منتج</h1>
    <div class="image-preview-box">
        <p class="preview-label">معاينة الصورة:</p>
        <img src="{src}" alt="{product['name']}" class="product-image"
             onerror="this.onerror=null;this.src='https://placehold.co/280x180/e8eaf0/888?text=No+Image'">
    </div>
    <form method="POST" action="/edit_product/{product['name']}" class="product-form">
        <label>اسم المنتج</label>
        <input type="text" name="name" value="{product['name']}" required>

        <label>السعر</label>
        <input type="number" name="price" value="{product['price']}" required>

        <label>التفاصيل</label>
        <textarea name="details">{product['details']}</textarea>

        <label>رابط الصورة</label>
        <input type="text" name="image" value="{product.get('image', '')}"
               placeholder="https://placehold.co/400x300?text=Product">
        <p class="field-hint">عدّل الرابط ثم احفظ — ستظهر الصورة الجديدة بعد الحفظ.</p>

        <button type="submit" class="btn btn-primary">حفظ التعديلات</button>
        <a href="/products" class="btn btn-secondary">رجوع</a>
    </form>
"""
    return PAGE_HEAD.format(title="تعديل منتج") + body + PAGE_TAIL


def render_product_details(product):
    if product is None:
        body = (
            '    <p>المنتج غير موجود</p>\n'
            '    <a href="/products" class="btn btn-secondary">رجوع للقائمة</a>\n'
        )
        return PAGE_HEAD.format(title="تفاصيل المنتج") + body + PAGE_TAIL

    src = product.get("image") or "https://placehold.co/280x180/e8eaf0/888?text=No+Image"
    body = f"""    <h2>{product['name']}</h2>
    <img src="{src}" alt="{product['name']}" class="product-image"
         onerror="this.onerror=null;this.src='https://placehold.co/280x180/e8eaf0/888?text=No+Image'">
    <p class="price">السعر: {product['price']}</p>
    <p class="details">{product['details']}</p>
    <a href="/products" class="btn btn-secondary">رجوع للقائمة</a>
"""
    return PAGE_HEAD.format(title="تفاصيل المنتج") + body + PAGE_TAIL


# ==================== كتابة الملفات ====================
def write_file(name, content):
    with open(os.path.join(BASE_DIR, name), "w", encoding="utf-8") as f:
        f.write(content)


def regenerate_index():
    html = render_index(load_products())
    write_file("index.html", html)
    return html


# ==================== المسارات ====================
@app.route("/")
@app.route("/products")
def view_products():
    return regenerate_index()


@app.route("/add_product", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        products = load_products()
        products.append({
            "name": request.form.get("name"),
            "price": request.form.get("price"),
            "details": request.form.get("details"),
            "image": request.form.get("image"),
        })
        save_products(products)
        regenerate_index()
        return redirect(url_for("view_products"))

    html = render_add_product()
    write_file("add_product.html", html)
    return html


@app.route("/products/<product_name>")
def product_details(product_name):
    product = find_product(load_products(), product_name)
    html = render_product_details(product)
    write_file("product_details.html", html)
    return html


@app.route("/edit_product/<product_name>", methods=["GET", "POST"])
def edit_product(product_name):
    products = load_products()
    found = find_product(products, product_name)

    if request.method == "POST":
        updated = {
            "name": request.form.get("name"),
            "price": request.form.get("price"),
            "details": request.form.get("details"),
            "image": request.form.get("image"),
        }
        if found is not None:
            products.remove(found)
        products.append(updated)
        save_products(products)
        regenerate_index()
        return redirect(url_for("view_products"))

    html = render_edit_product(found)
    write_file("edit_product.html", html)
    return html


@app.route("/delete_product/<product_name>")
def delete_product(product_name):
    products = load_products()
    found = find_product(products, product_name)
    if found is not None:
        products.remove(found)
        save_products(products)
    regenerate_index()
    return redirect(url_for("view_products"))


if __name__ == "__main__":
    regenerate_index()
    app.run(debug=True)