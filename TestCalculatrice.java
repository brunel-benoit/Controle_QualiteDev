import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCalculatrice {

    @BeforeEach
    void setUp(){
        this.calculatrice = new Calculatrice();
    }

    @Test
    void testadd(){
        Calculatrice calculatrice = new Calculatrice() ;
        assertEquals(10, calculatrice.add(5, 5));
    }

}