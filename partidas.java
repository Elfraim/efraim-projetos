package mata_mata;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.Box;
import java.awt.Component;

public class partidas extends JFrame {

	String[] Vtimes=new String[16];
	int []num=new int[16];
	char []tam=new char[16];
	char []tam2=new char[9];
	String[] timeQ=new String[9];
	String timeV;
	String nomet1;
	String nomet2;
	int i = 0;
	
	private JPanel contentPane;
	private JTextField a01;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;

	private JTextField a1;
	private JTextField a2;
	private JTextField b1;
	private JTextField b2;
	private JTextField c1;
	private JTextField c2;
	private JTextField d2;
	private JTextField d1;
	private JTextField e1;
	private JTextField e2;
	private JTextField f1;
	private JTextField f2;
	private JTextField g1;
	private JTextField g2;
	private JTextField h2;
	private JTextField h1;
	private JTextField a1p;
	private JTextField a2p;
	private JTextField b1p;
	private JTextField b2p;
	private JTextField c1p;
	private JTextField c2p;
	private JTextField d1p;
	private JTextField d2p;
	private JTextField pq1;
	private JTextField pq2;
	private JTextField pq3;
	private JTextField pq4;
	private JTextField e1p;
	private JTextField e2p;
	private JTextField f1p;
	private JTextField f2p;
	private JTextField g1p;
	private JTextField ps1;
	private JTextField h1p;
	private JTextField h2p;
	private JTextField qt8;
	private JTextField qt1;
	private JTextField qt2;
	private JTextField qt3;
	private JTextField pq5;
	private JTextField pq6;
	private JTextField pq7;
	private JTextField pq8;
	private JTextField qt4;
	private JTextField qt5;
	private JTextField qt6;
	private JTextField qt7;
	private JTextField s1;
	private JTextField s3;
	private JTextField s2;
	private JTextField g2p;
	private JTextField ps3;
	private JTextField ps4;
	private JTextField ps2;
	private JTextField pf2;
	private JTextField pf1;
	private JTextField pt3;
	private JTextField pt4;
	private JTextField t3;
	private JTextField s4;
	private JTextField fn1;
	private JTextField fn2;
	private JTextField t4;
	private JButton btnJogarSemifinais;
	private JButton btnJogarFinais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					partidas frame = new partidas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public partidas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50,50,950, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Pane =new JPanel();
		Pane.setBounds(0, 0, 934, 430);
		contentPane.add(Pane);
		Pane.setLayout(null);
		
		a1 = new JTextField();
		a1.setBounds(10, 11, 86, 20);
		Pane.add(a1);
		a1.setColumns(10);
		
		a2 = new JTextField();
		a2.setBounds(10, 42, 86, 20);
		Pane.add(a2);
		a2.setColumns(10);
		
		b1 = new JTextField();
		b1.setBounds(10, 97, 86, 20);
		Pane.add(b1);
		b1.setColumns(10);
		
		b2 = new JTextField();
		b2.setBounds(10, 128, 86, 20);
		Pane.add(b2);
		b2.setColumns(10);
		
		c1 = new JTextField();
		c1.setBounds(10, 204, 86, 20);
		Pane.add(c1);
		c1.setColumns(10);
		
		c2 = new JTextField();
		c2.setBounds(10, 235, 86, 20);
		Pane.add(c2);
		c2.setColumns(10);
		
		d2 = new JTextField();
		d2.setColumns(10);
		d2.setBounds(10, 322, 86, 20);
		Pane.add(d2);
		
		d1 = new JTextField();
		d1.setBounds(10, 291, 86, 20);
		Pane.add(d1);
		d1.setColumns(10);
		
		e1 = new JTextField();
		e1.setColumns(10);
		e1.setBounds(838, 11, 86, 20);
		Pane.add(e1);
		
		e2 = new JTextField();
		e2.setColumns(10);
		e2.setBounds(838, 42, 86, 20);
		Pane.add(e2);
		
