package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import Items.Item;
import Methods.Methods;
public class GUItrials {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object
		

		String[] shape = {"round","square","rectangular"};
		Item it = new Item();
      JFrame frame = new JFrame("Shipping company");
      JLabel quantity = new JLabel("Enter products Quantity: ");
      JLabel weight = new JLabel("Enter product's Weight: ");
      JLabel label1 = new JLabel("Item name: ", JLabel.LEFT);
      label1.setForeground(Color.BLACK);
      label1.setBounds(20, 20, 120, 30);
      
      JLabel label2 = new JLabel("Shape", JLabel.LEFT);
      label2.setForeground(Color.RED);
      label2.setBounds(20, 50, 130, 30);
      
      JPanel panel = new JPanel();
      panel.setLayout(null);
      
      JButton btn = new JButton("Submit");
      //
      JFrame frame1 = new JFrame("Volume");
	      JTextField Quan = new JTextField();
	      Quan.setBounds(200, 40, 120, 30);
	      Quan.setText("0");
	      double sq = Double.parseDouble(Quan.getText());
	      it.setQuantity(sq);
	      JTextField wei = new JTextField();
	      wei.setBounds(200, 70, 120, 30);
			   frame1.setSize(400, 500);
			   JPanel panel1 = new JPanel();
			   panel1.setLayout(null);
			   weight.setBounds(30, 70, 200, 30);
			   quantity.setBounds(30, 40, 200, 30);
			   panel1.add(Quan);
			   panel1.add(wei);
			   panel1.add(weight);
			   panel1.add(quantity);
			   frame1.add(panel1);
			   
			   
      JTextField tf = new JTextField();
      tf.setBounds(220, 20, 130, 30);
      
      JRadioButton r1 = new JRadioButton("Rectangular");
      JRadioButton r2 = new JRadioButton("Square");
      JRadioButton r3 = new JRadioButton("Round");
       ButtonGroup bg = new ButtonGroup();
      bg.add(r1);
      bg.add(r2);
      bg.add(r3);
      
      r1.setBounds(20, 70, 100, 30);
      r2.setBounds(120, 70, 100, 30);
      r3.setBounds(220, 70, 100, 30);
      r1.setName("Rectangle");
      r2.setName("Square");
      r3.setName("Round");
      
      panel.add(r1); panel.add(r2); panel.add(r3);
      
      
      JMenuBar menuBar = new JMenuBar();
      JMenu fileMenu = new JMenu("file");
      
      fileMenu.setMnemonic(KeyEvent.VK_F);
      menuBar.add(fileMenu);
      
      JMenuItem newItem = new JMenuItem("New",KeyEvent.VK_N);
      fileMenu.add(newItem);
      
      JMenuItem OpenItem = new JMenuItem("Open File",KeyEvent.VK_O);
      fileMenu.add(OpenItem);
      
      //edit menu
      JMenu editmenu = new JMenu("Edit");
      editmenu.setMnemonic(KeyEvent.VK_E);
      menuBar.add(editmenu);
      
      JMenu Sourcemenu = new JMenu("Source");
      Sourcemenu.setMnemonic(KeyEvent.VK_F);
      menuBar.add(Sourcemenu);
      //SET SIZE
      frame.setSize(500,600);
      frame.setJMenuBar(menuBar);
      //add component
      panel.add(label1);
      panel.add(label2);
      panel.add(btn, BorderLayout.SOUTH);
      panel.add(tf);
      frame.add(panel);
      
      btn.addActionListener(new ActionListener() {
  		@Override
  		public void actionPerformed(ActionEvent e) {
  		    String r = tf.getText();
  		    it.setName(r);
  		   if(r1.isSelected()) {
   			   frame1.setVisible(true);
  			   String r11 = r1.getName();
  			   System.out.println("the shape is: " +r11);
  		   }else if(r2.isSelected()) {
  			   String r12 = r2.getName();
  			   System.out.println("the shape is: " +r12);
  		   }else if(r3.isSelected()) {
  			   String r13 = r3.getName();
  			   System.out.println("the shape is: " +r13);
  		   }
  			
  		}
        });
      frame.getContentPane().add(BorderLayout.SOUTH, btn);   
      //end program when click on close
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //set visible
      frame.setVisible(true);
      
      
	}

}
