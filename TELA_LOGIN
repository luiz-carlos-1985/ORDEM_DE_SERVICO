package br.com.luizcarlos.ordemdeservico.telas;
//package dialogboxes;

import br.com.luizcarlos.ordemdeservico.dal.ModuloConexao;

import java.sql.*;
//import javax.swing.*;

public class TelaLogin extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void logar() {
        String sql = "select * from usuario where login =? and senha=?";
        try {
            /*As linhas abaixo preparam a consulta ao banco de dados em função do que foi digitado nas caixas de texto. O ? é substituido pelo conteudo das variaveis*/
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuario.getText());
            pst.setString(2, txtSenha.getText());
            // a linha abaixo executa a query 
            rs = pst.executeQuery();
            // se existir usuario e senha correspondente
            if (rs.next()) {
                //a linha abaixo obtem o conteúdo do campo perfil da tabela usuario
                String perfil = rs.getString(8);
                //System.out.println(perfil);
                //a estrutura abaixo faz o tratamento do perfil do usuario
                if (perfil.equals("ADMINISTRADOR")) {
                    // a linha abaixo exibe o conteudo do campo tabela
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.MenRelSer.setEnabled(true);
                    TelaPrincipal.MenCadUsu.setEnabled(true);
                    this.dispose(); //A tela principal quando chamada fecha a tela anterior que é a de login.
                    conexao.close();
                } else {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    this.dispose();
                    conexao.close();
                }

            } else {
                // JoptionPane.showMessageDialog(null, "Usuario e/ou senha inválida!", sql, 10);

            }

        } catch (SQLException e) {
            // jOption.showMessageDialog(this, e);
        }
    }

    public TelaLogin() {
        initComponents();
        conexao = ModuloConexao.conector();
        System.out.println(conexao);
        /*if (conexao != null){
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/luizcarlos/ordemdeservico/icones/tick_icon.png")));
        }
            else { lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/luizcarlos/ordemdeservico/icones/icon_critical.gif")));
                                        }
        }*/
        if (conexao != null) {
            lblStatus1.setText("on-line!");

        } else {
            lblStatus1.setText("off-line!");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblStatus1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ORDENS DE SERVIÇOS - LUIZ CARLOS DB");
        setResizable(false);

        jLabel1.setText("Usuário:");

        jLabel2.setText("Senha:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        lblStatus1.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus1)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSenha))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here

    }                                        
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Chamando o método logar
        logar();

    }                                        

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {                                    
        // TODO add your handling code here:
        logar();
    }                                   

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {                                    
        // TODO add your handling code here:
        logar();
        
    }                                   
    /*
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLogin;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration                   
}
