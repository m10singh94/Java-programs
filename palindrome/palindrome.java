class palindrome
{
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(221));
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome(int number)
    {
        int num, new_num = 0;
        if(number < 0)
            num = number*(-1);
        else   
            num = number;
        while(num >= 1)
        {
            new_num = (new_num * 10) + (num % 10);
            num /= 10;
        }
        if((new_num == number) || (new_num == (number *(-1))))
            return true;
        else 
            return false;
    }
}