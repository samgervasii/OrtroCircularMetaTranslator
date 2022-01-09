def calc(b,c):
    return b+c
rev func(x,y):
    x += calc(0,1)
    return x,y
def exect():
    x = 3
    y = 5
    print((x,y))
    f = func_fwd(x,y)
    print(f)
    f = func_bwd(f[0],f[1])
    print(f)
exect()