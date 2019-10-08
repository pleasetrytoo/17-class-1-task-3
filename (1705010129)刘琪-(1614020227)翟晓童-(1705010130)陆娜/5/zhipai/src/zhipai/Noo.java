package zhipai;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Noo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Nn() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Noo frame = new Noo();
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
	public Noo() {
		setTitle("\u63D0\u793A\u6846");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u6CA1\u6709\u6B21\u6570\u4E86\uFF01\uFF01");
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 27));
		
		JLabel label = new JLabel("\u540C\u82B1\uFF1A");
		label.setFont(new Font("楷体", Font.PLAIN, 20));
		
		JLabel K1 = new JLabel("0%");
		K1.setFont(new Font("宋体", Font.PLAIN, 20));
		int l=(int)((Pub.Last[1]*1.0)/(Pub.ci*1.0)*100);
		K1.setText(String.valueOf(l)+"%");
		
		JLabel label_1 = new JLabel("\u987A\u5B50\uFF1A");
		label_1.setFont(new Font("楷体", Font.PLAIN, 20));
		
		JLabel K2 = new JLabel("0%");
		K2.setFont(new Font("宋体", Font.PLAIN, 20));
		int ll=(int)((Pub.Last[2]*1.0)/(Pub.ci*1.0)*100);
		K2.setText(String.valueOf(ll)+"%");
		
		
		JLabel label_2 = new JLabel("\u540C\u70B9\uFF1A");
		label_2.setFont(new Font("楷体", Font.PLAIN, 20));
		
		JLabel K3 = new JLabel("0%");
		K3.setFont(new Font("宋体", Font.PLAIN, 20));
		int lll=(int)((Pub.Last[3]*1.0)/(Pub.ci*1.0)*100);
		K3.setText(String.valueOf(lll)+"%");
		
		
		JLabel label_3 = new JLabel("\u5BF9\u5B50\uFF1A");
		label_3.setFont(new Font("楷体", Font.PLAIN, 20));
		
		JLabel K4 = new JLabel("0%");
		K4.setFont(new Font("宋体", Font.PLAIN, 20));
		int llll=(int)((Pub.Last[4]*1.0)/(Pub.ci*1.0)*100);
		K4.setText(String.valueOf(llll)+"%");
		
		JLabel label_4 = new JLabel("\u6742\u724C\uFF1A");
		label_4.setFont(new Font("楷体", Font.PLAIN, 20));
		
		JLabel K5 = new JLabel("0%");
		K5.setFont(new Font("宋体", Font.PLAIN, 20));
		int lllll=(int)((Pub.Last[5]*1.0)/(Pub.ci*1.0)*100);
		K5.setText(String.valueOf(lllll)+"%");
		
		for(int i=1;i<=5;i++) {
			System.out.println(Pub.Last[i]);
		}
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Pub.k=0;
				new mainye();
				mainye.main(null);
				
			}
		});
		button.setFont(new Font("楷体", Font.PLAIN, 23));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(152)
					.addComponent(lblNewLabel)
					.addContainerGap(153, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(33)
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(K1)
									.addPreferredGap(ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap(235, Short.MAX_VALUE)
									.addComponent(button)))
							.addGap(18)
							.addComponent(K2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(K3)
							.addGap(32)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(K4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(K5)))
					.addContainerGap(84, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNewLabel)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(17)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(label)
										.addComponent(K1)
										.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(K2)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(15)
												.addComponent(K3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(17)
												.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(16)
												.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(14)
											.addComponent(K4)))
									.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
									.addComponent(button))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(K5)
									.addGap(62))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
