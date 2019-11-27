import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileHandling
{
    public static void main(String[] args) throws IOException
    {
        int ch;

        FileReader fr = null;

        try {
            
            fr = new FileReader("text.txt");
        
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println("File not found");
            e.printStackTrace();
        }

        FileWriter fw = new FileWriter("out.txt");
        int i = 0;
        while((ch=fr.read())!=-1)
        {
            i = i + 1;
            fw.write((char)ch);

        }
         System.out.println(i);

        fw.close();
        fr.close();
    }
}