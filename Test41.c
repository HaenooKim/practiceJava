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

�迭�� ������ ������ ������ ���� �����ϴ�
�迭�� �����Ͷ�� �ؼ� �����͸� �̿��ؼ� �迭�� ũ�⸦ ������ ���Ѵ�.
-> sizeof(t)�� ����.
*/