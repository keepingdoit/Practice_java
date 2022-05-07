package TJpractice;

import java.util.Scanner;

public class calcurate {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String error = " ";
		System.out.println("1. +\t2. -\t3. *\t4. /\t5. exit");
		int i=sc.nextInt();
		
		while (i<0 || i>=0) {
			cal(i);
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
	
	
	
	public static void cal(int i){
		Scanner sc = new Scanner(System.in);
		int a;	int b;
			while(0<i && i<=4) {
				if(i==1) {
					System.out.println("더할 두 숫자를 입력해주세요");
					a = sc.nextInt();
					b = sc.nextInt();
					int add = a+b;
					System.out.println("결과 : " + add);
				}
				if(i==2) {
					System.out.println("뺄 두 숫자를 입력해주세요");
					a = sc.nextInt();
					b = sc.nextInt();
					int sub = a-b;
					System.out.println("결과 : " + sub);
				}
				if(i==3) {
					System.out.println("곱할 두 숫자를 입력해주세요");
					a = sc.nextInt();
					b = sc.nextInt();
					int gup = a*b;
					System.out.println("결과 : " + gup);
				}
				if(i==4) {
					System.out.println("나눌 두 숫자를 입력해주세요");
					a = sc.nextInt();
					b = sc.nextInt();
					double div = (double)a/b;
					System.out.println("결과 : " + div);
				}
				System.out.println("목록\n1. +\t2. -\t3. *\t4. /\t5. exit");
				i = sc.nextInt();
			}
	}

}
