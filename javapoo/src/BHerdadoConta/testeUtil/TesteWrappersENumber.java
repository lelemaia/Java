package BHerdadoConta.testeUtil;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersENumber {
    public static void main(String[] args) {

        Integer num1Ref = Integer.valueOf(29);  // autoboxing (criação do primitivo)
        System.out.println(num1Ref.intValue());   // unboxing (retira o primitivo pela referencia)

        Double num2Ref = Double.valueOf(3.2);     // autoboxing
        System.out.println(num2Ref.doubleValue());  // unboxing

        // constante sempre letra maiuscula
        Boolean num3Ref = Boolean.FALSE;              // autoboxing 
        System.out.println(num3Ref.booleanValue());  // unboxing

        Number refNumero = Integer.valueOf(29);
        
        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);
    }
}