public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    public static int[] Problem1(Integer[] n, int t){
        int[] indecies = new int[2];
        for(int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i] + n[j] == t) {
                    indecies[0] = i;
                    indecies[1] = j;
                }
            }
        }
        return indecies;
    }

}