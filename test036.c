/* bokri��� �Լ��� ���� ȣ���ϴ� ���·� 100�Ⱓ 100������ 
6.6%�� ����� ����� ����ϴ� �ڵ带 ¥����

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