public class Task14 {
    public static void main(String[] args){

        int n = 5;

        if ((n % 3 == 0) && (n % 5 == 0)) {
            System.out.println("False");
        } else if ((n % 3 == 0) || (n % 5 == 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}