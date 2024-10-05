import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static String timeConversion(String s) {
        int n = s.length();
        int hour = Integer.parseInt(s.substring(0, 2));
        String timeOfDay = s.substring(n - 2);
        String restOfTime = s.substring(2, n - 2);
        
        if (timeOfDay.equals("AM") && hour == 12)
        {
            hour = 0;
        }
        else if (timeOfDay.equals("PM") && hour < 12)
        {
            hour += 12;
        }
        
        return String.format("%02d", hour) + restOfTime;
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
