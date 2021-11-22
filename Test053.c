#include <stdio.h>

int *temp() {
	int i; //i는 지역변수인데
	i = 100; 
	return &i; //return 할 때 사라지므로 warning이 뜰거임
}

int main() {
	int *t;
	
	t = temp();
	printf("%d", *t);
	
	return 0;
}

/*
위의 코드는 뭐를 잘못했을까?
- 저렇게 짜면 안 되는데 허다하게 저렇게 짜는 사람들이 많아서 허용하자는 의견이 생김
- Closure 개념이 나타남 -> 즉 다른 곳에서 포인터로 가리키는 변수는 살려라
'이거 웬만하면 안 쓰는게 좋다. 로컬변수의 개념을 무너뜨리는 개념임'

이런 코드는 안 짜는 것이 좋은데 대안은?
*/