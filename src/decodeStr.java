import java.util.Stack;

public class decodeStr {

    public String decodeString(String s) {

        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        String res = "";
        int index = 0;

        //we possibly could only have one of 4 types of characters (Digit,'[',']',Character), we'll handle all of them independently
        while(index < s.length()){
            System.out.println(s.charAt(index));
            if(Character.isDigit(s.charAt(index))){ //if it's a digit
                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = 10 * count + (s.charAt(index) - '0'); //handling multi digit prefixes like 32 or 43 or 4499
                    index += 1;
                }
                counts.push(count); //push the number into counts stack
            }
            else if(s.charAt(index) == '['){ //handling opening brackets
                result.push(res); //push existing res string into the stack so we can handle inner brackets
                res="";
                index += 1;
            }
            else if(s.charAt(index) == ']'){ //handling closing bracket
                StringBuilder temp = new StringBuilder(result.pop()); //stringbuilder for inner strings
                int count = counts.pop();//get the number from the stack
                for(int j=0;j<count;j++){//we'll basically repeat the number count number of times
                    temp.append(res);//append it into res
                }
                res = temp.toString();//make it a string
                index += 1;
            }
            else{//handling characters, basically just appending into res string
                res = res + s.charAt(index);
                index += 1;
            }
        }
        System.out.println(res);
        return res;

    }

    public static void main(String[] args) {

        decodeStr dec = new decodeStr();
        dec.decodeString("3[a2[c]]");

    }
}
