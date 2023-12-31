package org.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {

    public static class None extends Throwable {
        public static final long serialVersionUID = 1;
    }

    Class<? extends Throwable> expected() default None.class;

    long timeout() default 0;
}
