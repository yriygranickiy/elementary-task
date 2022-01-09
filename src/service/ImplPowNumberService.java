package service;

public class ImplPowNumberService  implements PowNumberService{
    @Override
    public int powNumber(String input){
        int[] values = getNumberForString(input);
        int result = power(values[0],values[1]);
        return result;
    }

    private int[] getNumberForString (String stringWithNumber){
        String[] splitLine = stringWithNumber.split(",");
        int[] values = new int[2];
        int number = Integer.parseInt(splitLine[0]);
        int pow = Integer.parseInt(splitLine[1]);
        values[0] = number;
        values[1] = pow;
        return values;
    }

    private int power( int number, int pow){
        int result = 1;
        for (int i = 1; i<=pow; i++){
            result = result * number;
        }
        return result;
    }
}
