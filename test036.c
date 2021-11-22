/* bokri라는 함수를 만들어서 호출하는 형태로 100년간 100만원월 
6.6%로 운용한 결과를 출력하는 코드를 짜세요

*/

#include <stdio.h>

float bokri (int money, int years, float rate) {
	
	float total = money;
	
	int i;
	
	for ( i = 0; i<years; i++) {
		total = total + total * rate;
	}
	
	return total;
	
}



int main(void) {
	
	printf("%f", bokri(100, 100, 0.066));
	
	return 0;
}