package persontreelist;

public class PersonByNameComparator extends Person implements Comparable<Person> {

    public PersonByNameComparator(String name, String lastName, int age, double income) {
        super(name, lastName, age, income);
    }

    @Override
    public int compareTo(Person person) {
        return getName().compareTo(person.getName());
    }
}
