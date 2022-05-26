rev revSum(a,b):
    a += b
    c = (a,b)
    return c

rev revAddOneIfEven(x,y,k,z):
    for x in range(z):
        if(k%2 == 0):
            y += 1

    return x,y,k,z

