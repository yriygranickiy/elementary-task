package handler;

import model.Triangle;
import service.TriangleService;
import utils.Console;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class TriangleHandler extends Handler {

    private final String SHOULD_TRY_AGAIN_QUESTION = "Want enter next triangle ? yes/no";

    private final TriangleService iTriangleService;

    public TriangleHandler(TriangleService iTriangleService) {
        this.iTriangleService = iTriangleService;
    }

    @Override
    public void handle() {
        boolean shouldGetTriangle = true;
        List<Triangle> triangleList = new ArrayList<>();
        while (shouldGetTriangle) {
            System.out.println("Enter triangle`s : name, first side, second side, third side");
            String input = Console.getString();
            try {
                Triangle triangle = iTriangleService.createTriangle(input);
                triangleList.add(triangle);
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
            }
            shouldGetTriangle = Console.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
        }
//        List<Triangle> sortedList = triangleList.stream()
//                .sorted(Comparator.comparingDouble(Triangle::getArea).reversed()).collect(Collectors.toList());
        Collections.sort(triangleList);
        triangleList.forEach(x -> System.out.println(x.toString()));
    }

}
