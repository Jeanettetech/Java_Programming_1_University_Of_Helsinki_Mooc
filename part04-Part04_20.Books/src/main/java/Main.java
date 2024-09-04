import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        int maximumDuration=0;
        while(true) {
            System.out.println("Title: ");
            String title =scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title,pages,year));
            
        }
            
        System.out.print("What information will be printed?");
        String input = scanner.nextLine();

        for(Book info:books){
            if (input.equals("everything")){
                System.out.println(info);
                
            }else if(input.equals("name")){
                System.out.println(info.getTitle());
                   
            }
        }
    }
}
            
            
        // implement here the program that allows the user to enter 
        // book information and to examine them

