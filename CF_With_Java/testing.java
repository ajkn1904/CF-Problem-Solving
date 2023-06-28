import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class testing {

  public static void main(String args[]) {
    Scanner ob = new Scanner(System.in);
    int n, m, sum = 0;
    int N = ob.nextInt();
    if (N == 2) {
      for (int k = 0; k < N; k++) {
        n = ob.nextInt();
        m = ob.nextInt();

        for (int i = n; i <= m; i++) {
          for (int j = 2; j < i; j++) {
            if (i % j == 0) {
              sum++;

              break;
            }
            //sum ++;j
            System.out.println(i);
          }
        }
      }
    }
  }
}
