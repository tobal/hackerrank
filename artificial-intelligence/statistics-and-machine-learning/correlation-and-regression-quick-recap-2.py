import numpy as np

phy = np.array([15, 12, 8, 8, 7, 7, 7, 6, 5, 3])
hist = np.array([10, 25, 17, 11, 13, 17, 20, 13, 9, 15])
slope = float(len(phy) * sum(phy * hist) - sum(phy) * sum(hist)) / (len(phy) * sum(phy * 2) - sum(phy) * 2)

print(slope)
