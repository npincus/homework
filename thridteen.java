import java.util.ArrayList;
import java.util.List;

class thridteen {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> old=new ArrayList();
        ArrayList<String> cur=new ArrayList();
        old.add("");
        for(int i=0;i<digits.length();i++){
            char s=digits.charAt(i);
            for(int j=0;j<old.size();j++){
                String start=old.get(j);
                String first="";
                String second="";
                String third="";
                String fourth="";
                switch(s){
                    case '2':
                        first="a";
                        second="b";
                        third="c";
                        break;
                    case '3':
                        first="d";
                        second="e";
                        third="f";
                        break;
                    case '4':
                        first="g";
                        second="h";
                        third="i";
                        break;
                    case '5':
                        first="j";
                        second="k";
                        third="l";
                        break;
                    case '6':
                        first="m";
                        second="n";
                        third="o";
                        break;
                    case '7':
                        first="p";
                        second="q";
                        third="r";
                        fourth="s";
                        break;
                    case '8':
                        first="t";
                        second="u";
                        third="v";
                        break;
                    case '9':
                        first="w";
                        second="x";
                        third="y";
                        fourth="z";
                        break;
                }
                cur.add(start+first);
                cur.add(start+second);
                cur.add(start+third);
                if(!(fourth.equals(""))) cur.add(start+fourth);
            }
            old=cur;
        }
        return old;
    }
}
/* ideal
    d7:ok so simple i add one number at a time and build a list of it at the current point this was not fast but simple
    used to arrayLists so that i dont have to deal with keeping track of what needs to be delete.
 */