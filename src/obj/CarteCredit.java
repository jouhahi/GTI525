package obj;

import java.util.Date;

public class CarteCredit {

	private String no;
	private String nomTitulaire;
	private Date dateExp;
	private int noVerif;
	
	/**
	 * @return the no
	 */
	public String getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(String no) {
		this.no = no;
	}
	/**
	 * @return the nomTitulaire
	 */
	public String getNomTitulaire() {
		return nomTitulaire;
	}
	/**
	 * @param nomTitulaire the nomTitulaire to set
	 */
	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}
	/**
	 * @return the dateExp
	 */
	public Date getDateExp() {
		return dateExp;
	}
	/**
	 * @param dateExp the dateExp to set
	 */
	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}
	/**
	 * @return the noVerif
	 */
	public int getNoVerif() {
		return noVerif;
	}
	/**
	 * @param noVerif the noVerif to set
	 */
	public void setNoVerif(int noVerif) {
		this.noVerif = noVerif;
	}
}
