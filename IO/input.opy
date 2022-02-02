def calc(b,c):
    return b+c

rev func(x,y,yi):
    x += calc(1,1)
    y += yi
    return x,y,yi,

rev ass(x,y):
    (i,j) = y
    i += 3
    return i,j,x

rev branch(x,y,z):
    if x == 3 :
        (i,j) = y
        z += 51
        if i == 3 :
            j += 2
            z -= 5
    else :
        (i,j) = y
        j += 22
    x += 3
    for i in range(3,11,2):
        x += 3
    return x,i,j,z






