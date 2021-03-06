/**
 * Implementations for TreeMap
 *
 * @author Khaknazar Shyntassov
 * @version 11/24/2020
 */

import java.util.*;
public class TreeIndex implements Index
{
    // instance variables - replace the example below with your own
    private TreeMap<String, TreeSet<Integer>> map;

    /**
     * Constructs a TreeMap
     */
    public TreeIndex()
    {
        map = new TreeMap<String, TreeSet<Integer>>();
    }

    /**
     * Searches TreeMap to see if it contains the word, if not adds a new one, if so, then adds to that word the line number
     *
     * @param  w  The word to be added
     * @param  k  the line number the word found is on
     * @return    If the insertion is successful
     */
    public boolean searchAndAdd(String w, int k){
        if (w == null) return false; //checks if w is null
        if(this.map.containsKey(w)){//checks for duplicate word
            TreeSet<Integer> set = this.map.get(w);
            set.add(k);
            this.map.replace(w,set);
            return true;
        }
        
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(k);
        this.map.put(w,set);
        return true;
    }
    
    /**
     * Finds the total number of words encountered
     * 
     * @return    the number of words
     */
    public int size() {
        return this.map.size();
    }
    
    /**
     * Gets the map
     * 
     * @return    the map
     */
    public TreeMap<String, TreeSet<Integer>> getMap(){
        return this.map;
    }
    
}
