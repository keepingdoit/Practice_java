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
				error = "�����ϼ̽��ϴ�!";
				System.out.println(error);
				break;
			}
			else {
				error = "�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���!";
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
					System.out.println("���� �� ���ڸ� �Է����ּ���");
					a = sc.nextInt();
					b = sc.nextInt();
					result = a+b;
				}else if(i==2) {
					System.out.println("�� �� ���ڸ� �Է����ּ���");
					a = sc.nextInt();
					b = sc.nextInt();
					result = a-b;
				}else if(i==3) {
					System.out.println("���� �� ���ڸ� �Է����ּ���");
					a = sc.nextInt();
					b = sc.nextInt();
					result = a*b;
				}else if(i==4) {
					System.out.println("���� �� ���ڸ� �Է����ּ���");
					a = sc.nextInt();
					b = sc.nextInt();
					result = a/b;
				}
				System.out.println("��� : " + result);
				System.out.println("���\n1. +\t2. -\t3. *\t4. /\t5. exit");
				i = sc.nextInt();
			}
			
		return i;
	}

}
