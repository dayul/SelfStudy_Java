package chapter_07;

public class DmbCellPhone extends CellPhone {
	
	// 필드
	int channel;
	
	// 생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;		// 부모 클래스로 상속받은 필드
		this.color = color;		// 부모 클래스로 상속받은 필드
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 번호가 " + channel + "로 변경되었습니다.");
	}
	
	void turnOff() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
