import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Question2Test {

  private Question2 q;

  // Processing the array
  @Before
  public void setUp() throws Exception {
    q = new Question2(9);  //Make array of 9 doors
  }
  /*
  This one tests initially all doors are open 
   */
  @Test
  public void testInitiallyAllDoorsOpen() {
    q.checkDoors(0);
    String[] arr = q.getArr();
    for(int i=0; i<arr.length; i++){
      assertEquals(arr[i], "open"); //Door is open
    }
  }
  /*
  This one tests after 1st pass all doors are closed
   */
  @Test
  public void testFirstPassAllDoorsClosed() {
    q.checkDoors(1);
    String[] arr = q.getArr();
    for(int i=0; i<arr.length; i++){
      assertEquals(arr[i], "closed"); //Door is open
    }
  }

  /*
  This one tests last door will be closed on 9 passes
   */
  @Test
  public void testLastDoorClosedAfter9Passes() {
    q.checkDoors(9);
    String[] arr = q.getArr();
    assertEquals(last(arr), "closed"); //Door is closed
  }

  /*
  This one tests last door will be open on 10 passes
   */
  @Test
  public void testLastDoorOpenAfter10Passes() {
    q = new Question2(10);  //Make array of 9 doors
    q.checkDoors(10);
    String[] arr = q.getArr();
    assertEquals(last(arr), "open"); //Door is open
  }

  private String last(String[] array){
    return array[array.length-1];
  }
}