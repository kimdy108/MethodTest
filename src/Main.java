import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import uuid.RegistUuid;
import dyiot.ConvertShopId;
import dyiot.ConvertDateFormat;
import kocom.ConvertDong;
import kocom.ConvertResident;
import kocom.ConvertHousehold;
import practice.Test;

public class Main {

    public static void main(String[] args) {

        // UUID 생성
        RegistUuid.UUID(797);

        // 대영iot 테스트
        ConvertShopId.DyiotDongHo("101","101");
        ConvertDateFormat.convertDateFormat("2023-08-01");
        ConvertDateFormat.convertDateFormatdatetime("2023-08-01 12:34:56.123");
        System.out.println("test_DyiotDongHo : " + ConvertShopId.DyiotDongHo("101","101"));
        System.out.println("test_convertDateFormat : " + ConvertDateFormat.convertDateFormat("2023-08-01"));
        System.out.println("test_convertDateFormatdatetime : " + ConvertDateFormat.convertDateFormatdatetime("2023-08-01 12:34:56.123"));
        String create_date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(create_date);

        // kocom_ConvertDong
        ConvertDong.convertDong("A");
        ConvertDong.convertDong("B");
        ConvertDong.convertDong("C");
        ConvertDong.convertDong("D");
        ConvertDong.convertDong("E");

        // kocom_ReConvertDong
        ConvertDong.convertNumberToAlphabet("101");
        ConvertDong.convertNumberToAlphabet("102");
        ConvertDong.convertNumberToAlphabet("103");
        ConvertDong.convertNumberToAlphabet("104");
        ConvertDong.convertNumberToAlphabet("105");
        ConvertDong.convertNumberToAlphabet("A");
        ConvertDong.convertNumberToAlphabet("B");
        ConvertDong.convertNumberToAlphabet("C");
        ConvertDong.convertNumberToAlphabet("D");
        ConvertDong.convertNumberToAlphabet("E");

        // kocom_ResidentList
        ConvertResident.convertResidentList("101","15","6");
        ConvertResident.convertResidentList("102","15","6");
        ConvertResident.convertResidentList("103","15","4");
        ConvertResident.convertResidentList("104","15","4");
        ConvertResident.convertResidentList("105","15","6");
        ConvertResident.convertResidentList("106","15","4");
        ConvertResident.convertResidentList("107","15","4");

        // kocom_ResidentListAll
        ConvertResident.convertResidentListAll("101","15","6");
        ConvertResident.convertResidentListAll("102","15","6");
        ConvertResident.convertResidentListAll("103","15","4");
        ConvertResident.convertResidentListAll("104","15","4");
        ConvertResident.convertResidentListAll("105","15","6");
        ConvertResident.convertResidentListAll("106","15","4");
        ConvertResident.convertResidentListAll("107","15","4");

        // kocom_household
        ConvertHousehold.convertHouseHold("101","15","6");
        ConvertHousehold.convertHouseHold("102","15","6");
        ConvertHousehold.convertHouseHold("103","15","4");
        ConvertHousehold.convertHouseHold("104","15","4");
        ConvertHousehold.convertHouseHold("105","15","6");
        ConvertHousehold.convertHouseHold("106","15","4");
        ConvertHousehold.convertHouseHold("107","15","4");


        // 구구단
        Test.Multiplication_Tables();

        // for 연습 - 장비
        String[] equipment_array1 = {"(구)장비1","(구)장비2","(구)장비3","(구)장비4"};
        String[] equipment_array2 = {"(신)장비1","(신)장비2","(신)장버3","(신)장비4"};
        Test.ForArray_Equipment(equipment_array1,equipment_array2);

        // for 연습 - 주사위
        Integer[] dice_array1 = {1,2,3,4,5,6};
        Integer[] dice_array2 = {1,2,3,4,5,6};
        Test.ForArray_Dice(dice_array1, dice_array2);

    }

}