package day19.mssage;

import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Writer;

import javax.swing.*;

import java.net.*;


public class MsgWrite {
	jjokji main;
	
	JFrame frame;
	JTextField field; // 한줄작성할때(Ex. ID 작성) // 이름을 기억할 필드
	JTextArea area; // 본문 작성
	JButton sendB, resetB, closeB;
	public MsgWrite(jjokji main) {
		this.main = main;
		
		frame = new JFrame("### 메세지 작성 ###");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);	// 스크롤
		
		// 버튼
		sendB = new JButton("보내기");
		resetB = new JButton("다시작성");
		closeB = new JButton("닫기");
		
		// 버튼 이벤트
		WriteEvt evt = new WriteEvt(this);
		sendB.addActionListener(evt);
		resetB.addActionListener(evt);
		
		JPanel bPan = new JPanel(new GridLayout(1, 3));
		bPan.add(sendB);
		bPan.add(resetB);
		bPan.add(closeB);
		
		closeB.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent evt) {
				main.frame.setVisible(true);
				frame.dispose();	// 현재 창만 닫아야 한다.
			}
		});
		frame.add(field, BorderLayout.NORTH);
		frame.add(sp, BorderLayout.CENTER);
		frame.add(bPan, BorderLayout.SOUTH);
		
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		
	}



}
