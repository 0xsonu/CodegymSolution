package java_core.level_5.task1525;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Solution {

    public static List<String> lines = new ArrayList<>();

    static{
        try{
            FileInputStream fis = new FileInputStream(Statics.FILE_NAME);
            FileInputStream fis1 = new FileInputStream(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            String line = reader.readLine();
            while (line != null){
                lines.add(line);
                line = reader.readLine();
            }


        } catch (Exception e){e.printStackTrace();}
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
