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
		System.out.println("국어점수");
		a = scan.nextInt();
		System.out.println("영어점수");
		b = scan.nextInt();
		System.out.println("수학점수");
	    c = scan.nextInt();
		System.out.println("평균");
		d = (a + b + c)/3;
		System.out.println(d);
		
		if(d > a) {
			System.out.println("국어 점수가 평균보다 낮습니다");
		}
		else
		{
			System.out.println("국어점수가 평균보다 높습니다");
		}
		
		
		if(d > b) {
			System.out.println("영어 점수가 평균보다 낮습니다");
		}
		else
		{
			System.out.println("영어점수가 평균보다 높습니다");
		}
		
		if(d > c) {
			System.out.println("수학 점수가 평균보다 낮습니다");
		}
		else
		{
			System.out.println("수학점수가 평균보다 높습니다");
		}
		

	}

}
