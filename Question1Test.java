import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Question1Test {

  private static Question1 myUnit;
  private static String[] arr;

  // Processing the array
  @BeforeClass
  public static void setUp() throws Exception {
    myUnit = new Question1(15);  //Make array max 15 numbers
    arr = myUnit.getArr();
  }
  /*
  This one tests multiples of 3
   */
  @Test
  public void testMultiplesOfThree() {
    assertEquals(arr[2], "Boats"); //Multiples of 3
    assertEquals(arr[2], arr[5]); //Multiples of 3
  }
  /*
  This one tests multiples of 5
   */
  @Test
  public void testMultiplesOfFive() {
    assertEquals(arr[4], "Group"); //Multiples of 5
    assertEquals(arr[4], arr[9]); //Multiples of 5
  }

  /*
  This one tests multiples of 3 and 5
   */
  @Test
  public void testMultiplesOfThreeAndFive() {
    assertEquals(arr[14], "BoatsGroup"); //Multiples of 5
  }

}