		f1 = new JTextField();
		f1.setColumns(10);
		f1.setBounds(838, 97, 86, 20);
		Pane.add(f1);
		
		f2 = new JTextField();
		f2.setColumns(10);
		f2.setBounds(838, 128, 86, 20);
		Pane.add(f2);
		
		g1 = new JTextField();
		g1.setColumns(10);
		g1.setBounds(838, 204, 86, 20);
		Pane.add(g1);
		
		g2 = new JTextField();
		g2.setColumns(10);
		g2.setBounds(838, 235, 86, 20);
		Pane.add(g2);
		
		h2 = new JTextField();
		h2.setColumns(10);
		h2.setBounds(838, 322, 86, 20);
		Pane.add(h2);
		
		h1 = new JTextField();
		h1.setColumns(10);
		h1.setBounds(838, 291, 86, 20);
		Pane.add(h1);
		
		a1p = new JTextField();
		a1p.setBounds(106, 11, 30, 20);
		Pane.add(a1p);
		a1p.setColumns(10);
		
		a2p = new JTextField();
		a2p.setColumns(10);
		a2p.setBounds(106, 42, 30, 20);
		Pane.add(a2p);
		
		b1p = new JTextField();
		b1p.setColumns(10);
		b1p.setBounds(106, 97, 30, 20);
		Pane.add(b1p);
		
		b2p = new JTextField();
		b2p.setColumns(10);
		b2p.setBounds(106, 128, 30, 20);
		Pane.add(b2p);
		
		c1p = new JTextField();
		c1p.setColumns(10);
		c1p.setBounds(106, 204, 30, 20);
		Pane.add(c1p);
		
		c2p = new JTextField();
		c2p.setColumns(10);
		c2p.setBounds(106, 235, 30, 20);
		Pane.add(c2p);
		
		d1p = new JTextField();
		d1p.setColumns(10);
		d1p.setBounds(106, 291, 30, 20);
		Pane.add(d1p);
		
		d2p = new JTextField();
		d2p.setColumns(10);
		d2p.setBounds(106, 322, 30, 20);
		Pane.add(d2p);
		
		pq1 = new JTextField();
		pq1.setColumns(10);
		pq1.setBounds(232, 28, 30, 20);
		Pane.add(pq1);
		
		pq2 = new JTextField();
		pq2.setColumns(10);
		pq2.setBounds(232, 113, 30, 20);
		Pane.add(pq2);
		
		pq3 = new JTextField();
		pq3.setColumns(10);
		pq3.setBounds(232, 219, 30, 20);
		Pane.add(pq3);
		
		pq4 = new JTextField();
		pq4.setColumns(10);
		pq4.setBounds(243, 304, 30, 20);
		Pane.add(pq4);
		
		e1p = new JTextField();
		e1p.setColumns(10);
		e1p.setBounds(798, 11, 30, 20);
		Pane.add(e1p);
		
		e2p = new JTextField();
		e2p.setColumns(10);
		e2p.setBounds(798, 42, 30, 20);
		Pane.add(e2p);
		
		f1p = new JTextField();
		f1p.setColumns(10);
		f1p.setBounds(798, 97, 30, 20);
		Pane.add(f1p);
		
		f2p = new JTextField();
		f2p.setColumns(10);
		f2p.setBounds(798, 128, 30, 20);
		Pane.add(f2p);
		
		g1p = new JTextField();
		g1p.setColumns(10);
		g1p.setBounds(798, 204, 30, 20);
		Pane.add(g1p);
		
		ps1 = new JTextField();
		ps1.setColumns(10);
		ps1.setBounds(363, 69, 30, 20);
		Pane.add(ps1);
		
		h1p = new JTextField();
		h1p.setColumns(10);
		h1p.setBounds(798, 291, 30, 20);
		Pane.add(h1p);
		
