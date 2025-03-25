package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Roger  ", "Male", "Married"));
        persons.add(new Person("Rafael", "Male", "Married"));
        persons.add(new Person("Eugenie", "Female", "Single"));
        persons.add(new Person("Justine", "Female", "Single"));
        persons.add(new Person("Maria  ","Female", "Married"));
        persons.add(new Person("Grigor", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria maleAndSingle = new AndCriteria(male, single);
        Criteria femaleOrSingle = new OrCriteria(female, single);

        System.out.println("Males: ");
        showPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        showPersons(female.meetCriteria(persons));

        System.out.println("\nSingles: ");
        showPersons(single.meetCriteria(persons));

        System.out.println("\nMale and Single: ");
        showPersons(maleAndSingle.meetCriteria(persons));

        System.out.println("\nFemale or Single: ");
        showPersons(femaleOrSingle.meetCriteria(persons));

    }

    public static void showPersons(List<Person> persons) {
        persons.forEach(person -> System.out.println("\tName: "+person.getName()+
                "\tGender: "+person.getGender()+
                "\tMarital Status: "+person.getMaritalStatus()));
    }
}
