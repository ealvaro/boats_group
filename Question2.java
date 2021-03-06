import java.io.*;
import java.util.*;


public class Question2 {

  private String[] arr;

  public String[] getArr(){
    return arr;
  }

  Question2(int n){
    arr = new String[n];
    Arrays.fill(arr, "closed");
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
        System.out.print("Enter number of doors: ");
        int n = in.nextInt();
        Question2 q = new Question2(n);
        System.out.print("How many passes: ");
        int p = in.nextInt();
        q.checkDoors(p);
        String[] arr = q.getArr();
        for(int i=1; i<=n; i++){
          System.out.println(String.format("%s - %s",i,arr[i-1]));
        }
        in.close();
    }
}
