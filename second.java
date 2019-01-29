import java.util.ArrayList;
import java.util.List;

class second {

    public List<String> generateParenthesis(int n) {
        ArrayList<String> ret = new ArrayList<>();
        if(n==1){
            ret.add("()");
            return ret;
        }
        List<String> sub=generateParenthesis(n-1);
        for (String s:sub) {
            for (int i = 0; i < s.length(); i++) {
                String p=s.substring(0, i) + "()" + s.substring(i);
                if(!ret.contains(p)) ret.add(p);
            }
        }
        return ret;
    }
}
/* this solution is nieave
    ideal: what are the legal combos of parenthesis?
    d7: so first i saw that there is only one solution of the form n=1 () and n=2 has 3 solutions but 2 are degenerate
    and any one could be build buy adding in solution one into all the places legal n and then removeing the degenerate
    solutions
    Q:what is the cleaner solution as this is really slow?
 */