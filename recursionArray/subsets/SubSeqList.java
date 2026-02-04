package recursionArray.subsets;

import java.util.List;
import java.util.*;

public class SubSeqList {
    public static void main(String[] args) {
        char ch = 'b';
        System.out.println((char)(ch + 1));
        System.out.println(subseqList("", "abc"));
    }
    
    public static List<String> subseqList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        //include current character
        List<String> left = subseqList(p + ch, up.substring(1));

        //exclude current character
        List<String> right = subseqList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
