class ChartoInt {
 
    public static void main(String[] args)
    {
        char ch = '9';
 
        System.out.println("char value: " + ch);
 
        int a = ch -'0';
 
        System.out.println("int value: " + a);

        // valueOf() method of String class 
         int b = Integer.parseInt(String.valueOf(ch));
        System.out.println(b);

    }
}