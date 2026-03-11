import java.util.Scanner;



public class Main{

    static Scanner scan = new Scanner(System.in);
    static CalculationСlass calc = new CalculationСlass();
    public static void main(String args[]){
        String[] operators = {"+", "-", "*", "/"};
        try{
            int choose = Choose(operators, "Select a mathematical operator:");
            int[] numbers = InputNumbers();
            calc.SetValue(choose, numbers);
            int result = calc.Output();
            System.out.println("Ответ: " + result);
           
        }
        catch (Exception e){
            System.out.println("Data error");
        }
    }

    public static int Choose(String[] obj, String text){
        System.out.println(text);
        for(int i = 0; i < obj.length; i++){
            int index = i+1;
            String result = String.format("%s)", index);
            System.out.println(result + obj[i]);
        }
        int inputData = scan.nextInt();
        return inputData;
    }

    public static int[] InputNumbers(){


        System.out.println("Enter the first numder or digit:");
        int numberFirst = scan.nextInt();
        System.out.println("Enter the second number or digit: ");
        int numberSecond = scan.nextInt();
        int[] resultCollection = {numberFirst, numberSecond};
        return resultCollection;
    }
}