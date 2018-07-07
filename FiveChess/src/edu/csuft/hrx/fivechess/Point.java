package edu.csuft.hrx.fivechess;

import java.awt.Color;
/**
 * ������
 */
public class Point 
{
  private int x;//�����е�x����
  private int y;//�����е�y����
  private Color color;//��ɫ
  public static final int DIAMETER=30;//ֱ��
  
  public Point(int x,int y,Color color)
  {
	  this.x=x;
	  this.y=y;
	  this.color=color;
  } 
  /*
   * �õ�������x������
   * �õ�������y������
   */
  public int getX()
  {
	  return x;
  }
  public int getY()
  {
	  return y;
  }
  
  /*
   * ������ӵ���ɫ
   */
  public Color getColor()
  {
	  return color;
  }
}
