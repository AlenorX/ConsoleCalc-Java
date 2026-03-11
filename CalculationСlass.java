public class CalculationСlass extends Data implements Calculable{


    public void SetValue(int operator, int[] numbers){
        super.selectedOperator = operator;
        super.numberFirst = numbers[0];
        super.numberSecond = numbers[1];
    }

    public int Output(){
       int result = calc(super.selectedOperator, super.numberFirst, super.numberFirst);
       return result;
    }

    @Override
    public int calc(int operator, int a, int b){
        switch(operator) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 404;
        }
    }


}
