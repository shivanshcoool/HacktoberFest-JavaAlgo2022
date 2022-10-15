public class DeletionInSinglyLinkedList {

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    int size;

    public DeletionInSinglyLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null)
            tail = head;
        ++size;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }    

        Node node = new Node(value,null);
        tail.next = node;
        tail = node;
        ++size;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;

        if(head == null)    tail = null;

        --size;

        return value;
    }

    public Node get(int index){
        Node temp = head;

        for(int i = 0 ; i< index ; ++i)
            temp = temp.next;
            
        return temp;
    }
    
    public int deleteLast(){
        
        if(size<=1){
            return deleteFirst();
        }

        int value = tail.value;

        tail = get(size-2);     //getting back a pointer to a node at a particular index
        tail.next = null;

        --size;

        return value;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.print("END\n");
    }
}
