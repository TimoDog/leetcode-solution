/**
题目：给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

方法：弹出和推入数字 & 溢出前进行检查
思路

我们可以一次构建反转整数的一位数字。在这样做的时候，我们可以预先检查向原整数附加另一位数字是否会导致溢出。

算法

反转整数的方法可以与反转字符串进行类比。

我们想重复“弹出” xx 的最后一位数字，并将它“推入”到 \text{rev}rev 的后面。最后，\text{rev}rev 将与 xx 相反。

要在没有辅助堆栈 / 数组的帮助下 “弹出” 和 “推入” 数字，我们可以使用数学方法。

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