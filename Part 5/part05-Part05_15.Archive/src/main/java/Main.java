
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String identifier;
        String name;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier?(empty will stop)");
            identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name?(empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive archive = new Archive(name, identifier);
            if (archives.contains(archive)) {
                System.out.println("Already on list");
     
            } else {
                archives.add(archive);
            }

        }
        System.out.println("==Items==");
        
        for(Archive archive:archives){
            System.out.println(archive);
        }

    }
}
