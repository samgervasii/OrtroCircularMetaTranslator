def calc(b,c):
    return b+c

rev func(x,y):
    x += calc(1,1)
    return x,y

rev ass(x):
    (i,j) = x
    i += 3
    return i,j

rev fi(x,y,z):
    if x==3 :
        y += 3
        if y == 3:
            z+= 3   
    return x,y,z



