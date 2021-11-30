package com.charuniverse.javareflection;

import com.charuniverse.javareflection.data.Person;
import org.junit.jupiter.api.Test;

public class SuperClassTest {

    @Test
    void testSuperClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass  );

        Class<? super Person> objectClass = personClass.getSuperclass();
        System.out.println(objectClass);

        Class<? super Person> nullCLass = objectClass.getSuperclass();
        System.out.println(nullCLass);
    }
}
