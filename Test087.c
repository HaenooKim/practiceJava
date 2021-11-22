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
	
	t->print = A_print; // ���󿡼� ����� �Լ��� ����
	t->print = B_print; // �ڼտ��� ����� �Լ��� ���ƾ���
	
	t->print(t);
	
	free(t);
	
	return 0;
}

//086 �ڵ带 �����ϰ� c���·� ¥���� ����