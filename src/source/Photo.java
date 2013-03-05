package source;
/**
 *  Démo AJAX en J2EE, par Eric Boivin
 *  Cette classe est un JavaBean contenant les informations
 *  d'une seule image
 **/
 
    
public class Photo implements java.io.Serializable 
{
    
    private String chemin;
    private String titre;
    
    public String getChemin(){
        return this.chemin;    
    }
    
    public void setChemin(String chemin){
        this.chemin = chemin;    
    }
    
    public String getTitre(){
        return this.titre;    
    }
    
    public void setTitre(String titre){
        this.titre = titre;    
    }

} 
