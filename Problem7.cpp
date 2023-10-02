#include<bits/stdc++.h>
using namespace std;
int main()
{
string a;
int b,c;
cin>>a>>b;
sort(a.begin(),a.end(),greater());

c=atoi(a.c_str());

if(b>c)
{cout<<-1;
return 0;}
while(b<c)
{
prev_permutation(a.begin(),a.end());
c=atoi(a.c_str());
}
next_permutation(a.begin(),a.end());
cout<<a;
}
