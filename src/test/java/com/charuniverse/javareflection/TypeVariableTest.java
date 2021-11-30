package com.charuniverse.javareflection;

import com.charuniverse.javareflection.data.Data;
import org.junit.jupiter.api.Test;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class TypeVariableTest {

    @Test
    void testTypeVariable() {
        Class<Data> dataClass = Data.class;

        for (TypeVariable<Class<Data>> typeVariable : dataClass.getTypeParameters()) {
            System.out.println(typeVariable.getName());
            System.out.println(Arrays.toString(typeVariable.getBounds()));
            System.out.println(typeVariable.getGenericDeclaration());
        }
    }
}
