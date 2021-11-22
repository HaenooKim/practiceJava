#include <stdio.h>
/*
 Temp 구조체 = class Temp - 즉 이건 명시적인 개념이 된다. 그 안의 함수와
 변수는 명시되었을 뿐.
 
 new_Temp() 호출시 : 메모리 확보, add함수포인터와 실체를 연결한다. data변수에 값을 넣음.
 
 Temp* t - 이것은 포인터, 구조체의 실체를 가리키는데 그 안의 변수는 이미 대입되었다.
 062의 참조형변수와 같은 개념이다.
*/


typedef struct temp {
	int data;
	int (*add)(int);//함수 포인터. 이건 변수이기에 구조체에 선언가능.
	
}Temp;

int Temp_add(int i) { 
	return 20 * i;
}

Temp* new_Temp() { //함수포인터를 연결시켜주는 작업을 하는 곳
	Temp* tmp;
	tmp = (Temp*)malloc(sizeof(Temp));
	tmp->add = Temp_add;
	tmp->data = 100;
	return tmp;
}

int main() {
	Temp* t;
	t = new_Temp();
	t->data = t->add(20);
	printf("%d\n", t->data);
	
	
	free(t);
	return 0;
}


/*
구조체 안에 함수는 선언 불가능하지만 함수포인터는?
*/