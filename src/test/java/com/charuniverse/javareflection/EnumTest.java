package com.charuniverse.javareflection;

import com.charuniverse.javareflection.data.Gender;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EnumTest {

    @Test
    void testGetEnum() {
        Class<Gender> genderClass = Gender.class;

        System.out.println(genderClass.getName());
        System.out.println(genderClass.getSuperclass());
        System.out.println(Arrays.toString(genderClass.getEnumConstants()));
        System.out.println(Arrays.toString(genderClass.getDeclaredFields()));
        System.out.println(Arrays.toString(genderClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(genderClass.getDeclaredMethods()));
    }

}
