#include<stdio.h>
void main(){
    printf("Enter N: ");
    int n;
    int count = 0;
    scanf("%d",&n);
    for(int i = 2;i<=n;i++){
        int a =0;
        for(int j =1;j<=i;j++){
            if(i%j==0){
                a++;
            }
        }
        if(a==2){
            printf("%d ",i);
            // count++;
        }

    }
    // printf("%d",count);
}