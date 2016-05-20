import java.awt.Point;

/**
 * Classe qui sert a dessiner les traits
 * @author Groupe 2
 * @version 1
 */
public class UnTrait extends FigureGeom{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnTrait(Point p1, Point p2) {
		super(p1, p2);
	}

	public Point getP1() {
		return new Point((int)getX1(), (int)getY1());
	}
	public Point getP2() {
		return new Point((int)getX2(), (int)getY2());
	}

	public boolean selectionP1(Point p, int tolerance) {
		int distance = distance(getP1(), p);
		if (distance < tolerance) return true;
		else return false;
	}

	public boolean selectionP2(Point p, int tolerance) {
		int distance = distance(getP2(), p);
		if (distance < tolerance) return true;
		else return false;
	}

	public int distance(Point p1, Point p2){
		return (int)(Math.sqrt(((p1.x - p2.x)*(p1.x - p2.x)) + 
				((p1.y - p2.y)*(p1.y - p2.y)))); 
	}
}
