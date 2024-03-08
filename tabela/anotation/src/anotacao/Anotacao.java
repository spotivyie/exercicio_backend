package anotacao;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface Anotacao {

    String value();

    String[] bairros();

    long numeroCasa();

    double valores() default 10d;
}

