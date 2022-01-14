def calc ( b , c ) : 
    return b + c 
def func_fwd( x , y ) :
    x += calc ( 1 , 1 ) 
    return x , y 
def func_bwd( x , y ) :
    x -= calc ( 1 , 1 ) 
    return  x , y 
def exect ( ) : 
    x = 3 
    y = 5 
    print ( ( x , y ) ) 
    f = func_fwd ( x , y ) 
    print ( f ) 
    f = func_bwd ( f [ 0 ] , f [ 1 ] ) 
    print ( f ) 
exect ( ) 
def ass_fwd( x ) :
    ( i , j ) = x 
    i += 3 
    return i , j 
def ass_bwd( i , j ) :
    i -= 3 
    x  = ( i , j )
    return  x 
