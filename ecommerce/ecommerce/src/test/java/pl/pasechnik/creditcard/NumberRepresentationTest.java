package pl.pasechnik.creditcard;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class NumberRepresentationTest {

    @Test
    void doubleRepresentation() {
        double a = 0.02;
        double b = 0.03;
        System.out.println("Double:");
        System.out.println(b-a);
    }

    @Test
    void floatRepresentation(){
        float a = 0.002f;
        float b = 0.003f;
        System.out.println("Float:");
        System.out.println(b-a);
    }

    @Test
    void bigDecimalRepresentation() {
        BigDecimal a = new BigDecimal("0.02");
        BigDecimal b = new BigDecimal("0.03");

        System.out.println("Big decimal:");
        System.out.println(b.subtract(a));
    }
}
