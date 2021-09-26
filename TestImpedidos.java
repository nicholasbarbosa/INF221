package test;
import java.util.Arrays;
import static org.junit.Assert.*;

import main.Impedidos;
import org.junit.Test;

public class TestImpedidos {
    @Test
    public void testImpedidos(){
        Impedidos c = new Impedidos();
        int na[] = new int[2];
        int nb[] = new int[2];

        na[0] = 200;
        na[1] = 400;

        nb[0] = 200;
        nb[1] = 1000;

        c.resultado(2,2,na,nb);

        assertTrue(c.geti());
    }

    @Test
    public void testImpedidos2(){
        Impedidos c = new Impedidos();
        int na[] = new int[3];
        int nb[] = new int[4];

        na[0] = 480;
        na[1] = 510;
        na[2] = 490;

        nb[0] = 480;
        nb[1] = 470;
        nb[2] = 50;
        nb[3] = 310;

        c.resultado(3,4,na,nb);

        assertFalse(c.geti());
    }
}
