import java.util.HashMap;

/**
 * created by Jay on 2019/5/21
 */
public class App
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = new HashMap();
        System.out.println(map.put("name", "baby"));
        map.get("name");
    }
}
