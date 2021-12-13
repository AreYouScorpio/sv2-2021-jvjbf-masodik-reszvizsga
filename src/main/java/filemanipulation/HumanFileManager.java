package filemanipulation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanFileManager {

    private List<Human> humans = new ArrayList<>();

    HumanFileManager() {


    }

    List<Human> getHumans() {
        return humans;
    }

    void readHumansFromFile(Path p) throws IllegalStateException {
        try {
            List<String> lines = Files.readAllLines(p);
            for (String line : lines) {
                String s[] = line.split(";");
                humans.add(new Human(s[0], s[1]));
            }
        }catch(IOException ise)
        {
            throw new IllegalStateException("Can't read file!",ise);
        }
    }

    void writeMaleHumansToFile(Path p) throws IOException{
        FileWriter outFile = new FileWriter(p.toString());
        for(Human h:humans) {
            char first=h.getIdentityNumber().charAt(0);
            if(first=='1'||first=='3') {
                outFile.write(h.getName());
                outFile.write(";");
                outFile.write(h.getIdentityNumber());
                outFile.write("\n");
            }
        }
        outFile.close();
    }

}
