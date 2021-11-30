package com.charuniverse.javareflection;

import com.charuniverse.javareflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

    @Test
    void testArrayClass() {
        Class<String[]> aClass = String[].class;
        Class<int[]> aClass1 = int[].class;
        Class<Person> personClass = Person.class;

        System.out.println(aClass.isArray());
        System.out.println(aClass1.isArray());
        System.out.println(personClass.isArray());
    }

    @Test
    void testArrayMember() {
        Class<String[]> aClass = String[].class;

        System.out.println(Arrays.toString(aClass.getDeclaredFields()));
        System.out.println(Arrays.toString(aClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(aClass.getDeclaredMethods()));
        System.out.println(aClass.getComponentType());
    }

    @Test
    void testArrayManipulation() {
        Class<String[]> aClass = String[].class;

        String[] array = (String[]) Array.newInstance(aClass.getComponentType(), 10);
        Array.set(array, 0, "Hello");
        Array.set(array, 1, "World");

        System.out.println(Arrays.toString(array));
    }
}
