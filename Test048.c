#include <stdio.h>

int strlen2(char *a) {
	int len, i;
	len =0;
	i = 0;
	
	for (i=0; *(a+i); i++) {
		len ++;
	}
	
	return len;
}


int main(void) {
	char *t = "HelloWorld\0";
	
	printf("%d", strlen2(t));
	
	return 0;
}
/*
\0은 실제로 문장의 일부가 아니라 0이라는 값을 의미하는 특수한 표현식이다.


char *를 매개변수로 갖는 strlen2함수를 만들고, 이것은 문자열의 길이를 재도록
하세요.
*/
