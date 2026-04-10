public class CalculationClass extends BaseCalculator implements Calculable {

    public CalculationClass(int operator, int[] numbers){
        super(operator, numbers);
    }
    
    public int core(){
        if(super.selectedOperator == 1){
            return super.numbers[0] + super.numbers[1];
        }
        else if(super.selectedOperator == 2){
            return super.numbers[0] - super.numbers[1];
        }
        else if(super.selectedOperator == 3){
            return super.numbers[0] * super.numbers[1];
        }
        else if(super.selectedOperator == 4){
            return super.numbers[0] / super.numbers[1];
        }
        else{
            return 404;
        }
    }

    
    
}
