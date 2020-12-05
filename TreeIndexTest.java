

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TreeIndexTest. Note: getters and setters untested
 *
 * @author  Henry Grote
 * @version 12/3/2020
 */
public class TreeIndexTest
{
    /**
     * Default constructor for test class TreeIndexTest
     */
    public TreeIndexTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void size0()
    {
        TreeIndex treeInde1 = new TreeIndex();
        assertEquals(0, treeInde1.size());
    }

    @Test
    public void size1()
    {
        TreeIndex treeInde1 = new TreeIndex();
        assertEquals(true, treeInde1.searchAndAdd("hello", 0));
        assertEquals(1, treeInde1.size());
    }

    @Test
    public void searchAndAddEmptyList()
    {
        TreeIndex treeInde1 = new TreeIndex();
        assertEquals(true, treeInde1.searchAndAdd("a", 1));
        assertEquals(1, treeInde1.size());
    }

    @Test
    public void searchAndAddNonEmptyList()
    {
        TreeIndex treeInde1 = new TreeIndex();
        assertEquals(true, treeInde1.searchAndAdd("a", 0));
        assertEquals(true, treeInde1.searchAndAdd("b", 4));
        assertEquals(2, treeInde1.size());
    }
    
    @Test
    public void searchAndAddSameWord()
    {
        TreeIndex treeInde1 = new TreeIndex();
        assertEquals(true, treeInde1.searchAndAdd("a", 0));
        assertEquals(true, treeInde1.searchAndAdd("a", 4));
        assertEquals(1, treeInde1.size());
    }
    
    @Test
    public void searchAndAddNull()
    {
        TreeIndex treeInde1 = new TreeIndex();
        assertEquals(false, treeInde1.searchAndAdd(null, 0));
        assertEquals(0, treeInde1.size());
    }
    
}




