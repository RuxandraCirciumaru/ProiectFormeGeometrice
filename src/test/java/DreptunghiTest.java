import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DreptunghiTest {
    @Test
    public void DreptunghiTest(){
        Dreptunghi dreptunghi =new Dreptunghi(2,3);
        double perimetruDreptunghi = dreptunghi.calculPerimetru();
        assertEquals(10,perimetruDreptunghi,0.0001);
        }
    }

