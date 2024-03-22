package kocom;

public class ConvertHousehold {
    public static String convertHouseHold(String dong, String floor, String line) {
        String household = "";

        int residentDong = Integer.parseInt(ConvertDong.convertDong(dong));

        for (int i = 1; i <= Integer.valueOf(floor); i++) {

            for (int j = 1; j <= Integer.valueOf(line); j++) {

                household = String.format("%04d", residentDong) + String.format("%02d",i) + "0" + j;

                System.out.println(household);

            }

        }

        return household;
    }
}
