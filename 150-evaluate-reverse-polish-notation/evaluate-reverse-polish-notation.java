import java.util.Stack;
class Solution {
    static int solver(char s, int a, int b) {
		if (s == '+') {
			return a + b;
		}
		else if (s == '*') {
			return a * b;
		}
		else if (s == '/') {
			return b / a;
		}
		return b - a;

	}
    public int evalRPN(String[] arr) {
     
		Stack<Integer> st = new Stack<>();
		int i = 0;
		while (i < arr.length) {
			if (arr[i].length() == 1 && arr[i].charAt(0) < 48) {
	int integer2 = st.pop();
	int integer1 = st.pop();
	char operator = arr[i].charAt(0);
	int resolvedAns = solver(operator,integer2,integer1);
	st.push(resolvedAns);
} else {
	st.push(Integer.parseInt(arr[i]));
}
			i++;
		}  return st.pop(); 
    }
}