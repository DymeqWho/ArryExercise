package persontreelist;

public class PersonByAgeComparator extends Person implements Comparable<Person> {
    public PersonByAgeComparator(String name, String lastName, int age, double income) {
        super(name, lastName, age, income);
    }

    @Override
    public int compareTo(Person person) {
        if (getAge() > person.getAge()) {
            return 1;
        } else if (getAge() < person.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
