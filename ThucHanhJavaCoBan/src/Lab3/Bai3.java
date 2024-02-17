package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Nhập độ dài của mảng: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.print("Nhập các phần tử của mảng: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        Arrays.sort(arr);
	        System.out.println("Mảng sau khi sắp xếp:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        int min = arr[0];
	        for (int i = 1; i < n; i++) {
	            min = Math.min(min, arr[i]);
	        }
	        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);
	        int sum = 0;
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 3 == 0) {
	                sum += arr[i];
	                count++;
	            }
	        }
	        if (count > 0) {
	            double avg = (double) sum / count;
	            System.out.println("Trung bình cộng: " + avg);
	        } else {
	            System.out.println("Không có phần tử chia hết cho 3");
	        }
	        
	    }
	}


