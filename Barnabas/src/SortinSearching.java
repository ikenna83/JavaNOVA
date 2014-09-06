import java.util.*;
import java.awt.*;
import javax.swing. *;
import java.io.*;
import java.awt.event.*;
import javax.swing.event.*;

public class SortinSearching extends JFrame implements ActionListener {
private static final int ARRAY_SIZE = 6;
private static final int NOTFOUND = -1; //Used for the Binary Search Method
int [] array1 = new int [ARRAY_SIZE]; //Original array used to store clients numbers
int [] array = new int [ARRAY_SIZE]; //Sorted array after from the file
//Declaring Labels
boolean bubble = false;
boolean selection = false;
boolean insertion = false;
String [] sort = {"Bubble Sort", "Selective Sort", "Insertion Sort"};
JList list = new JList(sort);
String fileName = "outPut.txt";
JLabel title = new JLabel ("Arrary Sorting");
JLabel lbl1 = new JLabel ("Enter Numbers here eg. 1,2,3,");
JLabel lbl2 = new JLabel ("The Sorted arrays");
JLabel lbl3 = new JLabel ("Search here");
// Declaring Buttons
JButton btnSubmit = new JButton("Submit");
JButton btnSort = new JButton("Sort");
JButton btnSearch = new JButton("Binary Search");
JButton btnExit = new JButton("Exit");
JButton btnClear = new JButton("Clr");
//Declaring TextFields
JTextField txtList = new JTextField();
JTextField txtSort = new JTextField();
JTextField txtSearch = new JTextField();
int counter = 0;
public SortinSearching(){ //Constructor for the SortinSearching class
JPanel p1 = new JPanel(new FlowLayout());
p1.add(title); //adding in the panel
JPanel p2 = new JPanel (new GridLayout(3,2,5,5));
p2.add(lbl1); //adding in the panel
p2.add(txtList);
p2.add(lbl2);
p2.add(txtSort);
p2.add(lbl3);
p2.add(txtSearch);
JPanel p3 = new JPanel (new FlowLayout());
p3.add(btnSubmit);//adding in the panel
p3.add(btnSort);
p3.add(btnSearch);
p3.add(btnExit);
p3.add(btnClear);
JPanel p4 = new JPanel(new FlowLayout());
list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
add(new JScrollPane(list));
getContentPane().add(p4, BorderLayout.EAST);
p4.add(list);
getContentPane().add(p1, BorderLayout.NORTH); //Borders
getContentPane().add(p2, BorderLayout.CENTER);
getContentPane().add(p3, BorderLayout.SOUTH);

btnSubmit.addActionListener(this);
btnExit.addActionListener(this);
btnSort.addActionListener(this);
txtSort.setEditable(false);
btnSearch.addActionListener(this);
btnClear.addActionListener(this);

list.addListSelectionListener(new ListSelectionListener(){ //List
public void valueChanged(ListSelectionEvent e) {
if(list.getSelectedIndex() == 0)
{bubble = true;
selection = false;
insertion = false;}
if(list.getSelectedIndex()== 1)
{bubble = false;
selection = true;
insertion = false;}
if(list.getSelectedIndex() == 2)
{bubble = false;
selection = false;
insertion = true;}
}});
}


public void actionPerformed(ActionEvent e)
{
PrintWriter outputStream = null;
if(e.getSource() == btnSubmit) //Creating File and Inserting the numbers into the file
{
try
{
outputStream = new PrintWriter(fileName);
}
catch (FileNotFoundException e1)
{
System.out.println("File not Found");
}
int i = 0;
String wholetxt = txtList.getText();
int firstindex = 0;
int num = 0;
while(i < array1.length)
{
firstindex = wholetxt.indexOf(",");
num = (int) Double.parseDouble(wholetxt.substring(0, firstindex));
wholetxt = wholetxt.substring(firstindex + 1);
array1[i] = num;
i++;
}
for(int c = 0; c <array1.length; c++)
{
outputStream.println(array1[c]);
}
txtList.setText("");
outputStream.close();
}
if(e.getSource() == btnExit)
{
System.exit(0);
}
if(e.getSource() == btnSort)
{
Scanner scan = null;
try
{
scan = new Scanner(new File(fileName));
}
catch(FileNotFoundException e1)
{
JFrame frame = new JFrame();
JOptionPane.showMessageDialog(frame, "File is Not Found");
}
int i = 0;
while(scan.hasNext())
{
array[i] = (int) scan.nextDouble();
i++;
}
if (bubble == true){ //Selecting Methods
BubbleSort(array);
txtSort.setText(printArray(array));}
else if (selection == true){
SelectionSort(array);txtSort.setText(printArray(array));}
else if (insertion == true){
InsertionSort(array);txtSort.setText(printArray(array));}
else { //If not selected then show a window indicating
JFrame frame = new JFrame("Error");
JOptionPane.showMessageDialog(frame, "Select a Sorting Method");
}
}
if(e.getSource() == btnClear) //Clear TextFields
{
txtList.setText("");
txtSort.setText("");
txtSearch.setText("");
}
if(e.getSource() == btnSearch) //Click event for Search Button
{
Scanner scan = null;
try
{
scan = new Scanner(new File(fileName));
}
catch(FileNotFoundException e1)
{
JFrame frame = new JFrame();
JOptionPane.showMessageDialog(frame, "File is Not Found");
}
int i = 0;
while(scan.hasNext())
{
array[i] = (int) scan.nextDouble();
i++;
}
//Binary Search used, see the below method
if(txtSearch.getText() == null) //Exceptions handling
{ JFrame frame = new JFrame("Error");
JOptionPane.showMessageDialog(frame, "Search what?");
}
int num = (int) Double.parseDouble(txtSearch.getText());
int found = binarySearch(array,num);
if (found == -1) //If numbers searched is not Found
{
JFrame frame = new JFrame("Not Found");
JOptionPane.showMessageDialog(frame, "Number is Not Found!");
}
if (found != -1) { //If Found
JFrame frame = new JFrame("Found");
JOptionPane.showMessageDialog(frame, "Number is Found... at Position " + (found + 1));
}
}
}//ActionPerformed Ends here


public static void BubbleSort(int [] Array) //BubbleSort Method
{

for (int i = 0; i < Array.length; i++)
{
for (int j =1; j< Array.length-i; j++)
{
if(Array[j-1] > Array[j])
 {
 int temp = Array[j-1];
 Array[j-1] = Array[j];
 Array[j] = temp; }
}
            }
        }

//End of Method
public static void SelectionSort(int[] Array) {//SelectionSort Method
int i, j, minIndex, tmp;
 int n = Array.length;
 for (i = 0; i < n - 1; i++) {
 minIndex = i;
for (j = i + 1; j < n; j++)
 if (Array[j] < Array[minIndex])
 minIndex = j;
if (minIndex != i) {
 tmp = Array[i];
 Array[i] = Array[minIndex];
 Array[minIndex] = tmp; 
           }
     }
}//End of Method
public static void InsertionSort(int[] Array) { //InsertionSort Method
 int i, j, newValue;
 for (i = 1; i < Array.length; i++) {
 newValue = Array[i];
j = i;
 while (j > 0 && Array[j - 1] > newValue) {
 Array[j] = Array[j - 1];
 j--;
}
 Array[j] = newValue; }
 }

//End of InsertionSort Method
public static String printArray(int [] Array) //Method is used to print an Array on the TextFields
{
String numbers = "";
for (int z = 0; z < Array.length; z++)
{
numbers = numbers + Array[z] + ", ";
}
return numbers;
}//End of printArray Method
//Main Method Starts Here
public static void main(String [] args) {
	SortinSearching window = new SortinSearching();
	window.pack();
	window.setVisible(true);
	window.setResizable(false);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setTitle("Sorting and Searching");

}  //End of Main Method

public static int binarySearch( int [ ] a, int x ) //Binary Search Method
{
	
int low = 0;
 int high = a.length - 1;
 int mid;
 int i = 0;
 while( low <= high )
{
mid = ( low + high ) / 2;

if( a[mid] < x )
low = mid + 1;
else if( a[mid] < x)
high = mid - 1;
else
return mid;


//return NOTFOUND;     // NOTFOUND = -1
    }//End of Method
