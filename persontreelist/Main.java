package persontreelist;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String space = " ";

        Person person1 = new PersonByNameComparator("Kuba", "Kakarekokko", 11, 0);
        Person person2 = new PersonByNameComparator("Alicja", "Kupagówna", 34, 1000);
        Person person3 = new PersonByNameComparator("Karolek", "Agbs", 44, 234.56);
        Person person4 = new PersonByNameComparator("Bolek", "Sławomireczek", 23, 111111.34);

       Set<Person> treeSetPerson = new TreeSet<>();

        treeSetPerson.add(person1);
        treeSetPerson.add(person2);
        treeSetPerson.add(person3);
        treeSetPerson.add(person4);

        for (Person person : treeSetPerson) {
            System.out.println(person.getName() + space + person.getLastName() + space + person.getAge() + space + person.getIncome());
        }

    }
}

