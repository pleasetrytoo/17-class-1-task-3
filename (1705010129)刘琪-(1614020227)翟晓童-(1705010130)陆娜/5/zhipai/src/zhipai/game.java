package zhipai;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class game extends JFrame {

	private JPanel contentPane;
	private JLabel pai1;
	private JLabel pai2;
	private JLabel pai3;
	private JLabel pai4;
	private JLabel pai5;
	private JLabel pai6;
	ImageIcon[][] img1=new ImageIcon[5][20];
	private JLabel P;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void Game() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					game frame = new game();
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
	public game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("\u6E38\u620F\u6B21\u6570\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 26));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 26));
		lblNewLabel.setText(Integer.toString(Pub.ci));
		
		ImageIcon img=null;
		
		img=new ImageIcon(this.getClass().getResource("/rear.gif"));
		
			img1[0][0]=new ImageIcon(this.getClass().getResource("/1-1.gif"));
			img1[0][1]=new ImageIcon(this.getClass().getResource("/1-2.gif"));
			img1[0][2]=new ImageIcon(this.getClass().getResource("/1-3.gif"));
			img1[0][3]=new ImageIcon(this.getClass().getResource("/1-4.gif"));
			img1[0][4]=new ImageIcon(this.getClass().getResource("/1-5.gif"));
			img1[0][5]=new ImageIcon(this.getClass().getResource("/1-6.gif"));
			img1[0][6]=new ImageIcon(this.getClass().getResource("/1-7.gif"));
			img1[0][7]=new ImageIcon(this.getClass().getResource("/1-8.gif"));
			img1[0][8]=new ImageIcon(this.getClass().getResource("/1-9.gif"));
			img1[0][9]=new ImageIcon(this.getClass().getResource("/1-10.gif"));
			img1[0][10]=new ImageIcon(this.getClass().getResource("/1-11.gif"));
			img1[0][11]=new ImageIcon(this.getClass().getResource("/1-12.gif"));
			img1[0][12]=new ImageIcon(this.getClass().getResource("/1-13.gif"));
			img1[1][0]=new ImageIcon(this.getClass().getResource("/2-1.gif"));
			img1[1][1]=new ImageIcon(this.getClass().getResource("/2-2.gif"));
			img1[1][2]=new ImageIcon(this.getClass().getResource("/2-3.gif"));
			img1[1][3]=new ImageIcon(this.getClass().getResource("/2-4.gif"));
			img1[1][4]=new ImageIcon(this.getClass().getResource("/2-5.gif"));
			img1[1][5]=new ImageIcon(this.getClass().getResource("/2-6.gif"));
			img1[1][6]=new ImageIcon(this.getClass().getResource("/2-7.gif"));
			img1[1][7]=new ImageIcon(this.getClass().getResource("/2-8.gif"));
			img1[1][8]=new ImageIcon(this.getClass().getResource("/2-9.gif"));
			img1[1][9]=new ImageIcon(this.getClass().getResource("/2-10.gif"));
			img1[1][10]=new ImageIcon(this.getClass().getResource("/2-11.gif"));
			img1[1][11]=new ImageIcon(this.getClass().getResource("/2-12.gif"));
			img1[1][12]=new ImageIcon(this.getClass().getResource("/2-13.gif"));
			img1[2][0]=new ImageIcon(this.getClass().getResource("/3-1.gif"));
			img1[2][1]=new ImageIcon(this.getClass().getResource("/3-2.gif"));
			img1[2][2]=new ImageIcon(this.getClass().getResource("/3-3.gif"));
			img1[2][3]=new ImageIcon(this.getClass().getResource("/3-4.gif"));
			img1[2][4]=new ImageIcon(this.getClass().getResource("/3-5.gif"));
			img1[2][5]=new ImageIcon(this.getClass().getResource("/3-6.gif"));
			img1[2][6]=new ImageIcon(this.getClass().getResource("/3-7.gif"));
			img1[2][7]=new ImageIcon(this.getClass().getResource("/3-8.gif"));
			img1[2][8]=new ImageIcon(this.getClass().getResource("/3-9.gif"));
			img1[2][9]=new ImageIcon(this.getClass().getResource("/3-10.gif"));
			img1[2][10]=new ImageIcon(this.getClass().getResource("/3-11.gif"));
			img1[2][11]=new ImageIcon(this.getClass().getResource("/3-12.gif"));
			img1[2][12]=new ImageIcon(this.getClass().getResource("/3-13.gif"));
			img1[3][0]=new ImageIcon(this.getClass().getResource("/4-1.gif"));
			img1[3][1]=new ImageIcon(this.getClass().getResource("/4-2.gif"));
			img1[3][2]=new ImageIcon(this.getClass().getResource("/4-3.gif"));
			img1[3][3]=new ImageIcon(this.getClass().getResource("/4-4.gif"));
			img1[3][4]=new ImageIcon(this.getClass().getResource("/4-5.gif"));
			img1[3][5]=new ImageIcon(this.getClass().getResource("/4-6.gif"));
			img1[3][6]=new ImageIcon(this.getClass().getResource("/4-7.gif"));
			img1[3][7]=new ImageIcon(this.getClass().getResource("/4-8.gif"));
			img1[3][8]=new ImageIcon(this.getClass().getResource("/4-9.gif"));
			img1[3][9]=new ImageIcon(this.getClass().getResource("/4-10.gif"));
			img1[3][10]=new ImageIcon(this.getClass().getResource("/4-11.gif"));
			img1[3][11]=new ImageIcon(this.getClass().getResource("/4-12.gif"));
			img1[3][12]=new ImageIcon(this.getClass().getResource("/4-13.gif"));
		
		pai1 = new JLabel();
		pai1.setIcon(img);
		pai2 = new JLabel();
		pai2.setIcon(img);
		pai3 = new JLabel();
		pai3.setIcon(img);
		pai4 = new JLabel();
		
		pai4.setIcon( img);
		pai5 = new JLabel();
		pai5.setIcon(img);
		
		pai6 = new JLabel();
		pai6.setIcon( img);
		
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.EAST, label, -668, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pai1, 70, SpringLayout.SOUTH, label);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pai1, -33, SpringLayout.NORTH, pai4);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, label);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 14, SpringLayout.EAST, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 264, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, 25, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, pai5, 47, SpringLayout.EAST, pai4);
		sl_contentPane.putConstraint(SpringLayout.EAST, pai5, -49, SpringLayout.WEST, pai6);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pai6, 0, SpringLayout.NORTH, pai4);
		sl_contentPane.putConstraint(SpringLayout.WEST, pai6, 0, SpringLayout.WEST, pai3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pai6, 0, SpringLayout.SOUTH, pai4);
		sl_contentPane.putConstraint(SpringLayout.EAST, pai6, -248, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pai3, 126, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, pai3, 29, SpringLayout.EAST, pai2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pai3, 0, SpringLayout.SOUTH, pai1);
		sl_contentPane.putConstraint(SpringLayout.EAST, pai3, -248, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, pai2, -393, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pai2, 126, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, pai2, 47, SpringLayout.EAST, pai1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pai2, -33, SpringLayout.NORTH, pai5);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pai5, 267, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pai5, 0, SpringLayout.SOUTH, pai4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pai4, -133, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, pai1, -556, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, pai1, 159, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pai4, 267, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, pai4, 159, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, pai4, 0, SpringLayout.EAST, pai1);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(label);
		contentPane.add(lblNewLabel);
		contentPane.add(pai1);
		contentPane.add(pai2);
		contentPane.add(pai3);
		contentPane.add(pai4);
		contentPane.add(pai5);
		contentPane.add(pai6);
		
		JLabel Ci = new JLabel("\u672A\u5F00\u59CB");
		Ci.setFont(new Font("宋体", Font.PLAIN, 21));
		sl_contentPane.putConstraint(SpringLayout.WEST, Ci, 337, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, Ci, -39, SpringLayout.NORTH, pai2);
		contentPane.add(Ci);
		
		
		P = new JLabel("\u65E0");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, P, 171, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, P, -32, SpringLayout.EAST, contentPane);
		P.setVerticalAlignment(SwingConstants.TOP);
		P.setFont(new Font("楷体", Font.PLAIN, 20));
		sl_contentPane.putConstraint(SpringLayout.NORTH, P, 0, SpringLayout.NORTH, pai1);
		sl_contentPane.putConstraint(SpringLayout.WEST, P, -198, SpringLayout.EAST, contentPane);
		contentPane.add(P);
		
		JButton Next = new JButton("下一次");
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Pub.k==Pub.ci) {
					setVisible(false);
					new Noo();
					Noo.Nn();
				}else {
				Ci.setText("第"+Integer.toString(Pub.k+1)+"次");
				for(int i=0;i<6;i++)
				{
					//System.out.println(Pub.b[k][i]);
					int x,y;
					x=Pub.b[Pub.k][i]/13;
					y=Pub.b[Pub.k][i]%13;
				if(i==0) {
					pai1.setIcon(img1[x][y]);
					
				}else if(i==1) {
					pai2.setIcon(img1[x][y]);
					//pai2.setBounds(0,0,img1[x][y].getWidth(),img1[x][y].getHeight());
				}
				else if(i==2) {
					pai3.setIcon(img1[x][y]);
					//pai3.setBounds(0,0,img1[x][y].getWidth(),img1[x][y].getHeight());
				}else if(i==3) {
					pai4.setIcon(img1[x][y]);
					//pai4.setBounds(0,0,img1[x][y].getWidth(),img1[x][y].getHeight());
				}else if(i==4) {
					pai5.setIcon(img1[x][y]);
					//pai5.setBounds(0,0,img1[x][y].getWidth(),img1[x][y].getHeight());
				}else if(i==5) {
					pai6.setIcon(img1[x][y]);
					//pai6.setBounds(0,0,img1[x][y].getWidth(),img1[x][y].getHeight());
				}
				}
				new Panduan();
				Panduan.main(null);
				if(Pub.flag==1) {
					P.setText("第"+Integer.toString(Pub.k+1)+"局A玩家获胜\n");
				}else if(Pub.flag==2) {
					P.setText("第"+Integer.toString(Pub.k+1)+"局B玩家获胜\n");
				}else {
					P.setText("第"+Integer.toString(Pub.k+1)+"局平局\n");
				}
				Pub.flag=-1;
				Pub.k+=1;
				}
			}

			private JLabel JLabel(ImageIcon imageIcon) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, Next, 44, SpringLayout.SOUTH, pai6);
		sl_contentPane.putConstraint(SpringLayout.WEST, Next, 0, SpringLayout.WEST, pai3);
		contentPane.add(Next);
		
		JButton New = new JButton("重新开始");
		New.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pub.k=0;
				Pub.ci=0;
				new cishu();
				cishu.CCi();
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, New, 0, SpringLayout.SOUTH, Next);
		sl_contentPane.putConstraint(SpringLayout.EAST, New, -144, SpringLayout.WEST, Next);
		contentPane.add(New);
		
		lblNewLabel_1 = new JLabel("A:");
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 24));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 113, SpringLayout.SOUTH, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -43, SpringLayout.WEST, pai1);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("B:");
		lblNewLabel_2.setFont(new Font("楷体", Font.PLAIN, 24));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 128, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		
		
		
	}
}
