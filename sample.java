import java.io.*;
import java.util.Scanner;

class sample {
    public static void main(String[] args)
    {
        String str = "selcia", nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr; 
        }
        System.out.println(nstr);
    }
}
