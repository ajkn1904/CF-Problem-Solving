import java.util.*;

public class WayToLong {

  public static void main(String args[]) {
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();

    String[] str = new String[100];
    char fchar = 0;
    char lchar = 0;
    int charlen = 0;
    for (int i = 0; i < n; i++) {
      str[i] = ob.next();

      if (str[i].length() > 10) {
        fchar = str[i].charAt(0);
        lchar = str[i].charAt(str[i].length() - 1);
        charlen = (str[i].length() - 2);

        System.out.println(fchar + "" + charlen + "" + lchar);
      } else System.out.println(str[i]);
    }
  }
}
