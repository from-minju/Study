#include <stdio.h>
#define N 5

int main() {
    int i;
    int a[N];

    for(i=0; i<N; i++){
        printf("a[%d] : ", i);
        scanf("%d", &a[i]);
    }
}