package uuid;

import java.util.UUID;

public class RegistUuid {
    public static String UUID(int t) {

        String s[] = new String[t];

        for(int i = 0; i < t-1; i++){
            s[i] = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(s[i]);
        }

        return null;
    }
}
