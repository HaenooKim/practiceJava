#include <stdio.h>

/*
����ü �ȿ� ����� ��� �Լ��� ù �Ű����� ���´� void*�� �Ѵ�.

����ü ���� �Լ������ͷ� ȣ���ϴ� ��� �Լ���
Temp* this;
this = (Temp*)self;

�� �ڵ带 �� ���κп� ���ֵ��� �Ѵ�.

�̷��� ���� �Լ� ȣ��ÿ�
t->add(t, 20); �� ����
���ʿ��� ����� ������ �Ű������� ù��°�� �־��ش�.
��, this �����ʹ� �ڱ� �ڽ��� �����ִ� ����ü�� ����Ű�� �ǰ�, ����ü ���� ������ ������ ���� ����

*/

typedef struct temp {
	int data;
	int (*add)(void*, int);
}Temp;

int Temp_add(void *self, int i) {
	Temp* this;
	this = (Temp*)self;
	
	return i*10+this->data;
}


//�޸� �Ҵ� + �Լ����� + ���� �ʱⰪ
Temp* new_Temp() {
	Temp *tmp;
	tmp = (Temp*)malloc(sizeof(Temp));
	tmp->add = Temp_add;
	tmp->data = 100;
	
	return tmp;
}

int main(void) {
	Temp *t;
	t=new_Temp();
	t->data = t->add(t, 20);
	printf("%d\n", t->data);
	
	free(t);
	
	
	return 0;
}