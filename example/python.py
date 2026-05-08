


products =[{"name": "Laptop", "price": 1200, "details": "High performance laptop"},{"name": "Phone", "price": 700, "details": "Smartphone with good camera"},{"name": "Headphones", "price": 150, "details": "Noise-cancelling"}]

@app.route("/products")
def view_products():
    return render_template("products.html", products_list = products)

@app.route("/add_product")
def add_product(new_product):
    products.append(new_product)
    return render_template("products.html", products_list=products)

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

    return render_template("products.html", products_list=products)


