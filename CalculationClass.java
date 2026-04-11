public class CalculationClass extends BaseCalculator implements ICalculable{

    public CalculationClass(int operator, int[] numbers){
        super(operator, numbers);
    }
    
    public String Solution(){
        return ICalculable.super.Сore(super.selectedOperator, super.numbers);
    }
}
