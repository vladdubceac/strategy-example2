package learning.vladdubceac.strategy;

public class StrategyContext {
    public double doOperation(Operation operation, int num1, int num2){
       return operation.doOperation(num1, num2);
    }

}
