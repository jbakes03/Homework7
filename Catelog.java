/*-------------------------------------------------------------------------
TODO: Document

author: Joseph Baker
-------------------------------------------------------------------------*/
public class Catelog {

    private Node head;
    private Node current;  //the show you are currently looking at

    //A newly created linked list is completely and all members are null
    public Catelog() {
        head = null;
        current = null;
    }


    public boolean addToBack(String show) {
      //gets rid of null
      if(show == null){
         return false;
      }
         //checks for an empty list (null)
         if(head == null){
            Node point = new Node(show);
            point.next = point;
            point.prev = flag;
            head = point;
            current = head;
            return true;
         }
            if(head.next == head){
            //checks to see if same show is being added. If so false
               if(head.data.show == show){
                  return false;
               }
               //if not the same adds new node
               Node point = new Node(show);
               head.next = point;
               head.prev = point;
               point.next = head;
               point.prev = head;
               return true;
            }
            current = head;
            if(current.data.show == show){
               return false;
            }
            while(current.next != head){
               if(current.data.show == show){
                  return false; 
               }
               current = current.next;
            }
            if(head != null){
               Node point = new Node(show);
               current = head.prev;
               head.prev = point;
               ppoint.next = head;
               point.prev = head;
            }
               
    }

    public boolean addToFront(String show) {
        return false;
    }

    public boolean removeShow(String show) {
        return false;
    }

    public void clear() {

    }

    public boolean isEmpty() {
        return true;
    }

    public String getCurrentShow() {
        return null;
    }

    public String stepForward() {
        return null;
    }

    public String stepBackward() {
        return null;
    }


    /* ---------------------------- HELPERS -------------------------------
    This section contians helper functions that support the class.  Some
    may only be internally used while others may be publicly exposed for
    general usage like toString and checkIntegrity.
    For example, you might add a search function here. 
    ---------------------------------------------------------------------*/
    /// This method is inherited from the Object base class and allows
    /// a user of this class to serialize the state which might be used for
    /// printing.  If the list is not internally consistent, then this
    /// method might generate an exception.  
    public String toString() {
        if(head == null) {
            return null;
        }

        String s = new String("[");

        Node it = head;
        s += it.data.show + "<=>";
        it = it.next;

        while(it != head) {
            s += it.data.show + "<=>";
            it = it.next;
        }

        s += "], current:";
        if(current != null) {
            s += current.data.show;
        } else {
            s += "null";
        }
        
        return s; 
    }

    /// This method performs a number of tests to validate the integrity
    /// of the linked list 
    /// @returns true if the list is internally consistent; otherwise, 
    ///          returns false.
    public boolean checkIntegrity() {
        // sanity check
        if(head == null) {
            // if list empty, but current is set, integrity compromised
            if(current != null) {
                return false;
            }   
            // otherwise, empty list has full integrity
            return true;
        }

        // if the head has any illegal pointers, integrity compromised
        if(head.next == null || head.prev == null) {
            return false;
        }
       
        // check that the rest of the list has the correct references.
        // already checked head, move to second element
        Node it = head.next;
        while(it != head) {          // when we circle back to head, done
            if(it.next.prev != it) {
                return false;
            }
            if(it.prev.next != it) {
                return false;
            }
            it = it.next;
        }

        // at this point, current should be set.  If it is not, the 
        // integrity is compromised
        if(current == null) {
            return false;
        }

        return true;
    }


    /*---------------------------- EXTENSION ------------------------------
    This section contains functions that are part of the extension 
    implementation.  Functions primarily consist of sort interfaces (public)
    and any internal functions (private) needed to support a specific sort
    ---------------------------------------------------------------------*/
    public enum SortType {
        SELECTION,
        BUBBLE,
        INSERTION,
        QUICK,
        MERGE
    }

    public void sort(SortType type) {
        switch(type) {
            case SELECTION:
                sortSelection();
                break;
            case BUBBLE:
                sortBubble();
                break;
            case INSERTION:
                sortInsertion();
                break;
            case QUICK:
                sortQuick();
                break;
            case MERGE:
                sortMerge();
                break;
        }
    }

    public void sortSelection() {

    }

    public void sortBubble() {

    }

    public void sortInsertion() {

    }

    public void sortQuick() {

    }

    public void sortMerge() {

    }
}
