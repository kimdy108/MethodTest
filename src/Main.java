import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        // UUID 생성
//        UUID(797);

        // 대영iot 테스트
//        DyiotDongHo("101","101");
//        convertDateFormat("2023-08-01");
//        convertDateFormatdatetime("2023-08-01 12:34:56.123");
//        System.out.println("test_DyiotDongHo : " + DyiotDongHo("101","101"));
//        System.out.println("test_convertDateFormat : " + convertDateFormat("2023-08-01"));
//        System.out.println("test_convertDateFormatdatetime : " + convertDateFormatdatetime("2023-08-01 12:34:56.123"));
//        String create_date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        System.out.println(create_date);

        // 구구단
//        Multiplication_Tables();

        // for 연습 - 장비
//        String[] equipment_array1 = {"(구)장비1","(구)장비2","(구)장비3","(구)장비4"};
//        String[] equipment_array2 = {"(신)장비1","(신)장비2","(신)장버3","(신)장비4"};
//        ForArray_Equipment(equipment_array1,equipment_array2);

        // for 연습 - 주사위
//        Integer[] dice_array1 = {1,2,3,4,5,6};
//        Integer[] dice_array2 = {1,2,3,4,5,6};
//        ForArray_Dice(dice_array1, dice_array2);


    }
    
    public static String DyiotDongHo(String dong, String ho) {
       String dongho = "";

       dongho = dong + String.format("%4s", ho).replace(" ", "0");
       
       return dongho;
    }

    public static String convertDateFormat(String dateString) {

        LocalDateTime currentDateTime = LocalDateTime.now(); //현재 시간 가져오기

        LocalTime currentTime = currentDateTime.toLocalTime();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); //형식 지정
        String formattedTime = currentTime.format(formatter);

        String newDateString = dateString + " " + "00:00:00";

        System.out.println("Current Date and Time : " + currentDateTime);
        System.out.println("Current Time : " + formattedTime);
        System.out.println("test : " + newDateString);

        return newDateString;
    }

    public static String convertDateFormatdatetime(String dateString) {

        String inputDateTime = dateString;
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime dateTime = LocalDateTime.parse(inputDateTime, inputFormatter);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String outputDateTime = dateTime.format(outputFormatter);

        return outputDateTime;
    }

    public static String UUID(int t) {

        String s[] = new String[t];

        for(int i = 0; i < t-1; i++){
            s[i] = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(s[i]);
        }

        return null;
    }

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

            for (int j = 0; j <array2.length; j++) {

                int result = array1[i] + array2[j];

                if (result == 5) {
                    System.out.println(array1[i] + " + " + array2[j] + " = " +  result);
                }

            }
        }
        return null;
    }

}