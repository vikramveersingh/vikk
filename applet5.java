import java.awt.*;
import java.applet.*;
/*<applet code="applet5" width=100 height=100>
</applet>*/
public class applet5 extends Applet{
	public void init()
	{
		setBackground(Color.blue);
		setForeground(Color.white);
	}
	public void paint(Graphics g)
	{
		showStatus("hii iam status");
	}
}