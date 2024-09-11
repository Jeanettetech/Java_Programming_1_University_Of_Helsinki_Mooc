
import java.nio.file.Paths;
import java.util.ArrayList;
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
public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner, ArrayList<Recipe> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        readFile();
        showCommands();
        while (true) {
            String cmd = askCommand();
            int check = readCommand(cmd);
            if (check == -1) {
                break;
            }
        }

    }

    public void readFile() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        String recipes = "";
        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();

                if (line.equals("")) {
                    recipes += line + "\n";
                } else {
                    recipes += line + ",";
                }

            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        addToCollection(recipes);

    }

    public void showCommands() {
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

    public String askCommand() {
        System.out.print("Enter command: ");
        return askWord();
    }

    public int readCommand(String command) {
        if (command.equals("list")) {
            commandList();
            return 1;
        }

        if (command.equals("stop")) {
            return -1;
        }

        if (command.equals("find name")) {
            findCommand();
            return 1;
        }

        if (command.equals("find cooking time")) {
            cookingTime();
            return 1;
        }
        
        if (command.equals("find ingredient")) {
            findIngredients();
            return 1;
        }

        return 1;
    }

    public void addToCollection(String recipesList) {

        String[] recipe = recipesList.split("\n");
        for (int i = 0; i < recipe.length; i++) {
            Recipe recipes = new Recipe();
            recipes.add(recipe[i]);
            this.recipes.add(recipes);
        }
    }

    public void commandList() {
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
        System.out.println("");
    }

    public void findCommand() {
        System.out.print("Searched word :");
        String wrd = askWord();
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(wrd)) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public String askWord() {
        String word = scanner.nextLine();
        return word;
    }

    public void cookingTime() {
        System.out.print("Max cooking time: ");
        int time = Integer.valueOf(askWord());
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if(recipe.getTime() <= time){
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
    
    public void findIngredients(){
        System.out.print("Igredient: ");
        String ingridients = askWord();
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if(recipe.getIngredients().contains(ingridients)){
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
}