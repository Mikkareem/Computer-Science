#include<stdio.h>

int main()
{
    int n=6;
    int left=n, right=n-2;
    
    for(int i=0;i<2*n-1;i++){
        int temp=n;
        
        if(i<n) {
            left--;
            right++;
        } else {
            left++;
            right--;
        }
        
        for(int j=0;j<2*n-1;j++){
            if(j>=left && j<=right){
                printf("%d", temp);
                if(j<n-1) temp--;
                else temp++;
            } else {
                printf("*");
            }
        }
        
        printf("\n");
    }
    return 0;
}

/*
n=6

*****6*****
****656****
***65456***
**6543456**
*654323456*
65432123456
*654323456*
**6543456**
***65456***
****656****
*****6*****

n=3

**3**
*323*
32123
*323*
**3**

*/
