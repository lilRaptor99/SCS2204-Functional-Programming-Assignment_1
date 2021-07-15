object Main extends App{
    def fib(n:Int):Int={
        if(n<=0) 0
        else if(n==1) 1
        else fib(n-1) + fib(n-2)
    }
    
    def printFib(n:Int):Unit={
        if(n>0) printFib(n-1)
        println(fib(n))
    }

    printFib(10)
    
}