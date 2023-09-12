import java.util.*;
public class Hash {

			Hashtable<String, String> ht = new Hashtable<String, String>();
			ht.put("Nitin", "nitin123@gmail.com");
			ht.put("Deepak", "deepak123@gmail.comss");
			// ht.put(null, "abc"); //RTE not allowed null Keys/values
			ht.put("Harish", "harish123@gmail.com");
			// ht.put(null, null);
			ht.put("Ravi", "ravi123@gmail.com");
			System.out.println("\nHashtable with name and emailId");
			System.out.println(ht);

			System.out.println("\nTraversing a Hashtable\n");
			Enumeration em = ht.keys();
			while (em.hasMoreElements()) {
				String nm = em.nextElement().toString();
				System.out.println(nm + " : " + ht.get(nm));
			}
}
