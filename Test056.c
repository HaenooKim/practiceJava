#include <stdio.h>

struct apple {
	int name;
	int value;
};

int main(void) {
	struct apple i;
	struct apple *t;
	
	t = &i;
	
	t->name = 100;
	t->value = 200;
	printf("%d %d", t->name, t->value);
	
	return 0;
}

/*

t-> name
�̶��� t�� �������� �ƴ϶� ������ ���� �̸��̾�� �Ѵ�.
't'��� �����Ͱ� ����Ű�� ����ü�� ���� ���� name�̸����� Ȯ���� ����

�����̸����� ������ ���� .�� ���� �����ͷ� ������ ���� ->�� ����.
*/