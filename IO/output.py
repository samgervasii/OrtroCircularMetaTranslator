def calc ( b , c ) : 
    return b + c 
def func_fwd ( x , y , yi ) :
    x += calc ( 1 , 1 ) 
    y += yi 
    return x , y , yi , 
def func_bwd ( yi , x , y ) :
    y -= yi 
    x -= calc ( 1 , 1 ) 
    return yi , x , y 
def ass_fwd ( x , y ) :
    ( i , j ) = y 
    i += 3 
    return i , j , x 
def ass_bwd ( x , i , j ) :
    i -= 3 
    y  = ( i , j )
    return x , y 
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
for i in range ( 3 , 11 , 2 ) : 
        x += 3     return x , i , j , z 
def branch_bwd ( x , i , j , z ) :
for i in range ( 3 , 11 , 2 ) : 
        x -= 3     x -= 3 
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
