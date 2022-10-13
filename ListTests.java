import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

import org.junit.*;

public class ListTests {
    /* 
    @Test 
    public void testFilter(){
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("hello");
        list.add("pineapple");
        list.add("random");
        ListExamples.filter(list, );
    }
    */

    @Test
    public void testMerge(){
        List<String> list1 = new ArrayList<String>();
        list1.add("x");
        list1.add("y");
        List<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("z"); 
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("x");
        expected.add("y");
        expected.add("z");
        assertEquals(expected, ListExamples.merge(list1, list2));
    }
}
