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
	
	//�迭�� ����ִ� ���� �� �ִ밪�� ���ϴ� �ڵ带 ¥����.
}