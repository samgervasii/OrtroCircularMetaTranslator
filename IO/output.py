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
def ass_fwd ( x ) :
    ( i , j ) = x 
    j += 3 
    return i , j 
def ass_bwd ( i , j ) :
    j -= 3 
    x  = ( i , j )
    return x 
