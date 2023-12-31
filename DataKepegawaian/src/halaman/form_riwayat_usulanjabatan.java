/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author alessandro
 */
public class form_riwayat_usulanjabatan extends javax.swing.JFrame {

    /**
     * Creates new form form_riwayat_usulanpangkat
     */
    DefaultTableModel tabel1 = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public form_riwayat_usulanjabatan() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width, screen.height);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int confirm = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar dari program?", "Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(form_riwayat_usulanjabatan.DISPOSE_ON_CLOSE);
                } else if (confirm == JOptionPane.NO_OPTION) {
                    setDefaultCloseOperation(form_riwayat_usulanjabatan.DO_NOTHING_ON_CLOSE);
                }
            }
        });

        initComponents();

        tampil_riwayat_usulanjabatan();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_riwayat_usulanjabatan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_riwayat_usulanjabatan = new javax.swing.JTable();
        btn_kembali = new javax.swing.JPanel();
        label_btn_kembali = new javax.swing.JLabel();
        btn_unduh = new javax.swing.JPanel();
        label_btn_unduh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));

        label_riwayat_usulanjabatan.setFont(new java.awt.Font("Karla", 1, 36)); // NOI18N
        label_riwayat_usulanjabatan.setForeground(new java.awt.Color(72, 60, 50));
        label_riwayat_usulanjabatan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_riwayat_usulanjabatan.setText("RIWAYAT USULAN JABATAN");

        tbl_riwayat_usulanjabatan.setFont(new java.awt.Font("Karla", 0, 18)); // NOI18N
        tbl_riwayat_usulanjabatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_riwayat_usulanjabatan);

        btn_kembali.setBackground(new java.awt.Color(72, 60, 50));
        btn_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_kembaliMouseClicked(evt);
            }
        });

        label_btn_kembali.setFont(new java.awt.Font("Karla", 1, 18)); // NOI18N
        label_btn_kembali.setForeground(new java.awt.Color(255, 255, 240));
        label_btn_kembali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_back_32px.png"))); // NOI18N
        label_btn_kembali.setText("KEMBALI");
        label_btn_kembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_btn_kembali.setIconTextGap(2);
        label_btn_kembali.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout btn_kembaliLayout = new javax.swing.GroupLayout(btn_kembali);
        btn_kembali.setLayout(btn_kembaliLayout);
        btn_kembaliLayout.setHorizontalGroup(
            btn_kembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_kembaliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_btn_kembali, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_kembaliLayout.setVerticalGroup(
            btn_kembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_btn_kembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btn_unduh.setBackground(new java.awt.Color(72, 60, 50));
        btn_unduh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_unduhMouseClicked(evt);
            }
        });

        label_btn_unduh.setFont(new java.awt.Font("Karla", 1, 18)); // NOI18N
        label_btn_unduh.setForeground(new java.awt.Color(255, 255, 240));
        label_btn_unduh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_btn_unduh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_download_32px.png"))); // NOI18N
        label_btn_unduh.setText("UNDUH BERKAS");
        label_btn_unduh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_btn_unduh.setIconTextGap(2);
        label_btn_unduh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout btn_unduhLayout = new javax.swing.GroupLayout(btn_unduh);
        btn_unduh.setLayout(btn_unduhLayout);
        btn_unduhLayout.setHorizontalGroup(
            btn_unduhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_unduhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_btn_unduh, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_unduhLayout.setVerticalGroup(
            btn_unduhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_btn_unduh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_riwayat_usulanjabatan, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_unduh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_riwayat_usulanjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_unduh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMouseClicked
        // TODO add your handling code here:
        form_usulan_jabatan back = new form_usulan_jabatan();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_kembaliMouseClicked

    private void btn_unduhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_unduhMouseClicked
        // TODO add your handling code here:
        int baris = tbl_riwayat_usulanjabatan.getSelectedRow();

        if (baris >= 0) {
            String id = tabel1.getValueAt(baris, 0).toString();
            String nip = tabel1.getValueAt(baris, 3).toString();
            String tanggal = tabel1.getValueAt(baris, 8).toString();

            try {
                Connection con = new database.connection().configDB();
                String sql = "SELECT * FROM riwayat_usulanjabatan WHERE id_riwayat_j = '" + id + "'";
                java.sql.Statement stat = con.createStatement();
                java.sql.ResultSet hasil = stat.executeQuery(sql);

                while (hasil.next()) {
                    try {
                        String user = System.getProperty("user.name");

                        String PATH = "C:/Users/" + user + "/Downloads/";
                        String directoryName = PATH.concat("" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")");
                        File directory = new File(directoryName);
                        if (!directory.exists()) {
                            directory.mkdir();
                        }

                        Blob blob1 = hasil.getBlob("file_ibel");
                        String namafile1 = hasil.getString("namafile_ibel");
                        InputStream input1 = blob1.getBinaryStream();

                        int exist1 = input1.available();
                        byte[] bt1 = new byte[exist1];
                        input1.read(bt1);

                        FileOutputStream fout1 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/IBEL_" + namafile1 + "");
                        DataOutputStream dout1 = new DataOutputStream(fout1);
                        dout1.write(bt1, 0, bt1.length);
                        fout1.close();

                        Blob blob2 = hasil.getBlob("file_ijazah");
                        String namafile2 = hasil.getString("namafile_ijazah");
                        InputStream input2 = blob2.getBinaryStream();

                        int exist2 = input2.available();
                        byte[] bt2 = new byte[exist2];
                        input2.read(bt2);

                        FileOutputStream fout2 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/IJAZAH_" + namafile2 + "");
                        DataOutputStream dout2 = new DataOutputStream(fout2);
                        dout2.write(bt2, 0, bt2.length);
                        fout2.close();

                        Blob blob3 = hasil.getBlob("file_kk");
                        String namafile3 = hasil.getString("namafile_kk");
                        InputStream input3 = blob3.getBinaryStream();

                        int exist3 = input3.available();
                        byte[] bt3 = new byte[exist3];
                        input3.read(bt3);

                        FileOutputStream fout3 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/KK_" + namafile3 + "");
                        DataOutputStream dout3 = new DataOutputStream(fout3);
                        dout3.write(bt3, 0, bt3.length);
                        fout3.close();

                        Blob blob4 = hasil.getBlob("file_pak");
                        String namafile4 = hasil.getString("namafile_pak");
                        InputStream input4 = blob4.getBinaryStream();

                        int exist4 = input4.available();
                        byte[] bt4 = new byte[exist4];
                        input4.read(bt4);

                        FileOutputStream fout4 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/PAK_" + namafile4 + "");
                        DataOutputStream dout4 = new DataOutputStream(fout4);
                        dout4.write(bt4, 0, bt4.length);
                        fout4.close();

                        Blob blob5 = hasil.getBlob("file_pangkalandata");
                        String namafile5 = hasil.getString("namafile_pangkalandata");
                        InputStream input5 = blob5.getBinaryStream();

                        int exist5 = input5.available();
                        byte[] bt5 = new byte[exist5];
                        input5.read(bt5);

                        FileOutputStream fout5 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/PANGKALAN_DATA_" + namafile5 + "");
                        DataOutputStream dout5 = new DataOutputStream(fout5);
                        dout5.write(bt5, 0, bt5.length);
                        fout5.close();

                        Blob blob6 = hasil.getBlob("file_profesi");
                        String namafile6 = hasil.getString("namafile_profesi");
                        InputStream input6 = blob6.getBinaryStream();

                        int exist6 = input6.available();
                        byte[] bt6 = new byte[exist6];
                        input6.read(bt6);

                        FileOutputStream fout6 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/PROFESI_" + namafile6 + "");
                        DataOutputStream dout6 = new DataOutputStream(fout6);
                        dout6.write(bt6, 0, bt6.length);
                        fout6.close();

                        Blob blob7 = hasil.getBlob("file_serdik");
                        String namafile7 = hasil.getString("namafile_serdik");
                        InputStream input7 = blob7.getBinaryStream();

                        int exist7 = input7.available();
                        byte[] bt7 = new byte[exist7];
                        input7.read(bt7);

                        FileOutputStream fout7 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SERDIK_" + namafile7 + "");
                        DataOutputStream dout7 = new DataOutputStream(fout7);
                        dout7.write(bt7, 0, bt7.length);
                        fout7.close();

                        Blob blob8 = hasil.getBlob("file_serkom");
                        String namafile8 = hasil.getString("namafile_serkom");
                        InputStream input8 = blob8.getBinaryStream();

                        int exist8 = input8.available();
                        byte[] bt8 = new byte[exist8];
                        input8.read(bt8);

                        FileOutputStream fout8 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SERKOM_" + namafile8 + "");
                        DataOutputStream dout8 = new DataOutputStream(fout8);
                        dout8.write(bt8, 0, bt8.length);
                        fout8.close();

                        Blob blob9 = hasil.getBlob("file_skcpns");
                        String namafile9 = hasil.getString("namafile_skcpns");
                        InputStream input9 = blob9.getBinaryStream();

                        int exist9 = input9.available();
                        byte[] bt9 = new byte[exist9];
                        input9.read(bt9);

                        FileOutputStream fout9 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_CPNS_" + namafile9 + "");
                        DataOutputStream dout9 = new DataOutputStream(fout9);
                        dout9.write(bt9, 0, bt9.length);
                        fout9.close();

                        Blob blob10 = hasil.getBlob("file_skjabatan");
                        String namafile10 = hasil.getString("namafile_skjabatan");
                        InputStream input10 = blob10.getBinaryStream();

                        int exist10 = input10.available();
                        byte[] bt10 = new byte[exist10];
                        input10.read(bt10);

                        FileOutputStream fout10 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_JABATAN_" + namafile10 + "");
                        DataOutputStream dout10 = new DataOutputStream(fout10);
                        dout10.write(bt10, 0, bt10.length);
                        fout10.close();

                        Blob blob11 = hasil.getBlob("file_skmutasi");
                        String namafile11 = hasil.getString("namafile_skmutasi");
                        InputStream input11 = blob11.getBinaryStream();

                        int exist11 = input11.available();
                        byte[] bt11 = new byte[exist11];
                        input11.read(bt11);

                        FileOutputStream fout11 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_MUTASI_" + namafile11 + "");
                        DataOutputStream dout11 = new DataOutputStream(fout11);
                        dout11.write(bt11, 0, bt11.length);
                        fout11.close();

                        Blob blob12 = hasil.getBlob("file_skp");
                        String namafile12 = hasil.getString("namafile_skp");
                        InputStream input12 = blob12.getBinaryStream();

                        int exist12 = input12.available();
                        byte[] bt12 = new byte[exist12];
                        input12.read(bt12);

                        FileOutputStream fout12 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SKP_" + namafile12 + "");
                        DataOutputStream dout12 = new DataOutputStream(fout12);
                        dout12.write(bt12, 0, bt12.length);
                        fout12.close();

                        Blob blob13 = hasil.getBlob("file_skpangkat");
                        String namafile13 = hasil.getString("namafile_skpangkat");
                        InputStream input13 = blob13.getBinaryStream();

                        int exist13 = input13.available();
                        byte[] bt13 = new byte[exist13];
                        input13.read(bt13);

                        FileOutputStream fout13 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_KP_" + namafile13 + "");
                        DataOutputStream dout13 = new DataOutputStream(fout13);
                        dout13.write(bt13, 0, bt13.length);
                        fout13.close();

                        Blob blob14 = hasil.getBlob("file_skpembebasan");
                        String namafile14 = hasil.getString("namafile_skpembebasan");
                        InputStream input14 = blob14.getBinaryStream();

                        int exist14 = input14.available();
                        byte[] bt14 = new byte[exist14];
                        input14.read(bt14);

                        FileOutputStream fout14 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_PEMBEBASAN_" + namafile14 + "");
                        DataOutputStream dout14 = new DataOutputStream(fout14);
                        dout14.write(bt14, 0, bt14.length);
                        fout14.close();

                        Blob blob15 = hasil.getBlob("file_skpim");
                        String namafile15 = hasil.getString("namafile_skpim");
                        InputStream input15 = blob15.getBinaryStream();

                        int exist15 = input15.available();
                        byte[] bt15 = new byte[exist15];
                        input15.read(bt15);

                        FileOutputStream fout15 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_PIM_" + namafile15 + "");
                        DataOutputStream dout15 = new DataOutputStream(fout15);
                        dout15.write(bt15, 0, bt15.length);
                        fout15.close();

                        Blob blob16 = hasil.getBlob("file_skpns");
                        String namafile16 = hasil.getString("namafile_skpns");
                        InputStream input16 = blob16.getBinaryStream();

                        int exist16 = input16.available();
                        byte[] bt16 = new byte[exist16];
                        input16.read(bt16);

                        FileOutputStream fout16 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_PNS_" + namafile16 + "");
                        DataOutputStream dout16 = new DataOutputStream(fout16);
                        dout16.write(bt16, 0, bt16.length);
                        fout16.close();

                        Blob blob17 = hasil.getBlob("file_stlkkpi");
                        String namafile17 = hasil.getString("namafile_stlkkpi");
                        InputStream input17 = blob17.getBinaryStream();

                        int exist17 = input17.available();
                        byte[] bt17 = new byte[exist17];
                        input17.read(bt17);

                        FileOutputStream fout17 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_STLKPPI_" + namafile17 + "");
                        DataOutputStream dout17 = new DataOutputStream(fout17);
                        dout17.write(bt17, 0, bt17.length);
                        fout17.close();

                        Blob blob18 = hasil.getBlob("file_stlud");
                        String namafile18 = hasil.getString("namafile_stlud");
                        InputStream input18 = blob18.getBinaryStream();

                        int exist18 = input18.available();
                        byte[] bt18 = new byte[exist18];
                        input18.read(bt18);

                        FileOutputStream fout18 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_STLUD_" + namafile18 + "");
                        DataOutputStream dout18 = new DataOutputStream(fout18);
                        dout18.write(bt18, 0, bt18.length);
                        fout18.close();

                        Blob blob19 = hasil.getBlob("file_sttpl");
                        String namafile19 = hasil.getString("namafile_sttpl");
                        InputStream input19 = blob19.getBinaryStream();

                        int exist19 = input19.available();
                        byte[] bt19 = new byte[exist19];
                        input19.read(bt19);

                        FileOutputStream fout19 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_STTPL_" + namafile19 + "");
                        DataOutputStream dout19 = new DataOutputStream(fout19);
                        dout19.write(bt19, 0, bt19.length);
                        fout19.close();

                        Blob blob20 = hasil.getBlob("file_tubel");
                        String namafile20 = hasil.getString("namafile_tubel");
                        InputStream input20 = blob20.getBinaryStream();

                        int exist20 = input20.available();
                        byte[] bt20 = new byte[exist20];
                        input20.read(bt20);

                        FileOutputStream fout20 = new FileOutputStream("C:/Users/" + user + "/Downloads/" + nip + " Riwayat Berkas Usulan Jabatan (" + tanggal + ")/SK_TUBEL_" + namafile20 + "");
                        DataOutputStream dout20 = new DataOutputStream(fout20);
                        dout20.write(bt20, 0, bt20.length);
                        fout20.close();

                        JOptionPane.showMessageDialog(null, "Berkas berhasil disimpan di folder download!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Gagal menyimpan Berkas!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    }

                }

                hasil.close();
                stat.close();
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Query Error!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum memilih data usulan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_unduhMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put("Table.showHorizontalLines", true);
        UIManager.put("Table.showVerticalLines", true);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_riwayat_usulanjabatan().setVisible(true);
            }
        });
    }

    private void header_usulanpangkat() {
        JTableHeader tab = tbl_riwayat_usulanjabatan.getTableHeader();
        tab.setFont(new Font("Karla", Font.BOLD, 18));
        tab.setPreferredSize(new Dimension(128, 32));

        tbl_riwayat_usulanjabatan.getColumnModel().getColumn(0).setMinWidth(0);
        tbl_riwayat_usulanjabatan.getColumnModel().getColumn(0).setMaxWidth(0);

        tbl_riwayat_usulanjabatan.getColumnModel().getColumn(1).setMinWidth(0);
        tbl_riwayat_usulanjabatan.getColumnModel().getColumn(1).setMaxWidth(0);

        TableColumn c = tbl_riwayat_usulanjabatan.getColumnModel().getColumn(2);
        c.setMaxWidth(64);
        c.setMinWidth(64);
    }

    private void tampil_riwayat_usulanjabatan() {
        Object[] baris = {"ID", "ID", "No.", "NIP", "Nama", "Jabatan", "Eselon", "Status", "Tanggal Validasi"};
        tabel1 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tbl_riwayat_usulanjabatan.setModel(tabel1);
        header_usulanpangkat();

        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT *, DATE_FORMAT(tanggal_validasi, '%e %b %Y') as format_tanggal, @rownum := @rownum + 1 AS number FROM riwayat_usulanjabatan t\n"
                    + "JOIN datapegawai ON t.id_pegawai = datapegawai.id_pegawai\n"
                    + "JOIN jabatan ON t.id_jabatan = jabatan.id_jabatan\n"
                    + "JOIN eselon ON t.id_eselon = eselon.id_eselon,\n"
                    + "(SELECT @rownum := 0) r";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);

            while (hasil.next()) {
                String id_riwayat = hasil.getString("id_riwayat_j");
                String id_pegawai = hasil.getString("id_pegawai");
                String no = Integer.toString(hasil.getInt("number"));
                String nip = hasil.getString("nip");
                String nama = hasil.getString("nama");
                String jabatan = hasil.getString("nama_jabatan");
                String eselon = hasil.getString("nama_eselon");
                String status = hasil.getString("status");
                String tanggal = hasil.getString("format_tanggal");

                String[] data = {id_riwayat, id_pegawai, no, nip, nama, jabatan, eselon, status, tanggal};
                tabel1.addRow(data);
                tbl_riwayat_usulanjabatan.setRowHeight(30);
            }

            hasil.close();
            stat.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menampilkan Riwayat Usulan Jabatan!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_kembali;
    private javax.swing.JPanel btn_unduh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_btn_kembali;
    private javax.swing.JLabel label_btn_unduh;
    private javax.swing.JLabel label_riwayat_usulanjabatan;
    private javax.swing.JTable tbl_riwayat_usulanjabatan;
    // End of variables declaration//GEN-END:variables
}
