import java.util.Scanner;
public class Sample
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Float m,n,d;
        m=sc.nextFloat();
        n=sc.nextFloat();
        d=m*n;
        System.out.format("%.2f",d);
    }
}