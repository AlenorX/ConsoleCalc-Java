public class DataClass{

    private int numberFirst;
    private int numberSecond;

    public void SetValue(int a, int b){
        this.numberFirst = a;
        this.numberSecond = b;
    }

    public int[] GetValue(){
        return new int[]{this.numberFirst, this.numberSecond};
    }

    public int CoreCalculator(int operator){
        
        if(operator == 1){
            int result = Addition();
            return result;
        }
        else if(operator == 2){
            int result = Subtractions();
            return result;
        }
        else if(operator == 3){
            int result = Multiplication();
            return result;
        }
        else if(operator == 4){
            int result = Division();
            return result;
        }
        else{
            return 404;
        }

    }

    public int Addition(){
        int result = numberFirst + numberSecond;
        return result;
    }

    public int Subtractions(){
        int result = numberFirst - numberSecond;
        return result;
    }

    public int Multiplication(){
        int result = numberFirst * numberSecond;
        return result;
    }

    public int Division(){
        int result = numberFirst / numberSecond;
        return result;
    }
}