
public class TabEleves {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private Eleve[] val;
		private int nb;
		private static String nomClasse;
		public TabEleves (String unNomClasse){
			this.val=new Eleve[36];
			this.nb=0;
			this.nomClasse=unNomClasse;
		}
		public String getNomClasse()
		public int getNb()
		public void ajouter(Eleve e)
		public Eleve getEleve(int i)
		public void supprimer(int i)
	}

}
public String resultats (TabEleves SIO1){
	System.out.println("L'élève"+SIO1.getEleve(nb-1).getNom()+"est le meilleur élève de la classe avec"+SIO1.getEleve(nb-1).getNote());
	System.out.println("Lélève"+SIO1.getEleve(0).getNom()+"est l'élève le moins bon de la classe avec"+SIO1.getEleve(0).getNote());
	private int somme;
	For(int i=0; i<nb; i++)
		somme=SIO1.getEleve(i).getNote();
	System.out.println("La moyenne est"+(somme/nb));
}