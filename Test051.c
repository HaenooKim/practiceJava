#include <stdio.h>

float fx(float x) {
	return x * x;
}

int main(void) {
	
	float result;
	float i;
	float cut; //�ڸ��� ����
	cut = 0.001;
	result=0;
	
	for (i = 0; i<3; i+=cut) {
		result += fx(i) * cut + ((fx(i+cut) - fx(i)) * cut *0.5);
	}
	
	printf("%f", result);
	
	return 0;
}

/*
fx�Լ��� 0���� 3���� �������� �����Ͽ� ���� ���� �󸶳� ����������� �ľ��Ͻÿ�.

y = x^2 �Լ��� 0���� 3���� �����ϴ� �Ͱ� �󸶳� ���̰� ������ �ڵ带 ¥�ÿ�.
*/