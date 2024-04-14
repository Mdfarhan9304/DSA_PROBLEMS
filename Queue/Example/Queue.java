package Queue.Example;

class Queuee {
    private int maxsize;
    private int[] qarray;
    private int front;
    private int rear;
    private int nitem;

    public Queuee(int s) {
        maxsize = s;
        qarray = new int[maxsize];
        front = 0;
        rear = -1;
        nitem = 0;
    }

    public void insert(int data) {
        if (rear == maxsize - 1) {
            rear = -1;
        }
        qarray[++rear] = data;
        nitem++;
    }

    public int remove() {
        int temp = qarray[front++];
        if (front == maxsize) {
            front = 0;
        }
        nitem--;
        return temp;
    }

    public int peek() {
        return qarray[front];
    }

    public boolean isEmpty() {
        return nitem == 0;
    }

    public boolean isfull() {
        return nitem == maxsize;
    }

    public int size() {
        return nitem;
    }
}

public class Queue {
    public static void main(String[] args) {
        Queuee practice = new Queuee(7);
        practice.insert(10);
        practice.insert(20);
        practice.insert(30);
        practice.insert(40);

        while (!practice.isEmpty()) {
            int n = practice.remove();
            System.out.print(n + " ");
        }
    }
}
