package handler;

import model.Envelope;
import service.ServiceEnvelope;
import utils.Console;

public class HandlerEnvelope implements Handle {
    public void pucker() {
        System.out.print("Enter first envelope length: ");
        double firstEnvelopeLength = Console.getDouble();
        System.out.print("Enter first envelope width: ");
        double firstEnvelopeWidth = Console.getDouble();
        System.out.print("Enter second envelope length: ");
        double secondEnvelopeLength = Console.getDouble();
        System.out.print("Enter second envelope width: ");
        double secondEnvelopeWidth = Console.getDouble();
        Envelope firstEnvelope = new Envelope(firstEnvelopeWidth, firstEnvelopeLength);
        Envelope secondEnvelope = new Envelope(secondEnvelopeWidth, secondEnvelopeLength);
        ServiceEnvelope service = new ServiceEnvelope();
        int result = service.build(firstEnvelope, secondEnvelope);
        switch (result) {
            case 1:
                System.out.println("Second envelope can be placed to first.");
                break;
            case -1:
                System.out.println("First envelope can be placed to second.");
                break;
            case 0:
                System.out.println("Envelope can`t be placed.");
        }
    }
}
