#include <stdio.h>

int main(void) {
	int i, j;
	int *t;
	
	i = 100;
	t = &i;
	j = i; //값을 복사하여 대입한다.
	
	(*t)++;
	printf("%d\n", i);
	
	
	return 0;
}

/*
	내용을 복사해서 넘기는 것과 포인터를 넘기는 것을 확실히 하자.
*/