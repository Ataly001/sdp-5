import java.util.Objects;
public class Calculator {
    private OperationStrategy strategy;
    public Calculator(OperationStrategy strategy) {
        setStrategy(strategy);
    }
    public void setStrategy(OperationStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }
    public double calculate(double a, double b) {
        double result = strategy.execute(a, b);
        if (!Double.isFinite(result)) {
            throw new ArithmeticException("Invalid calculation result");
        }
        return result;
    }
}
