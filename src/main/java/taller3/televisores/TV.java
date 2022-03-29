package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	public static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca = marca;
		this.canal = 1;
		this.precio = 500;
		this.estado = estado;
		this.volumen = 1;
		numTV += 1; 
	}
	
	// Marca
	public void setMarca(Marca marca) {
		return;
	}
	public Marca getMarca() {
		return marca;
	}
	
	// Control
	public void setControl(Control control) {
		return;
	}
	public Control getControl() {
		return control;
	}
	
	// Precio
	public void setPrecio(int precio) {
		return;
	}
	public int getPrecio() {
		return precio;
	}
	
	//Volumen
	public void setVolumen(int volumen) {
		return;
	}
	public int getVolumen() {
		return volumen;
	}
	
	// Canal	
	public void setCanal(int canal) {
		return;
	}
	public int getCanal() {
		return canal;
	}
	
	//NumTV
	public static void setNumTV(int numTV) {
		return;
	}
	public static int getNumTV() {
		return numTV;
	}
	
	
	// Apagado-Encendido-Estado
	public void turnOn () {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	
	//CanalUp - CanalDown
	public void canalUp() {
		if ((estado) && ((this.canal += 1) <=120)) {
			this.canal += 1;
		}
	}
	public void canalDown() {
		if ((estado) && ((this.canal -= 1) >= 1)) {
			this.canal -= 1;
		}
	}
	
	//VolumenUp - VolumenDown
	public void volumenUp() {
		if ((estado) && ((this.volumen += 1) <=7)) {
			this.volumen += 1;
		}
	}
	public void volumenDown() {
		if ((estado) && ((this.volumen -= 1) >=0)) {
			this.volumen -= 1
		}
	}
}
