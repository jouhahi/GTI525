package obj;

import java.util.ArrayList;

public class Spectacle {

	private String titre;
	private ArrayList<Artiste> listeArtiste;
	private ArrayList<Representation> listeRepresentation;
	
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the listeArtiste
	 */
	public ArrayList<Artiste> getListeArtiste() {
		return listeArtiste;
	}
	/**
	 * @param listeArtiste the listeArtiste to set
	 */
	public void setListeArtiste(ArrayList<Artiste> listeArtiste) {
		this.listeArtiste = listeArtiste;
	}
	/**
	 * @return the listeRepresentation
	 */
	public ArrayList<Representation> getListeRepresentation() {
		return listeRepresentation;
	}
	/**
	 * @param listeRepresentation the listeRepresentation to set
	 */
	public void setListeRepresentation(ArrayList<Representation> listeRepresentation) {
		this.listeRepresentation = listeRepresentation;
	}
	
}
