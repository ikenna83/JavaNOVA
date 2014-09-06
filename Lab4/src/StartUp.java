// Odi-Rodrigue P. Ikenna-Odom
// CSC 201
// Spring 2010
// Lab 4

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


public class StartUp {
	public static void main(String[] args) {
		new Controller();
	}

}
class Controller {
	public Controller() {
		Model m = new Model();
		MyView view = new MyView(m);
	}
}
class MyView extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	
	private Container c;
	private JLabel lblPrompt = new JLabel("Enter the first integer");
	private JLabel lblSearchResult = new JLabel("Array can have a maximum of 10 elements");
	private JTextField txtField = new JTextField();
	private SubmitButton submitButton = new SubmitButton("Submit",this);
	private SortButton sortButton = new SortButton("Sort",this);
	private SearchButton searchButton = new SearchButton("Search",this);
	private ExitButton exitButton = new ExitButton("Exit",this);
	private Model model;
	private int i;

	public MyView(Model m) {
			super("SortnSearch");
			model = m;
			c = getContentPane();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			c.setBackground(Color.white);
			c.setLayout(null);
			setSize(320,200);
			lblPrompt.setBounds(10, 10, 220, 25);
			lblPrompt.setBackground(Color.white);
			txtField.setBounds(200, 10, 80, 25);
			txtField.setBackground(Color.white);
			lblSearchResult.setBounds(20, 50, 300, 20);
			submitButton.setBounds(30, 100, 80, 25);
			sortButton.setBounds(110, 100, 80, 25);
			searchButton.setBounds(190, 100, 80, 25);
			exitButton.setBounds(110, 130, 80, 25);
			c.add(lblPrompt);
			c.add(txtField);
			c.add(submitButton);
			c.add(sortButton);
			c.add(searchButton);
			c.add(exitButton);
			c.add(lblSearchResult);
			setVisible(true);
	}

	public void fillArray() { //this gets called when Submit button is clicked
		i = Integer.parseInt(txtField.getText());
		lblPrompt.setText(model.fillArray(i));
		txtField.setText("");
	}

	public void sortArray() {
		model.sortArray();
	}
	public void searchElement() //this gets called when Search Button is clicked
	{
		int key = Integer.parseInt(txtField.getText());
		if(model.searchElement(key))
			lblSearchResult.setText("The Element " + key + " is found");
		else
			lblSearchResult.setText("The Element " + key + " is NOT found");
	}//end search element()
//end class

	public void ExitElement() {
		// TODO Auto-generated method stub
		
	}

	public void sortElement() {
		// TODO Auto-generated method stub
		
	}
	public void exit()//Gives life to Exit button
	{
		System.exit(0);
	}
	//end class
	}
//this is search button class

class SubmitButton extends JButton implements ActionListener {
	
	private static final long serialVersionUID = 2L;
	
	private MyView theView;
	public SubmitButton(String label, MyView v) {
		super(label);
		theView = v;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae){
		theView.fillArray();

	}
	}

class SearchButton extends JButton implements ActionListener {
	
	private static final long serialVersionUID = 3L;
	
	private MyView theView;
	public SearchButton(String label, MyView v){
	super(label);
	theView = v;
	addActionListener(this);
}
	public void actionPerformed(ActionEvent ae) {
	theView.searchElement();
}
}

//this is sortbutton class
class SortButton extends JButton implements ActionListener {
	
	private static final long serialVersionUID = 4L;
	private MyView theView;
	public SortButton(String label, MyView v){
		super(label);
		theView = v;
		addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		theView.sortArray();
	}

}

class ExitButton extends JButton implements ActionListener//Gives life to Exit button
{
	
	private static final long serialVersionUID = 9L;
	private MyView theView;
	public ExitButton (String label, MyView v)
	{
		super(label);
		theView = v;
		addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		theView.exit();
	}
}
class SortedArrayDisplay extends JFrame {
	
	private static final long serialVersionUID = 6L;

	public SortedArrayDisplay(int array[]){
		super("Sorted Array Display");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(200, 300);
		Container cp = getContentPane();
		JTextArea text = new JTextArea();
		cp.add(new JScrollPane(text));
	for(int index = 0; index < array.length; index++){
		text.append("Element" + index + "is" + array[index]);
		text.append("\n");
	}
	setVisible(true);
	}
}


class SortingClass//Class to sort the array
{
	public int[] sort (int[] a)
	{
		int[] unsortedArray = new int [a.length];
        int elem, length;
        unsortedArray = a;
        length = a.length;
        
        for(int counter=0; counter<length-1; counter++) //Loop once for each element in the array
        {
            for(int index=0; index<length-1-counter; index++)//Loop once for each element minus the counter
            { 
                if(unsortedArray[index] > unsortedArray[index+1])//Swap elements if needed
                {
                    elem = unsortedArray[index]; //These three lines just swap the two elements
                    unsortedArray[index] = unsortedArray[index+1];
                    unsortedArray[index+1] = elem;
                }
            }
        }
        a = unsortedArray;
		return a;
	}
}
class Model {
	private final int MAX = 10; //used to specify the size of the array
	private int array[] = new int [MAX]; // Look how an array of integers is created
	private int index = 0;
	private SortingClass SortingObject = new SortingClass(); //this class has a method for sorting.(NOT provided)
	SortedArrayDisplay sortedarraydisplay;

	public String fillArray(int element) // called by MyView when submit button is clicked
	{
		array[index] = element;
		if(index<(MAX-1)) {
			index++;
			return"Enter the next Element";
		}
		else
			return"Array is full, use Search of Sort";
	}
	public void sortArray() //called by MyView when sort button is clicked
	{
		array = SortingObject.sort(array);
		sortedarraydisplay = new SortedArrayDisplay(array);
	}
	public boolean searchElement(int key)//Searches through the array for an element requested
	{
		boolean found = false;
		
		for(int i=0; i<MAX; i++)
		{
			if (key == array[i])
			{
				found=true;
			}
		}
		return found;
	}// end of class
}// end of method