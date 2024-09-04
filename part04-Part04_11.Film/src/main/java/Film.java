/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeane
 */
public class Film {
    private String name;
    private int ageRating;
    
    public Film(String filmname, int filmAgeRating){
        this.name = filmname;
        this.ageRating = filmAgeRating;
    }
    public String name(){
        return name;
    }
    public int ageRating(){
        return ageRating;
    }
            
}
