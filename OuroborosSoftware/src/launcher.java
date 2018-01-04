import org.eclipse.swt.widgets.Shell;
import view.Login;

public class launcher {
	public static void main(String[] args) {

	    final Shell shell = new Shell();
		Login login = new Login(shell);
		login.open();

	}
}
