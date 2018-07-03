package my.day02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 원의 면적을 계산하는 프로ㅡ램
		//원의 반지름을  사용자로 부터 입력받아 계산
		//스캐너 객체를 사용
		double radius;
		double area;
		System.out.println("원의 반지름을 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
		area = radius*radius*3.14;
		System.out.println(area);
		

	}

}
