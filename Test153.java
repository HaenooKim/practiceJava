interface ICalc {
	public int execute (int i, int j);
}

class Add implements ICalc, NoPrint {
	public int execute(int i, int j) {
		return i+j;
	}
}

class Minus implements ICalc {
	public int execute(int i, int j) {
		return i-j;
	}
}

interface NoPrint {
	
}


public class Test153 {
	public static void main(String[] args) {
		ICalc ic = new Minus();
		int r = ic.execute(10, 20);
	
		if (ic instanceof NoPrint) {
			
		} else {
			System.out.println(r);
		}
		
		
		
	}
}


/*
	�ϳ��� ������ �ϳ��� �ν���ȭ�ϴ� ���������� Ŀ�ǵ������̶�� �Ѵ�.
	���ſ��� Commander Pattern�� ������ ���� ��.
	annotation�� ������ �� �������� �������
	
	Ŭ������ �������� ���»���� �ٸ� ���ɼ��� ũ��.
	-> �������� Ŭ�������ٰ� �̰� �� ���� �̷��� ������ ���ڴ� ��� ������ �ɾ��ְ� �ʹ�.
	
	�׷� ��� �ϴ���? -> ����ִ� �������̽��� �̿��Ѵ�.
	
	�ش� �������̽��� ��ӹ��� Ŀ�ǵ带 ������ �� instatnceof�� �̿��ؼ�
	�ش� �������̽��� ��ӹ������� ���캸��
	�ű⿡ �°� ������ ����� �ǵ��� ��Ƹ��ڵ带 ����� ���� �� �ְ� �ȴ�.

	::�̷� ������ ü��ȭ �ؼ� �� �������� annotation�̴�. -annotation�� �������̽��� ���������.
	�ֱ� �����ӿ�ũ��� annotation���������� ���� �ڵ带 ����ϴ� ������ ����.
	¥�� ���忡���� �������� ��������忡���� ����ϱ� ����.
	
	NoPrint������ �ϸ� �� �����Ŵϱ� ����� ����!!
	if (ic instanceof NoPrint) {
			
		} else {
			System.out.println(r);
		}

*/