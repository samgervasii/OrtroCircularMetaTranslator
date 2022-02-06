def branch_fwd ( x , y , z ) :
    if x == 3 : 
        ( i , j ) = y 
        z += 51 
        if i == 3 : 
            j += 2 
            z -= 5 
    else : 
        ( i , j ) = y 
        j += 22 
    x += 3 
    return x , i , j , z 
def branch_bwd ( x , i , j , z ) :
    x -= 3 
    if x == 3 : 
        if i == 3 : 
            z += 5 
            j -= 2 
        z -= 51 
        y  = ( i , j )
    else : 
        j -= 22 
        y  = ( i , j )
    return x , y , z 
def iter_fwd ( x , y , z ) :
    for x in range ( 2 , 6 , 1 ) :
        y += 3 
        ( i , j ) = z 
    return x , y , i , j 
def iter_bwd ( x , y , i , j ) :
    for x in reversed ( range ( 2 , 6 , 1 )  ) :
        z  = ( i , j )
        y -= 3 
    return x , y , z 
