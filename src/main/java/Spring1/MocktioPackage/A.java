package Spring1.MocktioPackage;


import org.springframework.http.HttpStatus;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import static org.jvnet.fastinfoset.FastInfosetSerializer.UTF_8;

public class A {


    public boolean isAnagram(String s, String t) throws UnsupportedEncodingException {
        if (s.length() != t.length()) {
            return false;
        }
        if(s.length()==0){
            return true;
        }
        int sum = 0;
        byte[] bytes = s.getBytes(UTF_8);
        byte[] bytes1 = t.getBytes(UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            sum = sum - bytes[i] + bytes1[i];
//            System.out.println("__________________________________________________");
//            System.out.println(Arrays.binarySearch(bytes, bytes1[i]) == -1);
//            System.out.println(Arrays.binarySearch(bytes1, bytes[i]) == -1);
//            System.out.println(sum);
//            System.out.println("__________________________________________________");
//            s:"ab",t:"ba" zwraca false;

            if (Arrays.binarySearch(bytes, bytes1[i]) == -1||
                    Arrays.binarySearch(bytes1, bytes[i]) == -1) {
                System.out.println(i);
                return false;
            }
        }
        if(sum==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s1 = "abc";
        String s2 = "abc";
        System.out.println( s1 == s2);

        A a = new A();
        System.out.println(a.isAnagram("abcd", "dcba"));

        HttpStatus httpStatus = HttpStatus.FAILED_DEPENDENCY;


    }

}
