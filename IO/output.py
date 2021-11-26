def ciao_fwd( x , y ) :
    x += 4 
    y -= 10 
    return x , y 
def ciao_bwd( x , y ) :
    x += 4 
    y -= 10 
    return x , y 
def main ( ) : 
    x = 3 
    y = 5 
    f = ciao_fwd ( x , y ) 
    print ( f ) 
    b = ciao_bwd ( f [ 0 ] , f [ 1 ] ) 
    print ( b ) 
main ( ) 
