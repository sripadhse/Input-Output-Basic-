#include <stdio.h>


 

int main(){

int n;

do

{

    scanf("%d",&n);

}

while((n<1)||(n>10));

int p=1;

for(int i=2;i<=n;i++){

p=p*i;

}

printf("%d",p);

}

