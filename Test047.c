#include <stdio.h>
#include <string.h>

int main(void) {
	char l[6] = "Apple\0";
	char* t = "Hello\0";
	int len;
	
	len = sizeof(l) / sizeof(char);
	printf("%d\n", len);
	printf("%d\n", strlen(l));
	
	
	/*
		java에서는 boolean이라는 자료형이 있다.
		그래서 if(...) 안에는 boolean값을 true아니면 false만 넣을 수 있다.
		
		c언어는 기본적으로 boolean이라는 자료형이 없다.
		=> 0은 false, 그 외엔 true
	*/
	if (100) {
		printf("Apple");
	}
	
}


/*
문자열의 길이를 잴 때는 \0은 고려하지 않아야 하기 때문에
strlen함수를 쓴다.
*/