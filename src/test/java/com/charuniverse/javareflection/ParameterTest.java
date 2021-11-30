package com.charuniverse.javareflection;

import com.charuniverse.javareflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {

    @Test
    void testGetParameter() {
        Class<Person> personClass = Person.class;

        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
            Parameter[] parameters = method.getParameters();

            for (Parameter parameter : parameters) {
                System.out.println("Parameter Name: " + parameter.getName());
                System.out.println("Parameter Type: " + parameter.getType());
            }
            System.out.println("======================================");
        }
    }

    @Test
    void testSetParameter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

        Person person = new Person("Hello", "World");
        System.out.println(person.getFirstName());

        setFirstName.invoke(person, "Nyaru");
        System.out.println(person.getFirstName());
    }
}
