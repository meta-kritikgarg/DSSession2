package stack;

public class Node<E> {
	
	protected E data;
    protected Node<E> link;
 
    //  Constructor
    public Node() {
        link = null;
        data = null;
    }    

    //  Constructor 
    public Node(E d,Node<E> n) {
        data = d;
        link = n;
    }    

    /**
     * Function to set link to next Node
     * @param n
     */
    public void setLink(Node<E> n) {
        link = n;
    }    
    
    /**
     * Function to set data to current Node
     * @param d
     */
    public void setData(E d) {
        data = d;
    }    
    
    /**
     * to get link to next node
     * @return
     */
    public Node<E> getLink() {
        return link;
    }
    
    /**
     * Function to get data from current Node 
     * @return
     */
    public E getData() {
        return data;
    }

}
