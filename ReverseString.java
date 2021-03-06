/**
 * @Author: TimoDog email:ax9nvm@Outlook.com
 * @Date: 2019/7/31 21:10
 */

/**
 * 题目：编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
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
