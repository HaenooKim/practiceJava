#include <stdio.h>

struct apple {
	int name;
	int value;
};

int main(void) {
	struct apple i;
	struct apple *t;
	
	t = &i;
	
	t->name = 100;
	t->value = 200;
	printf("%d %d", t->name, t->value);
	
	return 0;
}

/*

t-> name
이때의 t는 변수명이 아니라 포인터 변수 이름이어야 한다.
't'라는 포인터가 가리키는 구조체형 공간 안의 name이름으로 확보된 공간

변수이름으로 접근할 때는 .을 쓰고 포인터로 접근할 때는 ->를 쓴다.
*/