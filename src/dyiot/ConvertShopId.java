package dyiot;

public class ConvertShopId {
    public static String DyiotDongHo(String dong, String ho) {
        String dongho = "";

        dongho = dong + String.format("%4s", ho).replace(" ", "0");

        return dongho;
    }
}
