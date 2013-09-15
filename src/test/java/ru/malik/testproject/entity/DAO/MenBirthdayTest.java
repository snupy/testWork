/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.malik.testproject.entity.DAO;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Малик
 */
public class MenBirthdayTest {

    final public static int TEST_ID = (int) (Math.random() * 100 + 2), TEST2_ID = (int) (Math.random() * 100 + 2);
    final public static Date TEST_DATE = new Date((int) (Math.random() * 1000 + 2)), TEST2_DATE = new Date((int) (Math.random() * 1000 + 2));
    final public static String TEST_LASTNAME = String.valueOf(Math.random()), TEST2_LASTNAME = String.valueOf(Math.random());
    private MenBirthday instance;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("=================================================");
        System.out.println("begin testing MenBirthday");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("end testing MenBirthday");
        System.out.println("=================================================");  
    }

    @Before
    public void setUp() {
       instance = new MenBirthday();
       System.out.print('\t');
    }

    @After
    public void tearDown() {
            
    }

    /**
     * Test of getId method, of class MenBirthday.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        instance.setId(TEST_ID);
        int expResult = TEST_ID;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setId method, of class MenBirthday.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        instance.setId(TEST2_ID);
        assertEquals(TEST2_ID, instance.getId());

    }

    /**
     * Test of getLastname method, of class MenBirthday.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        MenBirthday instance = new MenBirthday();
        instance.setLastname(TEST_LASTNAME);
        String expResult = TEST_LASTNAME;
        String result = instance.getLastname();
        assertTrue(expResult.equals(result));

    }

    /**
     * Test of setLastname method, of class MenBirthday.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = TEST2_LASTNAME;
        instance.setLastname(lastname);
        assertTrue(lastname.equals(instance.getLastname()));

    }

    /**
     * Test of getBirthday method, of class MenBirthday.
     */
    @Test
    public void testGetBirthday() {
        System.out.println("getBirthday");
        MenBirthday instance = new MenBirthday();
        instance.setBirthday(TEST_DATE);
        Date expResult = TEST_DATE;
        Date result = instance.getBirthday();
        assertTrue(expResult.equals(result));

    }

    /**
     * Test of setBirthday method, of class MenBirthday.
     */
    @Test
    public void testSetBirthday() {
        System.out.println("setBirthday");
        Date birthday = TEST2_DATE;
        instance.setBirthday(birthday);
        assertTrue(birthday.equals(instance.getBirthday()));

    }
}