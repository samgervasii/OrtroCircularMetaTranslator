def calc ( b , c , d ) : 
    return b + c + d 
def func_fwd( x , y ) :
    x += calc ( y , 1 , 3 ) 
    y -= x 
    return x , y 
def func_bwd( x , y ) :
    y += x 
    x -= calc ( y , 1 , 3 ) 
    return x , y 
def exect ( ) : 
    x = 3 
    y = 5 
    print ( ( x , y ) ) 
    f = func_fwd ( x , y ) 
    print ( f ) 
    f = func_bwd ( f [ 0 ] , f [ 1 ] ) 
    print ( f ) 
exect ( ) 
