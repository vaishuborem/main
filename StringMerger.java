public class StringMerger {
    
    public static String mergeStrings(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int len1 = s1.length(), len2 = s2.length();
        int i = 0, j = 0;

        
        while (i < len1 || j < len2) {
            if (i < len1)
                merged.append(s1.charAt(i++));
            if (j < len2)
                merged.append(s2.charAt(j++));
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "12345";
        System.out.println(mergeStrings(s1, s2)); 
    }
}
