package persontreelist;

public class Person /*implements Comparable<Person>*/ {
    private final String name;
    private final String lastName;
    private final int age;
    private final double income;

    public Person(String name, String lastName, int age, double income) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }


  /* @Override
    public int compareTo(Person person) {

    return lastName.compareTo(person.getLastName());

       @Override
       /*  if (age > person.age) {
            return 1;
        } else if (age < person.age) {
            return -1;
        } else {
            return 0;
        }*/
}


