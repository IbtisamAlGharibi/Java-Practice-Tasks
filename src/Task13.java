public class Task13 {
    public static void main(String[] args){
        int n = 2;
        boolean outsideMode = false;

        if (outsideMode == false){
            if (n>=1 &&  n <= 10){
                System.out.println("True");
            }else {
                System.out.println("False");
            }

        }else if (outsideMode == true){
            if(n <= 1 && n>= 10){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }else {
            System.out.println("False");
        }

    }
}
