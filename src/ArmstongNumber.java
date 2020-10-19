import java.util.ArrayList;
import java.util.List;

public class ArmstongNumber {

    public boolean isArmstrong(int N) {

        int Ncopy = N;
        List<Integer> nums = new ArrayList();
        while(Ncopy > 0){
            nums.add(Ncopy%10);
            //digits += 1;
            Ncopy = Ncopy / 10;

        }
         //System.out.println(nums);
        //System.out.println(digits);
        //int cts = nums.size();

        int ArmstrongTotal = 0;
        for(int i =0; i<nums.size();i++){
            ArmstrongTotal += Math.pow(nums.get(i),nums.size());
        }
        System.out.println(ArmstrongTotal);
        System.out.println(N);
        if(ArmstrongTotal == N){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        ArmstongNumber am = new ArmstongNumber();
        am.isArmstrong(153);
    }
}
