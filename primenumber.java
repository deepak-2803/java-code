import java.util.*;
public class primenumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        String str=prime(n);
        System.out.println(str);
    }
    static String prime(int k)
    {
        if(k<2){
            return("not prime");
        }
        for(int i=2;i<k;i++){
            if(k%i==0){
                return("not prime");
            }
        }
        return("prime");
    }

}
