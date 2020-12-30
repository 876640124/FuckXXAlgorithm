package algorithm.chn.leecode;

public class problem1576 {

    public static void main(String[] args) {
        problem1576 a = new problem1576();
        a.modifyString("j?qg??b");
    }

    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            if (chars[i] == '?') {
                replace(chars, i);
            }
        }
        return String.copyValueOf(chars);
    }

    private void replace(char[] chars, int i) {
        char l = i == 0 ? ' ' : chars[i - 1];
        char r = i == (chars.length - 1) ? ' ' : chars[i + 1];
        char tmp = 'a';
        while (tmp == l || tmp== r) {
            tmp++;
        }
        chars[i] = tmp;
    }
}
