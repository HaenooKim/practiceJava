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
�̹����� �������� �ܸ��� ���ڸ� ���ϴ� �Լ� danri�� ���� 
100������ 10�Ⱓ �������� ���� ����� ���弼��.
*/