package com.revature.day05.filesIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByte {

	 

    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

 

        try {
            in = new FileInputStream("test.txt");
            out = new FileOutputStream("test_byte.txt");

 

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
 