
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("");
        
        String[] stringArray = {"9","8","6", "1"};
        System.out.println(Arrays.toString(stringArray));
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        System.out.println("");
        
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(24);
        System.out.println(arrayList);
        sortIntegers(arrayList);
        System.out.println(arrayList);
        System.out.println("");
        
        ArrayList<String> stringList= new ArrayList<>();
        stringList.add("4");
        stringList.add("5");
        stringList.add("2");
        stringList.add("8");
        stringList.add("9");
        stringList.add("76");
        System.out.println(stringList);
        sortStrings(stringList);
        System.out.println(stringList);
    
    }
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    public static void sort(String[]array){
        Arrays.sort(array);
       
    }
    public static void sortIntegers(ArrayList<Integer>integers){
        Collections.sort(integers);
        
    }
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        
    }

}
