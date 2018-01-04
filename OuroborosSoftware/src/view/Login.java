package view;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class Login extends Dialog {

	protected Object result;
	protected Shell shlLogin;
	private Text textLogin;
	private Text textPwd;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public Login(Shell parent) {
		super(parent);
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlLogin.open();
		shlLogin.layout();
		Display display = getParent().getDisplay();
		while (!shlLogin.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlLogin = new Shell();
		shlLogin.setBackground(SWTResourceManager.getColor(68, 68, 68));
		shlLogin.setSize(280, 159);
		shlLogin.setText("Login");
		shlLogin.setLayout(new GridLayout(4, true));
		
		Label lblLogin = new Label(shlLogin, SWT.NONE);
		lblLogin.setText("Login");
		
		textLogin = new Text(shlLogin, SWT.BORDER);
		textLogin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Label lblPassword = new Label(shlLogin, SWT.NONE);
		lblPassword.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPassword.setText("Password");
		
		textPwd = new Text(shlLogin, SWT.BORDER | SWT.PASSWORD);
		textPwd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		new Label(shlLogin, SWT.NONE);
		new Label(shlLogin, SWT.NONE);
		
		Button btnLogin = new Button(shlLogin, SWT.FLAT);
		btnLogin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnLogin.setText("Login");
		
		Button btnCancel = new Button(shlLogin, SWT.NONE);
		btnCancel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnCancel.setText("Cancel");

	}
}
