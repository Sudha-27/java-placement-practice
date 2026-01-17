import java .lang.System;
class stringbasics {
    public static void main(String args[]) {
        String str = "Hello, World!";
        int count = 0;
        for(int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if(ch=='o'||ch=='a' || ch=='e' || ch=='i' || ch=='u'||
               ch=='O'|| ch=='A' || ch=='E' || ch=='I' || ch=='U')  
               {
                count++;
            }
      

    }    System.out.println("Number of vowels in the string: " + count);
}
}