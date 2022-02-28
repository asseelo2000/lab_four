package lab_four.lab_four_assignment;

import lab_four.CircularyLinkedList;

/**
 * Created by Asseel Alazazi on 4/2/2022.
 */
public class R_3_7 {
    // implementation of addFirst method for Circularly Linked List
    // without creating additional node
    public void addFirst(E e){ // e stands for Element
        if (isEmpty()){
            tail=new CircularyLinkedList.Node<E>(e,null);
            tail.setNext(tail);
        }
        else {
            tail.next=new CircularyLinkedList.Node<E>(e,tail.getNext()); // rather than creating new node
        }
    }
}
