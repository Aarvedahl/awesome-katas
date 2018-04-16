package io.github.aarvedahl.FourPartTwo;

import java.io.*;

public class FourPartTwo {

//	The file football.dat contains the results from the English Premier League for 2001/2.
//	The columns labeled ‘F’ and ‘A’ contain the total number of goals
//	scored for and against each team in that season (so Arsenal scored 79 goals against opponents,
//	and had 36 goals scored against them). 
//	Write a program to print the name of the team with the smallest difference in ‘for’ and ‘against’ goals.

    public static void main(String[] args) {
        try {
            footballFileHantering();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void footballFileHantering() throws IOException{
        File file = new File("C:/Users/alexa/OneDrive/Dokument/football.dat");

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        reader.readLine();

        int slutSum = 0;
        String team = "";
        while(reader.ready()){
            String line = reader.readLine();

            String[] split = line.trim().split("\\s+");

            if(split.length > 6) {

                int Fgoals = Integer.parseInt(split[6].replace("-", ""));
                int Agoals = Integer.parseInt(split[8].replace("-", ""));
                int startSum = Fgoals - Agoals;

                if(slutSum == 0){
                    slutSum = startSum;
                }

                if(startSum >= 0 && startSum < slutSum) {
                    slutSum = startSum;
                    team = split[1].replace("_", " ");
                }
                if(startSum < 0) {
                    startSum = -1 * startSum;
                    if(startSum < slutSum) {
                        slutSum = startSum;
                        team = split[1].replace("_", " ");
                    }
                }

            }

        }
        System.out.println("Slutsumman är: " + slutSum + " av team: " + team);
    }
}