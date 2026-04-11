public interface  ICalculable {
    default String Сore(int operator, int[] numbers){
        return Сalculation(operator, numbers);
    }

    private String Сalculation(int operator, int[] numbers){
        if(operator == 1){
            int solve = numbers[0] + numbers[1];
            return String.valueOf(solve);
        }
        else if(operator == 2){
            int solve = numbers[0] - numbers[1];
            return String.valueOf(solve);
        }
        else if(operator == 3){
            int solve = numbers[0] * numbers[1];
            return String.valueOf(solve);
        }
        else if(operator == 4){
            int solve = numbers[0] / numbers[1];
            return String.valueOf(solve);
        }
        else{
            return "Такого оператора нет в списке";
        }

    }
}
