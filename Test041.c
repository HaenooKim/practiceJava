#include <stdio.h>

int main() {
	int arr[4] = {3, 6, 5, 8};
	int i;
	
	for (i = 0; i<sizeof(arr)/sizeof(int); i++) {
		printf("%d", arr[i]);
	}

	return 0;
}