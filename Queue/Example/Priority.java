package Queue.Example;

class Priority {
    private int maxsize;
    private int qarray[];
    private int nItem;

    public Priority(int s) {
        maxsize = s;
        qarray = new int[maxsize];
        nItem = 0;
    }

    public void insert(int item) {
        int j;

        if (nItem == 0) {
            qarray[nItem++] = item;
        } else {
            for (j = nItem - 1; j >= 0; j--) {
                if (item > qarray[j]) {
                    qarray[j + 1] = qarray[j];
                } else
                    break;
                qarray[j + 1] = item;
                nItem++;
            }
        }

    }

    public void insertz(int item) {
        int j;

        if (nItem == 0) {
            qarray[nItem++] = item;
        } else {
            for (j = nItem - 1; j >= 0; j--) {
                if (item > qarray[j]) {
                    qarray[j + 1] = qarray[j];
                } else
                    break;
                qarray[j + 1] = item;
                nItem++;
            }
        }
    }

    public int remove() {
        return qarray[--nItem];
    }

    public boolean isEmpty() {
        return nItem == 0;
    }

    public int peek() {
        return qarray[nItem - 1];
    }

    public boolean isFull() {
        return (nItem == maxsize);
    }
}

class PriorityQ {
    public static void main(String[] args) {
        Priority thePQ = new Priority(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
    }
}