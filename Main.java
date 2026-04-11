import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] listWords = new String[] {"Введите первое число или цифру", "Введите второе число или цифру", "Выберите математический оператор [1)+,2)-,3)*,4)%]"};
        int[] resultCycle = new int[3];
        for(int i = 0; i < 3;i++){
            System.out.println(listWords[i]);
            int source = scan.nextInt();
            resultCycle[i] = source;
        }
        CalculationClass calc = new CalculationClass(resultCycle[2], new int[]{resultCycle[0], resultCycle[1]});
        System.out.println("Результат: " + calc.Solution());
    }

}