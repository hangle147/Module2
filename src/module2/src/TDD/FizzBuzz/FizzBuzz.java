package TDD.FizzBuzz;

public class FizzBuzz {
    public String translate(int number) {
        if (number <= 0 || number >= 100) {
            throw new IllegalArgumentException("Số phải trong khoảng 1 đến 99");
        }

        // Kiểm tra nếu số chứa '3' hoặc '5'
        if (String.valueOf(number).contains("3")) return "Fizz";
        if (String.valueOf(number).contains("5")) return "Buzz";

        // Kiểm tra chia hết cho 3 và 5
        if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";

        // Trả về số dưới dạng chữ
        String[] numbers = {"một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười",
                "mười một", "mười hai", "mười ba", "mười bốn", "mười năm", "mười sáu", "mười bảy",
                "mười tám", "mười chín", "hai mươi", "hai mươi một", "hai mươi hai", "hai mươi ba",
                "hai mươi bốn", "hai mươi năm", "hai mươi sáu", "hai mươi bảy", "hai mươi tám",
                "hai mươi chín", "ba mươi", "ba mươi một", "ba mươi hai", "ba mươi ba", "ba mươi bốn",
                "ba mươi năm", "ba mươi sáu", "ba mươi bảy", "ba mươi tám", "ba mươi chín", "bốn mươi",
                "bốn mươi một", "bốn mươi hai", "bốn mươi ba", "bốn mươi bốn", "bốn mươi năm",
                "bốn mươi sáu", "bốn mươi bảy", "bốn mươi tám", "bốn mươi chín", "năm mươi", "năm mươi một",
                "năm mươi hai", "năm mươi ba", "năm mươi bốn", "năm mươi năm", "năm mươi sáu", "năm mươi bảy",
                "năm mươi tám", "năm mươi chín", "sáu mươi", "sáu mươi một", "sáu mươi hai", "sáu mươi ba",
                "sáu mươi bốn", "sáu mươi năm", "sáu mươi sáu", "sáu mươi bảy", "sáu mươi tám", "sáu mươi chín",
                "bảy mươi", "bảy mươi một", "bảy mươi hai", "bảy mươi ba", "bảy mươi bốn", "bảy mươi năm",
                "bảy mươi sáu", "bảy mươi bảy", "bảy mươi tám", "bảy mươi chín", "tám mươi", "tám mươi một",
                "tám mươi hai", "tám mươi ba", "tám mươi bốn", "tám mươi năm", "tám mươi sáu", "tám mươi bảy",
                "tám mươi tám", "tám mươi chín", "chín mươi", "chín mươi một", "chín mươi hai", "chín mươi ba",
                "chín mươi bốn", "chín mươi năm", "chín mươi sáu", "chín mươi bảy", "chín mươi tám", "chín mươi chín"};

        return numbers[number - 1];
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i <= 99; i++) {
            System.out.println(i + ": " + fizzBuzz.translate(i));
        }
    }
}
