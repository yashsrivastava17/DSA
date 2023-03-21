import java.util.Scanner;

//linkedlist definition

public class HelloWorld
{
	public static void main(String[] args) {
	    
	LinkedList ll = new LinkedList();
    System.out.println("Welcome to Linked List Learning Experience \n ");
    System.out.println("                    Curated by ~Yash Srivastava \n");
    System.out.println();
    System.out.println("1.SINGLY LINKED LIST :");
    System.out.println("Singly linked list, what a classic good choice my G! Heres the Menu-:");
    System.out.println("1. initialise the linked list (implemented using insert at beginning)");
    System.out.println("2. initialise the linked list (implemented using insert at end)");
    System.out.println("3. insert at beginning");
    System.out.println("4. insert at end");
    System.out.println("5. Exit");
    System.out.println("****************************");
    System.out.println();
    System.out.println("*~PLAYGROUND~* \n");
    boolean active =true;
    while (active == true){
    System.out.println("Choose your poison:");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    switch(choice){
        case 1:{
            System.out.println("Enter 0 when you want to stop entering: \n");
            int new1=1;
            int count=0;
            while(new1 !=0){
                
                new1 = sc.nextInt();
                    if (count==0 && new1 == 0){
                         System.out.println("Need to have atleast one element dumbo");
                         break;
                    }
                    if(new1 != 0){
                    ll.insertatbeg(new1);
                    count = count +1;
                    System.out.println(new1 + " inserted succesfully at " + count);
                    System.out.println();
                    }
            }
            
            System.out.println("Initiated Linked List with "+ count + " elements is: ");
            ll.printlist();
            System.out.println();
            break;
            
        }
        
        case 2:{
            System.out.println("work in progress TBD! check back later");
            break;
        }
        
        case 3:{
            System.out.println("Enter the Data");
            int new2 = sc.nextInt();
            ll.insertatbeg(new2);
            System.out.print("Updated Linked List is ");
            ll.printlist();
            System.out.println();
            break;
        }
        
        case 4:{
            System.out.println("Enter the Data");
            int new3 = sc.nextInt();
            ll.insertatend(new3);
            System.out.print("Updated Linked List is ");
            ll.printlist();
            System.out.println();
            break;
            
        }
        
        case 5:{
            System.out.println("Thanks for playing! this was singly linked list");
            System.out.println("Your Linked List is ");
            ll.printlist();
            active =false;
            break;
            
        }
        
    }
    
    }
    
	}
}

class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node (int d){
            data =d;
            next = null; 
            //in java the variable of the object just stores the address to 
            //where the object is / (i.e) the reference to it
            //thats why we directly assigning to the object name 
        }
    }
    
    public void printlist(){
        Node n;
        n = head;
        while (n != null){
            System.out.print(n.data + ", ");
            n=n.next;
        }
    }
    
    public void insertatbeg(int data){
        Node n = new Node(data);
        n.next = head;
        head=n;
        //now will the original head not have any node declarations just for it in main, 
        //so it cannot be called by node
        //maybe a node would only need declaration just to make itself and then it wont be 
        //called by its node name just by references of various linked lists;
    }
    
    public void insertatend(int data){
        Node n = new Node(data);
        if (head==null){
            head = n;
        }
        
        n.next = null;
        Node last = head;
        while (last.next !=null){
            last = last.next;
        }
        last.next = n;
    }
    
    
}

