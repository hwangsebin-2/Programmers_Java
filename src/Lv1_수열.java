/* ����� ���� 
 * 
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]

x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�.
*/
public class Lv1_���� {	
	public static long[] solution(int x, int n) {
        long[] answer = {};
        for(int i=0; i<n; i++) {
        	answer[i] = (long)x * (i+1);
        }
        return answer;
    }
}