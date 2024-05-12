package View;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Frame extends javax.swing.JFrame {


    public Frame() {
        ImageIcon img = new ImageIcon(getClass().getResource( "/Asset/InfectedClown"));
        this.setIconImage(img.getImage());

        initComponents();
        
    Toolkit tk = this.getToolkit();
    Dimension dim = tk.getScreenSize();
    this.setLocation (
            (int) dim.getWidth() / 2 - this.getWidth() /2,
            (int) dim.getHeight() / 2 - this.getHeight() / 2
    );
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Panel = new javax.swing.JPanel();
        CK_BTN = new javax.swing.JButton();
        PR = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        js = new javax.swing.JScrollPane();
        LOG = new javax.swing.JTextArea();
        p1 = new javax.swing.JPanel();
        Pass_Path = new javax.swing.JTextField();
        exp_2 = new javax.swing.JButton();
        exp_1 = new javax.swing.JButton();
        Tar_Path = new javax.swing.JTextField();
        ae = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("0xCrack");
        setResizable(false);

        CK_BTN.setText("Crack");
        CK_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CK_BTNActionPerformed(evt);
            }
        });

        PR.setForeground(new java.awt.Color(1, 1, 1));
        PR.setStringPainted(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Status"));

        LOG.setEditable(false);
        LOG.setBackground(new java.awt.Color(1, 1, 1));
        LOG.setColumns(20);
        LOG.setForeground(new java.awt.Color(254, 254, 254));
        LOG.setLineWrap(true);
        LOG.setRows(5);
        LOG.setAutoscrolls(false);
        js.setViewportView(LOG);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(js, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(js, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        p1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Config"));

        Pass_Path.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Password List"));

        exp_2.setText("...");
        exp_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exp_2ActionPerformed(evt);
            }
        });

        exp_1.setText("...");
        exp_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exp_1ActionPerformed(evt);
            }
        });

        Tar_Path.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Target"));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tar_Path, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(Pass_Path))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exp_1)
                    .addComponent(exp_2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tar_Path))
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exp_2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass_Path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ae.setText("GitHub");
        ae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Main_PanelLayout = new javax.swing.GroupLayout(Main_Panel);
        Main_Panel.setLayout(Main_PanelLayout);
        Main_PanelLayout.setHorizontalGroup(
            Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PR, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CK_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ae, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Main_PanelLayout.setVerticalGroup(
            Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CK_BTN)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exp_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exp_2ActionPerformed
        try {
            Pass_Path.setText(Browse());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
           
        }
    }//GEN-LAST:event_exp_2ActionPerformed

    private void exp_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exp_1ActionPerformed
        try {
            Tar_Path.setText(Browse("PDF File", "pdf"));
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
           
        }
    }//GEN-LAST:event_exp_1ActionPerformed

    private void CK_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CK_BTNActionPerformed
        
        LOG.setText("");
        File a , b;
        a = new File(Tar_Path.getText());
        b = new File(Pass_Path.getText());
        
        if(a.isFile() && b.isFile())
        {
            libINF.libpdf lib = new libINF.libpdf(a, b);
            lib.At(LOG,PR,CK_BTN);
            
        
        }
    }//GEN-LAST:event_CK_BTNActionPerformed

    private void aeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aeActionPerformed
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/InfectedClown"));
            } catch (URISyntaxException | IOException ex) {

            }
        }
    }//GEN-LAST:event_aeActionPerformed

    private String Browse(String fil,String format) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException{

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFileChooser fileChooser = new JFileChooser();
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        fileChooser.setFileSelectionMode( JFileChooser.FILES_ONLY );
        fileChooser.setFileFilter(new FileNameExtensionFilter(fil, format));
        int returnVal = fileChooser.showOpenDialog( this );
        
        if( returnVal == JFileChooser.APPROVE_OPTION ) {
            
            return fileChooser.getSelectedFile().getAbsolutePath();
        }
        else {
            return "";
        }

        
       
    }
    private String Browse() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException{

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFileChooser fileChooser = new JFileChooser();
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        fileChooser.setFileSelectionMode( JFileChooser.FILES_ONLY );
        int returnVal = fileChooser.showOpenDialog( this );
        
        if( returnVal == JFileChooser.APPROVE_OPTION ) {
                return fileChooser.getSelectedFile().getAbsolutePath();
        }
        else {
            return "";
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CK_BTN;
    private javax.swing.JTextArea LOG;
    private javax.swing.JLabel MEM_SHOW1;
    private javax.swing.JLabel MEM_SHOW2;
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar PR;
    private javax.swing.JTextField Pass_Path;
    private javax.swing.JLabel TARGET_FILE1;
    private javax.swing.JLabel TARGET_FILE2;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JTabbedPane Tab1;
    private javax.swing.JTextField Tar_Path;
    private javax.swing.JToggleButton ae;
    private javax.swing.JButton exp_1;
    private javax.swing.JButton exp_2;
    private javax.swing.JScrollPane js;
    private javax.swing.JPanel p1;
    // End of variables declaration//GEN-END:variables
}
