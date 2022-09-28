package validating.test;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import validating.CountedList;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class CountedListTest {
    private CountedList list;
    //注解是在任何其他测试操作之前运行一次的方法。
    @BeforeAll
    static void beforeAllMsg() {
        System.out.println(">>> Starting CountedListTest");
    }
    //是所有其他测试操作之后只运行一次的方法。
    @AfterAll
    static void afterAllMsg() {
        System.out.println(">>> Finished CountedListTest");
    }
//    @BeforeEach 注解是通常用于创建和初始化公共对象的方法，并在每次测试前运行。
    @BeforeEach
    public void initialize() {
        list = new CountedList();
        System.out.println("Set up for " + list.getId());
        for(int i = 0; i < 3; i++)
            list.add(Integer.toString(i));
    }
    //如果你必须在每次测试后执行清理
    @AfterEach
    public void cleanup() {
        System.out.println("Cleaning up " + list.getId());
    }
    @org.junit.jupiter.api.Test    //    @BeforeEach等一些列注解是Junit5上的，所以对应的@Test注解也要对应的版本才会起作用。
    public void insert() {
        System.out.println("Running testInsert()");
        assertEquals(list.size(), 3);
        list.add(1, "Insert");
        assertEquals(list.size(), 4);
        assertEquals(list.get(1), "Insert");
    }
    @Test
    public void replace() {
        System.out.println("Running testReplace()");
        assertEquals(list.size(), 3);
        list.set(1, "Replace");
        assertEquals(list.size(), 3);
        assertEquals(list.get(1), "Replace");
    }
    // A helper method to simplify the code. As
    // long as it's not annotated with @Test, it will
    // not be automatically executed by JUnit.
    private
    void compare(List<String> lst, String[] strs) {
        assertArrayEquals(lst.toArray(new String[0]), strs);
    }
    @org.junit.jupiter.api.Test
    public void order() {
        System.out.println("Running testOrder()");
        compare(list, new String[] { "0", "1", "2" });
    }
    @Test
    public void remove() {
        System.out.println("Running testRemove()");
        assertEquals(list.size(), 3);
        list.remove(1);
        assertEquals(list.size(), 2);
        compare(list, new String[] { "0", "2" });
    }
    @Test
    public void addAll() {
        System.out.println("Running testAddAll()");
        list.addAll(Arrays.asList(new String[] {
                "An", "African", "Swallow"}));
        assertEquals(list.size(), 6);
        compare(list, new String[] { "0", "1", "2",
                "An", "African", "Swallow" });
    }

    @org.junit.jupiter.api.Test
    public void helloWorld(){
        System.out.println("HelloWorld");
    }
}