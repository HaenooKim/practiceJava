#include <stdio.h>

typedef struct temp {
	int data;
	int (*add)(int);
}Temp;

int Temp_add(int i) {
	return i*10;
}


//�޸� �Ҵ� + �Լ����� + ���� �ʱⰪ
Temp* new_Temp() {
	Temp* tmp;
	tmp = (Temp*)malloc(sizeof(Temp));
	tmp->add = Temp_add;
	tmp->data = 100;
	
	return tmp;
}

int main(void) {
	Temp *t;
	t=new_Temp();
	free(t);
	
	
	return 0;
}


/*
Q. Ŭ������ ������� ���赵�ϱ�? �ƴϸ� ��ü������ �޸𸮸� �Ҵ�޾� ��밡���� ��ü�ϱ�?
-> ������� ���赵�̴�.

Q. Ŭ������ ����� �Լ��� ������ �ν��Ͻ��� �����ϸ� �� �ȿ� ȣ�Ⱑ���� ���·� �����Ѵ�.
-> O

Q. Ŭ������ ����� ������ �ν��Ͻ� ���� ���������� �����Ѵ�.
-> O

Q. Ŭ�������� ����� �Լ� ��ü�� �����Ѱ� �ƴϸ� �������ΰ�?
-> �����ϴ�. �ٸ� �Լ������ʹ� �������̴�.

Q. Ŭ���� �̸����� ����Ǵ� ������ ��� �����ʹ�.
-> O
*/