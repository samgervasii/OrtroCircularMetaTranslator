def ciao_fwd( x , y ) :
    x += 4 
    y -= 10 
    return x , y 
return x , y 
y -= 10 
x += 4 

def main ( ) : 
    x = 3 
    y = 5 
    f = ciao_fwd ( x , y ) 
    print ( f ) 
    b = ciao_bwd ( f [ 0 ] , f [ 1 ] ) 
    print ( b ) 
main ( ) 
