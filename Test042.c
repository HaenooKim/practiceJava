#include <stdio.h>

int sum(int len, int *arr) {
	
	int result, i;
	
	i = 0;
	result = 0;
	
	for (i = 0; i<len; i++) {
		result +=arr[i];
	}
	
	return result;
}


int main(void) {
	int arr[4] = {3, 6, 5, 8};
	int result, len;
	
	len = sizeof(arr) / sizeof(int);
	
	result =sum(len, arr);
	
	printf("%d", result);
	
	return 0;
}

/*
�迭�� ��� �� ���� ���ϴ� �Լ� sum�� ���� ȣ���ϴ� ���·�
�迭�� ���� ���ϼ���
*/