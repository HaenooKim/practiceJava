#include <stdio.h>

int main(void ) {
	
	float money = 100;
	int years = 100;
	float rate = 0.066;
	int i;
	
	for (i=0; i<years; i++) {
		money = money + money*rate;
	}
	
	printf("%f", money);
	
	return 0;
}

// 100������ 100�Ⱓ 6.6% ���ڷ� ������ ���� �����?