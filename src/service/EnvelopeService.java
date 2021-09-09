package service;

import model.Envelope;

public class EnvelopeService {
    //TODO изменить название переменных
    public int build(Envelope firstEnvelope, Envelope secondEnvelope) {

        final boolean firstEnvelopeSide = firstEnvelope.getLength() < secondEnvelope.getLength()
                && firstEnvelope.getWidth() < secondEnvelope.getWidth()
                || (firstEnvelope.getWidth() < secondEnvelope.getLength())
                && firstEnvelope.getLength() < secondEnvelope.getLength();
        final boolean secondEnvelopeSide = (firstEnvelope.getLength() > secondEnvelope.getLength()
                && firstEnvelope.getWidth() > secondEnvelope.getWidth())
                || firstEnvelope.getLength() > secondEnvelope.getWidth()
                && firstEnvelope.getWidth() > secondEnvelope.getLength();
        if (firstEnvelopeSide) {
            return 1;
        } else if (secondEnvelopeSide) {
            return -1;
        } else {
            return 0;
        }
    }

}
