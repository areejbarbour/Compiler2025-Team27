from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

products = [{"name": "Laptop", "price": 1800, "details": "High performance laptop", "image": "https://sm.mashable.com/t/mashable_sea/feature/r/rip-macboo/rip-macbook-apples-ultimate-lightweight-workhorse_uyk2.2496.png"}, {"name": "Phone", "price": 1300, "details": "Smartphone with good camera", "image": "https://m.media-amazon.com/images/I/71ddhabs2mL._AC_SL1500_.jpg"}, {"name": "Headphones", "price": 300, "details": "Noise-cancelling", "image": "https://www.dealmonday.co.uk/image/cache/wp/gp/Apple/apple-airpods-max-usbc-midnight-3-2400x2400.webp"}]

@app.route("/")
@app.route("/products")
def view_products():
    return render_template("index.jinja", products_list=products, title="قائمة المنتجات")

@app.route("/add_product", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        new_product = {"name": request.form.get("name"), "price": request.form.get("price"), "details": request.form.get("details"), "image": request.form.get("image")}
        products.append(new_product)
        return redirect(url_for("view_products"))
    return render_template("add_product.jinja")

@app.route("/products/<product_name>")
def product_details(product_name):
    found = None
    for p in products:
        if p["name"] == product_name:
            found = p
    return render_template("product_details.jinja", product=found)

@app.route("/edit_product/<product_name>", methods=["GET", "POST"])
def edit_product(product_name):
    found = None
    for p in products:
        if p["name"] == product_name:
            found = p
    if request.method == "POST":
        updated_product = {"name": request.form.get("name"), "price": request.form.get("price"), "details": request.form.get("details"), "image": request.form.get("image")}
        products.remove(found)
        products.append(updated_product)
        return redirect(url_for("view_products"))
    return render_template("edit_product.jinja", product=found)

@app.route("/delete_product/<product_name>")
def delete_product(product_name):
    for p in products:
        if p["name"] == product_name:
            products.remove(p)
    return redirect(url_for("view_products"))

if __name__ == "__main__":
    app.run(debug=True)

