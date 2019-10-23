/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tool;

import java.util.Random;

/**
 *
 * @author phong
 */
public class RandoomPw {

    public static String Randoom() {
        Random rd = new Random();
        int a = rd.nextInt(1000);
        String str1 = String.valueOf(a);

        int b = rd.nextInt(1000);
        String str2 = String.valueOf(b);

        int c = rd.nextInt(1000);
        String str3 = String.valueOf(c);

        int d = rd.nextInt(1000);
        String str4 = String.valueOf(d);

        int e = rd.nextInt(1000);
        String str5 = String.valueOf(e);

        int f = rd.nextInt(1000);
        String str6 = String.valueOf(f);

        int g = rd.nextInt(1000);
        String random = (str1 + str2 + str3 + str4 + str5 + str6);
        return random;
    }
}
