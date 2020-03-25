import Plants.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {
    Tree oak;
    Tree willow;

    @Before
    public void before(){oak = new Tree("oak",250,30,false);
        willow = new Tree("buffy",89,13,true);}
//    public void before(){}


    @Test
    public void neverEdible(){
        assertEquals(false, willow.canEat());
    }

}
