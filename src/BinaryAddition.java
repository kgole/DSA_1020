public class BinaryAddition {

    public String addBinary(String a, String b) {
        String ans = "";
        int carry = 0;
        StringBuilder sb = new StringBuilder();
 /*       for(int i=a.length()-1;i >=0 ;i--){
            for(int j=b.length()-1;j >=0 ;j--){
                int anum = a.charAt(i) - '0';
                int bnum = b.charAt(j) - '0';

                *//*System.out.println(anum);

                System.out.println(bnum);*//*
            }
        }
*/

        int i = a.length() - 1;
        int j = b.length() - 1;
        //int carry = 0;
        while(i >= 0 || j >= 0){
            /*System.out.println(a.charAt(i));
            System.out.println(b.charAt(j));
            i--;
            j--;*/

            int total = carry;
            if(i >= 0){
                total += a.charAt(i) - '0';
            }
            if(j >= 0){
                total += b.charAt(j) - '0';
            }
            sb.append(total % 2);
            carry = total/2;
            i--;
            j--;
        }
        if(carry!=0){
            sb.append(carry);
        }
        /*System.out.println(a);
        System.out.println(b);
        */
        //System.out.println(ans);
        ans = sb.reverse().toString();
        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args) {
        BinaryAddition ba = new BinaryAddition();
        ba.addBinary("11", "1");
    }
}
