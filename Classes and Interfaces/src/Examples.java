
import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    public Examples(){} //MUST be public

    
    Dillo babyDillo = new Dillo (8, false);
    Dillo adultDillo = new Dillo (24, false);
    Dillo bigDeadDillo = new Dillo (60, true);
    
    
    Boa billy = new Boa("Billy", 12, "toads");
    Boa trixie = new Boa("Trixie", 18, "ferns");
    
    //IAnimal ani = new IAnimal CANNOT DO, will only do as list of animals

    
    //Test where smaller dillo can't be sheltered
    @Test
    public void testSmallDillo() {
    		assertFalse(babyDillo.canShelter());
    		
    }
    
    //Test where bigger dillo can be sheltered
    @Test
    public void testBigDillo() {
    		assertFalse(bigDeadDillo.canShelter());
    }
    
    //Test where the two foods are different
    @Test
    public void testDifferentFood() {
    		assertFalse(billy.likesSameFood(trixie));
    }
  
    //Test where the two foods are the same
    @Test
    public void testSameFood() {
    		assertTrue(billy.likesSameFood(new Boa("Jennifer", 19, "toads")));
    }
    
    //Tests the length of a boa
    @Test
    public void testBoaLength() {
    		assertTrue(billy.lengthBelow(15));
    }
    
    @Test
    public void testBoaLengthEqual() {
    		assertFalse(billy.lengthBelow(12));
    }
    
    @Test
    public void testBoaLengthBigger() {
    		assertFalse(billy.lengthBelow(10));
    }
    
    //Tests the length of a dillo
    @Test
    public void testDilloLength() {
    		assertFalse(bigDeadDillo.lengthBelow(12));
    }
    
    @Test
    public void testDilloLengthEqual() {
    		assertFalse(bigDeadDillo.lengthBelow(60));
    }
    
    @Test
    public void testDilloSmaller() {
    		assertTrue(bigDeadDillo.lengthBelow(65));
    }
}
