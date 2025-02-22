package pl.edu.agh.hangman;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Words {

    List<String> words;


    public Words(String filename) {
        words = new ArrayList<>();
        readFromFile(filename);
    }

    public List<String> getWords(){
        return words;
    }

    private void readFromFile(String filename){

        File file = getFile(filename);

        try(BufferedReader input = new BufferedReader(new FileReader(file))) {
            while(true) {
                String line = input.readLine();
                if(line == null) {
                    break;
                }
                words.add(line.toUpperCase(Locale.ROOT));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private File getFile(String fileName) {
        URL resource = getClass().getClassLoader().getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found!");
        } else {


            try {
                return new File(resource.toURI());
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
