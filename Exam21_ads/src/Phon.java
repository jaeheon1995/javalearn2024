
public abstract class Phon {

	public abstract void openingLogo();
	
	public void powerOn() {
		this.openingLogo();
		System.out.println("on");
	}
	
	public void poweroff() {
		System.out.println("off");
	}
}
