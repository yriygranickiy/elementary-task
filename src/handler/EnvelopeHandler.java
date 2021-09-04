package handler;

import model.Envelope;
import service.EnvelopeService;
import utils.Console;

public class EnvelopeHandler implements Handleable {



    public void handle() {
        System.out.print("Enter first envelope length: ");
        double firstEnvelopeLength = Console.getPositiveDouble();
        System.out.print("Enter first envelope width: ");
        double firstEnvelopeWidth = Console.getPositiveDouble();
        System.out.print("Enter second envelope length: ");
        double secondEnvelopeLength = Console.getPositiveDouble();
        System.out.print("Enter second envelope width: ");
        double secondEnvelopeWidth = Console.getPositiveDouble();
        Envelope firstEnvelope = new Envelope(firstEnvelopeWidth, firstEnvelopeLength);
        Envelope secondEnvelope = new Envelope(secondEnvelopeWidth, secondEnvelopeLength);
        EnvelopeService service = new EnvelopeService();
        service.build(firstEnvelope, secondEnvelope);
    }

}
