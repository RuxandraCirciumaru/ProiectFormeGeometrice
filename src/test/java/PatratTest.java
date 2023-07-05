import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PatratTest {
    @Test
    public void PatratTest(){
        Patrat patrat = new Patrat(2);
        double perimetruPatrat = patrat.calculPerimetru();
        assertEquals(8,perimetruPatrat,0.0001);
    }
}
