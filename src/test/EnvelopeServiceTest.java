package test;

import model.Envelope;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.EnvelopeService;
import service.ImplEnvelopeService;

import static org.junit.Assert.assertEquals;

public class EnvelopeServiceTest {

    private static EnvelopeService envelopeService;

    @BeforeAll
    public static void init() {
        envelopeService = new ImplEnvelopeService();
        System.out.println("EnvelopeService test started");
    }

    @Test
    void testCompareFirstIntoSecond() {
        int expectedResult = 1;
        assertEquals("Fail to place envelope", expectedResult, envelopeService.compareEnvelope(new Envelope(3.0, 4.0), new Envelope(3.5, 5.0)));
    }

    @Test
    void testCompareSecondIntoFirst() {
        int expectedResult = -1;
        assertEquals("Fail to place envelope",expectedResult,envelopeService.compareEnvelope(new Envelope(5.0,5.4),new Envelope(4.8,5.0)));
    }

    @Test
    void testNotCompareSecondIntoFirst() {
        int expectedResult = 0;
        assertEquals("Fail to place envelope",expectedResult,envelopeService.compareEnvelope(new Envelope(5.0,5.4),new Envelope(5.4,5.0)));
    }

    @AfterAll
    public static void complete() {
        System.out.println("Testing successfully completed.");
    }

}
