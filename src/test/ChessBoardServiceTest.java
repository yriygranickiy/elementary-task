package test;

import model.Chessboard;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ChessBoardServiceTest {

    @BeforeAll
    public static void init() {
        System.out.println("ChessBoard test started");
    }

    @Test
    void testBuild() {
        String expectedBoard = "* * \n * *\n* * \n * *\n";
        assertEquals("Fail to build", expectedBoard, new Chessboard(4, 4, "*").toString());
    }

    @AfterAll
    public static void complete() {
        System.out.println("Testing successfully completed.");
    }
}
