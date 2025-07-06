package prince1;

public class triplet {
    public static void main(String[] args) {
        int nums[] ={1,4,2,6,7,10};
        System.out.println("the nums trplet is :"+trplet(nums));
    }
    public static boolean trplet(int nums[]){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=first){
                first = num;

            }
            else if (num<=second){
                second = num;
            }
            else{
                return true;
            }
        }
       return false;
    }
}