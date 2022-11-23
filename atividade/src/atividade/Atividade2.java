package atividade;

public class Atividade2 {
	public int f(int n) {
		if (n <= 2) {
			return (n-1);
		}else {
			return f(n-1) + f(n-2);
		}
	}
}
