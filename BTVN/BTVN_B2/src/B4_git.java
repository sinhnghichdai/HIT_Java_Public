import java.util.Scanner;

public class B4_git {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] a=new int[5];
        int sumn=0;
        int maxn=-10000000;
        for(int i=0;i<5;i++){
            System.out.println("a["+i+"]: ");
            a[i]=sc.nextInt();
            sumn+=a[i];
            maxn=Math.max(a[i],maxn);
        }  System.out.println("Mảng vừa nhập : ");
        for(int i=0;i<5;i++){

            System.out.println(a[i]+" ");
        }
        System.out.println("Giá trị lớn nhất là : "+maxn);
        System.out.println("Tổng các phần tử trong mảng là : "+sumn);
    }
}
