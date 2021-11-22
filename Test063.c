#include <stdio.h>

int add (int i, int j) {
	return 100;
}

int add_v2 (int i, int j) {
	return 102;
}

int main() {
	int (*fp)(int , int); //함수포인터. 이건 변수이다.
	fp = add; //fp라는 포인터는 add라는 함수를 가리킨다.
	printf("%d\n", fp(10, 20)); //fp라는 함수는 없어도 fp가 가리키는 함수가 호출된다.
	
	
	fp = add_v2;
	printf("%d\n", fp(10 , 20));
	
	
	
	return 0;
}


/*
1. void 포인터
2. 함수 포인터

- 이거 모르면서 javascript 하는건 에바임

int (*fp)(int , int); : 매개변수가 int int이고 리턴타입이 int인 함수를 가리킬 수 있다.

함수 포인터로 만들어 놓으니 자주 업그레이드 되는 함수의 경우 처리를 하기 정말 편해짐
*/