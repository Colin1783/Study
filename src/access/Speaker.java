package access;

public class Speaker {
	private int volume;

	public Speaker (int volume) {
		this.volume = volume;
	}

	public void volumeUp () {
		if (volume >= 100) {
			System.out.println("최대 음량입니다.");
		} else {
			volume += 5;
			System.out.println("음량을 5 높입니다.");
		}
	}

	public void volumeDown () {
		if (volume <= 0) {
			System.out.println("최소 음량입니다.");
		} else {
			volume -= 10;
			System.out.println("음량을 10 낮춥니다.");
		}
	}

	public void showVolume () {
		System.out.println("현재음량= " + volume);
	}
}
