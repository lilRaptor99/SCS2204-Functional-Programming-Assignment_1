object Main extends App{
    def isEven(n:Int):Boolean={
        if(n==0) true
        else isOdd(n-1)
    }

    def isOdd(n:Int):Boolean={
        !isEven(n)
    }
    
    println(isEven(5))
    println(isEven(6))
    println(isOdd(7))
    println(isEven(111))
}