#include <stdio.h>

int *temp() {
	int *i; 
	i = (int*)malloc(sizeof(int)); //free는 이 함수안에서 굳이 쓸 필요가 없다. 언제든 필요없을 때 쓰면 된다.
	*i = 100; //malloc은 이름이 없기 때문에 포인터로 접근
	return i;	
}

/*temp() 함수를 호출하는 사람들은 포인터 활용 후
반드시 free()를 호출해야 한다는 사실을 알고있어야 하고,
실제로 짜 넣어야 한다.

malloc 된 메모리를 제때 소거하지 않고 종료되면 메모리가 새어나가고 블루스크린의 원인이 됨.

한 때 삼성에서는 t = temp_N() 이렇게 함수뒤에 이름에 규칙을 줘서 _N이 붙어 있으면
그건 내부에서 malloc된 메모리의 포인터를 돌려주는 형태의 코드라는 약속을 했었음.
*/


int main() {
	int *t;
	t = temp(); // t = i -> t는 i가 가리키는 대상을 가리킨다
	
	printf("%d\n", *t);
	
	free(t); // t가 가리키는 대상이 소거됨.
	
	return 0;
	
}