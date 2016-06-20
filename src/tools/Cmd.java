package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Cmd {
	static String charset="GBK";
	public static List<String> run(String cmd) throws IOException {  
        Runtime rt = Runtime.getRuntime();  
        	List<String> l=new ArrayList<String>();
               Process p = rt.exec(cmd);  
               BufferedReader br = new BufferedReader(new InputStreamReader(p  
                             .getInputStream(),charset));  
               String msg = null;  
               while ((msg = br.readLine()) != null) {  
                      if(msg.length()>0){
                    	  l.add(msg);
                      }
               }  
               br.close();
			return l;  
          
 }  
}
