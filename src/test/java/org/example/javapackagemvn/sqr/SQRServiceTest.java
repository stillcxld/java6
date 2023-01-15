package org.example.javapackagemvn.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.CalcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAnotherExact() {
        SQRService service = new SQRService();
        int expected = 9;
        int actual = service.CalcSqrt(400, 800);
        Assertions.assertEquals(expected, actual);
    }
}
