class A{}
class B{}


//�븦 ���İ��� ��ӹ޴� ���� ���߻���� �ƴϴ�.
class D extends A{}
class E extends D{}

interface IA {}
interface IB {}

interface IC extends IA, IB {} // ���߻�� ����
class F implements IA, IB{}
class G extends B implements IA, IB{}


public class Test107 {
	public static void main(String[] args) {
		
	}
}




/*
�������̽��� ���߻���� �����Ѵ�.
class C extends A, B{} : 2�� �̻��� Ŭ������ ���� ��ӹ޴°��� �ڹٿ��� �����ϴ�.
������ �������̽��� ����.
�������̽��� ���߻�� �����ص� ����Ǿ��� ���ǵǾ����� �ʱ⿡ �Լ������Ͱ�
���ÿ� �ΰ��� �Լ������� ����Ű�� ���� �߻����� �ʴ´�.

�������̽��� �뵵�� abstract class�� ���� �ٸ���. �������̽��� Ŭ�������� ȣȯ���� ����� �뵵�̴�.
*/