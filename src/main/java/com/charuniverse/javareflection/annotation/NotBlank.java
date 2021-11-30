package com.charuniverse.javareflection.annotation;

import java.lang.annotation.*;

@Documented
@Target({
        ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {

    boolean allowEmptyString() default false;

}
