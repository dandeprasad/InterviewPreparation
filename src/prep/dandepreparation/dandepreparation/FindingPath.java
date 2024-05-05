package dandepreparation;
import java.util.ArrayList;

import org.json.JSONObject;
public class FindingPath {
static ArrayList<String> wholeval = new ArrayList<String>();

	public static void main(String[] args) {
		String jsonString = "{\"phonetype\":\"N95\",\"cat\":\"dande\"}";
		JSONObject jsonObj = new JSONObject(jsonString);
	    
		printJsonObject(jsonObj);

		  for (int i = 0; i < wholeval.size(); i++)  
	            System.out.print(wholeval.get(i) + "/");         
	    
	};
	
	public static void printJsonObject(JSONObject jsonObj) {
	    for (Object key : jsonObj.keySet()) {
	       
	        String keyStr = (String)key;
	        Object keyvalue = jsonObj.get(keyStr);

	        //checks the value match
	        if (keyvalue.equals("dande")) {
	        	wholeval.add((String) keyStr);
	        	return;
	        }
	       
	       
//checks the nested object;
	        if (keyvalue instanceof JSONObject) {
	        	wholeval.add((String) keyStr);
	            printJsonObject((JSONObject)keyvalue);
	        }
	    }
	}

}
