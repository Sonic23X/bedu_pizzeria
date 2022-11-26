package lealtad;

public class SistemaLealtad {

	private boolean estatusTajeta;
	private int saldoPuntos;
	private boolean estatusCupon;

	public SistemaLealtad() {
		this.estatusTajeta = false;
		this.saldoPuntos = 0;
		this.estatusCupon = false;
	}

	public boolean getEstatusTarjeta() {
		return this.estatusTajeta;
	}

	public void setEstatusTarjeta(boolean estatusTarjeta) {
		this.estatusTajeta = estatusTarjeta;
	}

	public int getSaldoPuntos() {
		return saldoPuntos;
	}

	public void setSaldoPuntos(int saldoPuntos) {
		this.saldoPuntos = saldoPuntos;
	}

	public boolean getEstatusCupon() {
		return estatusCupon;
	}

	public void setEstatusCupon(boolean estatusCupon) {
		this.estatusCupon = estatusCupon;
	}

	public String mostrarProductosExtras() {
		if (this.saldoPuntos >= 50 && this.saldoPuntos < 100) {
			return "Spaghetti";
		} else if (this.saldoPuntos >= 100 && this.saldoPuntos < 150) {
			return "Spaghetti y queso extra";
		} else if (this.saldoPuntos >= 150) {
			return "Pizza, spaghetti y queso extra";
		}

		return "";
	}

	public void usarCupon(String respuesta) {
		if (respuesta.equals("Y")) {
			this.estatusCupon = false;
		} else {
			this.estatusCupon = true;
		}
	}

}
