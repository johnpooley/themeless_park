import Animals.Squirrel;
import Plants.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SquirrelTest {
    Squirrel squirrel;
    Tree willow;

    @Before
    public void before(){ squirrel=new Squirrel("nigel","grey squirrel",5);
        willow = new Tree("buffy",89,13,true);}

    @Test
    public void canClimb(){assertEquals("nigel has climbed the tree",squirrel.climb(willow));}
}
