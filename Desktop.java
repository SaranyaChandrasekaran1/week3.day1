package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println(" Desktop)size:1024x768");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop deskobj = new Desktop();
		deskobj.computerModel();
		deskobj.desktopSize();
	}

}
