#include <stdio.h>

int add (int i, int j) {
	return 100;
}

int add_v2 (int i, int j) {
	return 102;
}

int main() {
	int (*fp)(int , int); //�Լ�������. �̰� �����̴�.
	fp = add; //fp��� �����ʹ� add��� �Լ��� ����Ų��.
	printf("%d\n", fp(10, 20)); //fp��� �Լ��� ��� fp�� ����Ű�� �Լ��� ȣ��ȴ�.
	
	
	fp = add_v2;
	printf("%d\n", fp(10 , 20));
	
	
	
	return 0;
}


/*
1. void ������
2. �Լ� ������

- �̰� �𸣸鼭 javascript �ϴ°� ������

int (*fp)(int , int); : �Ű������� int int�̰� ����Ÿ���� int�� �Լ��� ����ų �� �ִ�.

�Լ� �����ͷ� ����� ������ ���� ���׷��̵� �Ǵ� �Լ��� ��� ó���� �ϱ� ���� ������
*/