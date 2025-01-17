package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import preg2.ArregloPesos;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Pregunta_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pregunta_2 frame = new Pregunta_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pregunta_2() {
		setTitle("Pregunta 2 - Caso Pr�ctico CL2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(121, 11, 89, 23);
		contentPane.add(btnListar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(221, 11, 89, 23);
		contentPane.add(btnReportar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 406);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	
	//  Declaraci�n global

	ArregloPesos ap = new ArregloPesos();
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		/**
		 * Visualiza los valores del arreglo
		 */			
 		txtS.setText("");
 		
 		for (int i=0; i<ap.tama�o(); i++)
 			imprimir("n[" + i + "] :  " + ap.obtener(i));
	
	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		/**
		 * Muestra un reporte del arreglo
         */		
		
		
		imprimir();    	
    	imprimir("Cantidad de pesos :  " + ap.tama�o());    	
    	imprimir("Promedio de los pesos :  " + ap.pesoPromedio());
    	imprimir("Peso mayor:  " + ap.pesoMayor());
    	imprimir("Cantidad de personas mayor al peso promedio:  " + ap.cantMayoresPesoPromedio());
    	imprimir(" Posici�n del primer peso mayor a 70:  " + ap.posPrimerPesoMayorA70());
		

	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}