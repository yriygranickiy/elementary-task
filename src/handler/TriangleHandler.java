package handler;

import model.Triangle;
import service.TriangleFactory;
import service.TriangleService;
import utils.Console;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

//TODO фабрику убрать , Comparable
public class TriangleHandler extends Handler {

    private final String SHOULD_TRY_AGAIN_QUESTION = "Want enter next triangle ? yes/no";

    @Override
    public void handle() {
        List<Triangle> triangleList = new ArrayList<>();
        TriangleFactory triangleFactory = new TriangleService();
        boolean shouldGetTriangle = true;
        while (shouldGetTriangle) {
            System.out.println("Enter triangle`s : name, first side, second side, third side");
            String input = Console.getString();
            try {
                Triangle triangle = triangleFactory.createTriangle(input);
                triangleList.add(triangle);
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
            }
            shouldGetTriangle = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
        }
        List<Triangle> sortedList = triangleList.stream()
                .sorted(Comparator.comparingDouble(Triangle::getArea).reversed()).collect(Collectors.toList());
        sortedList.forEach(x -> System.out.println(x.toString()));
    }

}
