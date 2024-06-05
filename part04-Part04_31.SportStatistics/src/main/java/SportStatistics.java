
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<String> homeName = new ArrayList<>();
        ArrayList<String> awayName = new ArrayList<>();
        ArrayList<Integer> homePoints = new ArrayList<>();
        ArrayList<Integer> awayPoints = new ArrayList<>();

        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNext()) {
                String line = read.nextLine();

                String[] parts = line.split(",");
                String home = parts[0];
                String away = parts[1];

                int hPoints = Integer.valueOf(parts[2]);
                int aPoints = Integer.valueOf(parts[3]);

                homeName.add(home);
                awayName.add(away);
                homePoints.add(hPoints);
                awayPoints.add(aPoints);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //System.out.println(homeName);
        //System.out.println(awayName);
        //System.out.println(homePoints);
        //System.out.println(awayPoints);

        int games = 0;
        int wins = 0;
        int loses = 0;

        for (int i = 0; i < homeName.size(); i++) {
            if (homeName.get(i).equals(team)) {
                games++;
                if (homePoints.get(i) > awayPoints.get(i)) {
                    wins++;
                } else {
                    loses++;
                }
            }
            if (awayName.get(i).equals(team)) {
                games++;
                if (awayPoints.get(i) > homePoints.get(i)) {
                    wins++;
                } else {
                    loses++;
                }
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);

    }
}
