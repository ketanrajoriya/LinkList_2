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
Link temp;

public Link first;
DoubleLink start;

LinkList()
{
first = null;
start=null;
}
public void printList()
{
temp=first;
while(temp!=null)
{
System.out.print(temp.data+",");
temp=temp.nextLink;
}
}
public void duplicate()
{
Link temp1,temp2,temp3=null;
temp1=first;
while(temp1!=null)
{
temp2=temp1.nextLink;
while(temp2!=null)
{
if(temp1.data==temp2.data)
{
System.out.println("match"+temp2.data);
temp3.nextLink=(temp3.nextLink).nextLink;
}
temp3=temp2;
temp2=temp2.nextLink;
}
temp1=temp1.nextLink;
}
}
public void singleInsert()
{
int data;
int pos=0;
Link temp;
char answer;
Scanner scr2= new Scanner(System.in);
do
{
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
while( temp.nextLink!=null) 
{
temp=temp.nextLink;
}
temp.nextLink=link;
link.nextLink=null;
}
System.out.println("do you want to continue select 'y' or 'n'");
Scanner scr3= new Scanner(System.in);
answer = scr3.next().charAt(0);

}
while(answer=='y');
}
}

class Q6
{
public static void main(String s[])
{
Scanner scr3=new Scanner(System.in);
System.out.println("singleLinkList");
System.out.println("enter 1 to start");

int choice = scr3.nextInt();

LinkList link1 = new LinkList();

link1.singleInsert();link1.printList();
System.out.println("After removing duplicate");
link1.duplicate();link1.printList();
}

}