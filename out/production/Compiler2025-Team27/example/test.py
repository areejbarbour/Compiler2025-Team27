from flask import Flask, render_template, request, redirect, url_for
app = Flask("app")
products =[{"name": "Laptop", "price": 1200, "details": "High performance laptop","image": "https://via.placeholder.com/150"},{"name": "Phone", "price": 700, "details": "Smartphone","image": "https://via.placeholder.com/150"}]

@app.route("/products")
def view_products():
    return render_template("products.html", products_list=products)

@app.route("/add_product", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        name = request.form.get("name")
        price = request.form.get("price")
        details = request.form.get("details")
        image = request.form.get("image")

        products.append({"name": name,"price": price,"details": details,"image": image})

        return redirect(url_for("view_products"))

    return render_template("add_product.html")

@app.route("/products/<product_name>")
def product_details(product_name):
    found_product = None
    for p in products:
        if p["name"] == product_name:
            found_product = p
            break

    return render_template("product_details.html", product=found_product)

@app.route("/delete_product/<product_name>")
def delete_product(product_name):
    for p in products:
        if p["name"] == product_name:
            products.remove(p)
            break

    return redirect(url_for("view_products"))

if __name__ == "__main__":
    app.run(debug=True)

