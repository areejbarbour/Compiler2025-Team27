x = 10
x = "text"

a = 5
b = "hello"
if a > b:
    print(a)

y = []
y = [1, 2, 3]     # ✅ ما لازم يطلع خطأ هلق

d = {}
d = {"key": "value"}   # ✅ ما لازم يطلع خطأ هلق

z = [1, 2, 3]
z = "text"        # 🔴 لسا لازم يطلع خطأ (LIST<INT> مش UNKNOWN جواها)

c = 10
n = "hello"

c = n
