#include <stdio.h>

typedef struct node {
	int name;
	struct node* next;
}Node;

int main() {
	
	
	Node* head;
	Node* tail;
	Node* temp;
	Node* post;
	Node* pre;
	
	
	head = (Node*)malloc(sizeof(Node));
	tail = head;
	
	head->name = 0;
	head->next = NULL;
	
	temp = (Node*)malloc(sizeof(Node));
	temp->name = 10;
	temp->next = NULL;
	tail->next = temp;
	tail = temp;
	
	
	temp = (Node*)malloc(sizeof(Node));
	temp->name = 20;
	temp->next = NULL;
	
	tail->next = temp;
	tail = temp;
	
	for (temp = head->next; temp != NULL; temp=temp->next) {
		printf("%d\n", temp->name);
	}
	
	post = head;
	pre = head->next;
	for ( ; pre!=NULL; ) {
		
		post = pre;
		pre = pre->next;
		free(post); //앞에서 부터 하나씩 지우는 코드
	}
	free(head); //다지우고 나서 tail을 head로 변경.
	
	free(head->next->next);
	free(head->next);
	free(head);
	
	return 0;
}


/*
	typedef : 사용자가 정한 자료형 (struct node를 Node로 줄여서 사용가능)
	모든 포인터 변수에는 NULL이 대입가능. -> '아무것도 가리키지 않는다'
	
	
	배열은 편하긴 해도 한번 만들어 놓으면 크기를 늘리거나 줄일 수 없다.
	
	링크드 리스트는 기억용량이 메모리 한도 안에서 계속 늘어나거나 줄어들 수 있다.
	
	더미 노드가 하나 더 필요한 이유? 두개의 포인터를 순차적으로 이동시키기 위함.
	
----------------------------------
struct node {
	int name;
	struct node* next;
};

int main() {
	
	
	struct node* head;
	head = (struct node*)malloc(sizeof(struct node));
	head->name;
	head->next = head;
	
	free(head);
	
	return 0;
}
*/