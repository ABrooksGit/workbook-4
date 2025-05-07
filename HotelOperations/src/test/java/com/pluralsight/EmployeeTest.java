package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {



    @Test
    public void testPunchingInAndTestPunchingOut(){
        Employee e1 = new Employee(1, "Tony" ,"Gym", 10);

        e1.punchIn(9); // 9AM

        e1.punchOut(22.0); //10PM

        assertEquals(13,e1.getHoursWorked());

    }


    @Test
    public void punchInAndOutWithOverTime() {
        Employee e1 = new Employee(1, "Tony" ,"Gym", 10);

        e1.punchIn(1); // 9AM

        e1.punchOut(22.0); //10PM

    }
}