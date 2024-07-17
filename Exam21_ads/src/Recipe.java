
public abstract class Recipe {
	
	private String chef;
	public Recipe(String chef) {
		this.chef = chef;
		
		
	}
	public void info() {
		System.out.println("이 레시피는"+chef+"의 것입니다");
	}

}
