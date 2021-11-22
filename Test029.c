#include <stdio.h>

int main() {
	int i;
	float j;
	
	
	i = 100;
	j = 3.1416;
	
	printf("%d\n", i);
	printf("%f\n", j);
	return 0;
}

/*
gcc는 실수형으로 float을 애용
정수값을 실수형 변수에 대입하면 형 변환이되어 대입된다.
자바와 다르게 정수형 변수에 실수값을 넣었을 때 에러없이 들어간다.
단, 소수점은 짤려져 나간다. (이렇게 동작 안하는 경우도 드물게 있긴함.)
ex) int i; i = 3.14가 동작은 함. 3으로 나옴.
*/