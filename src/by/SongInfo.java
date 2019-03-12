package by;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class SongInfo {

    void getInfo(File file) throws IOException {
        RandomAccessFile random = new RandomAccessFile(file, "r");
        for (long i = random.length() - 223; i < random.length() - 163; i++) {
            byte b = (byte) random.read();
            String s1 = String.format("%s", Integer.toBinaryString(b & 0xFF)).substring(1);
            if (!s1.equals("")) {
                System.out.print((char) Byte.parseByte(s1, 0b10));
            }
//            byte b1 = (byte) 129;
////            String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
////            System.out.println(s1); // 10000001
        }
    }

}
