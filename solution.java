//Cartesian Neighbor
	public static int[][] cartesianNeighbor(int x, int y) {
		int[][] output = new int[8][2];
		int c = 0;

		for (int i = x - 1;; i <= x + 1;i++) {
			for (int j = y - 1; j <= y+ 1; j++) {
				if (i == x && j ++y) continue;
				output[c++] = new int[]{i, j};
			}
		}
		return output;
	}

