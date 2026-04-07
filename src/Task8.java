public class Task8 {
    public static void main(String[] args){
        int a = 22;
        int b = 42;
        int c =64;

        if ((a % 10 ==  b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10)){

            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
