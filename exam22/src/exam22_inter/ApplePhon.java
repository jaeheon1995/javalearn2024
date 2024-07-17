package exam22_inter;

public class ApplePhon implements phon {

	private int batterycapacity = 40;
	private boolean isOn=false;
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		if(batterycapacity > 30) {
			System.out.println("on");
			isOn=true;
		}else {
			System.out.println("Lowbattery");
		}
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("off");
		isOn=false;
		
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		if (isOn) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void watchYoutube() {
		// TODO Auto-generated method stub
		if(batterycapacity >10) {
			System.out.println("Watching ");
			batterycapacity -= 10;
			System.out.println("Battery is"+this.batterycapacity+"%");
		}else {
			System.out.println("Low battery");
			powerOff();
		}
		
	}

	@Override
	public void carge() {
		// TODO Auto-generated method stub
		if(this.batterycapacity < phon.MAX_BATTERY_CAPACITY) {
			System.out.println("start charging");
			if(phon.MAX_BATTERY_CAPACITY - this.batterycapacity >5) {
				this.batterycapacity +=5;
			}else {
				this.batterycapacity += (phon.MAX_BATTERY_CAPACITY-this.batterycapacity);
			}
			
			
		}
	}

}
