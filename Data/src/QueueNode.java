import java.util.Scanner;

public class QueueNode {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    public QueueNode() {
        this.front = null;
        this.rear = null;
    }

    public void insert(int value) { //ko hiu value o dau ra
        Node newNode = new Node(value);
        if (Empty()){ // isEmpty o day la gi
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode; // rear.next la rear toi tao o tren va node toi tao o tren luon a. ko hieu phan nay lam
            rear = newNode;
        }
        System.out.println ("you just insert: " + value);
    }

    public int delete() {
        if (Empty()){
            throw new RuntimeException("the Queue is empty"); //tai sao lai dung exception o day ma nay o tren empty ko dung exceoption
        }
        int value = front.data; // front la gi, data la gi - 2 thanh phan cach nhau boi dau cham thi la goi kieu gi
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return value;
    }

    public boolean Empty(){
        return front == null;
    }

    public void display(){
        if (Empty()) {
            System.out.println("the queue is empty");
            return;
        }
        Node temp = front; // temp la ban sao con tro, front van dung yen
        System.out.print("the Queue (front to rear):  ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueNode queue = new QueueNode();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU QUEUE =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("input number: ");
                    int value = sc.nextInt();
                    queue.insert(value);
                    break;
                case 2:
                    System.out.println("you just deleted: " + queue.delete());
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("good bye.");
                    break;
                default:
                    System.out.println("invalid choose");
            }
        } while (choice != 4);

        sc.close();
    }
}