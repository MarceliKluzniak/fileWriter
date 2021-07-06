package pl.mkluzniak;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue");
            writer.append("\nA poem by me! :)"); //method to add signature by who is written
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
