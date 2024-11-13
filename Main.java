import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(countProperContains("ga diga dagadi gadaio", "ga"));
  }

  public static int countSub(String word, String target)
  {
    int count = 0;
    if(word.indexOf(target) != -1){
      for(int i = 0; i < word.length()-1; i++){
        if((word.substring(i, i+target.length())).equals(target)){
          count++;
        }
      }
    }
    return count;
  }

  public static int countProperContains(String word, String target)
  {
    int count = 0;
    if(word.indexOf(target) != -1){
      for(int i = 0; i < word.length()-1; i++){
        if((word.substring(i, i+target.length())).equals(target)){
          if(i == 0 && word.substring(i + target.length(), i + target.length() + 1).equals(" ")){
            count++;
          } else if (i == target.length()-1 && word.substring(i-1,i).equals(" ")){
            count++;
          } else if (word.substring(i-1, i).equals(" ")){
            count++;
          }
        }
      }
    }
    return count;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
