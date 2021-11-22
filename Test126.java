import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.HashSet;

public class Test126 {
	public static void main(String[] args) {
		Set<String> l = new HashSet<String>();
		l.add("apple");
		l.add("banana");
		l.add("orange");
		l.add("kiwi");
		System.out.println(l.size());
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String t = it.next();
			System.out.println(t);
		}
	}
}

/*
	import�� �����? Ŭ������. ��Ű���� �ƴ�.
	
	Set �������̽����� System.out.println(l.get(0))���� ������ ��. (�������ϱ� ����)
	
	Set�� ���������� ����. -> �׷��� get�� ����.
	������ ����Ʈ���� �� ���� �˻��� ȿ������ ������ ����.
	
	TreeSet�� ���������� 2��Ʈ���� �Ἥ �����Ѵ�. -����Ʈ���� �ߺ��� ������� ����.
	
	HashSet�� TreeSet�� �Ѵ� Set�������̽��� ����ϹǷ� ȣȯ���� ���Ѵ�.
	
	HashSet�� ���������� �ؽ� �˰����� �Ἥ �����Ѵ�.
	
	��������� TreeSet�� �ٸ����� ����Լ��� ����.
*/