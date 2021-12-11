package algorithm.programmers.lv1;

public class HarshadNumber {
	
    public static boolean solution(int x) {
        
    	int sumOfX = 0;
        
        String[] arrayX = Integer.toString(x).split("");
        
        for(int i=0; i<arrayX.length; i++)
        	sumOfX += Integer.parseInt(arrayX[i]);
        
        if(x%sumOfX==0)
        	return true;
        else
        	return false;
        
    }
    
    public static void main(String[] args) {
		
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
        	
	}

}
