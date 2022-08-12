import java.util.*;
public class watermelon{

public void getEven(int w){
    if(w % 2 == 0 && w > 2 && w <= 100){
        System.out.println("YES");
    }
    else
        System.out.println("NO");
}
  

//public class watermelon{
 public static void main(String args[]){

 Scanner ob = new Scanner(System.in);
 int w = ob.nextInt();

watermelon ob1 = new watermelon();
ob1.getEven(w);
 
}
}
