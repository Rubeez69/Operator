package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Nhap vao 2 so nguyen a, b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.format("Tong cua a va b la: %d", a+b).println();
		System.out.format("Hieu cua a va b la: %d", a-b).println();
		System.out.format("Tich cua a va b la: %d", a*b).println();
		System.out.format("Thuong cua a va b la: %d", a/b).println();
		
		boolean c;
		c = a > b;
		System.out.print(c);
		System.out.print("\n");
		c = a < b;
		System.out.print(c);
		System.out.print("\n");
		c = a >= b;
		System.out.print(c);
		System.out.print("\n");
		c = a <= b;
		System.out.print(c);
	}
}
