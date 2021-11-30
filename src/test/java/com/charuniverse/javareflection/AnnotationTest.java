package com.charuniverse.javareflection;

import com.charuniverse.javareflection.data.Person;
import com.charuniverse.javareflection.validation.Validator;
import org.junit.jupiter.api.Test;

public class AnnotationTest {

    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {
        Person person = new Person("Hello", " ");
        Validator.validateNotBlank(person);
    }
}
