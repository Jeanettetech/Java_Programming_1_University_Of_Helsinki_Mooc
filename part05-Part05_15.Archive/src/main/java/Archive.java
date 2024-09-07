/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeane
 */
public class Archive {
    
    private String identifier;
    private String name;
    Archive comparedArchive;
    

    public Archive(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }
        comparedArchive = (Archive)compared;
        
        if (this.identifier.equals(comparedArchive.identifier))
        {
            
            return true;
        }
    
        return false; 
    }
        

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

}

   
    
    
    

