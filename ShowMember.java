/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rentalkendaraan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;

/**
 *
 * @author 
 */
public class ShowMember extends javax.swing.JFrame {

    public ShowMember() {
        initComponents();
        tampilTabel2();
        dispose();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        menuutama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuutama.setText("KEMBALI");
        menuutama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuutamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(menuutama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuutama)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuutamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuutamaActionPerformed
    dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_menuutamaActionPerformed
 private Object[][] getData2(){

        String user="root";
        String pswd ="";
        String host="localhost";
        String db="rentalkendaraan";
        String url="";

        Object[][] data1= null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user + "&password="+ pswd;
            Connection conn=DriverManager.getConnection(url);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM datamember ORDER BY kode");

            rs.last();
            int rowCount= rs.getRow();
            rs.beforeFirst();

            data1= new Object[rowCount][11];
            int no=-1;
            while (rs.next()) {
                no=no+1;
                data1[no][0]=rs.getString("kode");
                data1[no][1]=rs.getString("nama");
                data1[no][2]=rs.getString("alamat");
                data1[no][3]=rs.getString("telepon");
            }

          st.close();
          conn.close();

       }

       catch(ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
       }

       catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
       }
        return data1;
    }
public void tampilTabel2() {
        String[] columnNames = {"KODE","NAMA","ALAMAT", "TELEPON"};
        JTable table2 = new JTable(getData2(), columnNames);
        jScrollPane1.setViewportView(table2);

}

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuutama;
    // End of variables declaration//GEN-END:variables

}