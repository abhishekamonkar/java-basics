import java.util.HashMap;
import java.util.Map;

public class HashEntry {

    public static void main(String[] args)
    {
        Map<String, String> mapp = new HashMap<String, String>();

        mapp.put("Check", "Value 1");
        mapp.put("Trial", "Value 2");
        mapp.put("Execute", "Value 3");

        for(Map.Entry<String, String> entry : mapp.entrySet())
        {
            System.out.println("Key is " + entry.getKey() + " and Value is " + entry.getValue());

        }

    }
}
