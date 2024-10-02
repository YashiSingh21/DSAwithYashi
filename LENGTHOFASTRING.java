public class basicRecursion{
public int stringLength(String s) {
        if (s.equals(""))
         return 0;
        return 1 + stringLength(s.substring(1));
    }
}
