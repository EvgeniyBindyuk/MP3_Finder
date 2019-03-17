package by;

import by.sort.SongSorter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        SongListFiller filler = new SongListFiller();
        String consoleInput;
        String rule;

        while (!(consoleInput = scanner.nextLine()).equals("end")) {
            if (consoleInput.equals("sort")) {
                System.out.println("Enter sort rule, " +
                        "example: 'ARTIST', 'ALBUM', 'YEAR', 'GENRE', 'SONG'");
                rule = scanner.nextLine();
                SongSorter.sortBy(rule);
                printer.printSongs();
            } else {
                filler.fillListSong(consoleInput);
                printer.printSongs();
            }
        }
    }
}

