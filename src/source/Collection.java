package source;
/**
 *  Démo AJAX en J2EE, par Eric Boivin
 *  Cette classe est le conteneur des objets Photo. C'est elle qui
 *  connaît la logique pour populer les objets.
 **/


import java.util.ArrayList;

public class Collection 
{ 
    private ArrayList<Photo> maCollection = new ArrayList<Photo>();
    
    public Collection(){
        Photo photo1 = new Photo();
        Photo photo2 = new Photo();
        Photo photo3 = new Photo();
        Photo photo4 = new Photo();
        Photo photo5 = new Photo();
        
        photo1.setChemin("fallout1.jpg");
        photo2.setChemin("fallout2.jpg");
        photo3.setChemin("fallout3.jpg");
        photo4.setChemin("fallout4.jpg");
        photo5.setChemin("fallout5.jpg");
        
        photo1.setTitre("Capitole");
        photo2.setTitre("Soldats");
        photo3.setTitre("Porte-avions");
        photo4.setTitre("Washington");
        photo5.setTitre("Désert");
        
        maCollection.add(photo1);
        maCollection.add(photo2);
        maCollection.add(photo3);
        maCollection.add(photo4);
        maCollection.add(photo5);
    }
    
    //Pour obtenir la liste de toutes les images
    public String[] getImages(){
        String[] images = new String[maCollection.size()];
        for (int i=0;i<maCollection.size();i++){
            images[i] = ((Photo)maCollection.get(i)).getTitre();
        }
        return images;
    }
    
    //Pour obtenir un seul Bean Photo
     public Photo getPhoto(int id){
        return (Photo)maCollection.get(id);
    }
} 
