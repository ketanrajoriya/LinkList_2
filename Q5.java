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

class DoubleLink
{
int data;
DoubleLink nextLink;
DoubleLink prevLink;
DoubleLink(int a)
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
else if(data<temp.data)
{
link.nextLink=first;
first=link;
temp=first;
}
else 
{
while( data>temp.data && temp.nextLink!=null) 
{
temp=temp.nextLink;
}
link.nextLink=temp.nextLink;
temp.nextLink=link;
}
System.out.println("do you want to continue select 'y' or 'n'");
Scanner scr3= new Scanner(System.in);
answer = scr3.next().charAt(0);

}
while(answer=='y');
}

}

class Q5
{
public static void main(String s[])
{
Scanner scr3=new Scanner(System.in);
System.out.println("select your option: 1-SingleLinkList, 2-DoubleLinkList, 3-CircularLinkList");
int choice = scr3.nextInt();

LinkList link1 = new LinkList();

        
switch(choice)
{
case 1:link1.singleInsert();link1.printList();
break;
/*case 2:link1.insert();link1.printList();link1.delete();link1.printList();
break;
case 3:link1.update();link1.printList();
break;

LinkList list =new LinkList();
list.insert();
list.print();
list.delete();
System.out.println("");
System.out.println("after deletion");
list.print();
*/
}

}
}