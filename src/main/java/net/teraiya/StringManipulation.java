package net.teraiya;

/**
 * Created by jteraiya on 11/30/14.
 */
public class StringManipulation {

    /**
     * We'll assume for simplicity that the character set is ASCII (256 char)
     * @param s input string
     * @return true if input string has all unique characters
     */
    boolean isUniquieChar(String s){
        if(s.length() > 256){
            return false;
        } else  {
            boolean[] char_set = new boolean[256];
            for(int i=0; i<s.length(); i++){
                int val = s.charAt(i);
                if(char_set[val]){
                    return false;
                }
            }
            return true;
        }
    }
}
