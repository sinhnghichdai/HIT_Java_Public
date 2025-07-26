import java.util.Scanner;

public class Bai1 {

    public static Scanner sc = new Scanner(System.in);

    public static int[] enterArray(){
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i=0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int []a, int n) {
        for (int i=0; i<n; i++){
            System.out.println("a[" +i+ "] = " + a[i]);
        }
    }

    public static void oddEven(int []a, int n){
        int totalOdd = 0;
        int totalEven = 0;
        for (int i=0; i<n; i++){
            if (a[i] % 2 == 0){
                totalOdd += a[i];
            }
            else {
                totalEven += a[i];
            }
        }
        System.out.println("Tổng các phần tử chẵn là : " + totalOdd);
        System.out.println("Tổng các phần tử lẻ là : " + totalEven);
    }

    public static boolean checkPrime(int number){
        if (number < 2)
            return false;
        for (int i=2; i <= Math.sqrt(number); i++){
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static int slPrime(int []a){
        int sl= 0;
        for (int x : a){
            if (checkPrime(x))
                sl++;
        }
        return sl;
    }

    public static void  main(String[] args){
        System.out.println("Nhập vào số lượng phần tử của mảng : ");
        int n = sc.nextInt();

        int [] a = enterArray();
        printArray(a,n);
        oddEven(a,n);

        System.out.println("Số lượng số nguyên tố là : "+ slPrime(a));
    }
}
