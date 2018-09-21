import java.util.Scanner;


    public class homework05ex1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double one = 0;
            double rez = 0;
            boolean yes = true;
            while (1 == 1) {
                if(yes == false) {
                    //System.out.print("Write a number: ");
                    one = rez;
                }else if (yes == true){
                    System.out.print("Write a number: ");
                    one = in.nextDouble();
                }
                String op = in.next();
                double two = in.nextDouble();

                if (op.equals("+")) {
                    rez = one + two;
                }


                if (op.equals("-")) {
                    rez = one - two;
                }

                if (op.equals("*")) {
                    rez = one * two;
                }


                if (op.equals("/")) {
                    rez = one + two;
                }
                System.out.println(rez);
                System.out.println("Delete?");
                String arg = in.next();

                if (arg.equals("y")) {
                    yes = true;
                }
                else {
                    one = rez;
                    yes = false;

                }
            }




        }
    }



