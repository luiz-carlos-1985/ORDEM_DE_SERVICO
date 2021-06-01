package br.com.luizcarlos.ordemdeservico.telas;

import java.sql.*;
import br.com.luizcarlos.ordemdeservico.dal.ModuloConexao;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

//import br.com.luizcarlos.ordemdeservico.telas.TelaCliente;
/**
 *
 * @author luizc
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        MenCadCli = new javax.swing.JMenuItem();
        MenCadOs = new javax.swing.JMenuItem();
        MenCadUsu = new javax.swing.JMenuItem();
        MenRel = new javax.swing.JMenu();
        menRelCli = new javax.swing.JMenuItem();
        MenRelSer = new javax.swing.JMenuItem();
        MenOpc = new javax.swing.JMenu();
        MenOpcSai = new javax.swing.JMenuItem();
        MenAju = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ORDENS DE SERVIÇOS - EXERCÍCIO REALIZADO POR LUIZ CARLOS JR");

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        menCad.setText("CADASTRO");

        MenCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenCadCli.setText("CLIENTE");
        MenCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadCliActionPerformed(evt);
            }
        });
        menCad.add(MenCadCli);

        MenCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenCadOs.setText("ORDEM DE SERVIÇO");
        MenCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadOsActionPerformed(evt);
            }
        });
        menCad.add(MenCadOs);

        MenCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenCadUsu.setText("USUÁRIOS");
        MenCadUsu.setEnabled(false);
        MenCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadUsuActionPerformed(evt);
            }
        });
        menCad.add(MenCadUsu);

        Menu.add(menCad);

        MenRel.setText("RELATÓRIOS");

        menRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menRelCli.setText("RELATÓRIO DE CLIENTES");
        menRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelCliActionPerformed(evt);
            }
        });
        MenRel.add(menRelCli);

        MenRelSer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenRelSer.setText("RELATÓRIO DE SERVIÇOS");
        MenRelSer.setEnabled(false);
        MenRelSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelSerActionPerformed(evt);
            }
        });
        MenRel.add(MenRelSer);

        Menu.add(MenRel);

        MenOpc.setText("OPÇÕES");

        MenOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        MenOpcSai.setText("SAIR");
        MenOpcSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenOpcSaiActionPerformed(evt);
            }
        });
        MenOpc.add(MenOpcSai);

        Menu.add(MenOpc);

        MenAju.setText("AJUDA");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem5.setText("SOBRE");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenAju.add(jMenuItem5);

        Menu.add(MenAju);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(743, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void MenCadOsActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // CHAMANDO A TELA OS
        TelaOs os = new TelaOs();
        os.setVisible(true);
        desktop.add(os);

    }                                        

    private void MenCadUsuActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        //AS LINHAS ABAIXO IRÃO ABRIR O FORM TelaUsuario DENTRO DO DESKTOP PANE!
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);

    }                                         

    private void MenOpcSaiActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        // exibe uma caixa de dialógo para confirmar a saida do usuario
        int sair = JOptionPane.showConfirmDialog(null, "TEM CERTEZA QUE DESEJA SAIR?",
                 "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }                                         

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // chamando a tela sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }                                          

    private void MenCadCliActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // CHAMANDO A TELACLIENTE
        TelaCliente3 cliente = new TelaCliente3();
        cliente.setVisible(true);
        desktop.add(cliente);

    }                                         

    private void menRelCliActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // GERANDO O RELATÓRIO DE CLIENTES
        int confirma = JOptionPane.showConfirmDialog(null, "DESEJA REALMENTE IMPRIMIR O RELATÓRIO DE CLIENTES?", "ATENÇÃO", JOptionPane.YES_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            //IMPRIMINDO RELATÓRIO COM O FRAMEWORK JASPERREPORT
            try {
                // USANDO A CLASSE JASPERPRINT PARA IMPRIMIR O RELATÓRIO
                JasperPrint print = JasperFillManager.fillReport("C:/reports/clientes.jasper", null, conexao);
                // A LINHA ABAIXO EXIBE O RELATÓRIO ATRAVÉS DA CLASSE JASPERVIEWER
                JasperViewer.viewReport(print, false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
        }

    }                                         

    private void MenRelSerActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // EMITE O RELATÓRIO DE SERVIÇOS
        int confirma = JOptionPane.showConfirmDialog(null, "DESEJA REALMENTE IMPRIMIR O RELATÓRIO DE SERVIÇOS?", "ATENÇÃO", JOptionPane.YES_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            //IMPRIMINDO O RELATÓRIO COM O FRAMEWORK JASPERREPORT
            try {
                // USANDO A CLASSE JASPERPRINT PARA IMPRIMIR O RELATÓRIO
                JasperPrint print = JasperFillManager.fillReport("C:/reports/servicos.jasper", null, conexao);
                // A LINHA ABAIXO EXIBE O RELATÓRIO ATRAVÉS DA CLASSE JASPERVIEWER
                JasperViewer.viewReport(print, false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
        }

    }                                         

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

                      
    private javax.swing.JMenu MenAju;
    private javax.swing.JMenuItem MenCadCli;
    private javax.swing.JMenuItem MenCadOs;
    public static javax.swing.JMenuItem MenCadUsu;
    private javax.swing.JMenu MenOpc;
    private javax.swing.JMenuItem MenOpcSai;
    private javax.swing.JMenu MenRel;
    public static javax.swing.JMenuItem MenRelSer;
    private javax.swing.JMenuBar Menu;
    public static javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menRelCli;
                    
}
