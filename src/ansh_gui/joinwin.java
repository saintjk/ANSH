/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansh_gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author ninslab
 */
public class joinwin extends javax.swing.JFrame {
  Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;
ResultSetMetaData rsmd = null;
String curntString,nm;
int rows,col,h,w;
String[] cname;
    /**
     * Creates new form joinwin
     */
    public joinwin() {
        initComponents();
             con= Connect.ConnectDB();
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

        joingrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        typ1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        clist1 = new javax.swing.JList();
        pname1 = new javax.swing.JComboBox();
        crit1 = new javax.swing.JComboBox();
        all1 = new javax.swing.JCheckBox();
        inter = new javax.swing.JRadioButton();
        uni = new javax.swing.JRadioButton();
        lj = new javax.swing.JRadioButton();
        rj = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        typ3 = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        clist3 = new javax.swing.JList();
        pname3 = new javax.swing.JComboBox();
        crit3 = new javax.swing.JComboBox();
        all2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Table 1");

        jLabel2.setText("Table 2");

        typ1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Project", "Paper", "Project(OnGoing)" }));
        typ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typ1ActionPerformed(evt);
            }
        });

        clist1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "--" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, all1, org.jdesktop.beansbinding.ELProperty.create("${!selected}"), clist1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(clist1);

        pname1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        pname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pname1ActionPerformed(evt);
            }
        });

        crit1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));

        all1.setText("All");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(all1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(crit1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typ1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pname1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(typ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(all1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        joingrp.add(inter);
        inter.setText("Intersection");

        joingrp.add(uni);
        uni.setText("Union");

        joingrp.add(lj);
        lj.setText("Left Join");

        joingrp.add(rj);
        rj.setText("Right Join");

        jButton1.setText("JOIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Type");

        typ3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Project", "Paper", "Project(OnGoing)" }));
        typ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typ3ActionPerformed(evt);
            }
        });

        clist3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "--" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, all2, org.jdesktop.beansbinding.ELProperty.create("${!selected}"), clist3, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(clist3);

        pname3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        pname3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pname3ActionPerformed(evt);
            }
        });

        crit3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));

        all2.setText("All");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(all2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(pname3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(typ3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(crit3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(typ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(all2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setText("Name");

        jLabel5.setText("Columns");

        jLabel6.setText("Criteria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(inter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(uni)
                        .addGap(77, 77, 77)
                        .addComponent(lj)
                        .addGap(47, 47, 47)
                        .addComponent(rj))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(jLabel1)
                            .addGap(175, 175, 175)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inter)
                    .addComponent(uni)
                    .addComponent(lj)
                    .addComponent(rj))
                .addGap(90, 90, 90))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void typ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typ1ActionPerformed
      String mode = (String) typ1.getSelectedItem();
      List<Object> items = new ArrayList<>(100);
      Object[] test;
      items.clear();
      int rnum = 0;
      if("Project".equals(mode))
       {
                try {
                    pname1.setEnabled(true);
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
                             pname1.setModel(model);
                         }
                } 
                catch (SQLException ex) {
                        Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
      else if("Paper".equals(mode))
        {
         try {
              pname1.setEnabled(true);
          
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
                pname1.setModel(model);
            }

                } catch (SQLException ex) {
                    Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
                }
                   }
        else if("Project(OnGoing)".equals(mode))
        {
         try {
              pname1.setEnabled(true);
          
              String sql = "SELECT COUNT(*)  FROM  `Project(OnGoing)`";
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
                pname1.setModel(model);
            }

                } catch (SQLException ex) {
                    Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
                }
                   }
 else
        {
            pname1.setEnabled(false);
        }
    }//GEN-LAST:event_typ1ActionPerformed
public String[] prepend(String[] input, String prepend) {
   String[] output = new String[input.length];
   for (int index = 0; index < input.length; index++) {
      output[index] = "" + prepend + input[index];
   }
   return output;
}
    String sub_query(String name)
{
          List<Object> items = new ArrayList<>(col);
String[] qstring = null;
    int[] indices;
String finq = null,param = null;
  String tabname = name + ".";
if(name==curntString)
{    indices = clist1.getSelectedIndices();
qstring =  (String[]) clist1.getSelectedValuesList().toArray(new String[indices.length]);
}
else
{
     indices = clist3.getSelectedIndices();
qstring =  (String[]) clist3.getSelectedValuesList().toArray(new String[indices.length]);
}
qstring = prepend(qstring,tabname);
//System.out.print( columnlist.getSelectedValuesList());  
param = String.join(",",qstring);   
//System.out.print(param);
finq = param;

    
    return finq;
}
  String substr()
  {
         String substring1 = sub_query((String) pname1.getSelectedItem());
      String substring2 = sub_query((String) pname3.getSelectedItem());
      String Sub=null;
       if(all1.isSelected())
    {
        substring1=(String) pname1.getSelectedItem()+".*";
         Sub=substring1+","+substring2;
    }
      if(all2.isSelected())
       {
            substring2=(String) pname3.getSelectedItem()+".*";
            Sub=substring1+","+substring2;
       }
    
     if(!all2.isSelected()&&!all1.isSelected())
       {
           Sub=substring1+","+substring2;
       }
      // Sub=substring1+","+substring2;
      return Sub;
      
      
  }
  String gen_query()
  {
      String joinop = null;
      

      if(inter.isSelected())
      {
             joinop = "INNER JOIN";
      }
      else  if(uni.isSelected())
      {
             joinop = "OUTER JOIN";
      }
       else  if(lj.isSelected())
      {
             joinop = "LEFT JOIN";
      }
      
       else  if(rj.isSelected())
      {
             joinop = "RIGHT JOIN";
      }
      
     
            String items = substr();
            String sql1 = "SELECT "+items+" FROM "+(String)pname1.getSelectedItem()+" "+joinop+" "+(String)pname3.getSelectedItem()+" ON " ;
      String sql2 = (String)pname1.getSelectedItem()+"."+crit1.getSelectedItem()+" = "+(String)pname3.getSelectedItem()+"."+crit3.getSelectedItem();
String sql = sql1+sql2;
      return sql;
      
  }
    
    private void typ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typ3ActionPerformed
         String mode = (String) typ3.getSelectedItem();
      List<Object> items = new ArrayList<>(100);
      Object[] test;
      items.clear();
      int rnum = 0;
      if("Project".equals(mode))
       {
                try {
                    pname3.setEnabled(true);
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
                             pname3.setModel(model);
                         }
                } 
                catch (SQLException ex) {
                        Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
      else if("Paper".equals(mode))
        {
         try {
              pname3.setEnabled(true);
          
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
                pname3.setModel(model);
            }

                } catch (SQLException ex) {
                    Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
                }
                   }
       else if("Project(OnGoing)".equals(mode))
        {
         try {
              pname3.setEnabled(true);
          
              String sql = "SELECT COUNT(*)  FROM  Project(OnGoing)";
              pst = con.prepareStatement(sql);
              rs=pst.executeQuery(); 
              if(rs.next())
              {        rnum=rs.getInt(1);    }
              String sqlp = "SELECT Name FROM Project(OnGoing)";
              pst = con.prepareStatement(sqlp);
   
        //pst.setString(1,uname );
             rs=pst.executeQuery(); 
            while(rs.next())
            {
                 items.add(rs.getString(1));
                test= items.toArray(new String[rnum]);
         //   System.out.print(rs.getString(1));
                DefaultComboBoxModel model = new DefaultComboBoxModel(test);
                pname3.setModel(model);
            }

                } catch (SQLException ex) {
                    Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
                }
                   }
 else
        {
            pname3.setEnabled(false);
        }
    }//GEN-LAST:event_typ3ActionPerformed

    private void pname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pname1ActionPerformed
