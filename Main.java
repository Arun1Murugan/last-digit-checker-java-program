public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(hasSameLastDigit(13, 22, 924));
    }
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        // 10(inclusive) to 1000(inclusive)
        if((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <= 1000)
                                             && (number3 >= 10 && number3 <= 1000)){
            int number1LastDigit = number1 % 10;
            int number2LastDigit = number2 % 10;
            int number3LastDigit = number3 % 10;
            if((number1LastDigit == number2LastDigit) || (number1LastDigit == number3LastDigit)){
                return true;
            }else{
                return false;
            }
        }
        return false;

    }
}