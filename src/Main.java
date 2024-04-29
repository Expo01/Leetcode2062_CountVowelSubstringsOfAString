import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String test = "cuaieuouac";
        System.out.println(new Solution().countVowelSubstrings(test));
    }



}

//SOLUTION. helps to know the set.clear function and realize that set >= 5 is a pass. set won't allow duplicates
class Solution
{
    public int countVowelSubstrings(String word)
    {
        int vow = 0;
        int n = word.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < n-4; i++)
        {
            set.clear();
            for(int j = i; j < n; j++)
            {
                char ch = word.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    set.add(ch);
                    if(set.size() == 5)
                        vow++;
                }
                else
                    break;
            }
        }
        return vow;
    }
}


// ATTEMPT
class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;


        for(int h = 0; h< word.toCharArray().length; h++){
            boolean a = false;
            boolean i = false;
            boolean e = false;
            boolean o = false;
            boolean u = false;

            if(word.charAt(h) == 'a' || word.charAt(h) == 'i' || word.charAt(h) == 'e' || word.charAt(h) == 'o' || word.charAt(h) == 'u'){

                for(int j = h; j < word.toCharArray().length; j++){
                    if(word.charAt(j) == 'a'){
                        a = true;
                    } else if(word.charAt(j) == 'i'){
                        i = true;
                    } else if(word.charAt(j) == 'e'){
                        e = true;
                    } else if(word.charAt(j) == 'o'){
                        o = true;
                    } else if(word.charAt(j) == 'u'){
                        u = true;
                    }

                    if(a && i && e && o && u && (word.charAt(j) == 'a' ||
                            word.charAt(j) == 'i' || word.charAt(j) == 'e'
                            || word.charAt(j) == 'o' || word.charAt(j) == 'u')){
                        count++;
                    }
                }
            }


        }
        return count;
    }
}
