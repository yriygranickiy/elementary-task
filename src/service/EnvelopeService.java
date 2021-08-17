package service;

import model.Envelope;

public class EnvelopeService {

    public int build(Envelope firstEnvelope, Envelope secondEnvelope) {
        if ((firstEnvelope.getLength() < secondEnvelope.getLength() &&
                firstEnvelope.getWidth() < secondEnvelope.getWidth())||
                (firstEnvelope.getWidth()<secondEnvelope.getLength())&&
            firstEnvelope.getLength()<secondEnvelope.getLength()){
            return -1;
        } else if((firstEnvelope.getLength()>secondEnvelope.getLength() &&
                firstEnvelope.getWidth()>secondEnvelope.getWidth()) ||
                firstEnvelope.getLength()>secondEnvelope.getWidth() &&
                firstEnvelope.getWidth()>secondEnvelope.getLength()){
            return 1;
        }else {
            return 0;
        }
    }
}
