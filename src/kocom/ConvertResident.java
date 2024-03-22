package kocom;

public class ConvertResident {
    public static String convertResidentList(String dong, String floor, String line) {

        String residentList = "";

        String residentDong = ConvertDong.convertDong(dong);

        for (int i = 1; i <= Integer.valueOf(floor); i++) {

            for (int j = 1; j <= Integer.valueOf(line); j++) {

                for (int k = 0; k <= 4; k++) {

                    residentList = residentDong + String.format("%02d",i) + "0" + j + k;

                    System.out.println(residentList);

                }

            }

        }

        return residentList;
    }

    public static String convertResidentListAll(String dong, String floor, String line) {

        String residentList = "";

        String residentDong = ConvertDong.convertDong(dong);

        for (int i = 1; i <= Integer.valueOf(floor); i++) {

            for (int j = 1; j <= Integer.valueOf(line); j++) {

                for (int k = 0; k <= 4; k++) {

                    residentList = residentDong + String.format("%02d",i) + "0" + j + k;

                    if (k==4) System.out.print(residentList);
                    else System.out.print(residentList + "|@|");

                }

                System.out.println();

            }

        }

        return residentList;
    }
}
