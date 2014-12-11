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
int count=0,i,j;
public Link first;

LinkList()
{
first = null;
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
public void palindrome()
{
Link temp1,temp2;
temp1=first;
temp=first;
for(i=0;i<count;i++)
{
temp1=first;
//temp=first;
for(j=0;j<(count-1-i);j++)
{
temp1=temp1.nextLink;
}
//System.out.println("temp_"+temp.data);
//System.out.println("temp1_"+temp1.data);
if(temp1.data!=temp.data)
{
System.out.print("\n");
System.out.print("string is not palindrome");
System.exit(0);
}
temp=temp.nextLink;
}
System.out.print("\n");
System.out.print("string is  palindrome");

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
count++;
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
//System.out.print("count "+count);
}
}

class Q7
{
public static void main(String s[])
{
Scanner scr3=new Scanner(System.in);
System.out.println("singleLinkList");
System.out.println("enter 1 to start");

int choice = scr3.nextInt();

LinkList link1 = new LinkList();

link1.singleInsert();link1.printList();
link1.palindrome();//link1.printList();
}
}