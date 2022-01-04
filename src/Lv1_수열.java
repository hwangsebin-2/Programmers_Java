/* 입출력 예시 
 * 
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]

x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
*/
public class Lv1_수열 {	
	public static long[] solution(int x, int n) {
        long[] answer = {};
        for(int i=0; i<n; i++) {
        	answer[i] = (long)x * (i+1);
        }
        return answer;
    }
}