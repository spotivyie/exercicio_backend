package anotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface Anotacao {
	//ler a anotação chamada tabela ler o valor em tempo de execução e imprimir 
	//o nome da tabela no console
    String value();

    String[] bairros();

    long numeroCasa();

    double valores() default 10d;
}