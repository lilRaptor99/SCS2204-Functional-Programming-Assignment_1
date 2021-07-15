object Main extends App{
    def gcd(x:Int, y:Int):Int={
        if(y==0) x
        else if(x>y) gcd(y, x%y) 
        else gcd(y, x)
    }

    def isPrime(p:Int, n:Int=2):Boolean={
        if(p==n) true
        else if(gcd(p, n) > 1) false
        else isPrime(p, n+1)
    }

    println(isPrime(5))
    println(isPrime(8))
    
}