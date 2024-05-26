public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] sizeExceptionArr = {
                {"1", "2", "3", "4"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"5", "6", "7"}
        };

        String[][] dataExceptionArr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "I", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArr(correctArray);
            System.out.println("Сумма массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            int result = sumArr(sizeExceptionArr);
            System.out.println("Сумма массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            int result = sumArr(dataExceptionArr);
            System.out.println("Сумма массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int sumArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("The size of an array should be: 4х4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("The size of an array should be: 4х4");
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.err.println(new MyArrayDataException(i, j, arr[i][j]).getMessage());
                }
            }
        }
        return sum;
    }
}
