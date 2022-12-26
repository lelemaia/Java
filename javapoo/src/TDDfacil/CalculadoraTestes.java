package TDDfacil;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTestes {
    @Test
    public void deveriaSomarDoisNumerosPositivos() {

        Calculadora calc1 = new Calculadora();
        int soma = calc1.somar(3, 7);

        Assert.assertEquals(10, soma);
    }
}