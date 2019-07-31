/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/7/31 21:10
 */

/**
 * ��Ŀ����дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� char[] ����ʽ������
 *
 * ��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣
 *
 * ����Լ��������е������ַ����� ASCII ����еĿɴ�ӡ�ַ���
 *
 */

public class ReverseString {

    public void reverseString(char[] s) {
        swap(0, s.length-1, s);
    }

    public void swap(int start, int end, char[] s) {

        if (start >= end){
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        swap(start+1, end-1, s);

    }
}
