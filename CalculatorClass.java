public class CalculatorClass extends DataClass{

    public CalculatorClass(int operator, int[] numbers){
        super(operator, numbers);
    }

    public int Calculate(){
        if(super.operator == 1){
            return super.numbersInt[0] + super.numbersInt[1];
        }
        else if(super.operator == 2){
            return super.numbersInt[0] - super.numbersInt[1];
        }
        else if(super.operator == 3){
            return super.numbersInt[0] * super.numbersInt[1];
        }
        else if(super.operator == 4){
            return super.numbersInt[0] / super.numbersInt[1];
        }
        else{
            return 404;
        }
    }

}
