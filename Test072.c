#include <stdio.h>

typedef struct temp {
	int data;
}Temp;

/* new하면 벌어지는 일
	1. 메모리 확보.
	2. 멤버함수 포인터를 실체와 연결
	3. 생성자 호출
	
	특징사항들
	- 생성자는 외부에서 포인터로 접근 불가. ex) t->TempConstructor(...);
	- 생성자는 new ~ 하는 시점에서 호출된다.
	- 주로 멤버변수를 초기화 하는 용도로 사용되고 this를 사용가능. 방금 생성된 인스턴스를 가리킴
	- 매개변수를 적당히 만들어서 쓰면 된다.
*/


void TempConstructor(Temp *this, int i) {
	this->data = i;
}


Temp* new_Temp(int i) {
	Temp* tmp;
	tmp = (Temp*)malloc(sizeof(Temp));
	TempConstructor(tmp, i);
	
	
	return tmp;
}


int main() {
	Temp *t;
	t = new_Temp(100);
	
	printf("%d\n", t->data);
	
	free(t);
	
	return 0;
}