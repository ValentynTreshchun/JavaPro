package ua.hillel.treshchun.lessons.lesson10Homework11;

public class HW11 {
    public static void main(String[] args) {
        ArrayValueCalculator Calculator = new ArrayValueCalculator();
        String[][] str2DArray = new String[2][3];
        String[][] str2DArray2 = {
                {"1", "d", "1", "-1"}
                , {"1", "b", "1", "1"}
                , {"1", "1", "c", "1"}
                , {"f", "1", "1", "1"}};
        String[][] str2DArray3 = {
                {"1", "1", "1", "1"}
                , {"1", "1", "1", "1"}
                , {"1", "1", "1", "1"}
                , {"1", "1", "1", "1"}};
        try {
            System.out.println("Total = " + Calculator.doCalc(str2DArray));
            System.out.println("Total = " + Calculator.doCalc(str2DArray2));
            System.out.println("Total = " + Calculator.doCalc(str2DArray3));
        } catch (ArraySizeException | ArrayDataException asde) {
            asde.printStackTrace();
        }
    }
}
