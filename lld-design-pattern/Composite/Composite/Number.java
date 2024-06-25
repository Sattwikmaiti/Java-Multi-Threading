package Composite;

public class Number implements ExpressionSystem {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int calculate() {
        return number;
    }
    
}
