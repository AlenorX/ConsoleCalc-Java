public abstract class DataClass{

    protected int operator;
    protected int[] numbers;


    public DataClass(int operator, int[] numbers){
        this.operator = operator;
        this.numbers = numbers;
    }
    public abstract int Additon();

    public abstract int Subtraction();

    public abstract int Multiplication();

    public abstract int Division();


}