package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Words {

    public void reachFromFile(String fileName){
        try(BufferedReader input = new BufferedReader(new FileReader(fileName))) {
            while(true) {
                String line = input.readLine();
// wynik null oznacza, że to już koniec pliku
                if(line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
