package ansh_gui;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class addremove extends javax.swing.JFrame{
    private javax.swing.JComboBox[] combo1; //array of JComboBoxes
    private javax.swing.JComboBox[] combo2; //array of JComboBoxes
    private javax.swing.JTextField[] text1; //array of JTextFields
    private int count = -1; 
    private int max_row = 10;
    private int empty_count = 0;    
    public addremove() {
        initComponents(); // Netbeans defined function non-editable    
        setTitle("Adding and Removing Components Dynamically From a JPanel in Java");
        combo1_combo2_text1_array(); // declaring array for new row addition
    }

    private void combo1_combo2_text1_array(){
        combo1 = new JComboBox[10];
        combo2 = new JComboBox[10];
        text1 = new JTextField[10];        
    }
    
    private void addrowActionPerformed(java.awt.event.ActionEvent evt) {  // Add one row at a time                                     
        if(count == max_row-1){
            JOptionPane.showMessageDialog(null, "Maximum of 10 rows can be added","Failed!!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        count++;        
        combo1[count] = new javax.swing.JComboBox(); 
        for(int i=1;i<=5;i++){
            combo1[count].addItem("Item " + i);
        }       
        combo2[count] = new javax.swing.JComboBox(); 
        for(int i=1;i<=5;i++){
            combo2[count].addItem("Item " + i);
        }   
        text1[count] = new javax.swing.JTextField();        
        jPanel2.setLayout(new GridLayout(0,3,20,20));
        jPanel2.add(combo1[count]);
        jPanel2.add(combo2[count]);
        jPanel2.add(text1[count]);
        jPanel2.revalidate();
        jPanel2.repaint();
    }

    private void removerowActionPerformed(java.awt.event.ActionEvent evt) {   // Remove Row Action                                       
        if(count > -1){ // Deleting one row at a time
            jPanel2.remove(combo1[count]);
            jPanel2.remove(combo2[count]);
            jPanel2.remove(text1[count]);
            count--;
            jPanel2.revalidate();
            jPanel2.repaint();
        }
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {   // Cancel Button Action                                     
        System.exit(0);
    }

    private void resetActionPerformed(java.awt.event.ActionEvent evt) { //Reset Button Action                                     
        jTextField1.setText("");
        for(int i=count;i>-1;i--){
            jPanel2.remove(combo1[i]);
            jPanel2.remove(combo2[i]);
            jPanel2.remove(text1[i]);
            jPanel2.revalidate();
            jPanel2.repaint();
        }
        count = -1;
    }                                   

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(jTextField1.getText().length()==0)  // Submit button for the register form
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields","Failed!!",JOptionPane.ERROR_MESSAGE);      
        else if(count > -1){            
            for(int i=0;i<=count;i++){
                if(text1[count].getText().length()==0)  
                    empty_count++;                
            }
            if(empty_count > 0){
                JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields","Failed!!",JOptionPane.ERROR_MESSAGE); 
                empty_count = 0; // resetting the count
            }
            else
                JOptionPane.showMessageDialog(null, "No database connection for this application","Failed!!",JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "No database connection for this application","Failed!!",JOptionPane.ERROR_MESSAGE);        
    }
    
  private void initComponents() {

        addrow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        removerow = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addrow.setText("Add Row");

        jLabel1.setText("jLabel1");



        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        removerow.setText("Remove");

        cancel.setText("Cancel");

        reset.setText("Reset");

        submit.setText("Submit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submit)
                .addGap(18, 18, 18)
                .addComponent(reset)
                .addGap(18, 18, 18)
                .addComponent(cancel)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(submit)
                    .addComponent(cancel))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(addrow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerow)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addrow)
                            .addComponent(jLabel1)
                            .addComponent(removerow))
                        .addGap(18, 18, 18)
                       ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                           
                                      
    public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addremove().setVisible(true);
            }
        });
    }
     // Variables declaration - do not modify                     
    private javax.swing.JButton addrow;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;

    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton removerow;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    /*
        private javax.swing.JButton addrow;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton removerow;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    */
    // End of variables declaration             
  
      }
