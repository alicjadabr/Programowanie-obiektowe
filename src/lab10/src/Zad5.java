import java.util.Stack;

public class Zad5 {
    public static String odwrocZdanie (String zdanie) {
        Stack<String> stack = new Stack<>();
        String[] words = zdanie.split(" ");
        for(String word : words) {
            stack.push(word);
            if(word.contains("."))
                break;
        }
        StringBuilder zd =  new StringBuilder();
        while(stack.empty() == false)
        {
            String s = stack.pop();
            zd.append(s+" ");
        }
        zd.toString();
        String zd2 = zd.substring(0, 1).toUpperCase() + zd.substring(1).toLowerCase();
        return zd2;
    }
}
