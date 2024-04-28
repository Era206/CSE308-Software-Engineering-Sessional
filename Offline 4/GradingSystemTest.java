import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingSystemTest {
    //test for three credit starts here!
    @Test
    void Test3credit1() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NullPointerException.class, () -> {
            grades.gradeForThreeCredit("30500");
        }, "Number for grade cannot be greater than 300!");
    }

    @Test
    void Test3credit2() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NullPointerException.class, () -> {
            grades.gradeForThreeCredit("300.0008");
        }, "Number for grade cannot be greater than 300!");
    }

    @Test
    void Test3credit3() {
        GradingSystem grades = new GradingSystem();
        assertEquals('A', grades.gradeForThreeCredit("239.45"));
    }

    @Test
    void Test3credit4() {
        GradingSystem grades = new GradingSystem();
        assertEquals('A', grades.gradeForThreeCredit("245"));
    }

    @Test
    void Test3credit5() {
        GradingSystem grades = new GradingSystem();
        assertEquals('A', grades.gradeForThreeCredit("299.045"));
    }

    @Test
    void Test3credit6() {
        GradingSystem grades = new GradingSystem();
        assertEquals('B', grades.gradeForThreeCredit("238.88"));
    }

    @Test
    void Test3credit7() {
        GradingSystem grades = new GradingSystem();
        assertEquals('B', grades.gradeForThreeCredit("209.12"));
    }

    @Test
    void Test3credit8() {
        GradingSystem grades = new GradingSystem();
        assertEquals('B', grades.gradeForThreeCredit("216"));
    }

    @Test
    void Test3credit9() {
        GradingSystem grades = new GradingSystem();
        assertEquals('C', grades.gradeForThreeCredit("208.99"));
    }

    @Test
    void Test3credit10() {
        GradingSystem grades = new GradingSystem();
        assertEquals('C', grades.gradeForThreeCredit("181"));
    }

    @Test
    void Test3credit11() {
        GradingSystem grades = new GradingSystem();
        assertEquals('C', grades.gradeForThreeCredit("179.09"));
    }

    @Test
    void Test3credit12() {
        GradingSystem grades = new GradingSystem();
        assertEquals('F', grades.gradeForThreeCredit("178.09"));
    }

    @Test
    void Test3credit13() {
        GradingSystem grades = new GradingSystem();
        assertEquals('F', grades.gradeForThreeCredit("0"));
    }

    @Test
    void Test3credit14() {
        GradingSystem grades = new GradingSystem();
        assertEquals('F', grades.gradeForThreeCredit("0.9"));
    }

    @Test
    void Test3credit15() {
        GradingSystem grades = new GradingSystem();
        assertThrows(IllegalArgumentException.class, () -> {
            grades.gradeForThreeCredit("-0.99");
        }, "Number for grade cannot be negative!");
    }

    @Test
    void Test3credit16() {
        GradingSystem grades = new GradingSystem();
        assertThrows(IllegalArgumentException.class, () -> {
            grades.gradeForThreeCredit("-5");
        }, "Number for grade cannot be negative!");
    }

    @Test
    void Test3credit17() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NumberFormatException.class, () -> {
            grades.gradeForThreeCredit("2000a");
        }, "not a number format!");
    }

    @Test
    void Test3credit18() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NumberFormatException.class, () -> {
            grades.gradeForThreeCredit("0.00056.8");
        }, "not a number format!");
    }

    @Test
    void Test3credit19() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NumberFormatException.class, () -> {
            grades.gradeForThreeCredit("-0.3.4-34");
        }, "not a number format!");
    }

    @Test
    void Test3credit20() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NumberFormatException.class, () -> {
            grades.gradeForThreeCredit("$A23");
        }, "not a number format!");
    }


    //test for four credit starts here!
    @Test
    void Test4credit1() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NullPointerException.class, () -> {
            grades.gradeForFourCredit("30500");
        }, "Number for grade cannot be greater than 400!");
    }

    @Test
    void Test4credit2() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NullPointerException.class, () -> {
            grades.gradeForFourCredit("400.0008");
        }, "Number for grade cannot be greater than 400!");
    }

    @Test
    void Test4credit3() {
        GradingSystem grades = new GradingSystem();
        assertEquals('A', grades.gradeForFourCredit("319.45"));
    }

    @Test
    void Test4credit4() {
        GradingSystem grades = new GradingSystem();
        assertEquals('A', grades.gradeForFourCredit("345"));
    }

    @Test
    void Test4credit5() {
        GradingSystem grades = new GradingSystem();
        assertEquals('A', grades.gradeForFourCredit("399.045"));
    }

    @Test
    void Test4credit6() {
        GradingSystem grades = new GradingSystem();
        assertEquals('B', grades.gradeForFourCredit("318.88"));
    }

    @Test
    void Test4credit7() {
        GradingSystem grades = new GradingSystem();
        assertEquals('B', grades.gradeForFourCredit("279.12"));
    }

    @Test
    void Test4credit8() {
        GradingSystem grades = new GradingSystem();
        assertEquals('B', grades.gradeForFourCredit("316"));
    }

    @Test
    void Test4credit9() {
        GradingSystem grades = new GradingSystem();
        assertEquals('C', grades.gradeForFourCredit("278.99"));
    }

    @Test
    void Test4credit10() {
        GradingSystem grades = new GradingSystem();
        assertEquals('C', grades.gradeForFourCredit("241"));
    }

    @Test
    void Test4credit11() {
        GradingSystem grades = new GradingSystem();
        assertEquals('C', grades.gradeForFourCredit("239.09"));
    }

    @Test
    void Test4credit12() {
        GradingSystem grades = new GradingSystem();
        assertEquals('F', grades.gradeForFourCredit("238.09"));
    }

    @Test
    void Test4credit13() {
        GradingSystem grades = new GradingSystem();
        assertEquals('F', grades.gradeForFourCredit("0"));
    }

    @Test
    void Test4credit14() {
        GradingSystem grades = new GradingSystem();
        assertEquals('F', grades.gradeForFourCredit("0.9"));
    }

    @Test
    void Test4credit15() {
        GradingSystem grades = new GradingSystem();
        assertThrows(IllegalArgumentException.class, () -> {
            grades.gradeForFourCredit("-0.99");
        }, "Number for grade cannot be negative!");
    }

    @Test
    void Test4credit16() {
        GradingSystem grades = new GradingSystem();
        assertThrows(IllegalArgumentException.class, () -> {
            grades.gradeForFourCredit("-5");
        }, "Number for grade cannot be negative!");
    }

    @Test
    void Test4credit17() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NumberFormatException.class, () -> {
            grades.gradeForFourCredit("2000a");
        }, "not a number format!");
    }

    @Test
    void Test4credit18() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NumberFormatException.class, () -> {
            grades.gradeForFourCredit("0.00056.8");
        }, "not a number format!");
    }

    @Test
    void Test4credit19() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NumberFormatException.class, () -> {
            grades.gradeForFourCredit("-0.3.4-34");
        }, "not a number format!");
    }

    @Test
    void Test4credit20() {
        GradingSystem grades = new GradingSystem();
        assertThrows(NumberFormatException.class, () -> {
            grades.gradeForFourCredit("$A23");
        }, "not a number format!");
    }
}