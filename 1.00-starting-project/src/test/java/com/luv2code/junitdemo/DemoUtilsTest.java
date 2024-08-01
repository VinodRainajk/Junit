package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setuplearningBeforEach()
    {
        demoUtils = new DemoUtils();
        System.out.println("Running before each");
    }

    @BeforeAll
    static void setuplearningBeforAll()
    {
        System.out.println("Running before all");
    }

    @BeforeEach
    void setuplearningBeforEach2()
    {
        demoUtils = new DemoUtils();
        System.out.println("Running before each2");
    }



    @Test
    void getAcademyInList() {
    }

    @Test
    void getAcademy() {
    }

    @Test
    void getAcademyDuplicate() {
    }

    @Test
    void getFirstThreeLettersOfAlphabet() {
    }

    @Test

    void add() {
        DemoUtils demoUtils = new DemoUtils();
        assertEquals(8,demoUtils.add(2,6), "2,6 should be equal to 8");
        assertNotEquals(5,demoUtils.add(2,6), "2,6 should be equal to 8");
    }

    @Test
    void multiply() {
    }

    @Test
    void checkNull() {
        DemoUtils demoUtils = new DemoUtils();
        assertEquals(demoUtils, demoUtils.checkNull(demoUtils),"Two objects should be same");
        assertNotNull(demoUtils.checkNull(demoUtils),"Object should not be null");

    }

    @Test
    void testEqualAndNotEqual()
    {
       DemoUtils demoUtils1 = new DemoUtils();
       int inte1 = 0;
       assertSame(demoUtils1,inte1,"Two objects should be equal");
    }



    @Test
    void testLinesMatch()
    {
        List listlines = List.of("luv", "code","2");
        assertLinesMatch(listlines, demoUtils.getAcademyInList(),"Lines should match");

    }

    @Test
    void testThrowsException()
    {
        assertThrows(NullPointerException.class,()->demoUtils.throwException(-11),"Method should throw exception" );
    }



}