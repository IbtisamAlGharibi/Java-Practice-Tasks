public class Task2 {
    public static void main(String[] args){
        int speed = 65;
        boolean isBirthday = false;

        if (isBirthday == true){
            speed = speed - 5;
            if ( speed <= 65){
                System.out.println("no ticket");
            } else if (speed >= 66 && speed <= 85) {
                System.out.println("small ticket");
                
            }else {
                System.out.println("big ticket");
            }
        }else {
            if (speed<=60){
                System.out.println("no ticket");
            } else if (speed >=61 && speed <=80) {
                System.out.println("small ticket");
                
            }else {
                System.out.println("big ticket");
            }
        }


    }
}
