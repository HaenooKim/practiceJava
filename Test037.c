#include <stdio.h>
float danri(int money, int years, float rate) {
	
	float total = money;
	
	return total + total * years * rate;
	
}


int main(void) {
	float a = danri(100, 100, 0.066);
	
	printf("%f", a);
	
	
	return 0;
}


/*
이번에는 복리말고 단리로 이자를 구하는 함수 danri를 만들어서 
100만원을 10년간 이자율로 굴린 결과를 만드세요.
*/