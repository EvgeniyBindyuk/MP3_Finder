package by;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.regex.Pattern;

class SongInfo {

    void getInfo(File file) throws IOException {
        RandomAccessFile random = new RandomAccessFile(file, "r");
        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < 400; i++) {
            char a = (char) random.read();
            String str = String.valueOf(a);
            sb.append(str);
            if (str.matches("[A-Za-zА-Яа-яеЁ0-9\\s]")) {
                System.out.print(a);
            }
//            String str2 = new String(sb);
//            Pattern album = Pattern.compile("[TALB]") surefire plugin
        }
    }
}
