package edu.csuft.hrx.fivechess;

import java.awt.event.*;
import java.awt.*;
 
import javax.swing.*;
/*
 五子棋主框架
 */
public class StartChessJFrame extends JFrame
{
  private ChessBoard chessBoard;
  private JPanel toolbar;
  private JButton startButton,backButton,exitButton,manAIButton;
  
  //重新开始，退出，和悔棋菜单项
  public StartChessJFrame()
  {
	  setTitle("Java课程设计_五子棋");//设置标题
	  chessBoard=new ChessBoard();
	
	  Container contentPane=getContentPane();
	  contentPane.add(chessBoard);
	  chessBoard.setOpaque(true);
	  
	    toolbar=new JPanel();//工具面板实例化
      //三个按钮初始化
	  startButton=new JButton("重新开始");
	  backButton=new JButton("悔棋");
	  exitButton=new JButton("退出");
	  manAIButton=new JButton("人机模式");
	 
	
	  //将工具面板按钮用FlowLayout布局
	  toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
	  //将三个按钮添加到工具面板
	  toolbar.add(startButton);	
	  toolbar.add(manAIButton);
	  toolbar.add(backButton);
	  toolbar.add(exitButton);
	 

	  //初始化按钮事件监听器内部类
	  MyItemListener lis=new MyItemListener();
	

	  //将三个按钮注册监听事件
	  startButton.addActionListener(lis);
	  exitButton.addActionListener(lis);
	  backButton.addActionListener(lis);
	  manAIButton.addActionListener(lis);
	  
	  //将工具面板布局到界面”南方“也就是下方
	  add(toolbar,BorderLayout.SOUTH);
	  add(chessBoard);//将面板对象添加到窗体上
	  //设置界面关闭事件
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  pack();//自适应大小
	  
  }
  
  private class MyItemListener implements ActionListener
  {
	  public void actionPerformed(ActionEvent e)
	  {
		  Object obj=e.getSource();//获得事件源
		  if(obj==startButton)
		  {
			  //重新开始
			  //JFiveFrame.this内部类引用外部类
			  System.out.println("重新开始");
			  chessBoard.restartGame();
			
		  }
		  else if (obj==exitButton)
			  System.exit(0);
		  else if (obj==backButton)
		  {
			  System.out.println("悔棋...");
			  chessBoard.goback();
		  }
		  else if(obj==manAIButton)
		  {
			  System.out.println("人机模式");
			  chessBoard.isMantoAI=true;
		  }
		  
	  }
  }
  
  
  
  public static void main(String[] args)
  {
	  StartChessJFrame f=new StartChessJFrame();//创建主框架
	  f.setVisible(true);//显示主框架
	  
  }
}
