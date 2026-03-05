public class CalculatorClass extends DataClass{

    public CalculatorClass(int operator, int[] numbers){
        super(operator, numbers);
    }

    public int Calculate(){
        if(super.operator == 1){
            return Additon();
        }
        else if(super.operator == 2){
            return Subtraction();
        }
        else if(super.operator == 3){
            return Multiplication();
        }
        else if(super.operator == 4){
            return Division();
        }
        else{
            return 404;
        }
    }

    @Override
    public int Additon(){
        return super.numbers[0] + super.numbers[1];
    }

    @Override
    public int Subtraction(){
        return super.numbers[0] - super.numbers[1];
    }

    @Override
    public int Multiplication(){
        return super.numbers[0] * super.numbers[1];
    }
    @Override
    public int Division(){
        return super.numbers[0] / super.numbers[1];
    }
}
