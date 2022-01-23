package edu.cvtc.comparator;

import edu.cvtc.model.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
