package edu.csuft.hrx.fivechess;

import java.awt.Color;
/**
 * 棋子类
 */
public class Point 
{
  private int x;//棋盘中的x索引
  private int y;//棋盘中的y索引
  private Color color;//颜色
  public static final int DIAMETER=30;//直径
  
  public Point(int x,int y,Color color)
  {
	  this.x=x;
	  this.y=y;
	  this.color=color;
  } 
  /*
   * 拿到棋盘中x的索引
   * 拿到棋盘中y的索引
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
   * 获得棋子的颜色
   */
  public Color getColor()
  {
	  return color;
  }
}
