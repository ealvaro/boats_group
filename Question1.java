import java.io.*;
import java.util.*;


public class Question1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i <= n; i++){
          if (i%3 == 0)
            if (i%5 == 0)
              System.out.println("BoatsGroup");
            else
              System.out.println("Boats");
          else
            if (i%5 == 0)
              System.out.println("Group");
            else
              System.out.println(i);
        }
    }
}
