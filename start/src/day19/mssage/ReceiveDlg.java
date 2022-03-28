package day19.mssage;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ReceiveDlg {
	jjokji main;
	JTextField field;
	JTextArea area;
	JButton reB, closeB;
	JFrame frame;
	
	
	public ReceiveDlg(jjokji main) {
		this.main = main;
		setGui();
	}
	public void setGui() {
		frame = new JFrame("받은 메세지");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		// 버튼
		reB = new JButton("답장");
		closeB = new JButton("닫기");
		
		JPanel bPan = new JPanel(new GridLayout(1,2));
		bPan.add(reB);
		bPan.add(closeB);
		
		reB.addActionListener(new BtnEvt());
		
		closeB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				frame.dispose();// 이 창을 닫는다.
				main.frame.setVisible(true);
			}
		});
		
		frame.add(field, BorderLayout.NORTH);
		frame.add(sp, BorderLayout.CENTER);
		frame.add(bPan, BorderLayout.SOUTH);
		
		frame.setSize(400,300);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	class BtnEvt implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 이름 알아내고
			String name = field.getText();
			
			MsgWrite wr = new MsgWrite(main);
			wr.field.setText(name);
			frame.dispose(); // 답장시 이 창을 닫아준다.
			
		}
		
	}
}
