package learning.vladdubceac.strategy;

public class OperationAdd implements Operation {
    @Override
    public long doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
