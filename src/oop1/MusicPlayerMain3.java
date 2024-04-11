package oop1;

public class MusicPlayerMain3 {
	public static void main(String[] args) {
		MusicPlayerData data = new MusicPlayerData();
		on(data);
		off(data);
		on(data);
		next(data);
		volumeUp(data);
		volumeUp(data);
		prev(data);
		volumeDown(data);
		status(data);
		off(data);
	}

	static void next (MusicPlayerData data) {
		data.music = "비행기";
		System.out.println(STR."다음 곡 \{data.music}을 재생합니다.");
	}
	static void prev (MusicPlayerData data) {
		data.music = "아리랑";
		System.out.println(STR."이전 곡 \{data.music}을 재생합니다.");
	}

		static void on (MusicPlayerData data) {
			data.isOn = true;
			System.out.println("음악 플레이어를 시작합니다.");
		}

		static void off(MusicPlayerData data) {
			data.isOn = false;
			System.out.println("음악 플레이어를 종료합니다.");
		}

		static void volumeUp(MusicPlayerData data) {
			data.volume++;
			System.out.println("음악 플레이어 볼륨: " + data.volume);
		}

	static void volumeDown(MusicPlayerData data) {
		data.volume--;
		System.out.println("음악 플레이어 볼륨: " + data.volume);
	}

	static void status(MusicPlayerData data) {
		System.out.println("음악 플레이어 상태 확인");
		if (data.isOn == true) {
			System.out.println("음악 플레이어 On, 볼륨:" + data.volume);
		} else {
			System.out.println("음악 플레이어 Off");
		}
	}
}

