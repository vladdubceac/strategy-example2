package learning.vladdubceac.strategy;

public class OperationSubstract implements Operation {
    @Override
    public double doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
