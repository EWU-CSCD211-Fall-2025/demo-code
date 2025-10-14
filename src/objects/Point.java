package objects;

import java.util.Objects;

public class Point {
	
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof Point)) {
			return false;
		} else {
			return ((Point) o).x == x && ((Point) o).y == y;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
}