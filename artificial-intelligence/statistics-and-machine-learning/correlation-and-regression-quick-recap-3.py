x = [15 ,12, 8, 8, 7, 7, 7, 6, 5, 3]
y = [10 ,25, 17, 11, 13, 17, 20, 13, 9, 15]
n = len(x)
xy = [x[i] * y[i] for i in range(n)]
x_square = [x[i] * x[i] for i in range(n)]
avg_x = sum(x) / n
avg_y = sum(y) / n
avg_xy = sum(xy) / n
avg_xsqr = sum(x_square) / n
m = ((avg_x * avg_y) - avg_xy) / (avg_x ** 2 - avg_xsqr)
c = avg_y - (m * avg_x)
print(round((m * 10 + c), 2))
