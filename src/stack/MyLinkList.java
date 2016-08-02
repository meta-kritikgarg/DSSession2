package stack;

public class MyLinkList<E> {
	
	 	protected Node<E> start;
	    protected Node<E> end ;
	    public int size ;
	 
	    /*  Constructor  */
	    public MyLinkList() {
	        start = null;
	        end = null;
	        size = 0;
	    }
	    
	    /**
	     * Function to check if list is empty
	     * @return
	     */
	    public boolean isEmpty() {
	        return start == null;
	    }
	    
	    /**
	     * to get size of list
	     * @return
	     */
	    public int getSize() {
	        return this.size;
	    }


	    /**
	     * Function to insert an element at beginning
	     * @param e
	     */
	    public void insertAtStart(E e) {
	        Node<E> newNode = new Node<E>(e, null);    
	        if(start == null) {
	            start = newNode;
	            end = start;
	        }
	        else {
	            newNode.setLink(start);
	            start = newNode;
	        }
	        size++ ;    
	    }
	    
	    
	    /**
	     * Function to insert an element at end 
	     * @param e
	     */
	    public void add(E e) {
	        Node<E> newNode = new Node<E>(e,null);    
	        //LinkList is empty
	        if(start == null) {
	            start = newNode;
	            end = start;
	        }
	        else {
	            end.setLink(newNode);
	            end = newNode;
	        }
	        size++ ; 
	    }
	    
	    
	    /**
	     * Function to insert an element at index 
	     * @param data
	     * @param index
	     */
	    public void insertAtPos(E e , int index) {
	        Node<E> newNode = new Node<E>(e, null);                
	        Node<E> ptr = start;
	        for (int i = 0; i < size; i++) {
	            if (i == index-1) {
	                Node<E> tmp = ptr.getLink() ;
	                ptr.setLink(newNode);
	                newNode.setLink(tmp);
	                break;
	            }
	            ptr = ptr.getLink();
	        }
	        size++ ;
	    }
	    
	    
	    public E getByIndex(int index) {
	    	if(size>index) {
		    	 Node<E> tmp = start;
		    	 for (int i = 0; i < index ; i++) {
			                tmp = tmp.getLink();
			     }
		    	 return tmp.getData();
	    	}
	    	else {
	    		return null;
	    	}
	    }
	    
	    /**
	     * Function to delete an element at index
	     * @param index
	     */
	    public void deleteAtPos(int index) {        
	        if (index == 0) {
	            start = start.getLink();
	            size--; 
	            return ;
	        }
	        
	        if (index == size-1) {
	            Node<E> s = start;
	            Node<E> t = start;
	            while (s != end) {
	                t = s;
	                s = s.getLink();
	            }
	            end = t;
	            end.setLink(null);
	            size --;
	            return;
	        }
	        
	        
	        Node<E> ptr = start;
	        for (int i = 0; i < size ; i++) {
	            if (i == index-1) {
	                Node<E> tmp = ptr.getLink();
	                tmp = tmp.getLink();
	                ptr.setLink(tmp);
	                break;
	            }
	            ptr = ptr.getLink();
	        }
	        size-- ;
	    }    
	    
	    
	    /**
	     * To delete a object
	     * @param e object to delete
	     */
	    public void delete(E e) {
	    	Node<E> tmp = start;
	    	int index = 0;
	    	while(tmp.getLink()!=null) {
	    		if(tmp.getData()==e) {
	    			deleteAtPos(index);
	    			break;
	    		}
	    		tmp=tmp.getLink();
	    		index++;
	    	}
	    }
	    
	    
	    public void revarsal() {
	    	Node<E> previous = null;
	    	Node<E> current = start;
	    	while(current!=null) {
	    		Node<E> tmp = current;
	    		current = current.getLink();
	    		tmp.setLink(previous);
	    		previous = tmp;
	    	}
	    	start = previous;
		}
	    
	 
	    
	    /*  Function to display elements  */
	    
	    public void display()
	    {
	        System.out.print("\nSingly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }    
	        if (start.getLink() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        Node ptr = start;
	        System.out.print(start.getData()+ "->");
	        ptr = start.getLink();
	        while (ptr.getLink() != null)
	        {
	            System.out.print(ptr.getData()+ "->");
	            ptr = ptr.getLink();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }

}
