package practice;

public class Test {
    public static Integer Multiplication_Tables() {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = i * j;
                String AllResult = result + ", ";
                if (j==9) {
                    AllResult = Integer.toString(result);
                }
                System.out.print(AllResult);
            }
            System.out.println();
        }
        return null;
    }

    public static String ForArray_Equipment(String[] array1, String[] array2) {

        for(int i = 0; i < array1.length; i++){

            for (int j = 0; j < array2.length; j++) {

                if (array1[i].substring(3).equals(array2[j].substring(3))) {
                    System.out.println("(신재품) : " + array2[j]);

                }
            }
        }
        return null;
    }

    public static Integer ForArray_Dice (Integer[] array1, Integer[] array2) {

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                int result = array1[i] + array2[j];

                if (result == 5) {
                    System.out.println(array1[i] + " + " + array2[j] + " = " + result);
                }

            }
        }
        return null;
    }
}
