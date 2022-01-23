def calc(b,c):
    return b+c

rev func(x,y,yi):
    x += calc(1,1)
    y += yi
    return x,y,yi

rev ass(x,y):
    (i,j) = y
    i += 3
    return i,j,x

rev branch(x,y,z,k):
    if x == 3 :
        (i,j) = y
        z += 51
    else :
        (i,j) = y
        k += 5
    return x,y,z,k



