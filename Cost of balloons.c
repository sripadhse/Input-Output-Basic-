#include<stdio.h>

int main()

{

    int t,a,b,n,i,j,k,x,y,m[10][2];

    scanf("%i",&t);

for(i=1; i<=t; i++)

    {

        x=0;

        y=0;

        if(i%2==0)

        {

            scanf("%i%i",&b,&a);

        }

        else

        {

scanf("%i%i",&a,&b);

        }

        scanf("%i",&n);

        for(j=0; j<n; j++)

        {

            for(k=0; k<2; k++)

            {

                scanf("%i",&m[j][k]);

            }

            printf("\n");

        }

        for(j=0; j<n; j++)

        {

            if(m[j][0]==1)

            {

                x+=a;

            }

            if(m[j][1]==1)

            {

                y+=b;

            }

        }

        printf("%i\n",x+y);

    }

return 0;

}