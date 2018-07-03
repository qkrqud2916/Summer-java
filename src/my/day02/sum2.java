package my.day02;

public class sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum = 0;
		int sum2 = 0;
		
		for(int i=0; i<=10; i++) {
			if(i%2 == 0) { sum = sum+i ;
		}	else { 
			sum2 = sum2 + i;
		}
		
	}

		System.out.println(sum);
		System.out.println(sum2);
}}
