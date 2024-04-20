package Queue.Example;

public class Deque {
    private int maxsize;
    private int nitem;
    private int front;
    private int rear;
    private int[] dequearray;

    public Deque(int s){
        maxsize=s;
        dequearray= new int [maxsize];
        front=0;
        rear=-1;
        nitem=0;
    }

    public void insertleft(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        if(front==0){
            front=maxsize;
        }
        dequearray[--front]= data;
        nitem++;
    }

    public void insertright(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        rear= (rear+1)% maxsize;
        dequearray[rear]= data;
        nitem++;
    }
    
   public int removeleft(){
    if(isEmpty()){
        System.out.println("Queue is empty");
    }
    int item= dequearray[front++]; 
    if(front==maxsize){
        front=0;
    }
    nitem--;
    return item;

   } 

   public int removeright(){
    if(isEmpty()){
        System.out.println("Queue is empty");
    }
    int item= dequearray[rear--]; 
    if(rear==-1){
        rear=maxsize-1;
    }
    nitem--;
    return item;

   } 

   public boolean isEmpty(){
    return nitem==0;
   }

   public boolean isFull(){
    return nitem==maxsize;
   }

   public static void main(String[] args) {
    Deque d= new Deque(10);
    d.insertleft(1);
    d.insertleft(2);
    d.insertleft(3);
    d.insertleft(4);
    d.insertright(5);
    d.removeleft();
    for (int i = d.front, count = 0; count < d.nitem; i = (i + 1) % d.maxsize, count++) {
        System.out.print(d.dequearray[i] + " ");
    }
    System.out.println();
   
   }

}
