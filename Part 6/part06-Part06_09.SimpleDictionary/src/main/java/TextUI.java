
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeane
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
            
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start(){

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
                
            }else if (command.equals("add")){
                System.out.println("word:");
                String word = scanner.nextLine();
                System.out.println("Translation");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
                
            }else if(command.equals("search")){
                System.out.println("To be translated");
                String word = scanner.nextLine();
                String translation = this.dictionary.translate(word);
                if(translation == null){
                    System.out.println("Word "+word+" was not found");
                }else{
                    System.out.println("Translation: "+translation);
                }
            }else{
                System.out.println("Unknown command");
            }
        }
    }
}
        
        
            
 