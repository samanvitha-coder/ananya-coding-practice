package in.samanvitha.udemy.course.single_linked_list;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }



    public Iterator iterator(){

        return new Iterator(head);
    }

    public class Iterator{
        private EmployeeNode ptr;

        public Iterator(EmployeeNode head){

            this.ptr = head;
        }

        public boolean hasNext(){

            return ptr != null;
        }

        public int next(){
            int result = ptr == null?-1:ptr.getEmployee().getId();
            ptr = ptr == null?ptr:ptr.getNext();
            return result;
        }
    }
}
