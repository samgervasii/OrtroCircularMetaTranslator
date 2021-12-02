rev ciao(x,y):
    x += a(y,1,3)
    y -= 10
    return x,y

def a(b,c,d):
    return b+c+d

def main():
    x = 3
    y = 5
    f = ciao_fwd(x,y)
    print(f)
    b = ciao_bwd(f[0],f[1])
    print(b)


  main()