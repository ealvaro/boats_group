import java.io.*;
import java.util.*;


public class Question2 {

  private String[] arr;

  public String[] getArr(){
    return arr;
  }

  Question2(int n){
    arr = new String[n];
    Arrays.fill(arr, "open");
  }

  public void checkDoors (int times){
        for (int i=1; i <= times; i++)
        for (int d=1; d <= arr.length; d++)
            if (d % i == 0)
                toggleDoor(d-1);
  }

  private void toggleDoor (int door) {
    if (arr[door] == "open")
      arr[door] = "closed";
    else
      arr[door] = "open";
  }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Question2 q = new Question2(n);
        q.checkDoors(n);
        String[] arr = q.getArr();
        for(int i=0; i<n; i++){
          System.out.println(arr[i]);
        }
        in.close();
    }
}
