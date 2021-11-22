#include <stdio.h>

float fx(float x) {
	return x * x;
}

int main(void) {
	
	float result;
	float i;
	float cut; //자르는 간격
	cut = 0.001;
	result=0;
	
	for (i = 0; i<3; i+=cut) {
		result += fx(i) * cut + ((fx(i+cut) - fx(i)) * cut *0.5);
	}
	
	printf("%f", result);
	
	return 0;
}

/*
fx함수를 0부터 3까지 구간으로 적분하여 실제 값과 얼마나 가까워지는지 파악하시오.

y = x^2 함수를 0에서 3까지 적분하는 것과 얼마나 차이가 나는지 코드를 짜시오.
*/