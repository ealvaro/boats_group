import org.junit.Test;
import static org.junit.Assert.*;

public class Question2Test {

  /*
  This one tests multiples of 3
   */
  @Test
  public void testMultiplesOfThree() {
    Question1 myUnit = new Question1(15);  //Make array up until 15 numbers
    String[] arr = myUnit.getArr();
    assertEquals(arr[2], "Boats"); //Multiples of 3
    assertEquals(arr[2], arr[5]); //Multiples of 3
  }
  /*
  This one tests multiples of 5
   */
  @Test
  public void testMultiplesOfFive() {
    Question1 myUnit = new Question1(15);  //Make array up until 15 numbers
    String[] arr = myUnit.getArr();
    assertEquals(arr[4], "Group"); //Multiples of 5
    assertEquals(arr[4], arr[9]); //Multiples of 5
  }

  /*
  This one tests multiples of 3 and 5
   */
  @Test
  public void testMultiplesOfThreeAndFive() {
    Question1 myUnit = new Question1(15);  //Make array up until 15 numbers
    String[] arr = myUnit.getArr();
    assertEquals(arr[14], "BoatsGroup"); //Multiples of 5
  }

}