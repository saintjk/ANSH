/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.TreeMap;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author lab
 */
public class write2xl {
        JTable master_table;
        String path;
     
  public  write2xl(JTable mt,String p) throws FileNotFoundException, IOException
 {
     master_table = mt;
     path=p;
   //wrfun();
 }
      public String getCellVal(int x,int y)
 {
     return master_table.getValueAt(x,y).toString();
 }
 private Object[] appendValue(Object[] obj, Object newObj) {

	ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(obj));
	temp.add(newObj);
	return temp.toArray();

  }

      
  public void wrfun() throws FileNotFoundException, IOException
  {
        
       XSSFWorkbook wb = new XSSFWorkbook();
     XSSFSheet ws = wb.createSheet();
   
     TreeMap<String,Object[]> data = new TreeMap<>();
     int cnum=master_table.getColumnCount();
    Object[] cname = new String[cnum];

      List<Object> items = new ArrayList<>(cnum);
       for(int j=0;j<cnum;j++)
       {
           cname[j] = master_table.getColumnName(j);
           data.put("0", cname);
       }
       //   System.out.print(cname);
           int rnum =master_table.getRowCount();
        for(int i=0;i<rnum;i++)
        {
            String sn = Integer.toString(i+1);
              items.clear();
               for(int j=0;j<cnum;j++)
       {

                 items.add(getCellVal(i,j));
                      
       }
    //           System.out.print(items);  
  Object[] ritem = items.toArray(new String[cnum]);
       //       System.out.print( items+"\n");
data.put(sn, ritem);
           
        }
     
     // data.put("2", new Object[] {getCellVal(1,0),getCellVal(1,1),getCellVal(1,2),getCellVal(1,3),getCellVal(1,4),getCellVal(1,5),getCellVal(1,6),getCellVal(1,7),getCellVal(1,8) });
      //data.put("3", new Object[] {getCellVal(2,0),getCellVal(2,1),getCellVal(2,2),getCellVal(2,3),getCellVal(2,4),getCellVal(2,5),getCellVal(2,6),getCellVal(2,7),getCellVal(2,8) });
      Set<String> ids = data.keySet();
      XSSFRow row;
      int rowID=0;
    for (String key : ids) {
        row = ws.createRow(rowID++);
        Object[] values= data.get(key);
        int cellID=0;
        for(Object o: values)
        {
            XSSFCell cell = row.createCell(cellID++);
            cell.setCellValue(o.toString());

              
        }
    }

String extension = ".xls";
String pathn;
if (   path.contains(extension.toLowerCase()) ) {
  pathn=path;



} else {
pathn = path+extension;

}
    
      try (FileOutputStream fos = new FileOutputStream(new File(pathn))) {
    //try (FileOutputStream fos = new FileOutputStream(new File("/home/lab/My Stuffs/test_table.xlsx"))) {
        wb.write(fos);
        wb.close();
        
    }
  }
  
 
}
