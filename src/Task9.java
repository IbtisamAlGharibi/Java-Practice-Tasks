public class Task9 {
    public static void main(String[] args){
        int a = 22;
        int b =14;

        if (a == b){
            System.out.println("0");
        } else if ((a % 5) == (b % 5)) {
            if (a>b){
                System.out.println(b);
            }else {
                System.out.println(a);
            }

        }else {
            if (a>b){
                System.out.println(a);
            }else {
                System.out.println(b);
            }


        }

    }
}
