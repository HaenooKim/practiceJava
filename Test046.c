#include <stdio.h>

int main(void) {
	char l[6] = "Apple\0";
	char* t = "Hello\0";
	printf("%s\n", l);
	printf("%s", t);
	
	return 0;
}

/*
java에서는 문자열을 다룰 때 String을 사용했다.

int[] i = {1, 2}; dynamic array, 문자열을 다를 때 이 개념은 매우 유용.

문자열 이용시 배열에 할당된 공간 옆의 쓰레기 값까지 보여질 수 있기에 모든 문자열은
반드시 \0으로 끝나게 ""안에 명시하는 것을 원칙으로 한다.

배열형 변수는 포인터에 대입간으하니까 위와 같이 포인터로 문자열을 운용해도 같은 개념.
*/