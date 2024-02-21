package rvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
public static void main(String[] args) {
SpringApplication.run(App.class, args);
}

public static void Money(){
Money macins1 = new Money(0, 3);
Money macins2 = new Money(0, 3);
Money kopejais_macins = macins1.plus(macins2);
System.out.println();
System.out.println("Kopā abos maciņos ir " + kopejais_macins);
System.out.println("Pirmajā maciņa ir vairāk nekā otrajā" + macins1.lessThan(macins2));
Money Starp_macins = macins1.minus(macins2);
System.out.println("Atņemot no pirmā maciņa otro, paliek" + Starp_macins + "eiro");
System.out.println("pirmais un otrais maciņš ir vienāds: " + macins1.equals(macins2));
}

//public static void smallest(){
// int[] array = {3, 2, 5, 4, 8};
// int smallest = Sorter.smallest(array);
// System.out.println("Smallest: " + smallest);
//}
public static void indexOfSmallest(){
    int[] array = {3, 2, 5, 4, 8};
    int index = findIndexOfSmallest(array);
    System.out.println("Index of smallest number: " + index);
}

public static int findIndexOfSmallest(int[] array) {
    int smallest = array[0];
    int index = 0;
    for (int i = 1; i < array.length; i++) {
        if (array[i] < smallest) {
            smallest = array[i];
            index = i;
        }
    }
    return index;
}

}