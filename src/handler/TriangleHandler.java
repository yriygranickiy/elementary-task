package handler;

import model.Triangle;
import service.TriangleService;
import utils.Console;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleHandler implements Handleable {
    @Override
    public void handle() {
        List<Triangle> triangleList = new ArrayList<>();
        TriangleService triangleService = new TriangleService();
        boolean shouldGetTriangle = true;
        while (shouldGetTriangle) {
            System.out.println("Enter triangle`s : name, first side, second side, third side");
            String input = Console.getString();
            Triangle triangle = triangleService.build(input);
            triangleList.add(triangle);
            shouldGetTriangle = Console.getConfirmation("Want enter next triangle ? yes/no");
        }
        List<Triangle> sortedList = triangleList.stream()
                .sorted(Comparator.comparingDouble(Triangle::getArea).reversed()).collect(Collectors.toList());
        sortedList.forEach(x -> System.out.println(x.toString()));
    }
}
