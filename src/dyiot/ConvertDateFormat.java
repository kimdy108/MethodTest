package dyiot;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ConvertDateFormat {
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
}
