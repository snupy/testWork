/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.malik.testproject.entity.DAO;

import java.util.Date;
import java.util.List;
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
public class MenBirthdayDAOTest {

    final public static MenBirthday TEST_MENBIRTHDAY = new MenBirthday();
    ;
    private MenBirthdayDAO instance;

    public MenBirthdayDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("=================================================");
        System.out.println("begin testing MenBirthdayDAO");
        TEST_MENBIRTHDAY.setBirthday(new Date());
        TEST_MENBIRTHDAY.setLastname(new Date() + "test");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("end testing MenBirthdayDAO");
        System.out.println("=================================================");
    }

    @Before
    public void setUp() {
        System.out.print('\t');
        instance = new MenBirthdayDAO();
    }

    @After
    public void tearDown() {
    }

    
    /**
     * Test of getAllMenBirthdays method, of class MenBirthdayDAO.
     */
    @Test
    public void testGetAllMenBirthdays() {
        System.out.println("getAllMenBirthdays");
        List result = instance.getAllMenBirthdays();
        assertTrue(result.size() != 0);

    }

    /**
     * Test of updateMenBirthday method, of class MenBirthdayDAO.
     */
    @Test
    public void testUpdateMenBirthday() {
        System.out.println("updateMenBirthday");
        MenBirthday menBirthday = TEST_MENBIRTHDAY;
        instance.updateMenBirthday(menBirthday);

    }

    @Test
    public void testGetMenBirthdayById() {
        System.out.println("getMenBirthdayById");
        MenBirthday menBirthday = TEST_MENBIRTHDAY;
        instance.addMenBirthday(TEST_MENBIRTHDAY);
        MenBirthday getedMenBirthday = instance.getMenBirthdayById(Integer.valueOf(menBirthday.getId()));
        assertNotNull(getedMenBirthday);
        instance.deleteMenBirthday(getedMenBirthday);
    }
    
    /**
     * Test of addMenBirthday method, of class MenBirthdayDAO.
     */
    @Test
    public void testAddMenBirthday() {
        System.out.println("addMenBirthday");
        
        instance.addMenBirthday(TEST_MENBIRTHDAY);
    }
}