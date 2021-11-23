#include <stdio.h>

struct node {
	int name;
	struct node* next; //����ü �ȿ� ����ü�� ���ִ� �� �ƴ϶� �����Ͱ� ���ִ� ��.
};


int main() {
	struct node* head;
	struct node* tail;
	
	head = (struct node*)malloc(sizeof(struct node));
	tail = head; //������ ���� ������ head�� ����Ű�� �ִ� ����� tail�� ����Ű�� �ȴ�.
	
	tail->next = (struct node*)malloc(sizeof(struct node));
	tail->next->name = 10;
	tail = tail->next;
	
	
	tail->next = (struct node*)malloc(sizeof(struct node));
	tail->next->name = 20;
	tail = tail->next;
	
	free(head->next->next);
	free(head->next); //��������
	free(head);
	
	return 0;
}


