
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for");
        String search = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            
            while(fileScanner.hasNextLine()){
                String row =fileScanner.nextLine();
                
                if (row.equals(search)){
                isFound = true;   
                }
            }
            if(isFound == true){
                System.out.println("Found");
            }else{
                System.out.println("Not found");
            }
            
            
        }catch( Exception e) {
            System.out.println("Reading the file"+ file+"failed");
        }
        
       
    }
}
