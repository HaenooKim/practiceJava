#include <stdio.h>

typedef struct node {
	int name;
	struct node* next;
}Node;



Node* init() {
	Node *t;
	t = (Node*)malloc(sizeof(Node));
	t->name = 0;
	t->next = NULL;
	
	return t;
}

void init_v2(Node** a, Node** b) {
	*a = (Node*)malloc(sizeof(Node));
	(*a)->name = 0;
	(*a)->next = NULL;
	(*b) = (*a);
}

Node* add(Node* tail, int data) {
	Node *temp = (Node*)malloc(sizeof(Node));
	temp->name = data;
	temp->next = NULL;
	tail->next = temp;
	
	return temp;
}

void print_all(Node* head) {
	Node *i;
	
	for (i = head->next; i != NULL; i = i->next) {
		printf("%d\n", i->name);
	}
	
}

Node* delete_all(Node* head) {
	Node* post;
	Node* pre;
	
	post = head;
	pre = head->next;
	
	while (pre !=NULL) {
		post = pre;
		pre = pre->next;
		
		free(post);
	}
	
	return head;
}


int main() {
	
	
	Node* head;
	Node* tail;
	Node* temp;
	Node* post;
	Node* pre;
	
	
	init_v2(&head, &tail);
	
		
	/*
	head = (Node*)malloc(sizeof(Node));
		tail = head;
		head->name = 0;
		head->next = NULL;

	*/
		
	
	tail = add(tail, 10);
	tail = add(tail, 20);

	
	/*temp = (Node*)malloc(sizeof(Node));
	temp->name = 10;
	temp->next = NULL;
	tail->next = temp;
	tail = temp;
	*/
	
	/*
	temp = (Node*)malloc(sizeof(Node));
	temp->name = 20;
	temp->next = NULL;
	
	tail->next = temp;
	tail = temp;
	*/
	
	
	
	print_all(head);
	/*
	for (temp = head->next; temp != NULL; temp=temp->next) {
		printf("%d\n", temp->name);
	}
	*/
	
	
	
	tail = delete_all(head);
	/*
	post = head;
	pre = head->next;
	for ( ; pre!=NULL; ) {
		
		post = pre;
		pre = pre->next;
		free(post); //앞에서 부터 하나씩 지우는 코드
	}
	tail = head;
	*/
	free(head->next->next);
	free(head->next);
	free(head);
	
	return 0;
}

