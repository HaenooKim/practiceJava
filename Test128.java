
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class Test128 {
	public static void main(String[] args) {
		//���ʸ��� ������ ���� ��쵵 ����
		Map<String, String> mp  = new TreeMap<String, String>();
		mp.put("apple", "���"); //�̷� ���� key, value��� �̾߱��Ѵ�.
		mp.put("banana", "�ٳ���");
		mp.put("orange", "������");
		mp.put("kiwi", "Ű��");
		mp.put("apple", "���2");//���� key�� �ߺ��ؼ� �Է��ϸ� ���� ���� �о�� ����.
		
		String val = mp.get("banana");
		System.out.println(val); //���� Ű�� �̿��ؼ� value���� ��
		
		Map<Integer, String> mp2 = new HashMap<Integer, String> ();
		
		mp2.put(100, "apple");
		mp2.put(103, "banana");
		
		System.out.println(mp2.get(103));
	}
}

/*
	
	�̷��� ���·� �����ϴ� ���� Map�̶���Ѵ�.
	
	�ڹپȿ��� �⺻������ ���� ����ϴ� �ڷᱸ������ �����ȴ�.
	ũ�� 3������ �������̽��� ��ӹ޾� ����� �ȴ�.
	1. List (ArrayList linkedList) : ���������� �ְ� �ߺ����
	2. Set (HashSet TreeSet) : ���������� ���� �ߺ�����
	3. Map(HashMap, TreeMap) : key-value����, �ߺ�����
	
	�̰͵��� �ڹ��÷����̶�� �Ѵ�.
 
*/