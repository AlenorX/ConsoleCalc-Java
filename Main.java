import java.util.Scanner;

public class Main{

    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        String[] operators = {"+", "-", "*", "/"};
        try{
            int choose = Choose(operators, "Выберите математический оператор:");
            int[] numbers = InputNumbers();
            CalculatorClass calculator = new CalculatorClass(choose, numbers);
            int result = calculator.Calculate();
            System.out.println("Ответ: " + result);
        }
        catch (Exception e){
            System.out.println("Возникла ошибка");
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

        System.out.println("Введите первое число или цифру");
        int numberFirst = scan.nextInt();
        System.out.println("Введите второе число или цифру");
        int numberSecond = scan.nextInt();
        int[] resultCollection = {numberFirst, numberSecond};
        return resultCollection;
    }
}