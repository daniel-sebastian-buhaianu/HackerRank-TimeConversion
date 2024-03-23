import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String timeOfDay = s.substring(s.length() - 2);
        String hhmmss = s.substring(0, s.length()-2);
        String mmss = hhmmss.substring(3);
        
        int hour = Integer.parseInt(hhmmss.substring(0, 2));
        
        if (timeOfDay.equals("AM")) {
            if (hour == 12) {
                return "00:".concat(mmss);
            }
            
            return hhmmss;    
        }
        
        if (hour == 12) {
            return hhmmss;
        }
            
        return Integer.toString(hour + 12).concat(":").concat(mmss);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
