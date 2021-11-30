package com.charuniverse.javareflection;

import com.charuniverse.javareflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {

    @Test
    void testGetFields() {
        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType().getName());
        }
    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Hello", "World");
        String person1FirstName = (String) firstName.get(person1);
        System.out.println(person1FirstName);

        Person person2 = new Person("Yahaha", "Hayuk");
        String person2FirstName = (String) firstName.get(person2);
        System.out.println(person2FirstName);
    }

    @Test
    void testSetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Hello", "World");
        firstName.set(person1, "Yahaha");
        System.out.println(person1.getFirstName());

        Person person2 = new Person("Yahaha", "Hayuk");
        firstName.set(person2, "Hello");
        System.out.println(person2.getFirstName());
    }
}
