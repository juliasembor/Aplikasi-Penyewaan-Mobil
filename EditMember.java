/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rentalkendaraan;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class EditMember extends javax.swing.JFrame {
    public Connection conn;
    public Statement cn;
        String user="root";
        String pswd ="";
        String host="localhost";
        String db="rentalkendaraan";
        String url="";
        private Connection Lconnection=null;


    public EditMember() {
        initComponents();
                    simpan2.setEnabled(false);
        try {

            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user + "&password="+ pswd;

            Lconnection=DriverManager.getConnection(url);
        }

        catch(ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan");
        }

        catch (SQLException e){
            System.out.println("koneksi gagal:" +
                 e.toString());
        }

    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telepon = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        simpan2 = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        kode = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cekkode = new javax.swing.JButton();
        tabelmember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        simpan2.setText("SIMPAN");
        simpan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan2ActionPerformed(evt);
            }
        });

        kembali.setText("KEMBALI KE MENU UTAMA");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simpan2)
                .addGap(73, 73, 73)
                .addComponent(kembali)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan2)
                    .addComponent(kembali))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        jLabel3.setText("ALAMAT");

        jLabel4.setText("TELEPON");

        jLabel1.setText("KODE");

        jLabel2.setText("NAMA");

        cekkode.setText("CEK KODE");
        cekkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekkodeActionPerformed(evt);
            }
        });

        tabelmember.setText("DATA MEMBER");
        tabelmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelmemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kode, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(nama)
                            .addComponent(alamat)
                            .addComponent(telepon))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(cekkode))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tabelmember)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cekkode)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabelmember))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cekkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekkodeActionPerformed
        try {
            Statement st = (Statement) Lconnection.createStatement();
            ResultSet rs = st.executeQuery("Select * from datamember" +
                    " where kode='" + kode.getText() + "'");
            if (rs.next()) {
                simpan2.setEnabled(true);

                kode.setText(rs.getString("kode"));
                nama.setText(rs.getString("nama"));
                alamat.setText(rs.getString("alamat"));
                telepon.setText(rs.getString("telepon"));

            } else {
                JOptionPane.showMessageDialog(this,"Kode: Salah", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);

                simpan2.setEnabled(false);
            kode.setText("");
            nama.setText("");
            alamat.setText("");
            telepon.setText("");
                                        kode.requestFocus();
            }
        } catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());

        }
        // TODO add your handling code here:
}//GEN-LAST:event_cekkodeActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_alamatActionPerformed

    public void koneksi(){
 
try{
 
Class.forName("com.mysql.jdbc.Driver");
 
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalkendaraan","root","");
 
cn = conn.createStatement();
 
}catch (Exception e){
 
JOptionPane.showMessageDialog(this,"koneksi gagal..",
 
"Error",JOptionPane.ERROR_MESSAGE);
 
System.out.println(e.getMessage());
 
}
 
}
    
    private void simpan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan2ActionPerformed
 try{
 
koneksi();
 
String sql = "update datamember set kode='"+ kode.getText() +"',"+" nama='" + nama.getText() + "'"
        + ","+" alamat ='" +alamat.getText() +"'"
        + ","+" telepon ='" +telepon.getText() +"'"
        + "" +"where kode='" + kode.getText() + "'";
 
cn.executeUpdate(sql);

 
JOptionPane.showMessageDialog(null,"Data berhasil di rubah");
 
}catch (Exception e){
 
JOptionPane.showMessageDialog(null,"Proses update gagal/koneksi gagal..");
 
System.out.println(e.getMessage());
 
}

        // TODO add your handling code here:
    }//GEN-LAST:event_simpan2ActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        AplikasiRentalKendaraan tambah2 = new AplikasiRentalKendaraan();
        tambah2.setVisible(true);
        dispose();
        tambah2.tampilTabel2();
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliActionPerformed

    private void tabelmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelmemberActionPerformed
        // TODO add your handling code here:
        ShowMember show = new ShowMember();
        show.setVisible(true);
    }//GEN-LAST:event_tabelmemberActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton cekkode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JButton simpan2;
    private javax.swing.JButton tabelmember;
    private javax.swing.JTextField telepon;
    // End of variables declaration//GEN-END:variables

}
