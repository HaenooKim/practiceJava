#include <stdio.h>

int strlen2(char *a) {
	int len, i;
	len =0;
	i = 0;
	
	for (i=0; *(a+i); i++) {
		len ++;
	}
	
	return len;
}


int main(void) {
	char *t = "HelloWorld\0";
	
	printf("%d", strlen2(t));
	
	return 0;
}
/*
\0�� ������ ������ �Ϻΰ� �ƴ϶� 0�̶�� ���� �ǹ��ϴ� Ư���� ǥ�����̴�.


char *�� �Ű������� ���� strlen2�Լ��� �����, �̰��� ���ڿ��� ���̸� �絵��
�ϼ���.
*/
