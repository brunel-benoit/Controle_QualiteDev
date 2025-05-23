import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCalculatrice {

    Calculatrice calculatrice;
    @BeforeEach
    void setUp(){
        this.calculatrice = new Calculatrice();
    }

    @Test
    void testadd(){
        assertEquals(10.0f, calculatrice.add(5.0f, 5.0f));
        assertEquals(20.0f, calculatrice.add(10.0f, 10.0f));
    }

    @Test
    void testmult(){
        assertEquals(10.0f, calculatrice.mult(2.0f, 5.0f));
        assertEquals(20.0f, calculatrice.mult(2.0f, 10.0f));

    }

    @Test
    void testdiv(){
        assertEquals(2.0f, calculatrice.div(4.0f, 2.0f));
        assertEquals(4.0f, calculatrice.div(8.0f, 2.0f));
        assertThrows(ArithmeticException.class, () -> calculatrice.div(5,0));
    }


    /** Methode TDD test avant methode minus donc erreur **/
    @Test
    void testMinus(){
        assertEquals(6.0f, calculatrice.minus(10.0f, 4.0f));
        assertEquals(3.0f, calculatrice.minus(4.0f, 1.0f));

    }
}
