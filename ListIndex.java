
/**
 * Implementations for ArrayList
 *
 * @author Khaknazar Shyntassov
 * @version 11/24/2020
 */
import java.util.*;
public class ListIndex implements Index
{
    // instance variables - replace the example below with your own
    private ArrayList<Entry> list;

    /**
     * Constructs the ListIndex
     */
    public ListIndex()
    {
        list = new ArrayList<Entry>();
    }

    /**
     * Searches ArrayList to see if it contains the word, if not adds a new one, if so, then adds to that word the line number
     *
     * @param  w  The word to be added
     * @param  k  the line number the word found is on
     * @return    If the insertion is successful
     */
    public boolean searchAndAdd(String w, int k){
        if (w == null) return false; //cheks for null input
        if(this.list == null){ //checks for null list
            return false;
        }
        
        int l = 0, r = this.list.size() - 1; 
        int index=0;
        while (l <= r) { //binaryn search
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (this.list.get(m).getWord().compareTo(w)==0){
                index = m; 
                this.list.get(m).addLine(k);
                return true;
            }
            // If x greater, ignore left half 
            if (this.list.get(m).getWord().compareTo(w) < 0){
                l = m + 1; 
            }
            // If x is smaller, ignore right half 
            else{
                r = m - 1; 
            }
        } 
        Entry e = new Entry(w,k); // create new entry
        addIt(e);
        
        return true;
        /*
        int low = 0;
        int high = this.list.size()-1;
        int mid;

        while(low<=high){
            mid = (low+high)/2;
            if(this.list.get(mid).getWord().compareTo(w)<0){
                low = mid + 1;
            }
            else if(this.list.get(mid).getWord().compareTo(w)>0){
                high = mid - 1;
            }
            else{
                this.list.get(mid).addLine(k);
                return true;
            }
        }
        */
        
    }
    
    /**
     * Adds to the list, Helper method for searchAndAdd
     * 
     * @param    the Entry to add
     */
    public void addIt(Entry e){
        for (int i = 0; i < this.list.size(); i++) {
            // if the element you are looking at is smaller than x, 
            // go to the next element
            if (this.list.get(i).getWord().compareTo(e.getWord()) < 0) continue;
            // if the element equals x, return, because we don't add duplicates
            if (this.list.get(i).getWord().compareTo(e.getWord()) == 0) return;
            // otherwise, we have found the location to add x
            this.list.add(i, e);
            return;
        }
    // we looked through all of the elements, and they were all
    // smaller than x, so we add ax to the end of the list
        this.list.add(e);
        
    }
    
    /**
     * Finds the total number of words encountered
     * 
     * @return    the number of words
     */
    public int size() {
        return this.list.size();
    }
    
    /**
     * Gets the list
     * 
     * @return    the list
     */
    public ArrayList<Entry> getList(){
        return this.list;
    }
}
