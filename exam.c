#include <stdio.h>

int* sort(int *l, int len) {
    int i, j, temp, min, min_idx; //{2, 7, 4, 8}
    
    for (i=0; i<len; i++) {
        min = l[i];
		min_idx = i;
        for (j = i+1; j<len; j++) {
            if (l[j]<min) {
                min = l[j]; //최소값
                min_idx = j; //최소값 인덱스
            }
        } 
        if (l[i] > min) {
            temp = l[i];
            l[i] = min;
            l[min_idx] = temp;
        }
    }
    return l;
}

int main() {
    
    int l[] = {9, 8, 7, 7};
    int i, len;
    int* t;
    
    t = (int*)malloc(sizeof(int)*5);
    len = sizeof( l ) / sizeof( int );
 
    for( i = 0 ; i < len ; i++ ) {
        printf("%d\n", l[i]);
    }
    
    t = sort( l, len );

    for( i = 0 ; i < len ; i++ ) {
        printf("%d\n", *(t+i) );
    }
    
    free( t );
    return 0;
}
