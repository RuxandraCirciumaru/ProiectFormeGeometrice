import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriunghiTest {

    @Test
    void TriunghiTest(){
        Triunghi triunghi = new Triunghi(3,2,4);
        double perimetruTriunghi = triunghi.calculPerimetru();
        assertEquals(9,perimetruTriunghi,0.0001);
    }
}
