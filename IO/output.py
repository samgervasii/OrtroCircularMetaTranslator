def ciao_fwd( x , y ) :
    x += a ( y , x , 3 ) 
    y -= 10 
    return x , y 
def ciao_bwd( x , y ) :
    y += 10 
    x -= a ( y , x , 3 ) 
    return x , y 
def a ( b , c , d ) : 
    return b + c + d 
def main ( ) : 
    x = 3 
    y = 5 
    f = ciao_fwd ( x , y ) 
    print ( f ) 
    b = ciao_bwd ( f [ 0 ] , f [ 1 ] ) 
    print ( b ) 
main ( ) 
