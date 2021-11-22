#include <stdio.h>

typedef struct temp {
	int data;
}Temp;

/* new�ϸ� �������� ��
	1. �޸� Ȯ��.
	2. ����Լ� �����͸� ��ü�� ����
	3. ������ ȣ��
	
	Ư¡���׵�
	- �����ڴ� �ܺο��� �����ͷ� ���� �Ұ�. ex) t->TempConstructor(...);
	- �����ڴ� new ~ �ϴ� �������� ȣ��ȴ�.
	- �ַ� ��������� �ʱ�ȭ �ϴ� �뵵�� ���ǰ� this�� ��밡��. ��� ������ �ν��Ͻ��� ����Ŵ
	- �Ű������� ������ ���� ���� �ȴ�.
*/


void TempConstructor(Temp *this, int i) {
	this->data = i;
}


Temp* new_Temp(int i) {
	Temp* tmp;
	tmp = (Temp*)malloc(sizeof(Temp));
	TempConstructor(tmp, i);
	
	
	return tmp;
}


int main() {
	Temp *t;
	t = new_Temp(100);
	
	printf("%d\n", t->data);
	
	free(t);
	
	return 0;
}