
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;

    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        } else {
            return;
        }

    }

    public int totalWeight() {

        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();

        }
        return weight;

    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);

        }
    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }
        Item heaviestObject = this.items.get(0);
        for (Item item : this.items) {
            if (heaviestObject.getWeight() < item.getWeight()) {
                heaviestObject = item;
            }

        }
        return heaviestObject;
    }

    @Override
    public String toString() {

        if (items.isEmpty()) {
            return "no items(0kg)";
        } else if (items.size() == 1) {

            return items.size() + " item(" + totalWeight() + ")kg";

        }

        return items.size() + " items(" + totalWeight() + ")kg";
    }

}
