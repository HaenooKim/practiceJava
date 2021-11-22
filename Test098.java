class Temp {
	int data = 0;
	
	Temp(int i) {
		data = i;
	}
	
	public boolean equals(Object b) {
		if (b == null || b instanceof Temp == false) {
			return false;
		}
		
		
		Temp t = (Temp)b;
		if (this.data == t.data)
			//b.data�� �� �ȵ���? this.data�� �� �Ǵ���?
			return true;
		else
			return false;
	}
}


public class Test098 {
	public static void main(String[] args) {
		Temp t = new Temp(100);
		Temp l = new Temp(100);
		System.out.println(t==l); //false�� ����.
		//�ֳ�? �������� �񱳴� ���� ����� ����ų �� true�� ���´�.
		//Temp t = new Temp(100); Temp l = t; �� �ϸ� true�� ���´�.
		//���빰�� ���� ����. ���� ����� �����Ѿ� ��!
		
		
	
		System.out.println(t.data == l.data); //�Ǳ� �Ǵµ� ��ü���������� ����.
		
		
		Object t2 = new Temp(200);
		Object l2 = new Temp(200);
		System.out.println(t2 == l2); 
		//System.out.println(t2.data == l2.data) �����Ѵ�: data�� �ڼ�Ŭ�������� �߰��� �����̹Ƿ� ������ �ȵ�.
		
		
		//equals �� ��ü��?
		boolean b = t2.equals(l2);
		System.out.println(b);
	}
}

/*

*/