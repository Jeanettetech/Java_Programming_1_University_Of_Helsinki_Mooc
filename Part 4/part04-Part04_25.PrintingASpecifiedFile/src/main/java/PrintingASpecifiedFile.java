
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have it's contents printed?");
        String title =scanner.nextLine();
        
        
        try(Scanner fileScanner = new Scanner(Paths.get(title))){
            
            while(fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }
        }catch( Exception e) {
            System.out.println("Error: "+e.getMessage());
    }
    }
}


 