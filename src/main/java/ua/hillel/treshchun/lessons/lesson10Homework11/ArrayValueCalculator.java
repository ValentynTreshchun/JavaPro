package ua.hillel.treshchun.lessons.lesson10Homework11;

public class ArrayValueCalculator {
    public int doCalc(String[][] inputStrArr) throws ArrayDataException, ArraySizeException {
        int result = 0;
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    String s = inputStrArr[i][j];
                }
            }
        } catch (IndexOutOfBoundsException ioob) {
            throw new ArraySizeException("Incorrect array size: ", ioob);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    result += Integer.parseInt(inputStrArr[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new ArrayDataException("Incorrect data format in string [" + i + "][" + j + "]: ", nfe);
                }
            }
        }
        return result;
    }
}
