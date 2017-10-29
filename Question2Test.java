import org.junit.Test;
import static org.junit.Assert.*;

public class Question2Test {

  /*
  This one tests multiples of 3
   */
  @Test
  public void testInitiallyAllDoorsOpen() {
    Question2 q = new Question2(9);  //Make array of 9 doors
    q.checkDoors(0);
    String[] arr = q.getArr();
    for(int i=0; i<arr.length; i++){
      assertEquals(arr[i], "open"); //Door is open
    }
  }
  /*
  This one tests multiples of 5
   */
  @Test
  public void testFirstPassAllDoorsClosed() {
    Question2 q = new Question2(9);  //Make array of 9 doors
    q.checkDoors(1);
    String[] arr = q.getArr();
    for(int i=0; i<arr.length; i++){
      assertEquals(arr[i], "closed"); //Door is open
    }
  }

  /*
  This one tests multiples of 3 and 5
   */
  @Test
  public void testLastDoorClosedAfter15Passes() {
    Question2 q = new Question2(9);  //Make array of 9 doors
    q.checkDoors(9);
    String[] arr = q.getArr();
    assertEquals(last(arr), "closed"); //Door is open
  }

  private String last(String[] array){
    return array[array.length-1];
  }
}