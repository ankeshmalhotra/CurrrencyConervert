package currency_converter;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currency_converter extends JFrame implements ActionListener {

//
   JComboBox c1,c2;


// button
   JButton clear,button;


// text field
   JTextField  inter_amount ,convert1;
   String[] country = {"US Dollar","Indian Rupee","British Pound","Euro","Canadian Dollar","Emirati Driham","Chinese Yuan"};
//   public static int data;

   currency_converter(){
      setBounds(550, 80, 580, 650);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);

// heading of frame
      JLabel heading = new JLabel(" currency converter");
      heading.setBounds(100, 60, 380, 45);
      heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
      heading.setForeground(new Color(225, 69, 36));
      add(heading);

      JLabel input = new JLabel("select the input  currency ");
      input.setBounds(30, 160, 380, 45);
      input.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
      input.setForeground(new Color(35, 26, 24));
      add(input);

      // country name
//      String country[] = {"US Dollar","Indian Rupee","British Pound","Euro","Canadian Dollar","Emirati Driham","Chinese Yuan"};
      c1 = new JComboBox<>(country);
      c1.setBounds(290,158,180,45);
      c1.addActionListener(this);
      c1.setSelectedIndex(0);
      add(c1);

      JLabel amount = new JLabel("select the amount : ");
      amount.setBounds(50, 250, 380, 45);
      amount.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
      amount.setForeground(new Color(35, 26, 24));
      add(amount);

// amount
      inter_amount = new JTextField();
      inter_amount.setBounds(230,260,120,25);
      inter_amount.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
      inter_amount.setForeground(new Color(35, 26, 24));
      inter_amount.addActionListener(this);
      add(inter_amount);


      JLabel output = new JLabel("select the output currency ");
      output.setBounds(30, 350, 380, 45);
      output.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
      output.setForeground(new Color(35, 26, 24));
      add(output);

// country

//      String country1[] = {"US Dollar","Indian Rupee","British Pound","Euro","Canadian Dollar","Emirati Driham","Chinese Yuan"};
      c2 = new JComboBox<>(country);
      c2.setBounds(260,350,180,45);
      c1.setSelectedIndex(1);
      c2.addActionListener(this);
      add(c2);



//button
      button = new JButton("convert");
      button.setBounds(160,450,180,45);
      button.setBackground(new Color(225, 69, 36));
      button.setForeground(new Color(239, 236, 228));
      button.addActionListener(this);
      add(button);

      JLabel convert_amount = new JLabel("converted amount : ");
      convert_amount.setBounds(50, 510, 380, 45);
      convert_amount.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
      convert_amount.setForeground(new Color(35, 26, 24));
      add(convert_amount);

      convert1 = new JTextField();
      convert1.setBounds(250,520,120,25);
      convert1.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
      convert1.setForeground(new Color(35, 26, 24));
      add(convert1);


      //button
      clear = new JButton("clear");
      clear.setBounds(150,566,180,45);
      clear.setBackground(new Color(187, 63, 36));
      clear.setForeground(new Color(239, 236, 228));
      clear.addActionListener(this);
      add(clear);





      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
   public void actionPerformed(ActionEvent ae) {
      try {
         if (ae.getSource()==button){
            double amount = Double.parseDouble(inter_amount.getText());
            String fromcurrency =(String) c1.getSelectedItem();
            String toCurrency =(String) c2.getSelectedItem();
            double total;

            // us dollar
            if("US Dollar".equals(fromcurrency)){
               switch (toCurrency){
                  case "US Dollar":
                     total = amount;
                     convert1.setText(String.valueOf(total));
                     break;

                  case "Indian Rupee" :                   //      String country[] = {"US Dollar","Indian Rupee","British Pound","Euro","Canadian Dollar","Emirati Driham","Chinese Yuan"};
                     total = amount * 82.743;
                     convert1.setText(String.valueOf(total));
                     break;
                  case "British Pound":
                     total = amount * 0.943;
                     convert1.setText(String.valueOf(total));
                     break;
                  case"Euro":
                     total = amount * 0.92;
                     convert1.setText(String.valueOf(total));
                     break;

                  case "Canadian Dollar":
                     total =  amount * 0.92;
                     convert1.setText(String.valueOf(total));
                     break;

                  case "Emirati Driham":
                     total =  amount * 3.67;
                     convert1.setText(String.valueOf(total));
                     break;

                  case "Chinese Yuan":
                     total =  amount * 7.09;
                     convert1.setText(String.valueOf(total));
                     break;

               }
            }


            // indain
            else if ("Indian Rupee".equals(fromcurrency)) {
               switch (toCurrency){

                  case "Indian Rupee":
                     total = amount;
                     convert1.setText(String.valueOf(total));
                     break;

                  case "US Dollar":
                     total = amount * 0.0120;
                     convert1.setText(String.valueOf(total));
                     break;
                  case "British Pound":
                     total = amount * 00.01139;
                     convert1.setText(String.valueOf(total));
                     break;

                  case  "Euro":
                     total = amount * 0.011;
                     convert1.setText(String.valueOf(total));
                     break;

                  case  "Canadian Dollar":
                     total = amount * 0.044;
                     convert1.setText(String.valueOf(total));
                     break;

                  case  "Emirati Driham":
                     total = amount * 0.044;
                     convert1.setText(String.valueOf(total));
                     break;

                  case "Chinese Yuan":
                     total = amount *0.085;
                     convert1.setText(String.valueOf(total));
                     break;
               }

            }



         } else if (ae.getSource() == clear) {
            inter_amount.setText("");
            convert1.setText("");
         }


      }
      catch (Exception e){
         System.out.print(e);
      }

   }



   public static void main(String args[]){
      new currency_converter();
   }
}
