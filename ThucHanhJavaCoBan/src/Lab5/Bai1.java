package Lab5;

import java.util.ArrayList;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        while (true) {
            double x = scanner.nextDouble();
            list.add(x);

            scanner.nextLine();
            System.out.print("Nhập thêm (Y/N): ");
            String input = scanner.nextLine();
            if (input.equals("N")) {
                break;
                }
        }
        for (Double i : list) {
            System.out.print(i + " ");
        }
        scanner.close();

		}
		
}
