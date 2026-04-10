public abstract class BaseCalculator {

    protected int selectedOperator;
    protected int[] numbers;
    
    public BaseCalculator(int operator, int[] numbers){
        this.selectedOperator = operator;
        this.numbers = numbers;
    }
}
