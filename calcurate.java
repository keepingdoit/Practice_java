package TJpractice;

import java.util.Scanner;

public class calcurate {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String error = " ";
		System.out.println("11. +\t2. -\t3. *\t4. /\t5. exit");
		int i=sc.nextInt();
		
		while (true) {
			i = cal(i); 
			if (i==5) {
				error = "수고하셨습니다!";
				System.out.println(error);
				break;
			}
			else {
				error = "잘못입력하셨습니다. 다시 입력해주세요!";
				System.out.println(error);
			}
			i=sc.nextInt();
		}
	}
	
	
	
	public static int cal(int i){ 
		Scanner sc = new Scanner(System.in);
		double a;	double b;
		
			while(0<i && i<=4) {
				double result= 0;
				if(i==1) {
					System.out.println("더할 두 숫자를 입력해주세요");
					a = sc.nextInt();
					b = sc.nextInt();
					result = a+b;
				}else if(i==2) {
					System.out.println("뺄 두 숫자를 입력해주세요");
					a = sc.nextInt();
					b = sc.nextInt();
					result = a-b;
				}else if(i==3) {
					System.out.println("곱할 두 숫자를 입력해주세요");
					a = sc.nextInt();
					b = sc.nextInt();
					result = a*b;
				}else if(i==4) {
					System.out.println("나눌 두 숫자를 입력해주세요");
					a = sc.nextInt();
					b = sc.nextInt();
					result = a/b;
				}
				System.out.println("결과 : " + result);
				System.out.println("목록\n1. +\t2. -\t3. *\t4. /\t5. exit");
				i = sc.nextInt();
			}
			
		return i;
	}

}
