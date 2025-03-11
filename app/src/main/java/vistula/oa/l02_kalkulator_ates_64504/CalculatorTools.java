package vistula.oa.l02_kalkulator_ates_64504;

public class CalculatorTools {
    static int calculations(int N1, int N2, String operator) {
        int result = 0;

        switch (operator) {
            case "+":
                result = N1 + N2;
                break;
            case "-":
                result =N1-N2;
                break;
            case "*":
                result =N1*N2;
                break;
        }

        return result;
    }
}
