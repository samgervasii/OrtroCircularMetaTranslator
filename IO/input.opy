rev ciao(x,y):
    x += 4
    y -= 10
    return x,y

def main():
    x = 3
    y = 5
    ciao_fwd(x,y)
    print(x)
    print(y)
    ciao_bwd(x,y)
    print(x)
    print(y)


  main()