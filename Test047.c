#include <stdio.h>
#include <string.h>

int main(void) {
	char l[6] = "Apple\0";
	char* t = "Hello\0";
	int len;
	
	len = sizeof(l) / sizeof(char);
	printf("%d\n", len);
	printf("%d\n", strlen(l));
	
	
	/*
		java������ boolean�̶�� �ڷ����� �ִ�.
		�׷��� if(...) �ȿ��� boolean���� true�ƴϸ� false�� ���� �� �ִ�.
		
		c���� �⺻������ boolean�̶�� �ڷ����� ����.
		=> 0�� false, �� �ܿ� true
	*/
	if (100) {
		printf("Apple");
	}
	
}


/*
���ڿ��� ���̸� �� ���� \0�� ������� �ʾƾ� �ϱ� ������
strlen�Լ��� ����.
*/