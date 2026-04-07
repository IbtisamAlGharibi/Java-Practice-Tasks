public class Task10 {
    public static void main(String[] args){
        int a = 4;
        int b =6;
        int c = 8;

        int sum1 = a+b;
        int sum2 = a+c;
        int sum3 = b+c;

            if ((sum1 == 10) || (sum2 == 10) || (sum3 == 10)){
                System.out.println("10");
            } else if ((sum1 > 10 + sum2) || (sum1 > 10 + sum3)) {
                System.out.println("5");

            }else {
                System.out.println("0");

            }
    }

}
