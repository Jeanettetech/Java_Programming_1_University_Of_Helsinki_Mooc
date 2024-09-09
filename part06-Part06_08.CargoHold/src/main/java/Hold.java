
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase>suitcases;
  
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + holdListWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        } else {
            return;

        }

    }

    public int holdListWeight() {

        int weight = 0;
        for (Suitcase s : suitcases) {
            weight += s.totalWeight();

        }
        return weight;

    }
    public void printItems(){
        for (Suitcase suitcase:suitcases){
            suitcase.printItems();
            
            
            
        }
    }

    @Override
    public String toString() {
          if (suitcases.isEmpty()) {
            return "no items(0kg)";
        } else if (suitcases.size() == 1) {

            return suitcases.size() + " suitcase(" + holdListWeight() + ")kg";

        }

        return suitcases.size() + " suitcases(" + holdListWeight() + ")kg";
    }

}
