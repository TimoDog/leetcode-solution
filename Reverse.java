/**
��Ŀ������һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��

�������������������� & ���ǰ���м��
˼·

���ǿ���һ�ι�����ת������һλ���֡�����������ʱ�����ǿ���Ԥ�ȼ����ԭ����������һλ�����Ƿ�ᵼ�������

�㷨

��ת�����ķ��������뷴ת�ַ���������ȡ�

�������ظ��������� xx �����һλ���֣������������롱�� \text{rev}rev �ĺ��档���\text{rev}rev ���� xx �෴��

Ҫ��û�и�����ջ / ����İ����� �������� �� �����롱 ���֣����ǿ���ʹ����ѧ������

*/


class Reverse {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) 
                return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) 
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}