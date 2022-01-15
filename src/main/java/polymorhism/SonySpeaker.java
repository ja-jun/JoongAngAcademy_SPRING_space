package polymorhism;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// @Component // 일반적인 것 아래 3가지 다 상속받은 경우이므로 3가지 다 쓸 수 있다.
@Controller // 웹프로그램 기준   1) 컨트롤러 역할을 하는 경우(MVC모델)
// @Service 	// 		       2) 비지니스 로직 담당(MVC모델)
// @Repository  //			   3) DB 연동 객체 (우린 myBatis 쓸꺼기 떄문에 다른 어노테이션을 쓸 것임. 참고로 우린 안쓴다)
public class SonySpeaker implements Speaker {
	
	public SonySpeaker() {
		System.out.println("소니스피커 생성됨1");
	}
		
	public void volumeUp() {
		System.out.println("소니스피커 --- 볼륨을 올린다.");
	}

	public void volumeDown() {
		System.out.println("소니스피커 --- 볼륨을 내린다.");
	}
	
}
