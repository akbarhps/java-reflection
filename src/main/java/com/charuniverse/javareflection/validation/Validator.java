package com.charuniverse.javareflection.validation;

import com.charuniverse.javareflection.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {

    public static void validateNotBlank(Object obj) throws IllegalAccessException {
        Class<?> aClass = obj.getClass();

        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);

            NotBlank nb = field.getAnnotation(NotBlank.class);
            if (nb != null) {
                String value = (String) field.get(obj);

                if (!nb.allowEmptyString()) value = value.trim();
                if (value.isEmpty()) {
                    throw new RuntimeException("Field " + field.getName() + " can't be empty");
                }
            }
        }
    }
}
