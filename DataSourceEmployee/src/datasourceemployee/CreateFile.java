
package datasourceemployee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author PC
 */
public class CreateFile 
{
    public static void main(String[] args) throws IOException {
        
        /* start Arafa*/
        Properties properties = new Properties();
        OutputStream outputStream = null;
        try {
            // create db.properties
            outputStream = new FileOutputStream("db.properties");
            
            //properties.setProperty("MYSQL_DB_URL", "jdbc:mysql://localhost:3306/schema_arafa");
            properties.setProperty("MYSQL_DB_USERNAME", "root");
            properties.setProperty("MYSQL_DB_PASSWORD", "root");
            
            /*nouran schema */
             properties.setProperty("MYSQL_DB_URL", "jdbc:mysql://localhost:3000/employeesdatabase");
            properties.store(outputStream, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


