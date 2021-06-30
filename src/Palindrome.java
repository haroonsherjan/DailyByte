import java.util.HashMap;

public class Palindrome {
    public static void main(String... args){
        if(isPalindrome("racecar", "racecar")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        HashMap<Character, Integer> aMap = createCharacterCountMap(a);
        HashMap<Character, Integer> bMap = createCharacterCountMap(b);
        for(Character c : aMap.keySet()){
            if(aMap.getOrDefault(c, -1) != bMap.getOrDefault(c, -1)){
                return false;
            }
        }
        return true;
    }

    static HashMap<Character, Integer> createCharacterCountMap(String a){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character c : a.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
