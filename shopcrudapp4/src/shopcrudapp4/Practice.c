

/*
//simple i/p and o/p array 1D
#include<stdio.h>
int main()
{
    int arr_len;
    int arr[] = {10 , 20 , 30 , 40 , 50};
    arr_len = sizeof(arr)/sizeof(arr[0]);
    printf("\n Size of arr is : %d",arr_len);

    for(int i=0 ; i<arr_len ; i++){
        printf("\n %d",arr[i]);
    }


    printf("\n %d",arr[0]);

    return 0;
}
*/

#include<stdio.h>
int main()
{
    int arr[][] = {{2,3,4},{4,5,6}};
    arr_len = sizeof(arr[0])/sizeof(arr[0][0]);

    for(int i=0 ; i<arr_len ; i++){
        for(int j=i ; j<=i ; j++){
                printf("\n %d",arr[i][j]);

        }

    }

    return 0;
}