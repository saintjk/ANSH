/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansh_gui;

/**
 *
 * @author ninslab
 */
public class Disclaimer extends javax.swing.JFrame {

    /**
     * Creates new form Disclaimer
     */
    public Disclaimer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jButton1 = new javax.swing.JButton();
        accept = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Disclaimer");

        jButton1.setText("Decline");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        accept.setText("Accept");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Accept");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, accept, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jRadioButton1, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ansh_gui/Ansh_Login.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 24)); // NOI18N
        jLabel2.setText("A Dynamic Comprehensive Database Management System ");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed maximus dapibus leo eu consequat. Maecenas rutrum accumsan ligula, \nvel accumsan orci condimentum ac. Integer eget nisl nunc. Maecenas dapibus lacus quis nunc feugiat convallis. Nulla rhoncus metus\nsed mi aliquam interdum. Etiam semper odio sed velit convallis, vitae facilisis magna varius. Cras mattis nibh sit amet magna dignissim\neuismod. Suspendisse potenti. Pellentesque a est eget nisi lacinia sagittis vitae dapibus turpis. Etiam pulvinar, nisl sed tincidunt blandit,\n quam ante elementum turpis, nec aliquam tellus neque et tellus.\n\nNullam eget justo nec arcu ultricies eleifend vitae eu sapien. Proin eget feugiat mauris. Praesent vestibulum quam ac arcu bibendum ultricies.\nAenean id vehicula lacus. In dolor urna, molestie id nisi sit amet, pharetra rutrum urna. Curabitur malesuada quam a ante ultrices eleifend. \nDonec vitae mi eget arcu varius tempus. Nam varius volutpat felis, sit amet iaculis sem condimentum vel. Vestibulum tristique lectus id \neros congue gravida. Sed non iaculis purus, at malesuada tellus. Vestibulum dictum posuere semper. Aenean ornare consectetur iaculis.\nEtiam ut ultricies quam. Donec nulla leo, bibendum at purus in, euismod vulputate lorem.\n\nDuis ante urna, laoreet ut rhoncus finibus, interdum quis sapien. Etiam tempor elementum massa, ut feugiat orci aliquet et.\nAenean a luctus nisi. Aliquam gravida egestas sem, at venenatis nunc. Cras sollicitudin lectus in velit imperdiet, id ornare sapien\nullamcorper. Sed laoreet ipsum faucibus velit pharetra commodo. Praesent consequat odio sed porta sagittis. \n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed maximus dapibus leo eu consequat. Maecenas rutrum accumsan ligula, \nvel accumsan orci condimentum ac. Integer eget nisl nunc. Maecenas dapibus lacus quis nunc feugiat convallis. Nulla rhoncus metus\nsed mi aliquam interdum. Etiam semper odio sed velit convallis, vitae facilisis magna varius. Cras mattis nibh sit amet magna dignissim\neuismod. Suspendisse potenti. Pellentesque a est eget nisi lacinia sagittis vitae dapibus turpis. Etiam pulvinar, nisl sed tincidunt blandit,\n quam ante elementum turpis, nec aliquam tellus neque et tellus.\n\nNullam eget justo nec arcu ultricies eleifend vitae eu sapien. Proin eget feugiat mauris. Praesent vestibulum quam ac arcu bibendum ultricies.\nAenean id vehicula lacus. In dolor urna, molestie id nisi sit amet, pharetra rutrum urna. Curabitur malesuada quam a ante ultrices eleifend. \nDonec vitae mi eget arcu varius tempus. Nam varius volutpat felis, sit amet iaculis sem condimentum vel. Vestibulum tristique lectus id \neros congue gravida. Sed non iaculis purus, at malesuada tellus. Vestibulum dictum posuere semper. Aenean ornare consectetur iaculis.\nEtiam ut ultricies quam. Donec nulla leo, bibendum at purus in, euismod vulputate lorem.\n\nDuis ante urna, laoreet ut rhoncus finibus, interdum quis sapien. Etiam tempor elementum massa, ut feugiat orci aliquet et.\nAenean a luctus nisi. Aliquam gravida egestas sem, at venenatis nunc. Cras sollicitudin lectus in velit imperdiet, id ornare sapien\nullamcorper. Sed laoreet ipsum faucibus velit pharetra commodo. Praesent consequat odio sed porta sagittis. \n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed maximus dapibus leo eu consequat. Maecenas rutrum accumsan ligula, \nvel accumsan orci condimentum ac. Integer eget nisl nunc. Maecenas dapibus lacus quis nunc feugiat convallis. Nulla rhoncus metus\nsed mi aliquam interdum. Etiam semper odio sed velit convallis, vitae facilisis magna varius. Cras mattis nibh sit amet magna dignissim\neuismod. Suspendisse potenti. Pellentesque a est eget nisi lacinia sagittis vitae dapibus turpis. Etiam pulvinar, nisl sed tincidunt blandit,\n quam ante elementum turpis, nec aliquam tellus neque et tellus.\n\nNullam eget justo nec arcu ultricies eleifend vitae eu sapien. Proin eget feugiat mauris. Praesent vestibulum quam ac arcu bibendum ultricies.\nAenean id vehicula lacus. In dolor urna, molestie id nisi sit amet, pharetra rutrum urna. Curabitur malesuada quam a ante ultrices eleifend. \nDonec vitae mi eget arcu varius tempus. Nam varius volutpat felis, sit amet iaculis sem condimentum vel. Vestibulum tristique lectus id \neros congue gravida. Sed non iaculis purus, at malesuada tellus. Vestibulum dictum posuere semper. Aenean ornare consectetur iaculis.\nEtiam ut ultricies quam. Donec nulla leo, bibendum at purus in, euismod vulputate lorem.\n\nDuis ante urna, laoreet ut rhoncus finibus, interdum quis sapien. Etiam tempor elementum massa, ut feugiat orci aliquet et.\nAenean a luctus nisi. Aliquam gravida egestas sem, at venenatis nunc. Cras sollicitudin lectus in velit imperdiet, id ornare sapien\nullamcorper. Sed laoreet ipsum faucibus velit pharetra commodo. Praesent consequat odio sed porta sagittis. ");
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jRadioButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accept)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(accept))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
   Login knk=new Login();
knk.setVisible(true);

this.dispose();
    }//GEN-LAST:event_acceptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Disclaimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disclaimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disclaimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disclaimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disclaimer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
