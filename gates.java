public class gates{
	public static int not(int i){
		return (1 - i);
	}

	public static int and(int i, int k){
		return (i*k);
	}

	public static int or(int i, int k){
		return (i + k - (i*k));
	}

	public static int xor(int i, int k){
		return (i + k - i*k(1 + i + k - i*k));
	}

	public static int firstGateSim(int a, int b){
		return not(and(not(a), b), and(a, not(b));
	}

	public static int[] secondGateSim(int a, int b){
		int[] returnMe = [0, 0];
		returnMe[0] = xor(a, b);
		returnMe[1] = and(a, b);
		return returnMe;
	}

	public static void main(String[] args){
		// empty
	}
}
