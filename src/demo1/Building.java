package demo1;

public class Building {

        private String material;
        private int windows;

        public Building(String material, int windows) {
                this.material = material;
                this.windows = windows;
        }

        public int getWindows() {
                return windows;
        }

        public String getMaterial() {
                return material;
        }

        public void getClean() {
		String type = this.getClass().getSimpleName();
		System.out.println("Cleaned " + getMaterial() + " " + type);
		System.out.println("Cleaned " + getWindows() + " windows");
		
	}
}

