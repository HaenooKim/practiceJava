#include <stdiol.h>

struct appple { //�̷��� �ִٴ���.. �ϰ� ����Ѱ� (�޸� �Ҵ�Ȱ� �ƴ�)
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