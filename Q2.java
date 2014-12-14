import java.util.*;
class Link
{
int data;
Link nextLink;
Link(int a)
{
nextLink=null;
data=a;
}
}
class LinkList
{
Link first=null;
Link temp;
Scanner scr=new Scanner(System.in);
void insert()
{
int data;
char answer;


do{
System.out.println("enter the data");
data=scr.nextInt();
Link link=new Link(data);
if(first==null)
{
first=link;
link=first;
}
else{
temp=first;
while(temp.nextLink!=null)
{
temp=temp.nextLink;
}
temp.nextLink=link;
}
System.out.println("enter 'y' or 'n' ");

answer =scr.next().charAt(0);
}

while(answer=='y');
}
void print()
{
temp=first;
while(temp!=null)
{
System.out.print(","+temp.data);
temp=temp.nextLink;
}
}
void removeLoop()
{
temp=first;
Link temp1,temp2=null;
temp1=temp.nextLink;

while(temp!=null)
{
temp1=temp.nextLink;

while(temp1!=null)
{

if(temp.data==temp1.data)
{

temp2.nextLink=null;
}
temp2=temp1;
temp1=temp1.nextLink;

}
temp=temp.nextLink;
}


}
}
class Q2
{
public static void main(String s[])
{
LinkList link=new LinkList();
link.insert();
link.print();
System.out.println("after removing loop");
link.removeLoop();
link.print();

}
}