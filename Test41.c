#include <stdio.h>

int main() {
	int arr[4] = {3, 6, 5, 8};
	int i;
	int *t;
	
	for (i = 0; i<sizeof(arr)/sizeof(int); i++) {
		printf("%d", arr[i]);
	}
	
	t = arr;

	return 0;
}

/*

배열형 변수는 포인터 변수에 대입 가능하다
배열이 포인터라고 해서 포인터를 이용해서 배열의 크기를 재지는 못한다.
-> sizeof(t)로 못씀.
*/