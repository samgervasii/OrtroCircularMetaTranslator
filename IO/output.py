def revSum_fwd ( a , b ) :
    a += b 
    c  = ( a , b )
    return c 
def revSum_bwd ( c ) :
    ( a , b ) = c 
    a -= b 
    return a , b 
def revAddOneIfEven_fwd ( x , y , k , z ) :
    for x in range ( z ) :
        if ( k % 2 == 0 ) : 
            y += 1 
    return x , y , k , z 
def revAddOneIfEven_bwd ( x , y , z , k ) :
    for x in reversed ( range ( z )  ) :
        if ( k % 2 == 0 ) : 
            y -= 1 
    return x , y , z , k 
