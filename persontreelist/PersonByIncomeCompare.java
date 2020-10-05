package persontreelist;

public class PersonByIncomeCompare extends Person implements Comparable<Person> {
    public PersonByIncomeCompare(String name, String lastName, int age, double income) {
        super(name, lastName, age, income);
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
