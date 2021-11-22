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

// 100만원을 100년간 6.6% 이자로 복리로 굴린 결과는?