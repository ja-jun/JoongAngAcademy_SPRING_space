package polymorhism;

public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		System.out.println("애플스피커 생성됨1");
	}
		
	public void volumeUp() {
		System.out.println("애플스피커 --- 볼륨을 올린다.");
	}

	public void volumeDown() {
		System.out.println("애플스피커 --- 볼륨을 내린다.");
	}
	
}
