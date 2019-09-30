import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class FIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FIO
{
    // instance variables - replace the example below with your own
    private String fileName;
    
    /**
     * Constructor for objects of class FIO
     */
    public FIO()
    {
        // initialise instance variables
        fileName = "";
    }

    /** 
     * 
     *
     * 
     * 
     */
    public void FileIO(String newFileName)//Non default constructor 
    {
        fileName = newFileName;
    }
    
    public String getFileName()
    {
        return fileName;
    }
    
    public void  setFileName(String newFileName)
    {
        fileName = newFileName;
    }
    
    public String readOwnersData(String newFileName) //Read File Data from Different Files and return a String
     {
        String allData = "";
        setFileName(newFileName);
        try
        {
            FileReader inputFile = new FileReader(fileName);
            try
            {
             Scanner parser = new Scanner(inputFile);
             while(parser.hasNextLine())
             {
              allData += parser.nextLine();
              allData += "\n";
            }
            }
        
            finally
           {
            inputFile.close();
            return allData;
            }
         }
       
         catch(FileNotFoundException exception)
         {
          System.out.println(fileName + " not found");
          
          }
        catch(IOException exception)
          {
            System.out.println("Unexpected I/O exception occurs");
           } 
           
        return null;
    }
    
    
}
