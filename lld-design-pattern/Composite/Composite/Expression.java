package Composite;

public class Expression implements ExpressionSystem{
    private ExpressionSystem left;
    private ExpressionSystem right;
    private char operator;

    public Expression(ExpressionSystem left, ExpressionSystem right, char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public int calculate() {
        switch (operator) {
            case '+':
                return left.calculate() + right.calculate();
            case '-':
                return left.calculate() - right.calculate();
            case '*':
                return left.calculate() * right.calculate();
            case '/':
                return left.calculate() / right.calculate();
            default:
                return 0;
        }
    }
    
}
