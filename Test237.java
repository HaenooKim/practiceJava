package banana;

import static banana.Logic.print; //�̷��� ��������� Logic.print()�̷��� �� ���� print()�� ȣ�Ⱑ��

class Logic {
	public static void print() {
		System.out.println("HelloWorld");
		try {
			Thread.sleep(800);
		}
		catch(Exception e) {
			
		}
		
		print();
	}
	
	/*
	print(100);
		System.out.println("HelloWorld" + 100);
			print(99);
				System.out.println("HelloWorld" + 99);
					print(98);
						System.out.println("HelloWorld" + 98);
							print(97);
								...
	
	������ ��������� ����� ��? ��� ȣ���� �׸��ϴ� ������ �������� �Ѵ�.
	
	print(5)
		System.out.println("HelloWorld " + 5);
			print(4);
				System.out.println("HelloWorld " + 4);
					print(3);
						System.out.println("HelloWorld " + 3);
							print(2);
								System.out.println("HelloWorld " + 2);
									print(1);
										System.out.println("HelloWorld " + 1);
											-���ǹ��� �ɸ�-
									
	
	
	*/
	
	public static void print(int i) {
		System.out.println("HelloWorld " + i);
		
		if (i>0) {
			print(i-1);
		}
		
	}
}

public class Test237 {
	public static void main(String[] args) {
		
		print(5);
	}
}

/*
	���� �ڵ�� ���ѹݺ��̴�. ���� ���� �Լ� �ȿ��� �ڽ��� �ٽ� ȣ���ϴ� ��츦 ������
	���ȣ���̶�� �Ѵ�.
	
	��ġ ���̷����� ���ĵǴ� �� ó�� ������ ������ �ڵ�� ū ���� �س��µ�
	������ ��������� �������� ������ ���ѹݺ��ϰ� �Ǿ��ִ�.
*/