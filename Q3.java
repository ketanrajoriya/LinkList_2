import java.util.*;
class Link
{
int data;
Link nextLink;
Link(int a)
{
data=a;
}
}

class LinkList
{
public Link first;

int count=0;

public LinkList()
{
first = null;
}
public void insert()
{
int data;
int pos=0;
Link temp;
char answer;
Scanner scr2= new Scanner(System.in);

do{
System.out.println("enter the data part of link");
data = scr2.nextInt();
temp = first;
Link link = new Link(data);

if(first==null)
{
link.nextLink=null;
first=link;
temp=first;
}
else
{
while(temp.nextLink!=null)
{
temp=temp.nextLink;
}
temp.nextLink=link;
}

System.out.println("do you want to continue select 'y' or 'n'");
Scanner scr3= new Scanner(System.in);
answer = scr3.next().charAt(0);

}
while(answer=='y');
}
void print()
{
Link temp=first;
while(temp!=null)
{
System.out.print(temp.data+",");
temp=temp.nextLink;
count++;
}
//System.out.print("count"+count);

}
void segregate()
{
int tempvar,i,j;
Link temp,temp1;
temp=first;

while(temp!=null)
{
temp1=temp.nextLink;
i=temp.data;
if(i%2!=0)
{
while(temp1!=null)
{
if(temp1.data%2==0)
{
tempvar=temp.data;
temp.data=temp1.data;
temp1.data=tempvar;
}
temp1=temp1.nextLink;
}

}
temp=temp.nextLink;
}

}
}

class Q3
{

public static void main(String s[])
{
LinkList list =new LinkList();
list.insert();
list.print();
list.segregate();
System.out.println("");
System.out.println("after segretion");
list.print();
}

}