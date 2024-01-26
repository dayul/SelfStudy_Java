package chapter_07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		// DmbCellPhone 객체 생성
		DmbCellPhone dmb = new DmbCellPhone("자바폰", "블랙", 10);
		
		// CellPhone 클래스로 상속받은 필드
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		// DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dmb.channel);
		
		// CellPhone 클래스로 상속받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요!");
		dmb.sendVoice("죄송합니다. 잘못 걸었습니다.");
		dmb.hangUp();
		
		// DmbCellPhone 클래스의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChannelDmb(14);
		dmb.turnOff();
	}

}
