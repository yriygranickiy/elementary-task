package service;

import model.Envelope;

public class ImplEnvelopeService implements EnvelopeService {

    @Override
    public int compareEnvelope(Envelope firstEnvelope, Envelope secondEnvelope) {
        final boolean isFirstEnvelopeSideGreater = firstEnvelope.getLength() < secondEnvelope.getLength()
                && firstEnvelope.getWidth() < secondEnvelope.getWidth()
                || (firstEnvelope.getWidth() < secondEnvelope.getLength())
                && firstEnvelope.getLength() < secondEnvelope.getLength();
        final boolean isSecondEnvelopeSideGreater = (firstEnvelope.getLength() > secondEnvelope.getLength()
                && firstEnvelope.getWidth() > secondEnvelope.getWidth())
                || firstEnvelope.getLength() > secondEnvelope.getWidth()
                && firstEnvelope.getWidth() > secondEnvelope.getLength();
        if (isFirstEnvelopeSideGreater) {
            return 1;
        } else if (isSecondEnvelopeSideGreater) {
            return -1;
        } else {
            return 0;
        }
    }

}
