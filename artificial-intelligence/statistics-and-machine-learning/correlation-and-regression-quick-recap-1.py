import pandas as pd

scores = pd.DataFrame({
    'Physics': pd.Series([15, 12, 8, 8, 7, 7, 7, 6, 5, 3]),
    'History': pd.Series([10, 25, 17, 11, 13, 17, 20, 13, 9, 15])
})

print(scores.corr(method='pearson'))
