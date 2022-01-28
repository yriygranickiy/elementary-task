package test;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import service.ImplLuckyTicketService;
import service.LuckyTicketService;

import static org.junit.Assert.*;
public class LuckyTicketServiceTest {

    private static LuckyTicketService luckyTicketService = new ImplLuckyTicketService();

    @BeforeAll
    public static void init(){
        System.out.println("LuckyTicketService test started");
    }

    @Test
    public void testFindLuckyTicketFromMoscowType(){
        int expectedResult = 1;
        int actualResult = luckyTicketService.count("moscow",213123);
        assertEquals("Fail to find lucky ticket from moscow type",expectedResult,actualResult);
    }

    @Test
    public void testFindLuckyTicketFromMoscowPiter(){
        int expectedResult = 1;
        int actualResult = luckyTicketService.count("moscow",208703);
        assertEquals("Fail to find lucky ticket from moscow type",expectedResult,actualResult);
    }

    @AfterAll
    public static void complete(){
        System.out.println("Testing successfully completed.\n");
    }

}
