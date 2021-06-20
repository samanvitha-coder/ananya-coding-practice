package in.samanvitha.design.linkedlist.service;

import in.samanvitha.design.linkedlist.model.LinkedList;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int element : arr){
            list.insertAtEnd(element);
        }
        System.out.println(list.deleteFront());
        list.print();
        System.out.println(list.deleteEnd());
        list.print();
        list.insertAtBeginning(11);
        list.print();
        list.insertAtGivenPosition(12,2);
        list.print();
        list.deleteAtGivenPosition(9);
        list.print();
        System.out.println(list.getSize());
        System.out.println(list.check(9));
        System.out.println(list.check(23));
        list.reverse();
        list.print();
    }
}
