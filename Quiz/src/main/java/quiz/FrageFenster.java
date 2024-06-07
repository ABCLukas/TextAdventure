
package quiz;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.JobAttributes;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class FrageFenster extends JFrame implements MouseListener{

	
	private JLabel lbl_frage;
	private JLabel lbl_antwort1;
	private JLabel lbl_antwort2;
	private JLabel lbl_antwort3;
	private JLabel lbl_antwort4;
	
	private JPanel mainPanel;
	private QuizLogik logik;
	
	public FrageFenster() {
		
		//logik = new QuizLogik(this);
		
		mainPanel = new JPanel();
		this.setContentPane(mainPanel);
		
		GridBagLayout gbl = new GridBagLayout();
		mainPanel.setLayout(gbl);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(50, 20, 20, 20);
		//gbc.fill = GridBagConstraints.BOTH;
		
		lbl_frage = new JLabel("Frage?");
		lbl_frage.setPreferredSize(new Dimension(300,50));
		lbl_frage.setHorizontalAlignment(JLabel.CENTER);
		gbl.setConstraints(lbl_frage, gbc);
		mainPanel.add(lbl_frage);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(20, 30, 10, 10);
		//gbc.fill = GridBagConstraints.BOTH;
		
		lbl_antwort1 = new JLabel("Antwort 1");
		lbl_antwort1.setPreferredSize(new Dimension(100,50));
		lbl_antwort1.setHorizontalAlignment(JLabel.CENTER);
		lbl_antwort1.addMouseListener(this);
		lbl_antwort1.setBorder(new LineBorder(Color.BLACK));
		gbl.setConstraints(lbl_antwort1, gbc);
		mainPanel.add(lbl_antwort1);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(20, 30, 10, 10);
		//gbc.fill = GridBagConstraints.BOTH;
		
		lbl_antwort2 = new JLabel("Antwort 2");
		lbl_antwort2.setPreferredSize(new Dimension(100,50));
		lbl_antwort2.setHorizontalAlignment(JLabel.CENTER);
		lbl_antwort2.addMouseListener(this);
		lbl_antwort2.setBorder(new LineBorder(Color.BLACK));
		gbl.setConstraints(lbl_antwort2, gbc);
		mainPanel.add(lbl_antwort2);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(20, 30, 10, 10);
		//gbc.fill = GridBagConstraints.BOTH;
		
		lbl_antwort3 = new JLabel("Antwort 3");
		lbl_antwort3.setPreferredSize(new Dimension(100,50));
		lbl_antwort3.setHorizontalAlignment(JLabel.CENTER);
		lbl_antwort3.addMouseListener(this);
		lbl_antwort3.setBorder(new LineBorder(Color.BLACK));
		gbl.setConstraints(lbl_antwort3, gbc);
		mainPanel.add(lbl_antwort3);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(20, 30, 10, 10);
		//gbc.fill = GridBagConstraints.BOTH;
		
		lbl_antwort4 = new JLabel("Antwort 4");
		lbl_antwort4.setPreferredSize(new Dimension(100,50));
		lbl_antwort4.setHorizontalAlignment(JLabel.CENTER);
		lbl_antwort4.addMouseListener(this);
		lbl_antwort4.setBorder(new LineBorder(Color.BLACK));
		gbl.setConstraints(lbl_antwort4, gbc);
		mainPanel.add(lbl_antwort4);
		
		logik.showQuestion();
		
		this.pack();
	}
	
	
	
	
	public void setFrageText(String text) {
		lbl_frage.setText(text);
	}
	public void setAntwort1(String text) {
		lbl_antwort1.setText(text);
	}
	public void setAntwort2(String text) {
		lbl_antwort2.setText(text);
	}
	public void setAntwort3(String text) {
		lbl_antwort3.setText(text);
	}
	public void setAntwort4(String text) {
		lbl_antwort4.setText(text);
	}
	
	public static void main(String[] args) {
		new FrageFenster().setVisible(true);
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		
		int antwort = 0;
		if(e.getSource().equals(lbl_antwort1)) {
			antwort =1;
		}else if(e.getSource().equals(lbl_antwort2)){
			antwort =2;
		}else if(e.getSource().equals(lbl_antwort3)){
			antwort =3;
		}else if(e.getSource().equals(lbl_antwort4)){
			antwort =4;
		}
		
		if(logik.checkAnswer(antwort)) {
			JOptionPane.showMessageDialog(this,"Richtig!!!");
		}else {
			JOptionPane.showMessageDialog(this,"Leider Falsch!!!");
		}
		
		if(logik.hasNextQuestion()) {
			logik.showQuestion();
		}else {
			JOptionPane.showMessageDialog(this,"Sie haben alle Fragen beantwortet");
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
