object Main extends App{
    def isEven(n:Int):Boolean={
        if(n==0) true
        else isOdd(n-1)
    }

    def isOdd(n:Int):Boolean={
        !isEven(n)
    }

    def sum(n:Int):Int={
        if(n<=0) 0
        else if(isEven(n)) n + sum(n-1)
        else sum(n-1)
    }
    
    println(sum(5))
}