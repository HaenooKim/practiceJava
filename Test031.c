#include <stdio.h>

int main(void) {
	int arr[4] = {3, 7, 19, 10};
	int i;
	int max;
	max = arr[0];
	
	for (i = 1; i<4; i++) {
		if (max < arr[i]) {
			max = arr[i];
		}
	}
	
	printf("%d", max);
	return 0;
	
	//배열에 들어있는 값들 중 최대값을 구하는 코드를 짜세요.
}