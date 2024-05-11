import java.util.Scanner;
public class Main {
    public static int sum(int[] arr) {
        int total=0;
        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
    }
}