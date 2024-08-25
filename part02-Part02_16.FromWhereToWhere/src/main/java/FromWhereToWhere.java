
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Write yor program here
        System.out.print("Where to?");
        int finish = Integer.valueOf(scanner.nextLine());
        
        
        System.out.print("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        
        
//        for(int i=1; i <= finish;i++){
//            System.out.println(i);
            
        for(int j = start; j <= finish; j++){
            if(finish >= start){
                System.out.println(j);
            }
        }
            
            
           
        
    }
}

