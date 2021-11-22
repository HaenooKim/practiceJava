#include <stdio.h>


typedef struct temp {
	int data;
	int (*add)(void*, int);
}Temp;



void Temp_Constructor(void* self, int i) {
	Temp* this;
	this = (Temp*)self;
	this->data = i;
}


Temp* new_Temp() {
	Temp* tmp;
	tmp = (Temp*)malloc(sizeof(Temp));
	tmp->add = Temp_add;
	
	Temp_Constructor(tmp, d);
	
	returm tmp;
}