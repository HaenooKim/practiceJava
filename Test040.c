#include <stdio.h>

int add(int i, int* j) {
	i = i+1;
	*j = *j +1;
	
	return 100;
}

int main() {
	int a;
	int i2, j2;
	
	i2 = 100;
	j2 = 100;
	
	a = add(i2, &j2);
	printf("%d\n", i2);
	printf("%d\n", j2);
	
	return 0;
}