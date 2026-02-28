public class DataClass{

    protected int numberFirst;
    protected int numberSecond;

    public DataClass(int a, int b){
        this.numberFirst = a;
        this.numberSecond = b;
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