public class Task6 {
    public static void main(String[] args){
        int tea = 5;
        int candy = 4;
        if (tea<5 && candy < 50){
            System.out.println("0");

        } else if (tea >=5 && candy >=5) {
            System.out.println("1");
            
        } else if ((tea >= 2*candy) || (candy >= 2*tea)) {
            System.out.println("2");
            
        }else {
            System.out.println("1");
        }

    }
}
