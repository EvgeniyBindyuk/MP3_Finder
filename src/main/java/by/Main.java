package by;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path;
        SongInfo song = new SongInfo();
        while (!(path = scanner.nextLine()).equals("end")) {
            for (File file : Objects.requireNonNull(Parser.getDir(path))) {
                try {
                    song.getInfo(file);
                    for (int i = 0; i < Utils.count; i++) {
                        System.out.println(Utils.artist.get(Utils.count));
                        System.out.println(Utils.genre.get(Utils.count));
                        System.out.println(Utils.album.get(Utils.count));
                        System.out.println(Utils.year.get(Utils.count));
                    }
                    Utils.count = 0;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        }
    }
}
