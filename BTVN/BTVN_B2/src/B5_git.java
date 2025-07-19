import java.util.Scanner;

public class B5_git {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bảng cửu chương 5: ");
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+"="+5*i);
        }
        int tong=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                tong+=i;
            }
        }
        System.out.println("Tổng các số chẵn từ 1 đến 100 là: " + tong);
    }
}
