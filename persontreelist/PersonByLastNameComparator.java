package persontreelist;

public class PersonByLastNameComparator extends Person implements Comparable<Person> {
    public PersonByLastNameComparator(String name, String lastName, int age, double income) {
        super(name, lastName, age, income);
    }

    @Override
    public int compareTo(Person person) {
        return getLastName().compareTo(person.getLastName());
    }
}
