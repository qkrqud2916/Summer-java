package my.day02;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		Scanner scan = new Scanner(System.in);
		System.out.println("��������");
		a = scan.nextInt();
		System.out.println("��������");
		b = scan.nextInt();
		System.out.println("��������");
	    c = scan.nextInt();
		System.out.println("���");
		d = (a + b + c)/3;
		System.out.println(d);
		
		if(d > a) {
			System.out.println("���� ������ ��պ��� �����ϴ�");
		}
		else
		{
			System.out.println("���������� ��պ��� �����ϴ�");
		}
		
		
		if(d > b) {
			System.out.println("���� ������ ��պ��� �����ϴ�");
		}
		else
		{
			System.out.println("���������� ��պ��� �����ϴ�");
		}
		
		if(d > c) {
			System.out.println("���� ������ ��պ��� �����ϴ�");
		}
		else
		{
			System.out.println("���������� ��պ��� �����ϴ�");
		}
		

	}

}
