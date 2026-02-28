import java.util.Scanner;

public class Main{
    //static DataClass dataClass = new DataClass();
    public static void main(String args[]){
        
        String[] operators = {"+", "-", "*", "/"};
        Scanner scan = new Scanner(System.in);
        
        try{
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
            DataClass dataClass = new DataClass(numberA, numberB);
            int result = dataClass.CoreCalculator(chooseOperator);
            if(result == 404){
                System.out.println("Такого математического оператора нет");
            }
            else{
                System.out.println("Ответ: " + result);
            }
            
        }
        catch (Exception e){
            System.out.println("Возникла ошибка");
        }
    }
}