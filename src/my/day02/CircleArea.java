package my.day02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������ ����ϴ� ���Τѷ�
		//���� ��������  ����ڷ� ���� �Է¹޾� ���
		//��ĳ�� ��ü�� ���
		double radius;
		double area;
		System.out.println("���� �������� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
		area = radius*radius*3.14;
		System.out.println(area);
		

	}

}
