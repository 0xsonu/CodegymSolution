package java_core.level_5.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] query = input.split("\\?");
        String objParameterValue = null;

        String parameter[] = query[1].split("&");
        for (int i = 0; i < parameter.length; i++) {
            String[] parameterParts = parameter[i].split("=");
            System.out.print(parameterParts[0] + " ");
            if (parameterParts[0].equals("obj") && parameterParts.length > 1)
                objParameterValue = parameterParts[1];
        }
        System.out.println();

        if (objParameterValue!= null){
            try {
                alert(Double.parseDouble(objParameterValue));
            }catch (NumberFormatException e){alert((String) objParameterValue);}
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
