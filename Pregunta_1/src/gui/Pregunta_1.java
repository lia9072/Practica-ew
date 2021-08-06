package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import preg1.Consumo;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Pregunta_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pregunta_1 frame = new Pregunta_1();
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
	public Pregunta_1() {
		setTitle("Pregunta 1 - Caso Práctico CL2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(170, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 414, 510);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	/**
 		INSTITUTO DE EDUCACIÓN SUPERIOR PRIVADO CIBERTEC	
		DIRECCIÓN ACADÉMICA 
		CARRERAS PROFESIONALES
	
 		CURSO		:	Algoritmos y Estructura de Datos
		SEMESTRE	:	2021 - I
		CICLO		:	Segundo
		DURACIÓN	:	100 minutos

		ALUMNO (A)	:	
	
		------------------------------------------------
		      C A S O    P R Á C T I C O    C L 2
		------------------------------------------------
	 */	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Consumo c = new Consumo(10, "este compra fue muy exitosa", 245);
		lista(c);
		
		imprimir("------------------------------------");
		imprimir("cantidad de consumo :  " + Consumo.setcantO());
		imprimir(" la suma de de pagos : " + Consumo.setaculador());	
		imprimir("------------------------------------");
		imprimir("");
		
	}
	// metod listado 
	void lista(Consumo x) {		
		imprimir(" " + x);
		imprimir(" Boleta : " + x.getboleta());
		imprimir(" Detalle : " + x.getdetalle());
		imprimir(" Pago : " + x.getpago());	
		imprimir("");
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}