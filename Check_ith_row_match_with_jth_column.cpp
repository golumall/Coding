#include<iostream>
using namespace std;
int main()
{
    long long n,i,j,k=0;
    cin>>n;
    int f=0,f1=0;
    long long a[n][n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            cin>>a[i][j];
        }

    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(a[i][j]!=a[j][k])
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            k++;
            f=0;
        }
        else
        {
            cout<<"Matched row and column : "<<k+1<<endl;
            f1=1;
            break;
        }

    }
    if(f1==0)
        cout<<"Not Matched"<<endl;

    return 0;
}
