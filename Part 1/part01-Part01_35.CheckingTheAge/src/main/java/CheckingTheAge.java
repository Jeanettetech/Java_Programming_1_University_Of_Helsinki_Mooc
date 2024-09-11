
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int input1 =Integer.valueOf(scan.nextLine());
        if (input1 >= 0 &&  input1 <=120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible");
        }
        

    }
}
