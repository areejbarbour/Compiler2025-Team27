# ============================================================
# ملف اختبار شامل لأخطاء التحليل الدلالي في Python
# يحتوي على كل أنواع الأخطاء التي يكتشفها PythonASTBuilderVisitor
# ============================================================

# 1) Type mismatch - assignment (INT -> STRING)
x = 10
x = "text"

# 2) Type mismatch - assignment (LIST -> STRING)
z = [1, 2, 3]
z = "text"

# 3) Type mismatch - comparison (INT vs STRING)
a = 5
b = "hello"
if a > b:
    print(a)

# 4) Not iterable (for loop over INT)
n = 10
for i in n:
    print(i)

# 5) Not callable (call an INT)
m = 5
m()

# 6) Not subscriptable (index an INT)
k = 30
print(k[0])

# 7) Variable not defined
print(undefined_var)

# 8) Variable out of scope
def load_users():
    users = ["Ali", "Sara"]
    return users

print(users)

# 9) Function already defined
def foo():
    return 1

def foo():
    return 2

# 10) Duplicate parameter
def bar(p, p):
    return p

# 11) Function not defined
unknown_func()

# 12) Object not defined (decorator on undefined module)
@unknown_app.route("/test")
def test_route():
    return "ok"

# 13) Type mismatch again (cross assign)
c = 10
d = "hello"
c = d
