import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

Trumpet trumpet;

@Before
    public void before(){

    trumpet = new Trumpet(3, "brass", "yellow", "normal");

}

@Test
    public void hasValves(){
    assertEquals(3, trumpet.getValves());
}

@Test
    public void canPlay(){
    assertEquals("Freezer lyrics", trumpet.play());
}

@Test
    public void madeOfMaterial(){
    assertEquals("brass", trumpet.getMaterial());
}

    @Test
    public void hasType(){
        assertEquals("normal", trumpet.getType());
    }

    @Test
    public void hasColour(){
    assertEquals("yellow", trumpet.getColour());
    }


}