curntString = (String) pname1.getSelectedItem();
        try {
         nm=(String) pname1.getSelectedItem();
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
  crit1.removeAllItems();
  crit1.addItem("--");
            for(int i=0;i<col;i++)
            {
                //System.out.print(i);

                
//


//System.out.println(rsmd.getColumnName(i+1));
String ItemList=rsmd.getColumnName(i+1);
model.addElement(ItemList);

crit1.addItem(ItemList);
//cb[i]= new JCheckBox(cname[i]);
//cb[i].setText(cname[i]);
//panel.add(cb[i]);


//
            }


clist1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pname1ActionPerformed

    private void pname3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pname3ActionPerformed
        
        try {
         nm=(String) pname3.getSelectedItem();
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
  crit3.removeAllItems();
  crit3.addItem("--");
            for(int i=0;i<col;i++)
            {
                //System.out.print(i);

                
//


//System.out.println(rsmd.getColumnName(i+1));
String ItemList=rsmd.getColumnName(i+1);
model.addElement(ItemList);

crit3.addItem(ItemList);
//cb[i]= new JCheckBox(cname[i]);
//cb[i].setText(cname[i]);
//panel.add(cb[i]);


//
            }


clist3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(project_data_viewer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pname3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String tmp = gen_query();
        project_adv_win.qbox.setText(tmp);
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
            java.util.logging.Logger.getLogger(joinwin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(joinwin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(joinwin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(joinwin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new joinwin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox all1;
    private javax.swing.JCheckBox all2;
    private javax.swing.JList clist1;
    private javax.swing.JList clist3;
    private javax.swing.JComboBox crit1;
    private javax.swing.JComboBox crit3;
    private javax.swing.JRadioButton inter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.ButtonGroup joingrp;
    private javax.swing.JRadioButton lj;
    private javax.swing.JComboBox pname1;
    private javax.swing.JComboBox pname3;
    private javax.swing.JRadioButton rj;
    private javax.swing.JComboBox typ1;
    private javax.swing.JComboBox typ3;
    private javax.swing.JRadioButton uni;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
