
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
public class Room {
    private ArrayList<Person>persons;
    
    public Room(){
        this.persons= new ArrayList<>();
    }
    public void add(Person person){
        this.persons.add(person);
    }
    public boolean isEmpty(){
        if(this.persons.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    public Person shortest(){
        if (this.persons.isEmpty()) {
            return null;
        }
        Person returnObject = this.persons.get(0);
        for (Person item : this.persons) {
            if (returnObject.getHeight() > item.getHeight()) {
                returnObject = item;
            }
        }

        return returnObject;
    }
    public Person take(){
         if (this.persons.isEmpty()) {
            return null;
        }
         Person shortestPerson = shortest();
         this.persons.remove(shortest());
        return shortestPerson;

    }

}
