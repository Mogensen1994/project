

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Testfiles {

    public static void main(String[] args) {
        File file = new File("Player.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] info = s.split(",");
                String playername = info[0];
                int playerbalance = Integer.parseInt(info[1]);
                Player p = new Player(playername, playerbalance);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("filen findes ikke");
        }
    }
}
