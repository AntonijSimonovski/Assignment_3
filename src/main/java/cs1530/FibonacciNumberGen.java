package cs1530;

public class FibonacciNumberGen implements FibonacciNumberInterface {

	@Override
	public long fib(int n) {
		if (n <= 1) {
			return n;
		}
		long[] fibMem = new long[n + 1];
		fibMem[0] = 0;
		fibMem[1] = 1;
		for (int i = 2; i <= n; i++) {
			fibMem[i] = fibMem[i - 1] + fibMem[i - 2];
		}
		return fibMem[n];
	}
		

	@Override
	public long fibOpt(int n, long[] fibMem) {
		if (n <= 1) {
			return n;
		}
		fibMem[0] = 0;
		fibMem[1] = 1;
		for (int i = 2; i <= n; i++) {
			fibMem[i] = fibMem[i - 1] + fibMem[i - 2];
		}
		return fibMem[n];
	}

}
