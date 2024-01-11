public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    public static String Problem1(int[] n, int t){
        int[] indecies = new int[2];
        for(int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i] + n[j] == t) {
                    indecies[0] = j;
                    indecies[1] = i;
                }
            }
        }
        String str = "[" + indecies[0] + "," + indecies[1] + "]";
        return str;
    }
    public static boolean Problem2(int x){
        String y = String.valueOf(x);
        StringBuilder r = new StringBuilder();
        boolean isPal = false;
        r.append(y);
        String rev = String.valueOf(r.reverse());
        if(rev == y){
            isPal = true;
        }
        return isPal;
    }
    public static String Problem3(String[] strs){
        return "";
    }
    public static int Problem4(String num){
        return 1;
    }
    public static boolean Problem5(String s){
        return false;
    }
    public static String Problem7(int[] digits){
        return "";
    }
}