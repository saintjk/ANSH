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

import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
public class export_pdf {
    private static String FILE = "FirstPdf.pdf";
    String path,filename;
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 5,
            Font.BOLD);
    private static Font small = new Font(Font.FontFamily.TIMES_ROMAN, 5,
            Font.NORMAL);
    public static final String IMAGE = "Ansh_Login.png";
    public export_pdf(JTable mt,String pt) throws FileNotFoundException, BadElementException, IOException
    {
        export_table(mt,pt);
      
    }
    
    private static void addMetaData(Document document,String filename) {
        document.addTitle(filename);
        
        document.addSubject(filename+" | ANSH");
             document.addCreator("JK");
    }
    
    

 public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();

//            addMetaData(document);
       //     addTitlePage(document);
       //     addContent(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
 public void export_table(JTable table,String path) throws FileNotFoundException, BadElementException, IOException
 {
         try {
            Document doc = new Document();
      //  System.out.print(path);
            PdfWriter.getInstance(doc, new FileOutputStream(path));
            doc.open();
            Image img = Image.getInstance(IMAGE);
            img.scalePercent(40);
            img.setAlignment(Element.ALIGN_CENTER);
            doc.add(img);
           filename = path.substring(path.lastIndexOf("/") + 1);
           filename = filename.substring(0, filename.length() - 4);
                 addMetaData(doc,filename);
           
            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            //adding table headers
            for (int i = 0; i < table.getColumnCount(); i++) {
             PdfPCell c1 = new PdfPCell(new Phrase(table.getColumnName(i),subFont));
            
             c1.setHorizontalAlignment(Element.ALIGN_CENTER);  
             pdfTable.addCell(c1);
            }
            //extracting data from the JTable and inserting it to PdfPTable
        //    System.out.print(table.getRowCount());
            for (int rows = 0; rows < table.getRowCount(); rows++) {
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                      PdfPCell c2 = new PdfPCell(new Phrase(table.getModel().getValueAt(rows, cols).toString(),small));
                        c2.setHorizontalAlignment(Element.ALIGN_CENTER);  
                       
                        c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    pdfTable.addCell(c2);

                }
            }
            doc.add(pdfTable);
            doc.close();
         //   System.out.println("done");
        } catch (DocumentException ex) {
            Logger.getLogger(export_pdf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(export_pdf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 

     private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
     }
}

