import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Classe qui represente le menu bas et qui contient
 * les boutons c'est un JPanel
 * @author Groupe 2
 * @version 1
 */
public class MenuBas extends Menu {

	/**
	 *Sert a la serialisation
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructeur du JPanel menu bas
	 * @param fond couleur du background
	 */
	public MenuBas(Color fond) {
		super(fond);
		this.generateBoutton();
	}
	
	/**
	 * Methode qui contient et permet de generer les
	 * boutons du menu bas
	 */
	private void generateBoutton() {
		ImageIcon undo_img = new ImageIcon("src/images/undo2.png", "poubelle");
		ImageIcon redo_img = new ImageIcon("src/images/redo2.png", "poubelle");
		ImageIcon sup_img = new ImageIcon("src/images/poubelle2.png", "poubelle");
		
		JButton undo = new JButton(undo_img);
		JButton redo = new JButton(redo_img);
		JButton suprimer = new JButton(sup_img);
		JButton colorier = new JButton("Colorier");
		
		undo.setToolTipText("revenir en arriere");
		suprimer.setToolTipText("suprimer un objet");
		colorier.setToolTipText("colorier un objet");
		colorier.setToolTipText("aller en avant ");
		
		this.ajouterBouttonM(colorier);
		this.ajouterBouttonM(undo);
		this.ajouterBouttonM(redo);
		this.ajouterBouttonM(suprimer);
	}

}
