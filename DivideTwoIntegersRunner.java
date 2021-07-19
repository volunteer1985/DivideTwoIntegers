public class DivideTwoIntegersRunner {
    public static int divide(int divident, int divisor){
        int result = 0;
        if( divisor == 0){
            System.out.println("Incorrect action");
        }
        else{
            for (; divident >= divisor; divident -= divisor){
                result++;

            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(divide(123, 0));

    }
}
