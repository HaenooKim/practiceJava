#include <stdio.h>

/*
구조체 안에 선언된 모든 함수의 첫 매개변수 형태는 void*로 한다.

구조체 안의 함수포인터로 호출하는 모든 함수는
Temp* this;
this = (Temp*)self;

이 코드를 맨 윗부분에 써주도록 한다.

이러면 실제 함수 호출시에
t->add(t, 20); 와 같이
왼쪽에서 사용한 변수를 매개변수의 첫번째에 넣어준다.
즉, this 포인터는 자기 자신이 속해있는 구조체를 가리키게 되고, 구조체 안의 변수와 변수에 접근 가능

*/

typedef struct temp {
	int data;
	int (*add)(void*, int);
}Temp;

int Temp_add(void *self, int i) {
	Temp* this;
	this = (Temp*)self;
	
	return i*10+this->data;
}


//메모리 할당 + 함수연결 + 변수 초기값
Temp* new_Temp() {
	Temp *tmp;
	tmp = (Temp*)malloc(sizeof(Temp));
	tmp->add = Temp_add;
	tmp->data = 100;
	
	return tmp;
}

int main(void) {
	Temp *t;
	t=new_Temp();
	t->data = t->add(t, 20);
	printf("%d\n", t->data);
	
	free(t);
	
	
	return 0;
}