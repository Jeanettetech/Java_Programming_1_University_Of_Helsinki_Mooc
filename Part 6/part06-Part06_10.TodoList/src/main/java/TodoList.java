
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeane
 */
public class TodoList {

    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {

        todoList.add(task);
    }

    public void print() {
        int index = 1;

        for (String item : todoList) {
            System.out.println(index + ": " + item);
            index++;
        }

    }

    public void remove(int number) {
        
        todoList.remove(number -1);



    }

}