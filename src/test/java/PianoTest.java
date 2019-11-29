import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){

        piano = new Piano(24, "wood", "black", "electric");
    }

    @Test
    public void hasKeys(){
        assertEquals(24, piano.getKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("Softly, in the dusk, a woman is singing to me;", piano.play());
    }

    @Test
    public void madeOfMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("electric", piano.getType());
    }
}
