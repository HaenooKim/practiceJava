#include <stdio.h>

int main(void) {
	int i, j;
	int *t;
	
	i = 100;
	t = &i;
	j = i; //���� �����Ͽ� �����Ѵ�.
	
	(*t)++;
	printf("%d\n", i);
	
	
	return 0;
}

/*
	������ �����ؼ� �ѱ�� �Ͱ� �����͸� �ѱ�� ���� Ȯ���� ����.
*/