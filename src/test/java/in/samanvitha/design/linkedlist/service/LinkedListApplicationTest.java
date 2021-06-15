package in.samanvitha.design.linkedlist.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import in.samanvitha.design.linkedlist.model.LinkedList;

class LinkedListApplicationTest {

    @Test
    public void testCaseInputAtEnd(){
        int arr[] = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        LinkedList.Iterator iterator = list.iterator();

        Assertions.assertEquals(iterator.hasNext(),true);
        Assertions.assertEquals(iterator.next(),1);
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(iterator.next(),3);
        Assertions.assertEquals(iterator.next(),4);
        Assertions.assertEquals(iterator.next(),5);
        Assertions.assertEquals(iterator.hasNext(),false);


    }

    @Test
    public void testCaseInputAtBeginning(){
        int arr[] = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtBeginning(element);
        }
        LinkedList.Iterator iterator = list.iterator();

        Assertions.assertEquals(iterator.hasNext(),true);
        Assertions.assertEquals(iterator.next(),5);
        Assertions.assertEquals(iterator.next(),4);
        Assertions.assertEquals(iterator.next(),3);
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(iterator.next(),1);
        Assertions.assertEquals(iterator.hasNext(),false);
    }

    @Test
    public void testCaseDelete(){
        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        list.deleteFront();
        LinkedList.Iterator iterator = list.iterator();
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(list.deleteEnd(),true);
    }
}