		h2p = new JTextField();
		h2p.setColumns(10);
		h2p.setBounds(798, 322, 30, 20);
		Pane.add(h2p);
		
		qt8 = new JTextField();
		qt8.setBounds(702, 304, 86, 20);
		Pane.add(qt8);
		qt8.setColumns(10);
		
		qt1 = new JTextField();
		qt1.setColumns(10);
		qt1.setBounds(136, 28, 86, 20);
		Pane.add(qt1);
		
		qt2 = new JTextField();
		qt2.setColumns(10);
		qt2.setBounds(136, 113, 86, 20);
		Pane.add(qt2);
		
		qt3 = new JTextField();
		qt3.setColumns(10);
		qt3.setBounds(136, 219, 86, 20);
		Pane.add(qt3);
		
		pq5 = new JTextField();
		pq5.setColumns(10);
		pq5.setBounds(662, 28, 30, 20);
		Pane.add(pq5);
		
		pq6 = new JTextField();
		pq6.setColumns(10);
		pq6.setBounds(662, 113, 30, 20);
		Pane.add(pq6);
		
		pq7 = new JTextField();
		pq7.setColumns(10);
		pq7.setBounds(662, 219, 30, 20);
		Pane.add(pq7);
		
		pq8 = new JTextField();
		pq8.setColumns(10);
		pq8.setBounds(662, 304, 30, 20);
		Pane.add(pq8);
		
		qt4 = new JTextField();
		qt4.setColumns(10);
		qt4.setBounds(146, 304, 86, 20);
		Pane.add(qt4);
		
		qt5 = new JTextField();
		qt5.setColumns(10);
		qt5.setBounds(702, 42, 86, 20);
		Pane.add(qt5);
		
		qt6 = new JTextField();
		qt6.setColumns(10);
		qt6.setBounds(702, 113, 86, 20);
		Pane.add(qt6);
		
		qt7 = new JTextField();
		qt7.setColumns(10);
		qt7.setBounds(702, 219, 86, 20);
		Pane.add(qt7);
		
		s1 = new JTextField();
		s1.setColumns(10);
		s1.setBounds(267, 69, 86, 20);
		Pane.add(s1);
		
		s3 = new JTextField();
		s3.setColumns(10);
		s3.setBounds(575, 69, 86, 20);
		Pane.add(s3);
		
		s2 = new JTextField();
		s2.setColumns(10);
		s2.setBounds(267, 256, 86, 20);
		Pane.add(s2);
		
		g2p = new JTextField();
		g2p.setColumns(10);
		g2p.setBounds(798, 235, 30, 20);
		Pane.add(g2p);
		
		ps3 = new JTextField();
		ps3.setColumns(10);
		ps3.setBounds(535, 69, 30, 20);
		Pane.add(ps3);
		
		ps4 = new JTextField();
		ps4.setColumns(10);
		ps4.setBounds(535, 256, 30, 20);
		Pane.add(ps4);
		
		ps2 = new JTextField();
		ps2.setColumns(10);
		ps2.setBounds(363, 256, 30, 20);
		Pane.add(ps2);
		
		pf2 = new JTextField();
		pf2.setColumns(10);
		pf2.setBounds(489, 173, 30, 20);
		Pane.add(pf2);
		
		pf1 = new JTextField();
		pf1.setColumns(10);
		pf1.setBounds(489, 142, 30, 20);
		Pane.add(pf1);
		
		pt3 = new JTextField();
		pt3.setColumns(10);
		pt3.setBounds(489, 322, 30, 20);
		Pane.add(pt3);
		
		pt4 = new JTextField();
		pt4.setColumns(10);
		pt4.setBounds(489, 347, 30, 20);
		Pane.add(pt4);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(393, 322, 86, 20);
		Pane.add(t3);
		
		s4 = new JTextField();
		s4.setColumns(10);
		s4.setBounds(575, 256, 86, 20);
		Pane.add(s4);
		
