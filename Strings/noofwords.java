import java.util.*;

class noofwords
{
    public static void main(String args[])
    {
        String str = "this is a string and i love this. string";
        int i = 0;
        int count =0;
        while(i<str.length())
        {
            if(str.charAt(i)==' ' ||str.charAt(i)=='.')
            {
                count++;

            }
            i++;
        }
        System.out.println(count+1);
    }
}