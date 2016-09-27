package stackNqueue;

/*
 * 3.4 Tower of Hanoi
 */
public class TowerHanoi {

	public static void main(String[] args) {
		int n = 3;
		Tower[] towers = new Tower[n];

		// Creates the Towers
		for (int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}

		// Adds disks to the tower
		for (int i = n - 1; i >= 0; i++) {
			towers[0].add(i);
		}
		towers[0].moveDisks(n, towers[2], towers[1]);
	}

	public static class Tower {
		private Stack disks;
		private int index;

		public Tower(int i) {
			disks = new Stack();
			index = i;
		}

		public int index() {
			return index;
		}

		public void add(int d) {
			if (!disks.isEmpty() && (int) disks.peek() <= d) {
				System.out.println("Error placing: " + d);
			} else {
				disks.push(d);
			}
		}

		public void moveTop(Tower t) {
			int top = (int) disks.pop();
			t.add(top);

			System.out.println("Move disk " + top + "from " + index() + " to "
					+ t.index());
		}

		public void moveDisks(int n, Tower destination, Tower buffer) {
			if (n > 0) {
				moveDisks(n - 1, buffer, destination);
				moveTop(destination);
				buffer.moveDisks(n - 1, destination, this);
			}
		}
	}
}
