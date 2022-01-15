package polymorhism;

public class SamsungTv implements TV{
	
	private Speaker speaker;
	
	public SamsungTv() {
		System.out.println("삼성 Tv 생성됨1");
	}

	public void setSpeaker(Speaker speaker) { // speaker : 실행모듈 => dependency injection 의존주입 
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("삼성  TV --- 전원을 켠다.");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

	@Override
	public void powerOff() {
		System.out.println("삼성  TV --- 전원을 끈다.");
	}

}
