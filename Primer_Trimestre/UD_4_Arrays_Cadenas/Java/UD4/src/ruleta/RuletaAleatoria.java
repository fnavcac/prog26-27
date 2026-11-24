
package ruleta;

/**
 *
 * @author 03_1DAW
 */

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RuletaAleatoria {

	public static void main(String[] args) {
		
		MarcoVentana marcoAleatorio = new MarcoVentana();
		
		marcoAleatorio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marcoAleatorio.setVisible(true);
		
		marcoAleatorio.setResizable(false);
		
	}
	
}

class MarcoVentana extends JFrame {
	
	public MarcoVentana() {
		
		setTitle("Parejas aleatorio");
		
		setBounds(500, 300, 450, 300);
		
		PanelVentana panelAleatorio = new PanelVentana();
		
		add(panelAleatorio);
		
	}
	
}

class PanelVentana extends JPanel {
	
	private Random numeroAleatorio = new Random();
	
	//private JLabel alumno;
	
	private JLabel alumno1 = new JLabel("Aya");
	private JLabel alumno2 = new JLabel("Daniel");
	private JLabel alumno3 = new JLabel("Carlos");
	private JLabel alumno4 = new JLabel("Fran");
	private JLabel alumno5 = new JLabel("Maitane");
	private JLabel alumno6 = new JLabel("Jose Antonio");
	private JLabel alumno7 = new JLabel("Alejandro");
	private JLabel alumno8 = new JLabel("Miguel");
	private JLabel alumno9 = new JLabel("Jose Luis");
	private JLabel alumno10 = new JLabel("Jose Luis Soria");
	private JLabel alumno11 = new JLabel("Hugo");
	
        /*
	private JLabel[] alumnos = {alumno1, alumno2, alumno3, alumno4, alumno5, alumno6,
			alumno7, alumno8, alumno9, alumno10, alumno11};
	*/
        
	private JButton boton;
	
        ArrayList listaAlumnos = new ArrayList();
        
	/*
	private String[] nombresAlumnos = {"Aya", "Daniel", "Carlos", "Fran", "Maitane", 
			"Jose Antonio", "Alejandro", "Miguel", "Jose Luis", "Jose Luis Soria", "Hugo"};
	*/
	
	public PanelVentana() {
                
                listaAlumnos.add(alumno1);
                listaAlumnos.add(alumno2);
                listaAlumnos.add(alumno3);
                listaAlumnos.add(alumno4);
                listaAlumnos.add(alumno5);
                listaAlumnos.add(alumno6);
                listaAlumnos.add(alumno7);
                listaAlumnos.add(alumno8);
                listaAlumnos.add(alumno9);
                listaAlumnos.add(alumno10);
                listaAlumnos.add(alumno11);
            
		setLayout(new GridLayout(4, 3));
		
		/*
		for (int i=0; i<nombresAlumnos.length; i++) {
			
			alumno = new JLabel(nombresAlumnos[i]);
			
			add(alumno);
			
		}
		*/
		
		/*
		alumno1 = new JLabel("Aya");
		alumno2 = new JLabel("Daniel");
		alumno3 = new JLabel("Carlos");
		alumno4 = new JLabel("Fran");
		alumno5 = new JLabel("Maitane");
		alumno6 = new JLabel("Jose Antonio");
		alumno7 = new JLabel("Alejandro");
		alumno8 = new JLabel("Miguel");
		alumno9 = new JLabel("Jose Luis");
		alumno10 = new JLabel("Jose Luis Soria");
		alumno11 = new JLabel("Hugo");
		*/
		
		alumno1.setHorizontalAlignment(JLabel.CENTER);
		alumno2.setHorizontalAlignment(JLabel.CENTER);
		alumno3.setHorizontalAlignment(JLabel.CENTER);
		alumno4.setHorizontalAlignment(JLabel.CENTER);
		alumno5.setHorizontalAlignment(JLabel.CENTER);
		alumno6.setHorizontalAlignment(JLabel.CENTER);
		alumno7.setHorizontalAlignment(JLabel.CENTER);
		alumno8.setHorizontalAlignment(JLabel.CENTER);
		alumno9.setHorizontalAlignment(JLabel.CENTER);
		alumno10.setHorizontalAlignment(JLabel.CENTER);
		alumno11.setHorizontalAlignment(JLabel.CENTER);
		
                for(int i=0; i<listaAlumnos.size(); i++) {
                    
                    JLabel alu = (JLabel) listaAlumnos.get(i);
                    
                    add(alu);
                    
                }
                
                /*
		add(alumno1);
		add(alumno2);
		add(alumno3);
		add(alumno4);
		add(alumno5);
		add(alumno6);
		add(alumno7);
		add(alumno8);
		add(alumno9);
		add(alumno10);
		add(alumno11);
		*/
		
		/*
		alumno.setOpaque(true);
		
		alumno.setBackground(new Color(255, 0, 0));
		*/
		
		
		boton = new JButton("Aleatorio");
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
                                /*
				for (int i=0; i<alumnos.length; i++) {
					
					alumnos[i].setOpaque(true);
					
					alumnos[i].setBackground(new Color(235, 235, 235));
				
				}
				
				int numero = numeroAleatorio.nextInt(alumnos.length);
				
				alumnos[numero].setOpaque(true);
				
				alumnos[numero].setBackground(new Color(255, 0, 0));
                                */
                                
                                for (int i=0; i<listaAlumnos.size(); i++) {
					
					JLabel alu = (JLabel)listaAlumnos.get(i);
                                        
                                        alu.setOpaque(true);
					
					alu.setBackground(new Color(235, 235, 235));
				
				}
				
				int numero = numeroAleatorio.nextInt(listaAlumnos.size());
				
				JLabel alu = (JLabel)listaAlumnos.get(numero);
                                
                                alu.setOpaque(true);
				
				alu.setBackground(new Color(255, 0, 0));

			}
			
		});
		
		add(boton);
		
	}
	
}

