package service;

import model.Envelope;

public class EnvelopeService {
    //TODO изменить название переменных
    public int build(Envelope firstEnvelope, Envelope secondEnvelope) {

        final boolean firstExpression = firstEnvelope.getLength() < secondEnvelope.getLength()
                && firstEnvelope.getWidth() < secondEnvelope.getWidth();
        final boolean secondExpression = (firstEnvelope.getWidth() < secondEnvelope.getLength())
                && firstEnvelope.getLength() < secondEnvelope.getLength();
        final boolean thirdExpression = (firstEnvelope.getLength() > secondEnvelope.getLength()
                && firstEnvelope.getWidth() > secondEnvelope.getWidth());
        final boolean fourthExpression = firstEnvelope.getLength() > secondEnvelope.getWidth() &&
                firstEnvelope.getWidth() > secondEnvelope.getLength();
        if (firstExpression || secondExpression) {
            return 1;
        } else if (thirdExpression || fourthExpression) {
            return -1;
        } else {
            return 0;
        }
    }

}
