package service;

import java.util.ArrayList;
import java.util.List;

public class ImplNumberCountService implements NumberCountService {
    @Override
    public List<Integer> numberCountSquare(int value) {
        List<Integer> result = new ArrayList<>();
        validateValue(value);
        for (int i = 2; i * i < value; i++) {
                result.add(i);
        }
        return result;
    }

    private void validateValue(int value){
        if(value <= 0){
            throw new IllegalArgumentException("Number must be min 2");
        }
    }
}
