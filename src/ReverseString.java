// Program to print the reverse string in possible ways

public class ReverseString {

    // Method 1 through StringBuilder or StringBuffer because of their built-in reverse method
    public static void reverseStr(String original)
    {
        StringBuilder sb=new StringBuilder(original);

        // create new String for storing reverse String
        String rev=sb.reverse().toString();

        System.out.println("Reversed String through StringBuilder : "+ rev);
    }

    // Method 2 through loop
    public static void revStr( String original)
    {
        // take empty string for storing reverse value
        String rev="";
        // use reversing loop for reversing the String
        for(int i=original.length()-1;i>=0;i--)
        {
            rev += original.charAt(i);
        }
        System.out.println("Reversing string through loop : "+rev);
    }

    // Method 3 through character Array
    public static void revStrArray(String original)
    {
        char []charArray=original.toCharArray();
        int left=0,right=charArray.length-1;
        // loop is using to reversing the String
        while(left<right)
        {
            // create new int temp var for swapping the values
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;right--;
        }

        String rev=new String(charArray);
        System.out.println("Reversing string through swapping char array : "+rev);
    }

    // reverse String through Recursion
    public static String recursionStr(String original)
    {
        if(original.isEmpty())
        {
            return original;
        }

        return recursionStr(original.substring(1))+original.charAt(0);

    }

    public static void main(String[] args) {
        String str="Mihika Yadav";
        reverseStr(str);
        revStr(str);
        revStrArray(str);
        String rev=recursionStr(str);
        System.out.println("rev string using recursion : "+rev);


    }
}
