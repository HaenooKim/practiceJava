#include <stdio.h>

typedef struct a {
	void(*print)(void*);
}A;

typedef struct a {
	void(*print)(void*);
}B;

void A_print(void* self) {
	printf("A print\n");
}


void B_print(void* self) {
	printf("B print\n");
}

int main(void) {
	
	B *t;
	t = (B*)malloc(sizeof(B));
	
	t->print = A_print; // 조상에서 선언된 함수와 연결
	t->print = B_print; // 자손에서 선언된 함수로 갈아엎음
	
	t->print(t);
	
	free(t);
	
	return 0;
}

//086 코드를 간략하게 c형태로 짜보는 거임