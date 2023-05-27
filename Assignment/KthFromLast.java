import java.util.*;
public class KthFromLast {

    public class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public int solve(int k){
        Node slow=head;
        Node fast=head;
        while(k--!=1){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        KthFromLast abc=new KthFromLast();
        int n=sc.nextInt();
        while(n!=-1){
            abc.addNode(n);
            n=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.print(abc.solve(k));
    }
}
