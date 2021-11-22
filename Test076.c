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
	
	// �ʱ��Ȳ
	head = (Node*)malloc(sizeof(Node));
	tail = head;
	
	head->name = 0;
	head->next = NULL;

	// 10 �� ����� ����
	temp = (Node*)malloc(sizeof(Node));
	temp->name = 10;
	temp->next = NULL;
	
	tail->next = temp;
	tail = temp;	// tail->next �� ���� ( ���� ��� )
	
	// 20 �� ����� ����	
	temp = (Node*)malloc(sizeof(Node));
	temp->name = 20;
	temp->next = NULL;
	
	tail->next = temp;
	tail = temp;
	
	// 10 20 ���
	for( temp = head->next ; temp != NULL ; temp = temp->next ) {
		printf("%d\n", temp->name );
	}
	
	//	�տ��� ���� ���ʷ� �����ϰ� �ʱ��Ȳ���� ����
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
