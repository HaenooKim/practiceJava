#include <stdio.h>

typedef struct temp {
	int data;
	int (*add)(int);
}Temp;

int Temp_add(int i) {
	return i*10;
}


//메모리 할당 + 함수연결 + 변수 초기값
Temp* new_Temp() {
	Temp* tmp;
	tmp = (Temp*)malloc(sizeof(Temp));
	tmp->add = Temp_add;
	tmp->data = 100;
	
	return tmp;
}

int main(void) {
	Temp *t;
	t=new_Temp();
	free(t);
	
	
	return 0;
}


/*
Q. 클래스는 명시적인 설계도일까? 아니면 구체적으로 메모리를 할당받아 사용가능한 실체일까?
-> 명시적인 설계도이다.

Q. 클래스에 선언된 함수와 변수는 인스턴스를 생성하면 그 안에 호출가능한 상태로 존재한다.
-> O

Q. 클래스에 선언된 변수는 인스턴스 마다 개별적으로 존재한다.
-> O

Q. 클래스에서 선언된 함수 실체는 유일한가 아니면 개별적인가?
-> 유일하다. 다만 함수포인터는 개별적이다.

Q. 클래스 이름으로 선언되는 변수는 사실 포인터다.
-> O
*/