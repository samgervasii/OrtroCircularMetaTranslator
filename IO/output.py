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
    z  = ( x , y )
    z += 3 
    return z 
def ass_bwd ( z ) :
    z -= 3 
    ( x , y ) = z 
    return x , y 
