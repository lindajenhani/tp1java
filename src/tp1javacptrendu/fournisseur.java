package tp1javacptrendu;
import java.util.List;
import java.util.ArrayList;


public class fournisseur <T>{

	private String nom;
    private int id;
    private List<T> produits;
    
    
    public fournisseur(String nom, int id) {
        this.nom = nom;
        this.id = id;
        this.produits = new ArrayList<>();
    }
    
    public void ajouterProduit(T produit) {
        produits.add(produit);
    }

    public List<T> getProduitsFournis() {
        return produits;
    }

    public String getNomFournisseur() {
        return nom;
    }

    public int getIdFournisseur() {
        return id;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nom = nom;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.id = id;
    }
    



  
    public static class Produit<T> {
        private String nom;
        private T reference;
        private double prix;

        public Produit(String nom, T reference, double prix) {
            this.nom = nom;
            this.reference = reference;
            this.prix = prix;
        }

        public String getNom() {
            return nom;
        }

        public T getReference() {
            return reference;
        }

        public double getPrix() {
            return prix;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setReference(T reference) {
            this.reference = reference;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }
        
    }
    
    public void afficherListeProduits() {
        System.out.println("Produits fournis par " + nom + " (ID: " + id + "):");
        for (T produit : produits) {
            if (produit instanceof Produit) {
                Produit<?> p = (Produit<?>) produit;
                System.out.println("Nom: " + p.getNom() + ", Référence: " + p.getReference() + ", Prix: " + p.getPrix());
            }
        }
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  fournisseur<fournisseur.Produit<String>> fournisseur1 = new fournisseur<>("Fournisseur A", 1);
	        fournisseur.Produit<String> produit1 = new fournisseur.Produit<>("Produit 1", "REF123", 19.99);
	        fournisseur.Produit<String> produit2 = new fournisseur.Produit<>("Produit 2", "REF456", 29.99);

	        fournisseur1.ajouterProduit(produit1);
	        fournisseur1.ajouterProduit(produit2);
	        fournisseur1.afficherListeProduits();
	        
	        fournisseur<fournisseur.Produit<Integer>> fournisseur2 = new fournisseur<>("Fournisseur A", 1);
	        fournisseur.Produit<Integer> produitA = new fournisseur.Produit<>("Produit 1", 1233, 19.99);
	        fournisseur.Produit<Integer> produitB = new fournisseur.Produit<>("Produit 2", 4567, 29.99);

	        fournisseur2.ajouterProduit(produitA);
	        fournisseur2.ajouterProduit(produitB);
	        fournisseur2.afficherListeProduits();
	  }
    
}

