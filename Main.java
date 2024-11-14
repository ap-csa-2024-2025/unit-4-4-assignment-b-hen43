import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(deleteSub("i just lost my dawg", "dawg"));
  }

  public static String deleteSub(String word, String target)
  {
    String string3 = word;
    while(string3.indexOf(target) != -1){
      String string1 = string3.substring(0, string3.indexOf(target));
      String string2 = string3.substring(string3.indexOf(target) + target.length(), string3.length());
      string3 =  string1 + string2;
    }

    return(string3);
  }
}
