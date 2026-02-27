import java.util.Scanner;

public class Main{
    static DataClass dataClass = new DataClass();
    public static void main(String args[]){
        
        String[] operators = {"+", "-", "*", "/"};
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Выберите математический оператор");
        for(int i = 0; i < operators.length; i++){

            int test = i+1;
            String result = String.format("%s)", test);
            System.out.println(result + operators[i]);
        }
        
        int chooseOperator = scan.nextInt();
        System.out.println("Впишите первую цифру или число");
        int numberA = scan.nextInt();
        System.out.println("Впишите вторую цифру или число");
        int numberB = scan.nextInt();
        SaveData(numberA, numberB);
        int result = dataClass.CoreCalculator(chooseOperator);
        System.out.println("Ответ: " + result);

    }

    public static void SaveData(int a, int b){
        dataClass.SetValue(a, b);
    }

    
}