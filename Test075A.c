#include <stdio.h>

typedef struct node {
	int name;
	struct node* next;
}Node;



int main(void) {
	Node* head;
	Node* temp;
	Node* pre;
	Node* post;
	Node* tail;
	
	head = (Node*)malloc(sizeof(Node));
	head->name = 0;
	head->next = NULL;
	tail = head;
	
	temp = (Node*)malloc(sizeof(Node));
	temp->name = 10;
	temp->next = NULL;
	head->next = temp;
	tail = temp;
	
	for (temp = head; temp!= NULL; temp = temp->next) {
		printf("%d\n", temp->name);
	}
	
	post = head;
	pre = head->next;
	
	while(pre->next !=NULL) {
		
		
		post = pre;
		pre = pre->next;
		free(post);
	}
	
	
}