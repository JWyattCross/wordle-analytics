import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    // read data from text file & put in an array
    File fileName = new File("valid-bank.csv");
    Scanner inFile = new Scanner(fileName);
    int numValues = 0;
    int[][] dist = new int[5][26];
    int[] LetterList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int index = 0;

    // calcualtes the length of the file
    while (inFile.hasNextLine()) {
      inFile.nextLine();
      numValues++;
    }
    inFile.close();
    // System.out.println(numValues);

    //copies the values in the file to an array 
    String[] words = new String[numValues];
    inFile = new Scanner(fileName);
    while (inFile.hasNext()) {
      words[index] = inFile.next();
      index++;
    }
    inFile.close();
    //System.out.println(words[23]);

    index = 0;
    while (index < numValues){
      //System.out.println(words[index]);
      for (int i = 0; i < words[index].length(); i++){
        //System.out.println(words[index].charAt(i));
        for (int j = 0; j < 26; j++){
          if (LetterList[j] == words[index].charAt(i)){
            dist[i][j]++;
            //words[index].charAt(i)
          }
        
          }
      }
      index++;
    }

    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 26; j++){
        System.out.print(dist[i][j] + ", ");
    }
      System.out.println("");
    }
    //System.out.println(index);
  }
}