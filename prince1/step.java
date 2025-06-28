package prince1;

public class step {
    public static void main(String[] args) {
        int num[] = {2,3,1,1,4}; 
    
        System.out.println("okay the min jumps from start to end is :"+jump(num));
    }
    public static Integer jump(int num[]){
        int max=num[0];//2
        int steps = num[0];//2 
        int jump =1;// 1
        // 2,3,1,1,4

        for(int i =1;i<num.length;i++){
            if(i==num.length-1){
                return jump;
            }
            max=Math.max(max, i+num[i]);//2,1+num[1]==2,1+3==(2,4)
            steps --;

            if(steps==0){ //0,1,2,3
                jump++;  //jump add
                if(i>=max){ // 1,0,2,3,1
                    return -1;
                }
            steps = max- i;
            }
        }
        return -1;
    }
}
