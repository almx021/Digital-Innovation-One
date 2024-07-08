package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonOrdener {
    private List<Person> personList;

    public PersonOrdener() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        personList.add(new Person(name, age, height));
    }

    public List<Person> orderByAge(){
        List<Person> peopleByAge = new ArrayList<>(personList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Person> orderByHeight(){
        List<Person> peopleByHeight = new ArrayList<>(personList);
        Collections.sort(peopleByHeight, new HeightComparator());
        return peopleByHeight;
    }
}
