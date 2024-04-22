package com.Abdul.TightCoupling;

import org.springframework.boot.autoconfigure.SpringBootApplication;

class Mario {
	void up() {
		System.out.println("Mario Up");
	}

	void down() {
		System.out.println("Mario Down");
	}

	void left() {
		System.out.println("Mario left");
	}

	void right() {
		System.out.println("Mario right");
	}
}

class Subway {

	void up() {
		System.out.println("SubwaySurfers up");
	}

	void down() {
		System.out.println("SubwaySurfers down");
	}

	void left() {
		System.out.println("SubwaySurfers left");
	}

	void right() {
		System.out.println("SubwaySurfers Right");
	}

}

class RunGame {
	void run(Mario obj) {
		obj.up();
		obj.down();
		obj.right();
		obj.left();
	}

	void run(Subway obj) {
		obj.up();
		obj.down();
		obj.left();
		obj.right();

	}

}

class Application {
	public static void main(String[] args) {
		Mario m = new Mario();
		Subway s = new Subway();
		RunGame r = new RunGame();
		r.run(m);

	}

}
