import java.io.*;
public class Main {
   public static String abbreviation(String st) {
      StringBuilder ans = new StringBuilder();
      for (String token:st.split("\\s+")) 
      {
         ans.append(token.toUpperCase().charAt(0));
      }
      return ans.toString();
   }
   public static String rm(String ans) {
        if(ans.length()<=1)
            return ans;
        if(ans.charAt(0)==ans.charAt(1))
            return rm(ans.substring(1));
        else
            return ans.charAt(0) + rm(ans.substring(1));
    }

   public static void main(String[] args) {
      System.out.println(rm(abbreviation("Im Prajwal P, Senior software engineer engineer")));
   }
}
