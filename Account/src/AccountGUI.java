
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

//class AccountGUI
public class AccountGUI extends JFrame implements ActionListener{
	//declare text fields
	private JTextField idField, balanceField, depositField, withdrawField;
	//declare buttons
	private JButton depositButton, withdrawButton;
	//create account with initial balance 1000
	private Account account = new Account(1, 1000);
	//create label for showing status
	private JLabel statusLabel = new JLabel();



	public AccountGUI(){
		//panel p1 to group id and balance labels and text field
		JPanel p1= new JPanel();
		p1.setBackground (Color.CYAN);
		p1.setLayout(new GridLayout(2,2));
		p1.add(new JLabel("Account ID"));
		p1.add(idField = new JTextField(4));
		p1.add(new JLabel("Account Balance"));
		p1.add(balanceField = new JTextField(4));
		idField.setEditable(false);
		balanceField.setEditable(false);
		p1.setBorder(new TitledBorder("Display account information"));

		//panel p2 to group deposit amount and deposit button and
		//withdraw amount and withdraw button

		JPanel p2 = new JPanel();
		p2.setBackground (Color.pink);
		p2.setLayout(new GridLayout(2,3));
		p2.add(new JLabel("Deposit"));
		p2.add(depositField = new JTextField(4));
		p2.add(depositButton = new JButton("Deposit"));
		p2.add(new JLabel("Withdraw"));
		p2.add(withdrawField = new JTextField(4));
		p2.add(withdrawButton = new JButton("Withdraw"));
		p2.setBorder(new TitledBorder("Deposit or withdrraw funds"));

		//place panels p1, p2 and label in the GUI ********
		Container container = getContentPane();
		container.add(p1,BorderLayout.WEST);
		container.add(p2,BorderLayout.CENTER);
		container.add(statusLabel,BorderLayout.SOUTH);

		//refresh ID and balance Fields
		refreshFields();

		//register listener*****
		depositButton.addActionListener(this);
		withdrawButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(e.getSource() == depositButton){
			try{
				double depositValue = Double.parseDouble(depositField.getText());
				account.deposit(depositValue);
				refreshFields();
				statusLabel.setText("Transaction processed");
			}
			catch(NegativeAmountException ex){
				statusLabel.setText("Negative Amount");
			}
	}
	if(e.getSource() == withdrawButton){
		try{
			double withdrawValue = Double.parseDouble(withdrawField.getText());
			account.withdraw(withdrawValue);
			refreshFields();
			statusLabel.setText("Transaction processed");
		}
		catch(NegativeAmountException ex){
			statusLabel.setText("Negative Amount");
		}
		catch(InsufficientFundException ex){
			statusLabel.setText("Insufficient Funds");
	}
	
	}
}

public void refreshFields(){
	idField.setText(String.valueOf(account.getId()));
	balanceField.setText(String.valueOf(account.getBalance()));
}

public static void main(String[] args){
	AccountGUI accountGui = new AccountGUI();
	accountGui.setSize(400,100);
	accountGui.setVisible(true);
	accountGui.pack();
	accountGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
