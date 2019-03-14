package by;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

class Parser {

    static ArrayList<File> getDir(String dir){
        ArrayList<File> listSongs = new ArrayList<>();
        Path path = Paths.get(dir);
        if (Files.isDirectory(path)) {
            File file = path.toFile();
            File[] files = file.listFiles();
            assert files != null;
            listSongs.addAll(Arrays.asList(files));
        } else return null;
        return listSongs;
    }
}


