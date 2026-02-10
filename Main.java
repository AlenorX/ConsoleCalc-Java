import java.util.*;

public class Main{
    public static class Data{
        int numberFirst;
        int numderSecond; 
        int result;
    }

    
    public static void main(String args[]){
        Data data = new Data();
        String[] operators = {"1) +", "2) -", "3) *","4) /"};
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Выберите операцию:");
            for (String string : operators) { System.out.println(string);}
            int choose = scan.nextInt();
            System.out.println("Введите первое число или цифру");
            int a = scan.nextInt();
            System.out.println("Введите второе число или цифру");
            int b = scan.nextInt();
            data.numberFirst = a;
            data.numderSecond = b;
            if(choose == 1){
                data.result = Addition(a, b);
                System.out.println("Итог:" + data.result);
            
            }
            else if (choose == 2){
                data.result = Subtraction(a, b);
                System.out.println("Итог:" + data.result);
            }
            else if(choose == 3){
                data.result = Multiplication(a, b);
                System.out.println("Итог:" + data.result);
            }
            else if(choose == 4){
                data.result = Division(a, b);
                System.out.println("Итог:" + data.result);
            }
            else{
                System.out.println("Неправильный выбор");
            }
            
        } catch (Exception e) {
            System.out.println("Возникла ошибка");
        }
        
    } 

    public static int Addition(int a, int b){
        int example = a + b;
        return example;
    }

    public static int Subtraction(int a, int b){
        int example = a - b;
        return example;
    }

    public static int Multiplication(int a, int b){
        int example = a * b;
        return example;
    }

    public static int Division(int a, int b){
        int example = a / b;
        return example;
    }
}