package service;

public class FigureFactory {

    public TriangleService getTriangle() {
        return new ImplTriangleService();
    }

}
