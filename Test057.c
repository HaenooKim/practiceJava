#include <stdio.h>

struct apple {
	int name;
	int value;
};

int main(void) {
	struct apple *t;
	t->name = 100;
	t->value = 200;
	printf("%d %d\n", t->name, t->value);
	
	
	t = (struct apple*)malloc(sizeof(struct apple));
	
	free(t);
	return 0;
}
