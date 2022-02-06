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
    return x,i,j,z


rev iter(x,y,z):
    for x in range(2,6,1):
        y += 3
        (i,j) = z
    return x,y,i,j



