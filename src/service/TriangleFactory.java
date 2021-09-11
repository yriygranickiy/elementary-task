package service;

public class TriangleFactory {

    public ITriangleService getTriangle() {
            return new TriangleService();
    }

}
