package test;

import model.Triangle;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.ImplTriangleService;
import service.TriangleService;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;

public class TriangleServiceTest {

    private static TriangleService triangleService = new ImplTriangleService();

    @BeforeAll
    public static void init() {
        System.out.println("TriangleService test started");
    }

    @Test
    void testGetTriangleFromInput() {
        Triangle expectedTriangle = triangleService.createTriangle("Test, 4, 5, 6");
        Triangle actualTriangle = new Triangle();
        actualTriangle.setName("Test");
        actualTriangle.setArea(4,5,6);
        assertEquals("Fail to get Triangle", expectedTriangle, actualTriangle);
    }

    @Test
    void testGetTriangleFromInputGetIncorrect(){
        Assertions.assertThrows(InputMismatchException.class,()->
                triangleService.createTriangle("Test,4,4,4,4"));
    }

    @Test
    void testGetTriangleFromInputExpectedSidesWrong(){
        Assertions.assertThrows(InputMismatchException.class,()->
                triangleService.createTriangle("Test,3,3,20"));
    }

    @AfterAll
    public static void complete() {
        System.out.println("Testing successfully completed.");
    }

}
