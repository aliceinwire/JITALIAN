package dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;     
public class dictionary {
public static void main(String[] args){

try {
	File dir = new File(".");
	File fileDir = new File(dir.getCanonicalPath() + File.separator + "itadict.txt");

    BufferedReader in = new BufferedReader(
       new InputStreamReader(
                  new FileInputStream(fileDir), "UTF8"));

    String str;

    while ((str = in.readLine()) != null) {
        System.out.println(str);
    }

            in.close();
    } 
    catch (UnsupportedEncodingException e) 
    {
        System.out.println(e.getMessage());
    } 
    catch (IOException e) 
    {
        System.out.println(e.getMessage());
    }
    catch (Exception e)
    {
        System.out.println(e.getMessage());
    }
}
}