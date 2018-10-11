if __name__ == '__main__':
    n = int(input())
    weird = False
    if n % 2 != 0: weird = True
    else:
        if 6 <= n <= 20: weird = True
    if weird: print("Weird")
    else: print("Not Weird")
