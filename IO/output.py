def calc ( b , c ) : 
    return b + c 
def func_fwd ( x , y ) :
    x += calc ( 1 , 1 ) 
    return x , y 
def func_bwd ( x , y ) :
    x -= calc ( 1 , 1 ) 
    return x , y 
def ass_fwd ( x ) :
    ( i , j ) = x 
    i += 3 
    return i , j 
def ass_bwd ( i , j ) :
    i -= 3 
    x  = ( i , j )
    return x 
def fi_fwd ( x , y , z ) :
    if x == 3 : 
        y += 3 
        if y == 3 : 
            z += 3 
    return x , y , z 
def fi_bwd ( x , y , z ) :
    if x == 3 : 
        y -= 3 
        if y == 3 : 
            z -= 3 
    return x , y , z 
