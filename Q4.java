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
}

void delete()
{
int tempvar,i,j;
Link temp,temp1,Li;
temp=first;
while(temp!=null)
{
Li=temp;
temp1=temp.nextLink;
//if(temp=start)
if((temp1.data)>((temp1.nextLink).data))
{
temp.nextLink=(temp1.nextLink).nextLink;
}
temp1=temp.nextLink;
}
}
}
class Q4
{

public static void main(String s[])
{
LinkList list =new LinkList();
list.insert();
list.print();
list.delete();
System.out.println("");
System.out.println("after deletion");
list.print();
}

}