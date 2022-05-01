import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GeometryFunctionsGUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8778934274716408775L;
	private JTextField radius;
	private JTextField width;
	private JTextField height;
	private JTextField triangleHeight;
	private JTextField parallelogramHeight;
	private JTextField triangleBase;
	private JTextField parallelogramBase;
	private JTextField firstTrapezoidBase;
	private JTextField secondTrapezoidBase;
	private JTextField trapezoidHeight;
	private JTextField firstEllipseRadius;
	private JTextField secondEllipseRadius;
	private JTextField firstRhombusDiagonal;
	private JTextField secondRhombusDiagonal;
	private JPanel mainGeomPanel;
	private JPanel circlePanel;
	private JPanel radiusPanel;
	private JPanel rectangleAndSquarePanel;
	private JPanel widthPanel;
	private JPanel heightPanel;
	private JPanel trianglePanel;
	private JPanel triangleBasePanel;
	private JPanel triangleHeightPanel;
	private JPanel parallelogramPanel;
	private JPanel parallelogramBasePanel;
	private JPanel parallelogramHeightPanel;
	private JPanel trapezoidPanel;
	private JPanel firstTrapezoidBasePanel;
	private JPanel secondTrapezoidBasePanel;
	private JPanel trapezoidHeightPanel;
	private JPanel rhombusPanel;
	private JPanel firstRhombusDiagonalPanel;
	private JPanel secondRhombusDiagonalPanel;
	private JPanel ellipsePanel;
	private JPanel firstEllipseRadiusPanel;
	private JPanel secondEllipseRadiusPanel;
	private JButton areaOfCircle;
	private JButton areaOfRectangleAndSquare;
	private JButton areaOfTriangle;
	private JButton areaOfParallelogram;
	private JButton areaOfTrapezoid;
	private JButton areaOfRhombus;
	private JButton areaOfEllipse;
	private JLabel geomSolution;
	
	public GeometryFunctionsGUI() {
		setTitle("Geometry Operations Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setComponents();
		pack();
	}
	
	public void setComponents() {
		mainGeomPanel = new JPanel(new GridLayout(8, 4));
		radiusPanel = new JPanel();
		radius = new JTextField(5);
		radiusPanel.add(new JLabel("Enter the radius of a circle: "));
		radiusPanel.add(radius);
		circlePanel = new JPanel();
		circlePanel.add(radiusPanel);
		areaOfCircle = new JButton("Area of a Circle");
		areaOfCircle.addActionListener(this);
		circlePanel.add(areaOfCircle);
		
		widthPanel = new JPanel();
		width = new JTextField(5);
		widthPanel.add(new JLabel("Enter the width of a rectangle or square: "));
		widthPanel.add(width);
		heightPanel = new JPanel();
		height = new JTextField(5);
		heightPanel.add(new JLabel("Enter the height of a rectangle or square: "));
		heightPanel.add(height);
		rectangleAndSquarePanel = new JPanel();
		rectangleAndSquarePanel.add(widthPanel);
		rectangleAndSquarePanel.add(heightPanel);
		areaOfRectangleAndSquare = new JButton("Area of a Rectangle or Square");
		areaOfRectangleAndSquare.addActionListener(this);
		rectangleAndSquarePanel.add(areaOfRectangleAndSquare);
		
		triangleBasePanel = new JPanel();
		triangleBase = new JTextField(5);
		triangleBasePanel.add(new JLabel("Enter the base of a triangle: "));
		triangleBasePanel.add(triangleBase);
		triangleHeightPanel = new JPanel();
		triangleHeight = new JTextField(5);
		triangleHeightPanel.add(new JLabel("Enter the height of a triangle: "));
		triangleHeightPanel.add(triangleHeight);
		trianglePanel = new JPanel();
		trianglePanel.add(triangleBasePanel);
		trianglePanel.add(triangleHeightPanel);
		areaOfTriangle = new JButton("Area of a Triangle");
		areaOfTriangle.addActionListener(this);
		trianglePanel.add(areaOfTriangle);
		
		parallelogramBasePanel = new JPanel();
		parallelogramBase = new JTextField(5);
		parallelogramBasePanel.add(new JLabel("Enter the base of a parallelogram: "));
		parallelogramBasePanel.add(parallelogramBase);
		parallelogramHeightPanel = new JPanel();
		parallelogramHeight = new JTextField(5);
		parallelogramHeightPanel.add(new JLabel("Enter the height of a parallelogram: "));
		parallelogramHeightPanel.add(parallelogramHeight);
		parallelogramPanel = new JPanel();
		parallelogramPanel.add(parallelogramBasePanel);
		parallelogramPanel.add(parallelogramHeightPanel);
		areaOfParallelogram = new JButton("Area of a Parallelogram");
		areaOfParallelogram.addActionListener(this);
		parallelogramPanel.add(areaOfParallelogram);
		
		firstTrapezoidBasePanel = new JPanel();
		firstTrapezoidBase = new JTextField(5);
		firstTrapezoidBasePanel.add(new JLabel("Enter the first base of a trapezoid: "));
		firstTrapezoidBasePanel.add(firstTrapezoidBase);
		secondTrapezoidBasePanel = new JPanel();
		secondTrapezoidBase = new JTextField(5);
		secondTrapezoidBasePanel.add(new JLabel("Enter the second base of a trapezoid: "));
		secondTrapezoidBasePanel.add(secondTrapezoidBase);
		trapezoidHeightPanel = new JPanel();
		trapezoidHeight = new JTextField(5);
		trapezoidHeightPanel.add(new JLabel("Enter the height of a trapezoid: "));
		trapezoidHeightPanel.add(trapezoidHeight);
		trapezoidPanel = new JPanel();
		trapezoidPanel.add(firstTrapezoidBasePanel);
		trapezoidPanel.add(secondTrapezoidBasePanel);
		trapezoidPanel.add(trapezoidHeightPanel);
		areaOfTrapezoid = new JButton("Area of a Trapezoid");
		areaOfTrapezoid.addActionListener(this);
		trapezoidPanel.add(areaOfTrapezoid);
		
		firstEllipseRadiusPanel = new JPanel();
		firstEllipseRadius = new JTextField(5);
		firstEllipseRadiusPanel.add(new JLabel("Enter the first radius of an ellipse: "));
		firstEllipseRadiusPanel.add(firstEllipseRadius);
		secondEllipseRadiusPanel = new JPanel();
		secondEllipseRadius = new JTextField(5);
		secondEllipseRadiusPanel.add(new JLabel("Enter the second radius of an ellipse: "));
		secondEllipseRadiusPanel.add(secondEllipseRadius);
		ellipsePanel = new JPanel();
		ellipsePanel.add(firstEllipseRadiusPanel);
		ellipsePanel.add(secondEllipseRadiusPanel);
		areaOfEllipse = new JButton("Area of an Ellipse");
		areaOfEllipse.addActionListener(this);
		ellipsePanel.add(areaOfEllipse);
		
		firstRhombusDiagonalPanel = new JPanel();
		firstRhombusDiagonal = new JTextField(5);
		firstRhombusDiagonalPanel.add(new JLabel("Enter the first diagonal of a rhombus: "));
		firstRhombusDiagonalPanel.add(firstRhombusDiagonal);
		secondRhombusDiagonalPanel = new JPanel();
		secondRhombusDiagonal = new JTextField(5);
		secondRhombusDiagonalPanel.add(new JLabel("Enter the second diagonal of a rhombus: "));
		secondRhombusDiagonalPanel.add(secondRhombusDiagonal);
		rhombusPanel = new JPanel();
		rhombusPanel.add(firstRhombusDiagonalPanel);
		rhombusPanel.add(secondRhombusDiagonalPanel);
		areaOfRhombus = new JButton("Area of a Rhombus");
		areaOfRhombus.addActionListener(this);
		rhombusPanel.add(areaOfRhombus);
		
		mainGeomPanel.add(circlePanel);
		mainGeomPanel.add(rectangleAndSquarePanel);
		mainGeomPanel.add(trianglePanel);
		mainGeomPanel.add(parallelogramPanel);
		mainGeomPanel.add(trapezoidPanel);
		mainGeomPanel.add(ellipsePanel);
		mainGeomPanel.add(rhombusPanel);
		geomSolution = new JLabel("");
		mainGeomPanel.add(geomSolution);
		radius.setText("0");
		width.setText("0");
		height.setText("0");
		triangleBase.setText("0");
		triangleHeight.setText("0");
		parallelogramBase.setText("0");
		parallelogramHeight.setText("0");
		firstTrapezoidBase.setText("0");
		secondTrapezoidBase.setText("0");
		trapezoidHeight.setText("0");
		firstEllipseRadius.setText("0");
		secondEllipseRadius.setText("0");
		firstRhombusDiagonal.setText("0");
		secondRhombusDiagonal.setText("0");
		this.add(mainGeomPanel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double finalRadius = Integer.parseInt(radius.getText());
		double finalWidth = Integer.parseInt(width.getText());
		double finalHeight = Integer.parseInt(height.getText());
		double finalTriangleBase = Integer.parseInt(triangleBase.getText());
		double finalTriangleHeight = Integer.parseInt(triangleHeight.getText());
		double finalParallelogramBase = Integer.parseInt(parallelogramBase.getText());
		double finalParallelogramHeight = Integer.parseInt(parallelogramHeight.getText());
		double finalFirstTrapezoidBase = Integer.parseInt(firstTrapezoidBase.getText());
		double finalSecondTrapezoidBase = Integer.parseInt(secondTrapezoidBase.getText());
		double finalTrapezoidHeight = Integer.parseInt(trapezoidHeight.getText());
		double finalFirstEllipseRadius = Integer.parseInt(firstEllipseRadius.getText());
		double finalSecondEllipseRadius = Integer.parseInt(secondEllipseRadius.getText());
		double finalFirstRhombusDiagonal = Integer.parseInt(firstRhombusDiagonal.getText());
		double finalSecondRhombusDiagonal = Integer.parseInt(secondRhombusDiagonal.getText());
		double finalArea = 0.0;
		String answer = " ";
		
		if (e.getSource() == areaOfCircle) {
			finalArea = Math.PI*finalRadius*finalRadius;
			answer = "Area of the Circle is: " + finalArea;
		}
		else if (e.getSource() == areaOfRectangleAndSquare) {
			finalArea = finalWidth*finalHeight;
			answer = "Area of the Rectangle or the Square is: " + finalArea;
		}
		else if (e.getSource() == areaOfTriangle) {
			finalArea = (finalTriangleBase*finalTriangleHeight) / 2;
			answer = "Area of the Triangle is: " + finalArea;
		}
		else if (e.getSource() == areaOfParallelogram) {
			finalArea = finalParallelogramBase*finalParallelogramHeight;
			answer = "Area of the Parallelogram is: " + finalArea;
		}
		else if (e.getSource() == areaOfTrapezoid) {
			finalArea = ((finalFirstTrapezoidBase+finalSecondTrapezoidBase) / 2) * finalTrapezoidHeight;
			answer = "Area of the Trapezoid is: " + finalArea;
		}
		else if (e.getSource() == areaOfRhombus) {
			finalArea = (finalFirstRhombusDiagonal*finalSecondRhombusDiagonal) / 2;
			answer = "Area of the Rhombus is: " + finalArea;
		}
		else if (e.getSource() == areaOfEllipse) {
			finalArea = Math.PI*finalFirstEllipseRadius*finalSecondEllipseRadius;
			answer = "Area of the Ellipse is: " + finalArea;
		}
		geomSolution.setText(answer);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new GeometryFunctionsGUI().setVisible(true);
			}
		});
	}
}
