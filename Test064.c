#include <stdio.h>

int main() {
	int i;
	float j;
	void* vp;
	
	i = 100;
	vp = &i;
	printf("%d\n",*((int*)vp)); //반드시 접근할 땐 원래의 자료형으로 캐스팅(형변환)을 해줘야 한다.
	
	j = 3.14;
	vp = &j;
	printf("%f\n", *((float*)vp))
	

	return 0;
}

/*

	void*는 모든 기억장소를 가리킬 수 잇는 포인터다.(정수형, 실수형, 구조체, 공용체 등)
	단, 해당 기억공간 안에 저장된 내용에 접근할 때는 해당 타입으로 캐스팅해야한다.
*/