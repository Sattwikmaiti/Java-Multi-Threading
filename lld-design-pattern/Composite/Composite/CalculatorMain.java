package Composite;

public class CalculatorMain {
    public static void main(String[] args) {


        /*
         *   +
         * 3   * 
         *    4  + 
         *      5  3  
         * 
         */
        Number n5 = new Number(5);
        Number n3 = new Number(3);
        Number n4 = new Number(4);
        Number n2 = new Number(3);

        Expression e1 = new Expression(n5, n3, '+');//last expressiong
        Expression e2 = new Expression(e1, n4, '*');
        Expression e3 = new Expression(e2, n2, '+');
        System.out.println(e3.calculate());
       



    }
    
}
