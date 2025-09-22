
class Palindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int ori = x;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;

        }
        if (rev == ori) {
            return true;
        } else {
            return false;

        }

    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        int x = 11211;
        boolean a = p.isPalindrome(x);
        System.out.println(a);
    }
}
