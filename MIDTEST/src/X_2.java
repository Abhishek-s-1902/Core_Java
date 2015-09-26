import java.io.*;
import java.util.*;

public class X_2 {
  public static void main( String args[] ) {

    Hashtable aHashTable = new Hashtable();
    aHashTable.put("plus  Movie",   "A little Voice");
    aHashTable.put("The HashTable", aHashTable);

    try {
        FileOutputStream ostream = new FileOutputStream("self.data");
        ObjectOutputStream p = new ObjectOutputStream(ostream);
        p.writeObject(new Date());	// marked line 1
        p.writeObject(aHashTable);	// marked line 2
        p.close();
    } catch ( Exception e)	{ }
 
  }
}