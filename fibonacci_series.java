import java.util.*;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.print("Enter the term till which you want to print fibonacci series :");
        int n =A.nextInt();
        System.out.print("The series is: ");
        for(int i=0;i<n;i++){
            System.out.print(series(i)+" ");
        }

    }
    public static int series(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return series(n-1)+series(n-2);

    }
}
