package p648m.p668e;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.runners.MethodSorters;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: m.e.g */
/* compiled from: FixMethodOrder */
public @interface C9691g {
    MethodSorters value() default MethodSorters.DEFAULT;
}
