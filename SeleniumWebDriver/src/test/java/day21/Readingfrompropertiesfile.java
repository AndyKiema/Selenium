package day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Readingfrompropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileInputStream filepath=new FileInputStream(System.getProperty("user.dir")+"\\Testdatafolder\\Propertiesfile");
        Properties prop= new Properties();
        prop.load(filepath); //Loading the file so that it can be read
        //Getting values of the keys
        String link=prop.getProperty("url");
        prop.getProperty("email");
        prop.getProperty("orderid");
        prop.getProperty("customer");
        //System.out.println(prop.stringPropertyNames()); //Returns keys in string format in set collection
        //System.out.println(prop.keySet()); //Returns keys in object format in set collection
       // System.out.println(prop.values()); //reads all values. Returns values in object format in collection
        Collection<Object> propvalues=prop.values();
        Set<String>keys=prop.stringPropertyNames();
        ArrayList<String> kys= new ArrayList(keys);
        for(String key:kys) {
        	System.out.println(key);
        }
	}

}