		fn1 = new JTextField();
		fn1.setColumns(10);
		fn1.setBounds(393, 142, 86, 20);
		Pane.add(fn1);
		
		fn2 = new JTextField();
		fn2.setColumns(10);
		fn2.setBounds(393, 173, 86, 20);
		Pane.add(fn2);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(393, 347, 86, 20);
		Pane.add(t4);
		
		JButton btnNewButton_1 = new JButton("Jogar oitavas");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Torneio torneio=new Torneio();
				int t1=0;
				int t2=0;
				int plc1=torneio.t1;
				int plc2=torneio.t2;
				double ale=0;
				int p1=0;
				int p2=0;
				String pn1;
				String pn2;
				a1.setText(Vtimes[0]);
				a2.setText(Vtimes[1]);
				b1.setText(Vtimes[2]);
				b2.setText(Vtimes[3]);
				c1.setText(Vtimes[4]);
				c2.setText(Vtimes[5]);
				d1.setText(Vtimes[6]);
				d2.setText(Vtimes[7]);
				e1.setText(Vtimes[8]);
				e2.setText(Vtimes[9]);
				f1.setText(Vtimes[10]);
				f2.setText(Vtimes[11]);
				g1.setText(Vtimes[12]);
				g2.setText(Vtimes[13]);
				h1.setText(Vtimes[14]);
				h2.setText(Vtimes[15]);
			torneio.Partida(t1, t2, tam[0], tam[1],ale,p1,p2);	
			 plc1=torneio.getT1();
			 plc2=torneio.getT2();
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			  nomet1=a1.getText();
			  nomet2=a2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			a1p.setText(Integer.toString(plc1)+pn1);
			a2p.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam2[0]=tam[0];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam2[0]=tam[1];
					}
			timeQ[0]=timeV;
			
			//tam2[0]=torneio.getQuartas();
			
			torneio.Partida(t1, t2, tam[2], tam[3],ale,p1,p2);	
			 plc1=torneio.getT1();
			 plc2=torneio.getT2();
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			 nomet1=b1.getText();
			  nomet2=b2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			b1p.setText(Integer.toString(plc1)+pn1);
			b2p.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam2[1]=tam[2];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam2[1]=tam[3];
					}
			timeQ[1]=timeV;
		     
			
			//tam2[1]=torneio.getQuartas();
			
			torneio.Partida(t1, t2, tam[4], tam[5],ale,p1,p2);	
			 plc1=torneio.getT1();
			 plc2=torneio.getT2();
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			 nomet1=c1.getText();
			  nomet2=c2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			c1p.setText(Integer.toString(plc1)+pn1);
			c2p.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;	
				tam2[2]=tam[4];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam2[2]=tam[5];
					}
			timeQ[2]=timeV;
			
			
			//tam2[2]=torneio.getQuartas();
			
			torneio.Partida(t1, t2, tam[6], tam[7],ale,p1,p2);	
			 plc1=torneio.t1;
			 plc2=torneio.t2;
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			 nomet1=d1.getText();
			  nomet2=d2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			d1p.setText(Integer.toString(plc1)+pn1);
			d2p.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam2[3]=tam[6];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam2[3]=tam[7];
					}
			timeQ[3]=timeV;
			
			//tam2[3]=torneio.getQuartas();
			
			torneio.Partida(t1, t2, tam[8], tam[9],ale,p1,p2);	
			 plc1=torneio.t1;
			 plc2=torneio.t2;
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			 nomet1=e1.getText();
			  nomet2=e2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			e1p.setText(Integer.toString(plc1)+pn1);
			e2p.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam2[4]=tam[8];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam2[4]=tam[9];
					}
			timeQ[4]=timeV;
		  
			
			// tam2[4]=torneio.getQuartas();
			
			 torneio.Partida(t1, t2, tam[10], tam[11],ale,p1,p2);	
			 plc1=torneio.t1;
			 plc2=torneio.t2;
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			 nomet1=f1.getText();
			  nomet2=f2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			f1p.setText(Integer.toString(plc1)+pn1);
			f2p.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam2[5]=tam[10];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam2[5]=tam[11];
					}
			timeQ[5]=timeV;
		
			
			//tam2[5]=torneio.getQuartas();
			
			torneio.Partida(t1, t2, tam[12], tam[13],ale,p1,p2);	
			 plc1=torneio.t1;
			 plc2=torneio.t2;
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			 nomet1=g1.getText();
			  nomet2=g2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			g1p.setText(Integer.toString(plc1)+pn1);
			g2p.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam2[6]=tam[12];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam2[6]=tam[13];
					}
			timeQ[6]=timeV;
			
			
			//tam2[6]=torneio.getQuartas();
			
			torneio.Partida(t1, t2, tam[14], tam[15],ale,p1,p2);	
			 plc1=torneio.t1;
			 plc2=torneio.t2;
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			 nomet1=h1.getText();
			  nomet2=h2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			h1p.setText(Integer.toString(plc1)+pn1);
			h2p.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam2[7]=tam[14];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam2[7]=tam[14];
					}
			timeQ[7]=timeV;
			//timeQ[8]=torneio.getTimeQ();
			
			//tam2[7]=torneio.getQuartas();
			//for (int j = 0; j < timeQ.length; j++) {			
	          
	          qt1.setText(timeQ[0]);
	          qt2.setText(timeQ[1]);
	          qt3.setText(timeQ[2]);
	          qt4.setText(timeQ[3]);
	          qt5.setText(timeQ[4]);
	          qt6.setText(timeQ[5]);
	          qt7.setText(timeQ[6]);
	          qt8.setText(timeQ[7]);
			//}
		
			
			}
		});
		btnNewButton_1.setBounds(10, 396, 108, 34);
		Pane.add(btnNewButton_1);
		
		JButton btnJogarQuartas = new JButton("Jogar Quartas");
		btnJogarQuartas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Torneio torneio=new Torneio();
				int t1=0;
				int t2=0;
				int plc1=torneio.t1;
				int plc2=torneio.t2;
				double ale=0;
				int p1=0;
				int p2=0;
				String pn1;
				String pn2;
			
			torneio.Partida(t1, t2, tam2[0], tam2[1],ale,p1,p2);	
			 plc1=torneio.getT1();
			 plc2=torneio.getT2();
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			  nomet1=qt1.getText();
			  nomet2=qt2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			pq1.setText(Integer.toString(plc1)+pn1);
			pq2.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam2[0]=tam[0];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam2[0]=tam[1];
					}
			timeQ[0]=timeV;
			
			torneio.Partida(t1, t2, tam2[2], tam2[3],ale,p1,p2);	
			 plc1=torneio.getT1();
			 plc2=torneio.getT2();
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			  nomet1=qt3.getText();
			  nomet2=qt4.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			pq3.setText(Integer.toString(plc1)+pn1);
			pq4.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam[1]=tam2[2];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam[1]=tam2[3];
					}
			timeQ[1]=timeV;
			
			
			torneio.Partida(t1, t2, tam2[4], tam2[5],ale,p1,p2);	
			 plc1=torneio.getT1();
			 plc2=torneio.getT2();
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			  nomet1=qt5.getText();
			  nomet2=qt6.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			pq5.setText(Integer.toString(plc1)+pn1);
			pq6.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam[2]=tam2[4];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam[2]=tam2[5];
					}
			timeQ[2]=timeV;
		
			torneio.Partida(t1, t2, tam2[6], tam2[7],ale,p1,p2);	
			 plc1=torneio.getT1();
			 plc2=torneio.getT2();
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			  nomet1=qt7.getText();
			  nomet2=qt8.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			pq7.setText(Integer.toString(plc1)+pn1);
			pq8.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
				tam[3]=tam2[6];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
						tam[3]=tam2[7];
					}
			timeQ[3]=timeV;
			
			  s1.setText(timeQ[0]);
	          s2.setText(timeQ[1]);
	          s3.setText(timeQ[2]);
	          s4.setText(timeQ[3]);
			
		}
		});
		btnJogarQuartas.setBounds(159, 396, 108, 34);
		Pane.add(btnJogarQuartas);
		
		btnJogarSemifinais = new JButton("Jogar Semi-finais");
		btnJogarSemifinais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Torneio torneio=new Torneio();
				int t1=0;
				int t2=0;
				int plc1=torneio.t1;
				int plc2=torneio.t2;
				double ale=0;
				int p1=0;
				int p2=0;
				String pn1;
				String pn2;
				torneio.Partida(t1, t2, tam[0], tam[1],ale,p1,p2);	
				 plc1=torneio.getT1();
				 plc2=torneio.getT2();
				 p1=torneio.getP1();
				 p2=torneio.getP2();
				  nomet1=s1.getText();
				  nomet2=s2.getText();
				 pn1=torneio.getPen1();
				 pn2=torneio.getPen2();
				ps1.setText(Integer.toString(plc1)+pn1);
				ps2.setText(Integer.toString(plc2)+pn2);
				if (plc2<plc1 || p2<p1) {
					timeV=nomet1;
					tam2[0]=tam[0];
					timeQ[2]=nomet2;
					
						} 
				if (plc1<plc2 || p1<p2) {
							timeV=nomet2;
							tam2[0]=tam[1];
							timeQ[2]=nomet1;
						}
				timeQ[0]=timeV;
				
				//tam2[0]=torneio.getQuartas();
				
				torneio.Partida(t1, t2, tam[2], tam[3],ale,p1,p2);	
				 plc1=torneio.getT1();
				 plc2=torneio.getT2();
				 p1=torneio.getP1();
				 p2=torneio.getP2();
				 nomet1=s3.getText();
				  nomet2=s4.getText();
				 pn1=torneio.getPen1();
				 pn2=torneio.getPen2();
				ps3.setText(Integer.toString(plc1)+pn1);
				ps4.setText(Integer.toString(plc2)+pn2);
				if (plc2<plc1 || p2<p1) {
					timeV=nomet1;
					tam2[1]=tam[2];
					timeQ[3]=nomet2;
						} 
				if (plc1<plc2 || p1<p2) {
							timeV=nomet2;
							tam2[1]=tam[3];
							timeQ[3]=nomet1;
						}
				timeQ[1]=timeV;	
				
				  fn1.setText(timeQ[0]);
		          fn2.setText(timeQ[1]);
		          t3.setText(timeQ[2]);
		          t4.setText(timeQ[3]);
				
			}
		});
		btnJogarSemifinais.setBounds(285, 396, 108, 34);
		Pane.add(btnJogarSemifinais);
		
		btnJogarFinais = new JButton("Jogar Finais");
		btnJogarFinais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Torneio torneio=new Torneio();
				int t1=0;
				int t2=0;
				int plc1=torneio.t1;
				int plc2=torneio.t2;
				double ale=0;
				int p1=0;
				int p2=0;
				String pn1;
				String pn2;
			
			torneio.Partida(t1, t2, tam2[0], tam2[1],ale,p1,p2);	
			 plc1=torneio.getT1();
			 plc2=torneio.getT2();
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			  nomet1=fn1.getText();
			  nomet2=fn2.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
			pf1.setText(Integer.toString(plc1)+pn1);
			pf2.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
