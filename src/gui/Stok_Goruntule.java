/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ozkan
 */
public class Stok_Goruntule extends javax.swing.JFrame {

    /**
     * Creates new form Stok_Goruntule
     */
    public Stok_Goruntule() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ürün Kodu", "Stok"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText("Ara..");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setText("Ara");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Güncel Stok Durumu", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ürün Kodu", "Adet", "Tarih", "Olay"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jRadioButton1.setText("Stok Girişleri");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Stok Çıkışları");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Hepsi");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sıralama Ölçütü", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 12))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarih: Yeniden Eskiye", "Tarih: Eskiden Yeniye", "Stok Adedi:Artan", "Stok Adedi: Azalan", "Ürün Koduna Göre Artan", "Ürün Koduna Göre Azalan" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, 0, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        jTextField2.setText("Ara..");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel2.setText("Ara");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(49, 49, 49)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stok Hareketliliği", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void StokGuncelGoster(){
        DefaultTableModel stoktablo = (DefaultTableModel) jTable1.getModel();
        stoktablo.getDataVector().clear();
        stoktablo.setRowCount(0);
        List<codes.stok> stoklist = null;
        List<codes.urun> urunlist = null;
        try{
            urunlist = new codes.urun().UrunKoduHepsi();
        } catch (SQLException ex) {
            Logger.getLogger(Stok_Goruntule.class.getName()).log(Level.SEVERE, null, ex);
        }
        Vector[] v = new Vector[urunlist.size()];
        int giren = 0, cikan = 0;
        for(int i=0;i<urunlist.size();i++){
            v[i] = new Vector();
            v[i].add(urunlist.get(i).getUrun_kodu());
            try { 
                giren = new codes.stok().StokToplamGiris(urunlist.get(i).getUrun_kodu());
            } catch (SQLException ex) {
                Logger.getLogger(Stok_Goruntule.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                cikan = new codes.stok().StokToplamCikis(urunlist.get(i).getUrun_kodu());
            } catch (SQLException ex) {
                Logger.getLogger(Stok_Goruntule.class.getName()).log(Level.SEVERE, null, ex);
            }
            int toplam = giren-cikan;
            v[i].add(toplam);
            stoktablo.insertRow(i, v[i]);
        }
        jTable1.setModel(stoktablo);
        jTable1.repaint();
    }
    
    public void StokGirisCikisGoster(boolean eskiye){
        DefaultTableModel stoktablo = (DefaultTableModel) jTable2.getModel();
        stoktablo.getDataVector().clear();
        stoktablo.setRowCount(0);
        List<codes.stok> stoklist = null;
        List<codes.stok> stoklist2 = null;
        try {
            stoklist = new codes.stok().StokGirisTumu(eskiye);
        } catch (SQLException ex) {
            Logger.getLogger(Stok_Goruntule.class.getName()).log(Level.SEVERE, null, ex);
        }
        Vector[] v = new Vector[stoklist.size()];
        int i=0;
        while(i<stoklist.size()){
            v[i] = new Vector();
            v[i].add(stoklist.get(i).getUrun_kodu());
            v[i].add(stoklist.get(i).getAdet());
            String[] temp = stoklist.get(i).getTarih().split("-");
            String tarih = temp[2] +"/"+ temp[1] +"/"+ temp[0];
            v[i].add(tarih);
            v[i].add(stoklist.get(i).getOlay());
            stoktablo.insertRow(i, v[i]);
            i++;
        }
        i=0;
        jTable2.setModel(stoktablo);
        jTable2.repaint();
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        StokGuncelGoster();
        StokGirisCikisGoster(true);
    }//GEN-LAST:event_formComponentShown

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        if(!jTextField1.getText().equals("")){
        String metin = jTextField1.getText().trim();
        jTextField1.setText(metin.toUpperCase().trim());
        DefaultTableModel stoktablo = (DefaultTableModel) jTable1.getModel();
        for(int i=0;i<jTable1.getRowCount();i++){
            String deger = stoktablo.getValueAt(i, 0).toString();
            String deger2 = deger.substring(0, metin.length());
            if(!metin.equals(deger2)){
               stoktablo.removeRow(i);
            }
        }
        /*
        stoktablo.getDataVector().clear();
        stoktablo.setRowCount(0);
        List<codes.stok> stoklist = null;
        List<codes.urun> urunlist = null;
            try {
                urunlist = new codes.urun().UrunKoduAra(metin);
            } catch (SQLException ex) {
                Logger.getLogger(Stok_Goruntule.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        Vector[] v = new Vector[stoklist.size()];
        int giren=0, cikan=0;
        for(int n=0;n<stoklist.size();n++){
            v[n] = new Vector();
            v[n].add(urunlist.get(n).getUrun_kodu());
            
            try {
                giren = new codes.stok().StokToplamGiris(urunlist.get(n).getUrun_kodu());
            } catch (SQLException ex) {
                Logger.getLogger(Stok_Goruntule.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                cikan = new codes.stok().StokToplamCikis(urunlist.get(n).getUrun_kodu());
            } catch (SQLException ex) {
                Logger.getLogger(Stok_Goruntule.class.getName()).log(Level.SEVERE, null, ex);
            }
            int toplam = giren - cikan;
            v[n].add(toplam);
            stoktablo.insertRow(n, v[n]);
        }*/
        jTable1.setModel(stoktablo);
        jTable1.repaint();
        }else{
            StokGuncelGoster();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
       /* StokGirisCikisGoster(true);
        DefaultTableModel stoktablo = (DefaultTableModel) jTable2.getModel();
        for(int i=0;i<jTable2.getRowCount();i++){
            String olay = jTable2.getValueAt(i, 3).toString().trim();
            if(!olay.equals("GİRİŞ")){
                stoktablo.removeRow(i);
            }
        }
        jTable2.setModel(stoktablo);
        jTable2.repaint();*/
       
       
       DefaultTableModel stoktablo = (DefaultTableModel) jTable2.getModel();
        stoktablo.getDataVector().clear();
        stoktablo.setRowCount(0);
        List<codes.stok> stoklist = null;
        List<codes.stok> stoklist2 = null;
        try {
            stoklist = new codes.stok().StokGirisListele();
        } catch (SQLException ex) {
            Logger.getLogger(Stok_Goruntule.class.getName()).log(Level.SEVERE, null, ex);
        }
        Vector[] v = new Vector[stoklist.size()];
        int i=0;
        while(i<stoklist.size()){
            v[i] = new Vector();
            v[i].add(stoklist.get(i).getUrun_kodu());
            v[i].add(stoklist.get(i).getAdet());
            String[] temp = stoklist.get(i).getTarih().split("-");
            String tarih = temp[2] +"/"+ temp[1] +"/"+ temp[0];
            v[i].add(tarih);
            v[i].add(stoklist.get(i).getOlay());
            stoktablo.insertRow(i, v[i]);
            i++;
        }
        i=0;
        jTable2.setModel(stoktablo);
        jTable2.repaint();
       
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
       /*StokGirisCikisGoster(true);
          DefaultTableModel stoktablo = (DefaultTableModel) jTable2.getModel();
        for(int i=0;i<jTable2.getRowCount();i++){
            String olay = jTable2.getValueAt(i, 3).toString().trim();
            if(!olay.equals("ÇIKIŞ")){
                stoktablo.removeRow(i);
            }
        }
        jTable2.setModel(stoktablo);
        jTable2.repaint();*/
       DefaultTableModel stoktablo = (DefaultTableModel) jTable2.getModel();
        stoktablo.getDataVector().clear();
        stoktablo.setRowCount(0);
        List<codes.stok> stoklist = null;
        try {
            stoklist = new codes.stok().StokCikisListele();
        } catch (SQLException ex) {
            Logger.getLogger(Stok_Goruntule.class.getName()).log(Level.SEVERE, null, ex);
        }
        Vector[] v = new Vector[stoklist.size()];
        int i=0;
        while(i<stoklist.size()){
            v[i] = new Vector();
            v[i].add(stoklist.get(i).getUrun_kodu());
            v[i].add(stoklist.get(i).getAdet());
            String[] temp = stoklist.get(i).getTarih().split("-");
            String tarih = temp[2] +"/"+ temp[1] +"/"+ temp[0];
            v[i].add(tarih);
            v[i].add(stoklist.get(i).getOlay());
            stoktablo.insertRow(i, v[i]);
            i++;
        }
        i=0;
        jTable2.setModel(stoktablo);
        jTable2.repaint();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        StokGirisCikisGoster(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tablo = (DefaultTableModel) jTable2.getModel();
        JTable table = new JTable(tablo);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTable2.getModel());
         table.setRowSorter(sorter);
         if(jComboBox1.getSelectedIndex()==0){
            StokGirisCikisGoster(true);
         }
         else if(jComboBox1.getSelectedIndex()==1){
             StokGirisCikisGoster(false);
         }
         else if(jComboBox1.getSelectedIndex()==2){
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
         }
         else if(jComboBox1.getSelectedIndex()==3){
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(1, SortOrder.DESCENDING));
            sorter.setSortKeys(sortKeys);
         }
         else if(jComboBox1.getSelectedIndex()==4){
                List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
         }
         else{
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.DESCENDING));
            sorter.setSortKeys(sortKeys);
         }
        
        jTable2.setRowSorter(sorter);
        jTable2.repaint();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        DefaultTableModel defaultTable = (DefaultTableModel) jTable2.getModel();
        
        if(!jTextField2.getText().equals("")){
        String metin = jTextField2.getText();
        jTextField2.setText(metin.toUpperCase());
        DefaultTableModel stoktablo = (DefaultTableModel) jTable2.getModel();
        //stoktablo.setRowCount(0);
        for(int i=0;i<jTable2.getRowCount();i++){
            String deger = jTable2.getValueAt(i, 0).toString();
            String deger2 = deger.substring(0, metin.length());
            if(!metin.equals(deger2)){
               stoktablo.removeRow(i);
            }
        }
        jTable2.setModel(stoktablo);
        jTable2.repaint();
        }else{
             StokGirisCikisGoster(true);
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Stok_Goruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stok_Goruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stok_Goruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stok_Goruntule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stok_Goruntule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}