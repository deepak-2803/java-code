import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][]a=new int[3][3];
        int [][]b=new int[3][3];
        int [][]c=new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int  i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
