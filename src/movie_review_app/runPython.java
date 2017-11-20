package movie_review_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class runPython {

    public static String showMSG(String X){
        
        String s = null;

        try {
            
            
            String Str=X;
            String com = "python /Users/sureenawadhwa/Desktop/movie_review_app/src/movie_review_app/Classify.py \""+Str+"\"";
            Process p = Runtime.getRuntime().exec(com);
            System.out.println(com);
            
            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(p.getInputStream()));

            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
                
                return s;
                
            }
            System.out.println("didnt work");
           //return "s";
            //System.exit(0);
        }
        catch (IOException e) {
           
        }
        return "0";
    }
}