package Sundy20191124;

import java.util.HashSet;

public class DemoPerson {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<Person>();
        persons.add(new Person("a",11));
        persons.add(new Person("b",10));
        persons.add(new Person("b",10));
        persons.add(new Person("c",25));
        persons.add(new Person("d",19));
        persons.add(new Person("e",17));

        for(Person person:persons){
            System.out.println(person);
        }

    }

}