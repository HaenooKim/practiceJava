#include <stdio.h>

int main(void) {
	int i;
	int *p;
	int *t;
	
	p = &i;
	t = p; //i의 기억공간을 가리킨다.
	
	i = 100;
	printf("%d", i);
	printf("%d", *p);
	return 0;
}


/*
포인터가 기억장소를 가리킬 수 있다면 로컬변수 선언을 통해 확보된 공간도 포인터가 접근 가능?

p = &i;
'i'라는 이름을 가진 변수의 기억공간을 p로하여금 가르키게 하라.
i라는 공간은 malloc으로 된 것이 아니므로 free가 필요없다.

t = p;
"포인터의 대입은 오른편의 변수를 가리키는 게 아니라, 오른쪽 포인터가 가리키는 대상으 가리킨다."
int ** t; 로 선언에서 p라는 포인터를 가리키게 할 수도 있다.
하지만 이론적으로 포인터의 포인터는 굳이 필요하지 않다는 것이 입증되어 있기에
현장에서 가급적 피한다.

"java에서는 포인터 개념은 있지만 아예 포인터의 포인터 개념은 없다."
t = p
*t의 값은 100

*/