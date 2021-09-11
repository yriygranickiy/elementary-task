package handler;

import model.Envelope;
import service.IEnvelopeService;
import utils.Console;

public class EnvelopeHandler extends Handler {

    private final IEnvelopeService iEnvelopeService;

    public EnvelopeHandler(IEnvelopeService iEnvelopeService) {
        this.iEnvelopeService = iEnvelopeService;
    }

    @Override
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
        int result = iEnvelopeService.build(firstEnvelope, secondEnvelope);
        if (result == 1) {
            System.out.println("First envelope can be placed to second.");
        } else if (result == -1) {
            System.out.println("Second envelope can be placed to first.");
        } else {
            System.out.println("Unable to fit envelopes.");
        }

    }

}
