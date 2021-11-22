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
		free(post); //�տ��� ���� �ϳ��� ����� �ڵ�
	}
	free(head); //������� ���� tail�� head�� ����.
	
	free(head->next->next);
	free(head->next);
	free(head);
	
	return 0;
}


/*
	typedef : ����ڰ� ���� �ڷ��� (struct node�� Node�� �ٿ��� ��밡��)
	��� ������ �������� NULL�� ���԰���. -> '�ƹ��͵� ����Ű�� �ʴ´�'
	
	
	�迭�� ���ϱ� �ص� �ѹ� ����� ������ ũ�⸦ �ø��ų� ���� �� ����.
	
	��ũ�� ����Ʈ�� ���뷮�� �޸� �ѵ� �ȿ��� ��� �þ�ų� �پ�� �� �ִ�.
	
	���� ��尡 �ϳ� �� �ʿ��� ����? �ΰ��� �����͸� ���������� �̵���Ű�� ����.
	
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