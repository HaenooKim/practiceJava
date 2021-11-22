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
배열의 요소 총 합을 구하는 함수 sum을 만들어서 호출하는 형태로
배열의 합을 구하세요
*/