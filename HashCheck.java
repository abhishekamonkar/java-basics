import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashCheck {

    public static void main(String[] args)
    {
        Map<String, String> mapp = new HashMap<>();

        mapp.put("Check", "Value 1");
        mapp.put("Trial", "Value 2");
        mapp.put("Execute", "Value 3");

        String check = "Execute";

        Iterator<Map.Entry<String, String>> itr = mapp.entrySet().iterator();

        boolean isPresent = false;

        while(itr.hasNext())
        {
            Map.Entry<String, String> entry = itr.next();
            if(check.equals(entry.getKey()))
                isPresent = true;
        }
        if(isPresent)
            System.out.println("Key is present");
        else
            System.out.println("Key not present");
    }
}
