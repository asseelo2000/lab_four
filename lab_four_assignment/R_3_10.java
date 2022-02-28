package lab_four.lab_four_assignment;

/**
 * Created by Asseel Alazazi on 4/2/2022.
 */
public class R_3_10 {
    // implementing the size method with variable not as instance variable
    public int Size(){
        int s=0; // s for size
        if (tail==null) return s;
        else s++;
        Node<E> node=tail;
        while (node.getNext()!=tail){
            s++;
            node=node.getNext();
        }
        return s;
    }
}
