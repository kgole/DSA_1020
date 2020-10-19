public class BinaryAddition {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int total = 0;
        int carry = 0;
        while(i >= 0 || j >= 0){
            total = carry;
            if(i >= 0){
                total += a.charAt(i) - '0';
            }
            if(j >= 0){
                total += b.charAt(j) - '0';
            }

            sb.append(total % 2);
            carry = total /2;
            i--;
            j--;
        }

        if(carry > 0){
            sb.append(carry);
        }
        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        BinaryAddition ba = new BinaryAddition();
        ba.addBinary("1010", "1011");
    }
}
