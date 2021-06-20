package in.samanvitha.design.linkedlist.model;

public class LinkedList {

    private LinkedListNode head;

    public LinkedList() {

        this.head = null;
    }

    public void insertAtBeginning(int val) {

        if (head == null) {
            head = new LinkedListNode(val);;
        } else {
            LinkedListNode node = new LinkedListNode(val);
            LinkedListNode temp = null;
            temp = node;
            temp.setNext(head);
            head=temp;

        }

    }
    public void insertAtGivenPosition(int val,int pos){
        LinkedListNode node = new LinkedListNode(val);
        if(pos<1){
            System.out.println("Invalid position");
        }
        if(head == null && pos != 1){
            return;
        }
        if(head == null && pos==1){
            head = node;
        }
        if(head != null && pos == 1){

            node.setNext(head);
            head=node;
            return;
        }

        LinkedListNode temp = head;
        LinkedListNode prev = null;
        int i=1;
        while(i<pos){
            prev = temp;
            temp = temp.getNext();
            if(temp == null)
                break;
            i++;
        }
        node.setNext(temp);
        prev.setNext(node);
    }


    public void insertAtEnd(int val) {
        LinkedListNode node = new LinkedListNode(val);

        if (head == null) {
            head = node;
        } else {
            LinkedListNode temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }


    public void deleteAtGivenPosition(int pos){

        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(pos<1){
            System.out.println("The position should be greater than or equal to 1");
            return;
        }
        LinkedListNode temp = head;
        if(pos == 1){
            head = temp.getNext();
            return;
        }

        for(int i=1; temp!=null && i < pos-1 ;i++){
            temp = temp.getNext();
        }
        if (temp == null || temp.getNext() == null) {
            return;
        }

        LinkedListNode next = temp.getNext().getNext();
        temp.setNext(next);
    }



    public boolean deleteFront(){
      if(head!= null) {
          head = head.getNext();
          return true;
      }
        else
            return false;

    }

    public boolean deleteEnd(){
        LinkedListNode temp = head;
        if(head!=null) {

            while (temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            return true;
        }
        else
            return false;

    }


    public int getSize(){
        LinkedListNode temp = head;
        int cnt=0;
        if(head==null)
            return 0;
        else{

            while (temp.getNext() != null) {
                temp= temp.getNext();
                cnt++;
            }


        }
        return cnt+1;
    }

    public boolean check(int val){
        if(head == null){
            System.out.println("The given list has no nodes");
            return false;
        }
        else{
            LinkedListNode temp = head;
            while(temp!=null){
                if(temp.getValue() == val)
                    return true;
                temp = temp.getNext();
            }
            return false;
        }
    }

    public  void reverse(){
        LinkedListNode prev = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void print() {
        System.out.print("head -> ");

        LinkedListNode ptr = head;

        while (ptr != null) {
            System.out.print(ptr.getValue() + " -> ");
            ptr = ptr.getNext();
        }

        System.out.println(" NULL ");

    }

    public Iterator iterator(){

        return new Iterator(head);
    }

    public class Iterator{
        private LinkedListNode ptr;

        public Iterator(LinkedListNode head){

            this.ptr = head;
        }

        public boolean hasNext(){

            return ptr != null;
        }

        public int next(){
            int result = ptr == null?-1:ptr.getValue();
            ptr = ptr == null?ptr:ptr.getNext();
            return result;
        }
    }

}
