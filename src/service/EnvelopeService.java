package service;

import model.Envelope;

public class EnvelopeService   {

    public void build(Envelope firstEnvelope, Envelope secondEnvelope) {
        if ((firstEnvelope.getLength() < secondEnvelope.getLength() &&
                firstEnvelope.getWidth() < secondEnvelope.getWidth()) ||
                (firstEnvelope.getWidth() < secondEnvelope.getLength()) &&
                        firstEnvelope.getLength() < secondEnvelope.getLength()) {
            System.out.println("First envelope can be placed to second.");
        } else if ((firstEnvelope.getLength() > secondEnvelope.getLength() &&
                firstEnvelope.getWidth() > secondEnvelope.getWidth()) ||
                firstEnvelope.getLength() > secondEnvelope.getWidth() &&
                        firstEnvelope.getWidth() > secondEnvelope.getLength()) {
            System.out.println("Second envelope can be placed to first.");

        } else {
            System.out.println("Envelope can`t be placed.");
        }
    }

}
