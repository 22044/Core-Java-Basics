#include<stdio.h>
void push(int s[],int n,int *top,int x)
{
if(*top>=(n-1))
{
printf("Stack overflow");
return;
}
*top=*top+1;
s[*top]=x;
}
int pop(int s[],int *top)
{
if(*top==-1)
return 0;
*top=*top-1;
return(s[*top+1]);
}
int peep(int s[],int *top,int n)
{
if((*top+1-n)<0)
return 0;
return s[(*top+1-n)];
}
void change(int s[],int *top,int n,int m)
{
if((*top+1-n)<0)
printf("Stack underflow");
s[(*top+1-n)]=m;
}
int isempty(int *top)
{
if(*top<=-1)
return 1;
else
return 0;

}
int isfull(int *top,int n)
{
if(*top>=(n-1))
return 1;
else
return 0;

}
void display(int s[],int *top)
{
int i;
if(*top==-1)
printf("Stack empty");
else
{
printf("\nThe stack contains:\n\n");
for(i=*top;i>=0;i--)
printf("%d ",s[i]);
}
}
int main()
{
int n=5,*top,i,j,k;
int s[5];
*top=-1;
again:
printf("Functions on stack :\n");
printf("------------------\n\n\n");
printf("1. PUSH\n2. POP\n3. PEEP\n4. CHANGE\n");
printf("5. DISPLAY\n6. ISEMPTY \n7. ISFULL\n8. EXIT\n\n");
printf("Pick your choice :");
scanf("%d",&k);
printf("\n\n");
switch(k)
{
case 1:
printf("Enter value to be inserted :");
scanf("%d",&j);
push(s,n,top,j);
display(s,top);
goto again;
case 2:
j=pop(s,top);
if(j==0)
printf("Stack underflow\n");
else
printf("%d is deleted\n",j);
display(s,top);
goto again;
case 3:
printf("enter element position w.r.t. top : ");
scanf("%d",&i);
j=peep(s,top,i);
if(j==0)
printf("Stack underflow");
else
printf("The element is %d\n",j);
display(s,top);
goto again;
case 4:
printf("enter new element : ");
scanf("%d",&j);
printf("enter element position w.r.t. top : ");
scanf("%d",&i);
change(s,top,i,j);
display(s,top);
goto again;
case 5:
display(s,top);
goto again;
case 6:
j=isempty(top);
if(j==1)
{
printf("Stack is empty");
}
else {
printf("Stack isn't empty");
display(s,top);
}
goto again;
case 7:
j=isfull(top,n);
if(j==1)
printf("Stack is full");
else
printf("Stack isn't full");
display(s,top);
goto again;
case 8:
goto again;
default:
printf("invalid choice\a");
return 0;
}goto again;

}