import java.util.*;
public class A_Team {
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

        int count, sum = 0;
        for(int i = 0; i < n; i++){
            count = 0;
            count += ob.nextInt();
            count += ob.nextInt();
            count += ob.nextInt();
            if(count>=2){
                sum++;
            }                   
        }
        
        System.out.println(sum );
    }
}
