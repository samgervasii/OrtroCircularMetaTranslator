rev revSum(a,b):
    a += b
    c = (a,b)
    return c

rev revAddOneIfEven(x,y,z,k):
    for x in range(z):
        if(k%2 == 0):
            y += 1

    return x,y,z,k

def main():
    x = 5
    y = 6
    sum = revSum_fwd(x,y)
    print(sum[0] == x+y)
    print(sum[0])
    print(revSum_bwd(sum) == (x,y))
    print(revSum_bwd(sum))
    print(revAddOneIfEven_fwd(0,y,3,2))
    print(revAddOneIfEven_fwd(0,y,3,3))
    print(revAddOneIfEven_fwd(0,y,3,4))
    print(revAddOneIfEven_fwd(0,y,3,2)[1] == revAddOneIfEven_fwd(0,y,3,4)[1])
    var = revAddOneIfEven_fwd(0,y,3,4)
    print(revAddOneIfEven_bwd(var[0],var[1],var[2],var[3]))

if __name__ == "__main__":
    main()
