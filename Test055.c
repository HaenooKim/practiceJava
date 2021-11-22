#include <stdiol.h>

struct appple { //이렇게 있다더라.. 하고 명시한것 (메모리 할당된거 아님)
	int name;
	int value;
};

int main() {
	
	struct apple i;
	struct apple j;
	i.name = 100;
	i.value = 200;
	
	printf("%d %d\n", i.name, i.value);
	
	return 0;
}