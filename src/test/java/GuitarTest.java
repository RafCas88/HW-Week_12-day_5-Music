import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(5, "Wood", "Red", "electric");
    }

    @Test
    public void hasStrings(){
        assertEquals(5, guitar.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("I wanna rock 'n' rol all night....and party everyday", guitar.play());
    }

    @Test
    public void madeOfMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("electric", guitar.getType());
    }

}
