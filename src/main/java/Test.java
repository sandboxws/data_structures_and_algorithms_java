import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String input = "c";
        char[] chars = input.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        int lastDupIndex = -1;
        int max = 0;
        for (int i=0; i < chars.length; i++) {
            Integer lastIndex = map.get(chars[i]);
            System.out.print(chars[i]);
            System.out.println(" lastIndex: " + lastIndex + ", lastDupIndex: " + lastDupIndex + ", max: " + max);
            if(lastIndex != null && lastDupIndex < lastIndex) {
                lastDupIndex = lastIndex;
            }

            max = Math.max(max, i - lastDupIndex);
            System.out.println(max);
            map.put(chars[i], i);
        }

        System.out.println(max);
    }
}
