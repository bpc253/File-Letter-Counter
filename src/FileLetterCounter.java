import java.util.Scanner;
import java.io.*;
public class FileLetterCounter {

    public static void main(String[] args) throws IOException{
        // Create Scanner object for user input
		Scanner scanner = new Scanner(System.in);
                
                String userFileName;
                String userContents;
                String userContentsFromFile;
                char userCharacter;
                int characterCount = 0;
                
                
                System.out.println("Please enter the name of a file with the extention: ");
                userFileName = scanner.nextLine();
                
                PrintWriter userWriteFile = new PrintWriter(userFileName);
                System.out.println(userFileName + " has been created");
                
                System.out.println("Please enter what you want to write in " + userFileName);
                userContents = scanner.nextLine();
                
                userWriteFile.println(userContents);
                System.out.println(userContents + " has been written to " + userFileName);
                
                userWriteFile.close();
                
                File userCreatedFile = new File(userFileName);
                
                System.out.println("Checking to make sure " + userFileName + " exists");
                
                if(!userCreatedFile.exists()){
                    System.out.println("File does not exist");
                } else{
                    System.out.println("Success! File exists. Reading from " + userFileName + " ...");
                    Scanner userCreatedFileToScan = new Scanner(userCreatedFile);
                    userContentsFromFile = userCreatedFileToScan.nextLine();
                    
                    System.out.println("Please enter a character to count");
                    userCharacter = scanner.nextLine().charAt(0);
                    
                
                for(int index = 0; index < userContentsFromFile.length(); index++){
                    if (userContentsFromFile.charAt(index) == userCharacter){
                        characterCount = characterCount + 1;
                    }                 
                }
                userCreatedFileToScan.close();
                    System.out.println(userCharacter + " appears in " + userContentsFromFile + " " + characterCount + " time(s)");
                }
    }
    
}
