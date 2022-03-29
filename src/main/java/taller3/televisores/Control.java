package taller3.televisores;

public class Control {

	// Atributo
	private TV tv;

	public void enlazar(TV televisor) {
		this.tv = televisor;
		this.tv.setControl(this);
	}

	// Apagado-Encendido-Estado
	public void turnOn() {
		tv.turnOn();
	}

	public void turnOff() {
		tv.turnOff();
	}

	public void canalUp() {
		tv.canalUp();
	}

	public void canalDown() {
		tv.canalDown();
	}

	public void volumenUp() {
		tv.volumenUp();
	}

	public void volumenDown() {
		tv.volumenDown();
	}

	public void setCanal(int canal) {
		tv.setCanal(canal);
	}

	// TV
	public void setTV(TV televisor) {
		tv = televisor;
	}

	public TV getTV() {
		return tv;
	}
}
