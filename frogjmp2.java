public class frogjmp2{
    public static int solution(int X,int Y,int D){

        double distence = Y - X;
        int jumps = (int) Math.ceil(distence / D);
        return jumps;
    }
    public static void main(String args[]) {
        
        System.out.println(solution(10,100,10));
        
        
    }
}