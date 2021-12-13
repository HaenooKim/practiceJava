
class TempVO {
	public int data = 100;
	
	public int getData() {
		return data;
	}
}

class Temp2VO extends TempVO{
	public int data = 200;
	
	public int getData() {
		return data;
	}
}

public class Test292 {
	public static void main(String[] args) {
		TempVO t = new Temp2VO();
		System.out.println(t.data);
		System.out.println(t.getData());
		//������ ����? �Լ��� �ڼ�? ���ݵ�...
		
		Temp2VO t2 = (Temp2VO) t;
		System.out.println(t2.data);
		//�ű⿡ ĳ���� �ϰ��� ���� ���ϳ�?? ���ݵ�...
		
		/*
			-> ��������� ����� public�ϰ� �����ϵ��� ���� �ʴ´� ��� �ҹ����� ����.
			�ؼ� ��������� private/protected�ϰ� �����ؼ� ���� �������� ���ϵ��� �Ѵ�.
			
			�׷� ��� ���� �а���? getter�Լ��� �Ἥ �а�, setter�Լ��� �Ἥ ����.
			
			privaet int data = 0;
			public int getData(){return this.data;} //getter
			public void setData(int i){this.data = i;} //setter
			
			getter�� get+���������(ù���ڴ� �빮�ڷ�) + ������ ���� �ڷ����� ����Ÿ�� + �Ű����� ����
			setter�� set+���������(ù���ڴ� �빮�ڷ�) + void ����Ÿ�� + �Ű������� ������ ���� �ڷ����� Ÿ��
			
			DTO : Data Transfer Object
			VO : Value Object
			- �� ��� �� �����͸� ��� �뵵�� ����Ѵٴ� �ǹ̸� ��� �ִ�.
			- VO������ int���� Integer�� ����Ѵ�. 
			�� ������ db�� int�� �ʵ忡�� null���� �� �� �ִµ� �̰��� �������� Int�� �Ұ���!
			ex) int r = null; �Ұ���
			    Integer r = null; ����
				
			���� db�� �����Ǵ� VO���� int, double �Ⱦ��� , Integer, Double�� ����ϴ� ���� �⺻���� �Ѵ�.
			
		*/
	}
}

/*
*/