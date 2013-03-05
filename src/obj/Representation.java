package obj;

import java.util.Date;

public class Representation {

	private String details;
	private Date date;
	private int nbBilletsDisponibles;
	private double tarif;
	private Salle salle;
	
	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the nbBilletsDisponibles
	 */
	public int getNbBilletsDisponibles() {
		return nbBilletsDisponibles;
	}
	/**
	 * @param nbBilletsDisponibles the nbBilletsDisponibles to set
	 */
	public void setNbBilletsDisponibles(int nbBilletsDisponibles) {
		this.nbBilletsDisponibles = nbBilletsDisponibles;
	}
	/**
	 * @return the tarif
	 */
	public double getTarif() {
		return tarif;
	}
	/**
	 * @param tarif the tarif to set
	 */
	public void setTarif(double tarif) {
		this.tarif = tarif;
	}
	/**
	 * @return the salle
	 */
	public Salle getSalle() {
		return salle;
	}
	/**
	 * @param salle the salle to set
	 */
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	
	
}
