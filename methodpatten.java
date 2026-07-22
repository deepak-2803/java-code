import java.util.*;
public class methodpatten{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int a=5;
        int b=10;
        Pat(a);
        Pat(b);
        Pat(3);
        Pat(4);
    }
    static void Pat(int k)
    {
        for(int i=0;i<k;i++)
        {
            for(int j=i;j<k;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }

}
