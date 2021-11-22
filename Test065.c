#include <stdio.h>
/*
 Temp ����ü = class Temp - �� �̰� ������� ������ �ȴ�. �� ���� �Լ���
 ������ ��õǾ��� ��.
 
 new_Temp() ȣ��� : �޸� Ȯ��, add�Լ������Ϳ� ��ü�� �����Ѵ�. data������ ���� ����.
 
 Temp* t - �̰��� ������, ����ü�� ��ü�� ����Ű�µ� �� ���� ������ �̹� ���ԵǾ���.
 062�� ������������ ���� �����̴�.
*/


typedef struct temp {
	int data;
	int (*add)(int);//�Լ� ������. �̰� �����̱⿡ ����ü�� ���𰡴�.
	
}Temp;

int Temp_add(int i) { 
	return 20 * i;
}

Temp* new_Temp() { //�Լ������͸� ��������ִ� �۾��� �ϴ� ��
	Temp* tmp;
	tmp = (Temp*)malloc(sizeof(Temp));
	tmp->add = Temp_add;
	tmp->data = 100;
	return tmp;
}

int main() {
	Temp* t;
	t = new_Temp();
	t->data = t->add(20);
	printf("%d\n", t->data);
	
	
	free(t);
	return 0;
}


/*
����ü �ȿ� �Լ��� ���� �Ұ��������� �Լ������ʹ�?
*/