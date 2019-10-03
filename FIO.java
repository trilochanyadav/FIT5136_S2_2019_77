import java.io.*;
import java.util.Scanner;
/**
 * This class is used to read and write file data to all files like owner.txt,customer.txt,admin.txt,hall.txt
 *
 * @Trilochan Yadav,Zonghao Dai,Yuxu Chen
 * @1.0 (30.09.2019)
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
    
    public String readData(String newFileName) //Read File Data from Different Files and return a String
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
    
    public void setData(String[] newData,String newFileName)//Write Data back to Different Files 
    {
      setFileName(newFileName);
      try
      {
           PrintWriter outputFile = new PrintWriter(fileName);
           int size = newData.length;
           for(int i = 0;i < size;i++)
           {
               outputFile.println(newData[i]);
              
            }  
           outputFile.close();
     
      }
     
     
       catch(IOException exception)
      {
         System.out.println("Unexpected I/O exception occurs");
        }
     }
    
   
    
}
