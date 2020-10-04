package listshomework;

import java.util.*;

public class ListOfStringsMain {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Lorem");
        listOfStrings.add("ipSum");
        listOfStrings.add("Dolor");
        listOfStrings.add("kakarekokko");
        listOfStrings.add("sit");
        listOfStrings.add("aMeT");
        listOfStrings.add("queueueue");

        System.out.println("Listy: ");

        System.out.println(listOfStrings);

        Collections.sort(listOfStrings);
        System.out.println(listOfStrings);
        System.out.println();
        System.out.println("Sety: ");

        //Najpierw sortuje to co ma wielkie litery alfabetycznie, potem sortuje to, co zaczyna się z małej litery alfabetycznie


        Set<String> setStringow = new HashSet<>();
        setStringow.add("Lorem");
        setStringow.add("Lorem");
        setStringow.add("Lorem");
        setStringow.add("Ipsum!");
        System.out.println(setStringow);
        int setStringowIlosc = setStringow.size();
        System.out.println("unikatowe Stringi: " + setStringowIlosc);

        //Set nie przyjmuje duplikatów


        //comparator
        System.out.println();
        System.out.println("sortowanie po długości elementów: ");
        Collections.sort(listOfStrings, Comparator.comparing(String::length));
        System.out.println(listOfStrings);

    }
}
