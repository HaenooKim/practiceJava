#include <stdio.h>

typedef struct abcd {
	int name;
	struct abcd* next;
} Node;

/*
	init
	add
	print_all
	delete_all
*/

int main() {
	Node* head;
	Node* tail;
	Node* temp;
	Node* post;
	Node* pre;
	
	// 초기상황
	head = (Node*)malloc(sizeof(Node));
	tail = head;
	
	head->name = 0;
	head->next = NULL;

	// 10 이 생기고 붙음
	temp = (Node*)malloc(sizeof(Node));
	temp->name = 10;
	temp->next = NULL;
	
	tail->next = temp;
	tail = temp;	// tail->next 도 가능 ( 같은 얘기 )
	
	// 20 이 생기고 붙음	
	temp = (Node*)malloc(sizeof(Node));
	temp->name = 20;
	temp->next = NULL;
	
	tail->next = temp;
	tail = temp;
	
	// 10 20 출력
	for( temp = head->next ; temp != NULL ; temp = temp->next ) {
		printf("%d\n", temp->name );
	}
	
	//	앞에서 부터 차례로 삭제하고 초기상황으로 돌림
	post = head;
	pre = head->next;
	while( pre != NULL ) {
		post = pre;
		pre = pre->next;
		
		free( post );
	}
	tail = head;
	
	free( head );
	
	return 0;
}
