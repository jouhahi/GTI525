package obj;

import java.util.ArrayList;
import java.util.Date;

public class Paiement {

	private Date date;
	private Client client;
	private ArrayList<Billet> listeBillets;
	private double prixTotal;
	private CarteCredit cartecredit;
	private String cw;
	private Adresse adresseLivraison;
	private String noConfirmation;
	private String detailsVente;
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
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * @return the listeBillets
	 */
	public ArrayList<Billet> getListeBillets() {
		return listeBillets;
	}
	/**
	 * @param listeBillets the listeBillets to set
	 */
	public void setListeBillets(ArrayList<Billet> listeBillets) {
		this.listeBillets = listeBillets;
	}
	/**
	 * @return the prixTotal
	 */
	public double getPrixTotal() {
		return prixTotal;
	}
	/**
	 * @param prixTotal the prixTotal to set
	 */
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	/**
	 * @return the cartecredit
	 */
	public CarteCredit getCartecredit() {
		return cartecredit;
	}
	/**
	 * @param cartecredit the cartecredit to set
	 */
	public void setCartecredit(CarteCredit cartecredit) {
		this.cartecredit = cartecredit;
	}
	/**
	 * @return the cw
	 */
	public String getCw() {
		return cw;
	}
	/**
	 * @param cw the cw to set
	 */
	public void setCw(String cw) {
		this.cw = cw;
	}
	/**
	 * @return the adresseLivraison
	 */
	public Adresse getAdresseLivraison() {
		return adresseLivraison;
	}
	/**
	 * @param adresseLivraison the adresseLivraison to set
	 */
	public void setAdresseLivraison(Adresse adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}
	/**
	 * @return the noConfirmation
	 */
	public String getNoConfirmation() {
		return noConfirmation;
	}
	/**
	 * @param noConfirmation the noConfirmation to set
	 */
	public void setNoConfirmation(String noConfirmation) {
		this.noConfirmation = noConfirmation;
	}
	/**
	 * @return the detailsVente
	 */
	public String getDetailsVente() {
		return detailsVente;
	}
	/**
	 * @param detailsVente the detailsVente to set
	 */
	public void setDetailsVente(String detailsVente) {
		this.detailsVente = detailsVente;
	}
	
	
	
}
