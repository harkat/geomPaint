import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;

/**
 * Classe qui represente le menu Gauche et qui contient
 * les boutons c'est un JPanel
 * @author Groupe 2
 * @version 1
 */
public class MenuGauche extends Menu {

	/**
	 *Sert a la serialisation
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur du JPanel menu Gauche
	 * @param fond couleur du background
	 */
	public MenuGauche(Color fond) {
		super(fond);

		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

		this.generateBoutton();
	}

	/**
	 * Methode qui contient et permet de generer les
	 * boutons du menu Gauche
	 */
	private void generateBoutton() {
		
		this.ajouterBouttonM(new JButton("Couleur"));
		int i = 1;
		for (String chemin : this.getListicone1()){
			this.ajouterBouttonM(new JButton());
			((AbstractButton) this.getBouttonM(i)).setIcon(new ImageIcon(getClass().getResource(chemin)));
			i++;
		}
		this.ajouterBouttonM(this.generate_mg_jsli());
		
		for(Component bouton : this.getListe_b()){
			if (!(bouton instanceof JSlider)){
				((AbstractButton) bouton).setAlignmentX(Component.CENTER_ALIGNMENT);
				((AbstractButton) bouton).setFocusPainted(false);
			}
		}
		this.getBouttonM(0).setMinimumSize(new Dimension(104,30));
		this.getBouttonM(0).setMaximumSize(new Dimension(104,30));
		this.getBouttonM(0).setPreferredSize(new Dimension(104,30));
	}

	/**
	 *Methode qui genere un Jslider, creer pour allerger le code 
	 * @return b_type le bouton type
	 */
	private JSlider generate_mg_jsli() {
		JSlider b_type = new JSlider();
		b_type.setMaximum(8);
		b_type.setMinimum(4);
		b_type.setValue(1);
		b_type.setPaintTicks(true);
		b_type.setPaintLabels(true);
		b_type.setMajorTickSpacing(1);
		b_type.setFont(new Font("TimesRoman", Font.BOLD, 12));
		b_type.setMinimumSize(new Dimension(102,40));
		b_type.setMaximumSize(new Dimension(102,40));
		b_type.setPreferredSize(new Dimension(102,40));
		b_type.setAlignmentX(Component.CENTER_ALIGNMENT);
		b_type.setToolTipText("nombre de points pour le polygone");

		return b_type;
	}

	/**
	 *Methode qui retourne le nombre de points du Slider
	 * @return nombre de points selectionner
	 */
	public int get_nb_points_poly(){
		return ((JSlider) this.getBouttonM(7)).getValue();
	}

	/**
	 *Methode pour definir la nouvelle couleur actuelle 
	 * @param new_col
	 */
	public void set_col_actuelle(Color new_col){
		this.getBouttonM(0).setBackground(new_col);
	}

	/**
	 *Methode pour savoir la couleur selectionnee
	 * @return couleur actuelle
	 */
	public Color get_col_actuelle(){
		return this.getBouttonM(0).getBackground();
	}

	/**
	 * Methode qui gere le changement des icones pour l'interface
	 * @param etat 
	 */
	public void changeicons(boolean etat) {
		if (!etat) {
			int i = 1;
			for (String chemin : this.getListicone1()){
				((AbstractButton) this.getBouttonM(i)).setIcon(new ImageIcon(getClass().getResource(chemin)));
				i++;
			}
		}
		else {
			int i = 1;
			for (String chemin : this.getListicone2()){
				((AbstractButton) this.getBouttonM(i)).setIcon(new ImageIcon(getClass().getResource(chemin)));
				i++;
			}
		}
	}

	/**
	 * Methode pour favoriser la lecture claire du code qui
	 * contient les chemins des icones 1 
	 * @return liste des chemin icones
	 */
	public ArrayList<String> getListicone1(){
		ArrayList <String> li1 = new ArrayList<String>();
		li1.add("images/edition.png");
		li1.add("images/trait.png");
		li1.add("images/rectangle.png");
		li1.add("images/triangle.png");
		li1.add("images/cercle.png");
		li1.add("images/quelconque.png");
		
		return li1;
	}

	/**
	 * Methode pour favoriser la lecture claire du code qui
	 * contient les chemins des icones 1 
	 * @return liste des chemin icones
	 */
	public ArrayList<String> getListicone2(){
		ArrayList <String> li2 = new ArrayList<String>();
		li2.add("images/edition2.png");
		li2.add("images/trait2.png");
		li2.add("images/rectangle2.png");
		li2.add("images/triangle2.png");
		li2.add("images/cercle2.png");
		li2.add("images/quelconque2.png");
		
		return li2;
	}
}