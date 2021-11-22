#include <stdio.h>

struct node {
	int name;
	struct node* next;
};


int main() {
	struct node* head;
	struct node* tail;
	
	head = (struct node*)malloc(sizeof(struct node));
	tail = head; //포인터 끼리 대입은 head가 가리키고 있는 대상을 tail이 가리키게 된다.
	
	tail->next = (struct node*)malloc(sizeof(struct node));
	tail->next->name = 10;
	tail = tail->next;
	
	
	tail->next = (struct node*)malloc(sizeof(struct node));
	tail->next->name = 20;
	tail = tail->next;
	
	free(head->next->next);
	free(head->next); //순서주의
	free(head);
	
	return 0;
}


