#include <stdio.h>

//	class A 에 해당 
typedef struct a {
	int data;
	void (*print)( void* );
} A;

// class B extends A 에 해당
typedef struct b {
	int data;
	void (*print)( void* );		//  오버라이딩이 일어난 경우에는 조상의 포인터를 쓴다.
	void (*print2)( void* );	//	자손에서 추가된 함수
} B;

void A_print( void* self ) {
	printf("print");	
}

void B_print( void* self ) {
	printf("printXX");	
}

void B_print2( void* self ) {
	printf("print2");	
}

void* new_B( ) {
	B* tmp;
	tmp = (B*)malloc( sizeof(B) );
	tmp->print = A_print;
	tmp->print = B_print;
	tmp->print2 = B_print2;
	
	return tmp;
}

int main() {
	void* vp;
	A* t;
	B* t2;

	vp = new_B();

	t = (A*)vp;
	t->print( t );
	//	t->print2( t );
	
	t2 = (B*)vp;
	t2->print2( t2 );
	
	free( (B*)vp );
	return 0;
}

//	Test090.c