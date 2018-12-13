/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansh_gui;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import user_view.save;


/**
 *
 * @author ninsadmin
 */
public class project_data_viewer extends javax.swing.JFrame {

    Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;
ResultSetMetaData rsmd = null;
int rows,col,h,w;

String loneString,nm;
String[] cname;
Object[][] data = {
{null, null, null },
{null,null,null }};
JCheckBox[] cb;


    /**
     * Creates new form project_data_viewer
     */
    public project_data_viewer() {
     con= Connect.ConnectDB();
       initComponents(); 
       lab1.hide();
       lab2.hide();
        jtable.hide();
      String mode = (String) type.getSelectedItem();
//        if("--".equals(mode))
//      {
//          ptable.setEnabled(false);
//      }
//        else
//        {
//            ptable.setEnabled(true);
//        }
      if("--".equals(etc.getSelectedItem()))
      {
          crbox1.hide();
          operator1.hide();
          criteria1.hide();
      }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ptable = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        itemall = new javax.swing.JCheckBox();
        panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        columnlist = new javax.swing.JList<String>();
        jLabel3 = new javax.swing.JLabel();
        crbox = new javax.swing.JComboBox<String>();
        operator = new javax.swing.JComboBox<String>();
        criteria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        type = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        etc = new javax.swing.JComboBox();
        export = new javax.swing.JButton();
        crbox1 = new javax.swing.JComboBox<String>();
        operator1 = new javax.swing.JComboBox<String>();
        criteria1 = new javax.swing.JTextField();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Project Viewer");

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enter", "Items", "to", "Display"
            }
        ));
        jtable.setMaximumSize(new java.awt.Dimension(10000000, 20064));
        jScrollPane1.setViewportView(jtable);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Name");

        ptable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        ptable.setEnabled(false);
        ptable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptableActionPerformed(evt);
            }
        });

        jLabel2.setText("Components");

        itemall.setText("All");

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, itemall, org.jdesktop.beansbinding.ELProperty.create("${!selected}"), columnlist, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(columnlist);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setText("Criteria Selector");

        crbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        crbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crboxActionPerformed(evt);
            }
        });

        operator.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=", "LIKE", "NOT LIKE", "!=", ">", "<", "BETWEEN", "NOT BETWEEN", "IS NULL", "IS NOT NULL" }));
        operator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorActionPerformed(evt);
            }
        });

        jButton1.setText("Go");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Advanced");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Project", "Paper", "Project(OnGoing)" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jLabel4.setText("Type");

        etc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "AND", "OR" }));
        etc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etcActionPerformed(evt);
            }
        });

        export.setText("Export");
        export.setEnabled(false);
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        crbox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));

        operator1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=", "LIKE", "NOT LIKE", "!=", ">", "<", "BETWEEN", "NOT BETWEEN", "IS NULL", "IS NOT NULL" }));
        operator1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator1ActionPerformed(evt);
            }
        });

        lab1.setText("No of Results:");

        lab2.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ptable, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(69, 69, 69))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemall))
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(crbox, 0, 169, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(operator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(criteria)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(crbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(operator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(criteria1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lab1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lab2)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itemall)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(operator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(export)
                            .addComponent(criteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(operator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(criteria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab1)
                            .addComponent(lab2)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ptableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptableActionPerformed
     
        try {
         nm=(String) ptable.getSelectedItem();
            String sql="select * from " +nm+ " ";
          //String  sql = "SELECT * FROM `?`WHERE 1";
         //   System.out.print(nm);
            con= Connect.ConnectDB();
            pst=con.prepareStatement(sql);
         //    pst.setString(1,nm);
            rs= pst.executeQuery();
            rsmd = rs.getMetaData();
            col =rsmd.getColumnCount();
            cname = new String[col];

        //    System.out.print(col);
  DefaultListModel model = new DefaultListModel();
  crbox.removeAllItems();
  crbox1.removeAllItems();
  crbox.addItem("--");
            for(int i=0;i<col;i++)
            {
                //System.out.print(i);

                
//


//System.out.println(rsmd.getColumnName(i+1));
String ItemList=rsmd.getColumnName(i+1);
model.addElement(ItemList);

crbox.addItem(ItemList);
crbox1.addItem(ItemList);
//cb[i]= new JCheckBox(cname[i]);
//cb[i].setText(cname[i]);
//panel.add(cb[i]);


//
            }


columnlist.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ptableActionPerformed
String sub_query()
{
          List<Object> items = new ArrayList<>(col);
String[] qstring;
    String finq = null,name,param = null;
    if(itemall.isSelected())
    {
        finq="*";
    }
    else
    {
    int[] indices = columnlist.getSelectedIndices();
qstring =  columnlist.getSelectedValuesList().toArray(new String[indices.length]);
//System.out.print( columnlist.getSelectedValuesList());  
param = String.join(",",qstring);   
//System.out.print(param);
finq = param;
name=(String) ptable.getSelectedItem();
    }
    return finq;
}
    String gen_query()
    {
        String substr = sub_query();
        String query,cond = "1";
        String cnd_tmp,crit = (String) crbox.getSelectedItem();
        if((String) operator.getSelectedItem()=="LIKE" || (String) operator.getSelectedItem()=="NOT LIKE")
        {
        cnd_tmp = "%" +criteria.getSelectedText()+"%";    
        }
        
        String op = (String) operator.getSelectedItem();
        String comp = "'"+criteria.getText()+"'";
     if(!"--".equals((String)crbox.getSelectedItem()))
             {
             cond = crit +" "+(String) operator.getSelectedItem()+" "+comp;
             System.out.print(cond);
         if( !"--".equals((String)etc.getSelectedItem()))
            switch ((String)etc.getSelectedItem()) {
                case "AND":
                    cond =  crit + " "+ op + " " +comp+ " AND " + (String) crbox1.getSelectedItem()+ " " +  (String) operator1.getSelectedItem() + " " +  "'"+criteria1.getText()+"'";
                    break;
                case "OR":
                    cond =  crit + " "+ op + " " +comp+ " OR " + (String) crbox1.getSelectedItem()+ " " +  (String) operator1.getSelectedItem() + " " +  "'"+criteria1.getText()+"'";
                    break;
                case "--":
                    cond = "1";
                    break;
            }
         query = "SELECT " + substr + " FROM `" + (String)ptable.getSelectedItem()+"` WHERE " +cond;
        }
     else
     { query = "SELECT " + substr + " FROM `" + (String)ptable.getSelectedItem()+"` WHERE  1"; }
        return query;
        
    }
    private void operatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operatorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String tmp = gen_query();
        project_adv_win cl = new project_adv_win(tmp);
        cl.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
   String mode = (String) type.getSelectedItem();
      List<Object> items = new ArrayList<>(100);
      Object[] test;
      items.clear();
      int rnum = 0;
      if("Project".equals(mode))
       {
                try {
                    ptable.setEnabled(true);
                    String sql = "SELECT COUNT(*)  FROM  Project";
                    pst = con.prepareStatement(sql);
                    rs=pst.executeQuery(); 
                    if(rs.next())
                    {        rnum=rs.getInt(1);    }
                 
                    String sqlp = "SELECT Name FROM Project";
                    pst = con.prepareStatement(sqlp);
          //pst.setString(1,uname );
                     rs=pst.executeQuery(); 
                     while(rs.next())
                         {
                             items.add(rs.getString(1));
                             test= items.toArray(new String[rnum]);
                             DefaultComboBoxModel model = new DefaultComboBoxModel(test);
                             ptable.setModel(model);
                         }
                } 
                catch (SQLException ex) {
                        Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
      else if("Paper".equals(mode))
        {
         try {
              ptable.setEnabled(true);
          
              String sql = "SELECT COUNT(*)  FROM  Paper";
              pst = con.prepareStatement(sql);
              rs=pst.executeQuery(); 
              if(rs.next())
              {        rnum=rs.getInt(1);    }
              String sqlp = "SELECT Name FROM Paper";
              pst = con.prepareStatement(sqlp);
   
        //pst.setString(1,uname );
             rs=pst.executeQuery(); 
            while(rs.next())
            {
                 items.add(rs.getString(1));
                test= items.toArray(new String[rnum]);
         //   System.out.print(rs.getString(1));
                DefaultComboBoxModel model = new DefaultComboBoxModel(test);
                ptable.setModel(model);
            }

                } catch (SQLException ex) {
                    Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
                }
                   }
       else if("Project(OnGoing)".equals(mode))
        {
         try {
              ptable.setEnabled(true);
          
              String sql = "SELECT COUNT(*) FROM `Project(OnGoing)` ";
              pst = con.prepareStatement(sql);
              rs=pst.executeQuery(); 
              if(rs.next())
              {        rnum=rs.getInt(1);    }
              String sqlp = "SELECT Name FROM `Project(OnGoing)`";
              pst = con.prepareStatement(sqlp);
   
        //pst.setString(1,uname );
             rs=pst.executeQuery(); 
            while(rs.next())
            {
                 items.add(rs.getString(1));
                test= items.toArray(new String[rnum]);
         //   System.out.print(rs.getString(1));
                DefaultComboBoxModel model = new DefaultComboBoxModel(test);
                ptable.setModel(model);
            }

                } catch (SQLException ex) {
                    Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
                }
                   }
 else
        {
            ptable.setEnabled(false);
        }

    }//GEN-LAST:event_typeActionPerformed
    public void qprocess()
    {
            try {
            h=this.getHeight();
            w=this.getWidth();
Dimension d = new Dimension();
d.setSize(w, h);
jtable.setVisible(true);
jtable.setPreferredScrollableViewportSize(d);
            con= Connect.ConnectDB();
        
             String sql= gen_query();
             System.out.println(sql);
             
             pst=con.prepareStatement(sql);
             rs= pst.executeQuery();
             rsmd = rs.getMetaData();
             col =rsmd.getColumnCount();
             cname = new String[col];
             boolean b = rs.last();
             rows = rs.getRow();
             rs.beforeFirst();
            
           System.out.println(rows);
             
             
             for(int i=0;i<col;i++)
             {
               //  System.out.println(rsmd.getColumnName(i+1));
                 cname[i]=rsmd.getColumnName(i+1);
                 
             }
             lab1.setVisible(true);
             lab2.setVisible(true);
            lab2.setText(Integer.toString(rows));
                model = new DefaultTableModel();
        model= (DefaultTableModel) DbUtils.resultSetToTableModel(rs);
       //     table = new JTable(data,cname);
   
            
                    jtable.setModel(model);
 TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        jtable.setRowSorter(sorter);
         } catch (SQLException ex) {
             String n = ex.toString();
             n=n.substring(n.lastIndexOf(":")+1);
             
             
             JOptionPane.showMessageDialog(null, n, "ANSH", INFORMATION_MESSAGE);
         }

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
qprocess();
 

export.setEnabled(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
    save frm = new save(jtable);
  frm.setVisible(true);
    }//GEN-LAST:event_exportActionPerformed

    private void operator1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operator1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operator1ActionPerformed

    private void etcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etcActionPerformed
          if(etc.getSelectedItem()=="AND")
          {
              crbox1.setVisible(true);
              operator1.show();
              criteria1.show();
          }
          else if(etc.getSelectedItem()=="OR")
          {
              crbox1.setVisible(true);
              operator1.show();
              criteria1.show();
          }
          else
          {
              crbox1.hide();
              operator1.hide();
              criteria1.hide();
          }
    }//GEN-LAST:event_etcActionPerformed

    private void crboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crboxActionPerformed

    
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
            java.util.logging.Logger.getLogger(project_data_viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project_data_viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project_data_viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project_data_viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project_data_viewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> columnlist;
    private javax.swing.JComboBox<String> crbox;
    private javax.swing.JComboBox<String> crbox1;
    private javax.swing.JTextField criteria;
    private javax.swing.JTextField criteria1;
    private javax.swing.JComboBox etc;
    private javax.swing.JButton export;
    private javax.swing.JCheckBox itemall;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtable;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JComboBox<String> operator;
    private javax.swing.JComboBox<String> operator1;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> ptable;
    private javax.swing.JComboBox type;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
  private DefaultTableModel model;
}
