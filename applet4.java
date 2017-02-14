import java.awt.*;
import java.applet.*;
/*<applet code="applet4" width=100 height=100>
</applet>*/
public class applet4 extends Applet{
	public void paint(Graphics g)
	{
		for(int i=10;i<=100;i=i+10)
		{
			for(int j=0;j<10;j++)
			{
				if((i/10)%2!=0)
				g.drawString("*",10+j*3,5*i);
				else
					g.drawString("  *",10+j*3,5*(i+1));
			}
		}
	}
}