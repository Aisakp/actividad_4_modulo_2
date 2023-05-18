import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void mainTest(){

        Main m = new Main();
        Assertions.assertNotNull(m);

    }
}
