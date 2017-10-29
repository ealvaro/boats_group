import java.io.*;
import java.util.*;


public class Question1 {

  private String[] arr;

  public String[] getArr(){
    return arr;
  }

  Question1(int n){
    arr = new String[n];
    for(int i=1; i <= n; i++){
      if (i%3 == 0)
        if (i%5 == 0)
          arr[i-1]="BoatsGroup";
        else
          arr[i-1]="Boats";
      else
        if (i%5 == 0)
          arr[i-1]="Group";
        else
          arr[i-1]=String.format("%s",i);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Question1 q = new Question1(n);
    String[] arr = q.getArr();
    for(int i=0; i<n; i++){
      System.out.println(arr[i]);
    }
  }
}
