import java.io.*;
import java.util.*;


public class Question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        Arrays.fill(arr, "open");
        for (int i=1; i <= n; i++)
            for (int d=1; d <= n; d++)
                if (d % i == 0)
                  if (arr[d-1] == "open")
                    arr[d-1] = "closed";
                  else
                    arr[d-1] = "open";
        in.close();
        for(int d=0; d<n; d++)
            System.out.println(arr[d]);

    }
}
