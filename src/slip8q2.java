/* Q2) Design a screen to handle the Mouse Events such as MOUSE_MOVED
and MOUSE_CLICKED and display the position of the Mouse_Click in a TextField. */
import java.awt.*;
import java.awt.event.*;
public class slip8q2 extends Frame implements MouseListener,MouseMotionListener
{
  TextField t1,t;
  Label l,l1;
  int x,y;
  Panel p;
  slip8q2()
  {
	  super("slip8q2");
	  setLayout(new FlowLayout());
	  p=new Panel();
	  p.setLayout(new GridLayout(2,2,5,5));
	  t=new TextField(20);
	  l=new Label("Co-ordinate of mouse Clicking");
	  l1=new Label("co-ordinates of mouse movment");
	  t1=new TextField(20);
	  p.add(l);p.add(t);p.add(t1);add(p);
	  addMouseListener(this);
	  addMouseMotionListener(this);
	  setSize(500,500);
	  setVisible(true);
   }
  

@Override
public void mouseDragged(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseMoved(MouseEvent me) 
{
	x=me.getX();
	y=me.getY();
	t1.setText("X="+x+"Y="+y);
}

@Override
public void mouseClicked(MouseEvent me)
{
	x=me.getX();
	y=me.getY();
	t.setText("X="+x+"Y="+y);
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args) 
{
  new slip8q2();	
}

}