//				tam2[0]=tam[0];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
//						tam2[0]=tam[1];
					}
//			timeQ[0]=timeV;
			
			torneio.Partida(t1, t2, tam2[2], tam2[3],ale,p1,p2);	
			 plc1=torneio.getT1();
			 plc2=torneio.getT2();
			 p1=torneio.getP1();
			 p2=torneio.getP2();
			  nomet1=t3.getText();
			  nomet2=t4.getText();
			 pn1=torneio.getPen1();
			 pn2=torneio.getPen2();
	        pt3.setText(Integer.toString(plc1)+pn1);
			pt4.setText(Integer.toString(plc2)+pn2);
			if (plc2<plc1 || p2<p1) {
				timeV=nomet1;
//				tam[1]=tam2[2];
					} 
			if (plc1<plc2 || p1<p2) {
						timeV=nomet2;
//						tam[1]=tam2[3];
					}
//			timeQ[1]=timeV;	
			}
		});
		btnJogarFinais.setBounds(411, 396, 108, 34);
		Pane.add(btnJogarFinais);
		
		
		
		a01 = new JTextField();
		a01.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		
		JLabel trc1 = new JLabel("New label");
		
		JLabel trc2 = new JLabel("New label");
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		
		
								

		
		
		JButton btnNewButton = new JButton("Sortear partidas");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				int tot=0;	
				while ( i < Vtimes.length) {
					int sort;
					double ale=Math.random();
					
					sort=(int)(1+ale*(5-1));
					int nsort=sort+tot;
				     tot=tot+sort;
					
				     if(nsort==1) {
				    	 Vtimes[i]="Liverpool"; 
				    	 tam[i]='g';
				    	 }
					  if(nsort==2){ 
						  Vtimes[i]="Bayern";
							  tam[i]='g';
							  }
					   if(nsort==3) {  
						  Vtimes[i]="Barcelona";
						  tam[i]='g'; }
					  if(nsort==4){ 
						  Vtimes[i]="Manc City";
						  tam[i]='g';}
					   if(nsort==5){ 
						  Vtimes[i]="flamengo";
						  tam[i]='g';}
					  if(nsort==6){ 
						  Vtimes[i]="Psg";
						  tam[i]='g';}
					  if(nsort==7) {
						  Vtimes[i]="at.Madrid";
						  tam[i]='g';}
					  if(nsort==8) {
						  Vtimes[i]="Juventus";
						  tam[i]='g';
						  }
					  if(nsort==9){
						  Vtimes[i]="Leipzig";
						  tam[i]='g';
						  }
					  if(nsort==10){
						  Vtimes[i]="R.MADRID";
						  tam[i]='g';
						  }
							
					  if(nsort==11){
						  Vtimes[i]="Chelsea";
						  tam[i]='g';
						  }
					  if(nsort==12){ 
						  Vtimes[i]="Boca";
						  tam[i]='g';
						  }
					  if(nsort==13){ 
						  Vtimes[i]="Arsenal";
						  tam[i]='g';
						  }
					  if(nsort==14){
						  Vtimes[i]="River ";
						  tam[i]='g'; 
						  }
					  if(nsort==15){ 
						  Vtimes[i]="Palmeiras";
						  tam[i]='g';
						  }
					  if(nsort==16){
						  Vtimes[i]="Manc Untd";
						  tam[i]='g';
						  }
					  if(nsort==17){ 
						  Vtimes[i]="Inter mil.";
						  tam[i]='g';
						  }
					  if(nsort==18){ 
						  Vtimes[i]="Totenham";
						  tam[i]='g';
						  }
					  if(nsort==19){
						  Vtimes[i]="Bayern Lev";
						  tam[i]='m';
								  }
					  if(nsort==20){
						  Vtimes[i]="Valencia";
						  tam[i]='m';
						  }
							
					  if(nsort==21){
						  Vtimes[i]="Roma";
						  tam[i]='m';
						  }
					  if(nsort==22){ 
						  Vtimes[i]="Internacional";
						  tam[i]='m';
						  }
					  if(nsort==23){ 
						  Vtimes[i]="Monterey";
						  tam[i]='m';
						  }
					  if(nsort==24){
						  Vtimes[i]="Napoli";
						  tam[i]='m'; 
						  }
					  if(nsort==25){ 
						  Vtimes[i]="Porto";
						  tam[i]='m';
						  }
					  if(nsort==26){
						  Vtimes[i]="Benfica";
						  tam[i]='m';
						  }
					  if(nsort==27){ 
						  Vtimes[i]="Sevilla";
						  tam[i]='m';
						  }
					  if(nsort==28){ 
						  Vtimes[i]="Grêmio";
						  tam[i]='m';
						  }
					  if(nsort==29){
						  Vtimes[i]="Borus. dt";
						  tam[i]='m';
								  }
					  if(nsort==30){
						  Vtimes[i]="Ajax";
						  tam[i]='m';
						  }
							
					  if(nsort==31){
						  Vtimes[i]="Atalanta";
						  tam[i]='m';
						  }
					  if(nsort==32){ 
						  Vtimes[i]="Lazio";
						  tam[i]='m';
						  }
					  if(nsort==33){ 
						  Vtimes[i]="Olimpiacos";
						  tam[i]='m';
						  }
					  if(nsort==34){
						  Vtimes[i]="Getafe";
						  tam[i]='p'; 
						  }
					  if(nsort==35){ 
						  Vtimes[i]="Real Soc";
						  tam[i]='p';
						  }
					  if(nsort==36){
						  Vtimes[i]="al Narssr";
						  tam[i]='p';
						  }
					  if(nsort==37){ 
						  Vtimes[i]="at. Min";
						  tam[i]='p';
						  }
					  if(nsort==38){ 
						  Vtimes[i]="America";
						  tam[i]='p';
						  }
					  if(nsort==39){
						  Vtimes[i]="Wolverhpt";
						  tam[i]='p';
								  }
					  if(nsort==40){
						  Vtimes[i]="Santos";
						  tam[i]='p';
						  }
							
					  if(nsort==41){
						  Vtimes[i]="Guangzhou";
						  tam[i]='p';
						  }
					  if(nsort==42){ 
						  Vtimes[i]="At. Paran";
						  tam[i]='p';
						  }
					  if(nsort==43){ 
						  Vtimes[i]="Frankfurt";
						  tam[i]='p';
						  }
					  if(nsort==44){
						  Vtimes[i]="Al hilal";
						  tam[i]='p'; 
						  }
					  if(nsort==45){ 
						  Vtimes[i]="Brugge";
						  tam[i]='p';
					  }if(nsort==46){ 
						  Vtimes[i]="Zenit";
						  tam[i]='p';
						  }
					  if(nsort==47){
						  Vtimes[i]="Shaktar";
						  tam[i]='p'; 
						  }
					  if(nsort==48){ 
						  Vtimes[i]="Lyon";
						  tam[i]='p';
					  }
					  num[i] =nsort;
					  
			       i++;
			}
			
			for (int j = 0; j < Vtimes.length; j++) {
				
		        a1.setText(Vtimes[0]);
				a2.setText(Vtimes[1]);
				b1.setText(Vtimes[2]);
				b2.setText(Vtimes[3]);
				c1.setText(Vtimes[4]);
				c2.setText(Vtimes[5]);
				d1.setText(Vtimes[6]);
				d2.setText(Vtimes[7]);
				e1.setText(Vtimes[8]);
				e2.setText(Vtimes[9]);
				f1.setText(Vtimes[10]);
				f2.setText(Vtimes[11]);
				g1.setText(Vtimes[12]);
				g2.setText(Vtimes[13]);
				h1.setText(Vtimes[14]);
				h2.setText(Vtimes[15]);
			}
			
			}
		});
		btnNewButton.setBounds(10, 441, 111, 23);
		contentPane.add(btnNewButton);
		
		JLabel Oitavas = new JLabel("Oitavas");
		Oitavas.setBounds(40, 64, 46, 14);
		contentPane.add(Oitavas);
	}
}
