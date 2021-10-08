package practice508;

interface PhoneInterface { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언

	void sendCall(); // 추상 메소드

	void receiveCall(); // 추상 메소드

	default void printLogo() { // default 메소드
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface { // 인터페이스 구현
// PhoneInterface의 모든 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

// 메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

	interface MobilePhoneInterface extends PhoneInterface {
		void sendSMS(); // 새로운 추상 메소드 추가

		void receiveSMS(); // 새로운 추상 메소드 추가
	}

	interface MP3Interface {
		void play(); // 추상 메소드

		void stop(); // 추상 메소드
	}

	interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface {
		void playMP3RingTone(); // 새로운 추상 메소드 추가
		}
}
