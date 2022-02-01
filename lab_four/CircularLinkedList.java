package lab_four;

/**
 * Created by Asseel Tarish Alazazi  on 2/1/2022.
 */
public class CircularLinkedList <E>{
    private Node<E> tail=null;
    private int size=0;

    public CircularLinkedList() {
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;

    }
    public E first(){
        if (isEmpty())return null;
        return tail.getNext().getElemnt();
    }
    public E last(){
        if (isEmpty())return null;
        return tail.getElemnt();
    }





    public void addFirst(E ele){
        if (isEmpty()){
            tail=new Node<E>(ele,null);
            tail.setNext(tail);
        }
        else {
            Node<E> newNode=new Node<E>(ele,tail.getNext());
            tail.setNext(newNode);

        }
        size++;
    }
    public void addLast(E ele){
        addFirst(ele);
        tail=tail.getNext();
    }
    public E removeFirst(){
        if (isEmpty())return null;
        Node<E> x=tail.getNext();
        if (x==tail) tail=null;
        else tail.setNext(x.getNext());
        size--;
        return x.getElemnt();
    }
    public void rotate(){
        if(tail !=null)
            tail=tail.getNext();
    }




    private static class Node<E>{
        private E elemnt;
        private Node<E> next;

        public Node(E elemnt, Node<E> next) {
            this.elemnt = elemnt;
            this.next = next;
        }

        public E getElemnt() {
            return elemnt;
        }


        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
