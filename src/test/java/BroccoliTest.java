import Plants.Broccoli;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BroccoliTest {

    Broccoli yum;

    @Before
    public void before(){yum = new Broccoli("yum",4,1,false);}

    @Test
    public void alwaysEdible(){
        assertEquals(true, yum.canEat());
    }


}


