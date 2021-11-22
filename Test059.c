#include <stdio.h>
#include <string.h>


int starts_with(char *a, char *b) {
	int i, check;
	check = 1; //0은 거짓 1은 참
	
	for (i=0; i<strlen(b); i++) {
		if (a[i] != b[i]) {
			check = 0;
			break;
		}
	}
	
	return check;
}


int main() {
	int result;
	result = starts_with("HelloWorld\0", "Hel\0");
	
	printf("%d\n", result);
	
	return 0;
}