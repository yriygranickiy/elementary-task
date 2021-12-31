package service;

public class ImplNumberInWordsService implements NumberInWordsService{
    @Override
    public String numberInWords(int number) {
        validateMaxNumber(number);
        String words = "";
        String[] unitsArray0_19 ={"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String[] tensArray = {"zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};
        if(number == 0){
            return unitsArray0_19[0];
        }
        if((number / 1000000) > 0) {
            words += numberInWords(number / 1000000) + " million ";
            number %= 1000000;
        }
        if((number / 1000) > 0) {
            words += numberInWords(number / 1000) + " thousand ";
            number %= 1000;
        }
        if((number / 100) > 0) {
            words += numberInWords(number / 100) + " hundred ";
            number %= 100;
        }
        if (number > 0) {
            if (number < 20) {

                words += unitsArray0_19[number];
            } else {

                words += tensArray[number / 10];
                if ((number % 10) > 0) {
                    words += "-" + unitsArray0_19[number % 10];
                }
            }
        }
        return words.trim();
    }

    private void validateMaxNumber(long value){
        if(value > 9_999_999_99){
            throw new IllegalArgumentException("Input number must be less 1 000 000 000.");
        }
    }
}
