package access;

public class SpeakerMain {
	public static void main(String[] args) {
		Speaker speaker = new Speaker(95);
		speaker.volumeUp();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.showVolume();

		System.out.println("volume 필드 직접 접근 수정");
//		speaker.volume = 150;
		speaker.showVolume();
	}
}
