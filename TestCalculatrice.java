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
        assertEquals(10, calculatrice.add(5, 5));
        assertEquals(20, calculatrice.add(10, 10));
    }

    @Test
    void testmult(){
        assertEquals(10, calculatrice.mult(2, 5));
        assertEquals(20, calculatrice.mult(2, 10));

    }

}