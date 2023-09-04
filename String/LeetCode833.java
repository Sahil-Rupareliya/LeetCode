package String;

public class LeetCode833 {
    public static void main(String[] args) {
        String[]  sources = {"kg","ggq","mo"},targets = {"s","so","bfr"};
        int[] indices = {3,5,1};


        String s = "vmokgggqzp";
        System.out.println(findReplaceString(s,indices,sources,targets));
    }

    public static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        String ans = s;
        for(int i=0; i<indices.length; i++){
            if(s.indexOf(sources[i]) == indices[i]){
                ans= ans.replace(sources[i],targets[i]);
            }
        }
        return s;
    }
}
