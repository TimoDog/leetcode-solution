/**
题目描述：
给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
J 中的字母不重复，J 和 S中的所有字符都是字母。
字母区分大小写，因此"a"和"A"是不同类型的石头。
*/


class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int n_j = J.length();
        int n_s = S.length();
        int count = 0;
        for (int i=0; i<n_j; i++){
            char c = J.charAt(i);
            for (int j=0; j<n_s; j++) {
                if(c == S.charAt(j)){
                    count++;
                }//if
            }//for j
        }//for i
        return count;
    }//public
}//class
