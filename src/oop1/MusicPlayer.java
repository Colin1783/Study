package oop1;

public class MusicPlayer {
	int volume;
	boolean isOn;

	void on() {
		isOn = true;
		System.out.println("플레이어 전원을 켭니다.");
	}

	void off() {
		isOn = false;
		System.out.println("플레이어 전원을 끕니다.");
	}

	void volumeUp() {
		volume++;
		System.out.println(STR."볼륨을 높입니다. volume: \{volume}");
	}

	void volumeDown() {
		volume--;
		System.out.println(STR."볼륨을 낮춥니다. volume: \{volume}");
	}

	void showStatus() {
		if (isOn = true) {
			System.out.println(STR."전원 On, 현재 Volume: \{volume}");
		} else {
			System.out.println("전원 Off");
		}
	}
}
