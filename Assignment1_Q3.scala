object Assignment1_Q3 extends App{
    def bookCost()=24.95*60*0.6;
    def shippingCost()=3.0 + 10*0.75;
    def totalCost()=bookCost() + shippingCost();
    
    println(totalCost());
}