package week06_review;

public class NestedLoopPractice2 {

    public static void main(String[] args) {

        String str = "abcabcabcabcbbbbbb ";

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int f = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j));
                f++;
            }
            if (result.contains(""+ch)){
                continue;
            }
            result += ch + ""+f;
        }

        System.out.println(result);

    }
}
