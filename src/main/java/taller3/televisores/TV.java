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
		numTV++; 
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
		this.volumen = volumen;
	}
	public int getVolumen() {
		return volumen;
	}
	
	// Canal	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getCanal() {
		return canal;
	}
	
	//NumTV
	public static void setNumTV(int numTv) {
		numTV = numTv;
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
		if ((estado) && (canal<120)) {
			canal++;
		}
	}
	public void canalDown() {
		if ((estado) && (canal> 1)) {
			canal--;
		}
	}
	
	//VolumenUp - VolumenDown
	public void volumenUp() {
		if ((estado) && (volumen <7)) {
			volumen++;
		}
	}
	public void volumenDown() {
		if ((estado) && (volumen>0)) {
			volumen--;
		}
	}
}
