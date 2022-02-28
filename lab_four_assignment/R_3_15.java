package lab_four.lab_four_assignment;

import lab_four.CircularyLinkedList;

/**
 * Created by Asseel Alazazi on 4/2/2022.
 */
public class R_3_15 {
    public boolean equals(CircularyLinkedList list1, CircularyLinkedList list2) {
        boolean b = false;
        if (list1.size() == list2.size()){
            int n = list1.size ();
            Node<E> n1 = list1.tail.getNext();
            Node<E> n2 = list2.tail.getNext();
            while (n != 0){
                if (list1.tail.getElemnt ().equals ( list2.tail.getElemnt () ) || n1.getElemnt().equals ( n2.getElemnt() ) ){
                    b = true;
                }
                else b=false;
                n1 = n1.getNext();
                n2 = n2.getNext();
                n--;
            }
        }return b;
    }
}
