package handler;

import model.Triangle;
import service.TriangleService;
import utils.Console;

import java.util.*;
import java.util.stream.Collectors;


public class TriangleHandler extends Handler {

    private final String SHOULD_TRY_AGAIN_QUESTION = "Want enter next triangle ? yes/no";

    private final TriangleService triangleService;

    public TriangleHandler(TriangleService triangleService) {
        this.triangleService = triangleService;
    }

    List<Triangle> triangleList = new ArrayList<>();

    @Override
    public void handle() {
        boolean shouldGetTriangle = true;
        while (shouldGetTriangle) {
            System.out.println("Enter triangle`s : name, first side, second side, third side");
            String input = Console.getString();
            try {
                Triangle triangle = triangleService.createTriangle(input);
                triangleList.add(triangle);
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
            }
            shouldGetTriangle = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
        }
        List<Triangle> sortedList = triangleList.stream()
                .sorted(Comparator.comparingDouble(Triangle::getArea).reversed()).collect(Collectors.toList());
//        Collections.sort(triangleList);
        sortedList.forEach(x -> System.out.println(x.toString()));
    }
}
