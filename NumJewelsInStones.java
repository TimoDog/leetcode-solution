/**
��Ŀ������
�����ַ���J ����ʯͷ�б�ʯ�����ͣ����ַ��� S������ӵ�е�ʯͷ�� 
S ��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
J �е���ĸ���ظ���J �� S�е������ַ�������ĸ��
��ĸ���ִ�Сд�����"a"��"A"�ǲ�ͬ���͵�ʯͷ��
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
