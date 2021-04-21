package arrays;
import java.util.Scanner;
public class Arrays1 {

	public static int findSum(int[] arr) {
		int sum = 0;
		int n = arr.length;
		for(int i = 0; i<n;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int summ = findSum(arr);
        System.out.println(summ);
	}

}
