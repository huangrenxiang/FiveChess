package edu.csuft.hrx.fivechess;

import java.awt.event.*;
import java.awt.*;
 
import javax.swing.*;
/*
 �����������
 */
public class StartChessJFrame extends JFrame
{
  private ChessBoard chessBoard;
  private JPanel toolbar;
  private JButton startButton,backButton,exitButton,manAIButton;
  
  //���¿�ʼ���˳����ͻ���˵���
  public StartChessJFrame()
  {
	  setTitle("Java�γ����_������");//���ñ���
	  chessBoard=new ChessBoard();
	
	  Container contentPane=getContentPane();
	  contentPane.add(chessBoard);
	  chessBoard.setOpaque(true);
	  
	    toolbar=new JPanel();//�������ʵ����
      //������ť��ʼ��
	  startButton=new JButton("���¿�ʼ");
	  backButton=new JButton("����");
	  exitButton=new JButton("�˳�");
	  manAIButton=new JButton("�˻�ģʽ");
	 
	
	  //��������尴ť��FlowLayout����
	  toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
	  //��������ť��ӵ��������
	  toolbar.add(startButton);	
	  toolbar.add(manAIButton);
	  toolbar.add(backButton);
	  toolbar.add(exitButton);
	 

	  //��ʼ����ť�¼��������ڲ���
	  MyItemListener lis=new MyItemListener();
	

	  //��������ťע������¼�
	  startButton.addActionListener(lis);
	  exitButton.addActionListener(lis);
	  backButton.addActionListener(lis);
	  manAIButton.addActionListener(lis);
	  
	  //��������岼�ֵ����桱�Ϸ���Ҳ�����·�
	  add(toolbar,BorderLayout.SOUTH);
	  add(chessBoard);//����������ӵ�������
	  //���ý���ر��¼�
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  pack();//����Ӧ��С
	  
  }
  
  private class MyItemListener implements ActionListener
  {
	  public void actionPerformed(ActionEvent e)
	  {
		  Object obj=e.getSource();//����¼�Դ
		  if(obj==startButton)
		  {
			  //���¿�ʼ
			  //JFiveFrame.this�ڲ��������ⲿ��
			  System.out.println("���¿�ʼ");
			  chessBoard.restartGame();
			
		  }
		  else if (obj==exitButton)
			  System.exit(0);
		  else if (obj==backButton)
		  {
			  System.out.println("����...");
			  chessBoard.goback();
		  }
		  else if(obj==manAIButton)
		  {
			  System.out.println("�˻�ģʽ");
			  chessBoard.isMantoAI=true;
		  }
		  
	  }
  }
  
  
  
  public static void main(String[] args)
  {
	  StartChessJFrame f=new StartChessJFrame();//���������
	  f.setVisible(true);//��ʾ�����
	  
  }
}
