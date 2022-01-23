def calc ( b , c ) : 
    return b + c 
def func_fwd ( x , y , yi ) :
    x += calc ( 1 , 1 ) 
    y += yi 
    return x , y , yi 
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
def branch_fwd ( x , y , z , k ) :
    if x == 3 : 
        ( i , j ) = y 
        z += 51 
        else : 
        ( i , j ) = y 
        k += 5 
    return x , y , z , k 
def branch_bwd ( x , y , z , k ) :
    if x == 3 : 
        y  = ( i , j )
        z -= 51 
        else : 
        y  = ( i , j )
        k -= 5 
    return x , y , z , k 
