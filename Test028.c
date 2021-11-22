#include <stdio.h>

int main(void) {
	int i;
	i = i+1;
	printf("%d", i);
	
	printf("Hello World");
	

	return 0;
	
}

//컴파일 하는 방법 : c:/JavaWork > gcc Test028.c -o test.exe
// test.exe는 생성되는 실행파일 명

/*
변수의 선언 대입 연산 다 있다.(자바와 동일)

정통 문법은 선언하면서 대입하지 않는다.( int c = 0; 이런 코드는 고전적인 환경에서 에러남)
변수 선언은 코드 (함수 )위쪽으로 몰아서 해줘야 한다.
*/