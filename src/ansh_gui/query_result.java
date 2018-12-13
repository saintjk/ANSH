/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansh_gui;

import com.mysql.jdbc.StringUtils;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author lab
 */
public class query_result {
    
     public static void main(String[] args) throws SQLException {
        new query_result("GSH");
    }
    Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;
ResultSetMetaData rsmd = null;
int rows,col;
String[] cname;

Object[][] data = {
{null, null, null },
{null,null,null }};
    public query_result(String nm)
    {
         try {
             String sql="select * from " +nm+ " ";
             System.out.println(sql);
             con= Connect.ConnectDB();
             pst=con.prepareStatement(sql);
             rs= pst.executeQuery();
             rsmd = rs.getMetaData();
             col =rsmd.getColumnCount();
             
             cname = new String[col];
             
             System.out.println(col);
             
             
             for(int i=0;i<col;i++)
             {
                 System.out.println(rsmd.getColumnName(i+1));
                 cname[i]=rsmd.getColumnName(i+1);
                 
             }
             EventQueue.invokeLater(new Runnable() {
                 @Override
                 public void run() {
                     try {
                         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                     } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                         ex.printStackTrace();
                     }
                     
                     JFrame frame = new JFrame("Testing");
                     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                     frame.setExtendedState(frame.getExtendedState()|JFrame.MAXIMIZED_BOTH);
                     frame.add(new query_result.TestPane());
                     frame.pack();
                     frame.setLocationRelativeTo(null);
                     frame.setVisible(true);
                 }
             });
         } catch (SQLException ex) {
             String n = ex.toString();
             n=n.substring(n.lastIndexOf(":")+1);
             
             
             JOptionPane.showMessageDialog(null, n, "ANSH", INFORMATION_MESSAGE);
         }
    
    }
    
      public class TestPane extends JPanel {

        private JTable table;
        private DefaultTableModel model;
      

        public TestPane() {

            setLayout(new BorderLayout());

         

            JPanel options = new JPanel(new GridBagLayout());
           

            JButton update = new JButton("Update");
            options.add(update);

            update.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    

                    // Dynamic master model...
//                  model.setRowCount(rows);
//                  model.setColumnCount(cols);

                    // Replace model
                 
                    table.setModel(new DefaultTableModel(rows, col));
                    
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }
            });

            model = new DefaultTableModel();
         
            table = new JTable(data,cname);
            add(new JScrollPane(table));
            add(options, BorderLayout.NORTH);

        }

    }
}
