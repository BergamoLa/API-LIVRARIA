/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Editora;
import model.Livro;
import service.ILivraria;

/**
 *
 * @author mlbergamo
 */
public class FormLivraria extends javax.swing.JFrame {
        public static int IDLIVRO;
        public static int IDEDITORA;
    
    public FormLivraria() {
        initComponents();
        ConfigurarFormulario();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        quantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIDeditora = new javax.swing.JTextField();
        lblLivro = new javax.swing.JLabel();
        lblEditora = new javax.swing.JLabel();
        txtPesquisarLivro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLivros = new javax.swing.JTable();
        btnInserir = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        btnInserirED = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEditora = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblNome = new javax.swing.JLabel();
        lblLivro1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisarEditora = new javax.swing.JTextField();
        lblPesquisarEditora = new javax.swing.JLabel();
        btnPesquisarEd = new javax.swing.JButton();
        btnEditarLivro = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        btnEditarED = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 723, -1));

        jLabel1.setText("Titulo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel2.setText("Autor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 66, 723, -1));

        jLabel3.setText("Ano");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 95, -1, -1));
        getContentPane().add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 92, 44, -1));

        lblPreco.setText("Preço");
        getContentPane().add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 95, -1, -1));
        getContentPane().add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 92, 59, -1));

        quantidade.setText("Quantidade");
        getContentPane().add(quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 95, -1, -1));
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 92, 44, -1));

        jLabel4.setText("ID Editora");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 95, -1, -1));
        getContentPane().add(txtIDeditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 92, 383, -1));

        lblLivro.setText("LIVROS");
        getContentPane().add(lblLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 15, 44, -1));

        lblEditora.setText("Pesquisar Livros");
        getContentPane().add(lblEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, -1));

        txtPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarLivroActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisarLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 463, -1));

        tbLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Titulo", "Autor", "Ano", "Preço", "Quantidade", "IdEditora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLivrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbLivros);
        if (tbLivros.getColumnModel().getColumnCount() > 0) {
            tbLivros.getColumnModel().getColumn(1).setResizable(false);
            tbLivros.getColumnModel().getColumn(2).setResizable(false);
            tbLivros.getColumnModel().getColumn(3).setResizable(false);
            tbLivros.getColumnModel().getColumn(4).setResizable(false);
            tbLivros.getColumnModel().getColumn(5).setResizable(false);
            tbLivros.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 159, 873, 167));

        btnInserir.setText("Salvar Livro");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 422, -1));

        btnInserirED.setText("Salvar Editora");
        btnInserirED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirEDActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserirED, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 120, -1));

        tbEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEditoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEditora);
        if (tbEditora.getColumnModel().getColumnCount() > 0) {
            tbEditora.getColumnModel().getColumn(0).setResizable(false);
            tbEditora.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 426, 826, 112));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 332, 924, 10));

        lblNome.setText("Inserir Editora");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 80, -1));

        lblLivro1.setText("EDITORAS");
        getContentPane().add(lblLivro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 348, -1, -1));

        btnPesquisar.setText("Pesquisar Livro");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));
        getContentPane().add(txtPesquisarEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 422, -1));

        lblPesquisarEditora.setText("Pesquisar Editora");
        getContentPane().add(lblPesquisarEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 110, -1));

        btnPesquisarEd.setText("Pesquisar Editora");
        btnPesquisarEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarEdActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 120, -1));

        btnEditarLivro.setText("Atualizar Livro");
        btnEditarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLivroActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, -1, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 40, 20, -1));

        ID.setText("ID");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 43, -1, -1));

        btnEditarED.setText("Atualizar Editora");
        btnEditarED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEDActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarED, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 130, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarLivroActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            Registry srv = LocateRegistry.getRegistry(ILivraria.SERVICE_HOST,
                    ILivraria.SERVICE_PORT
            );

            ILivraria op = (ILivraria)srv.lookup(ILivraria.SERVICE_NAME);

            Livro l = new Livro();
            l.setTitulo(txtTitulo.getText());
            l.setAutor(txtAutor.getText());
            l.setAno(Integer.parseInt(txtAno.getText()));
            l.setPreco(Double.parseDouble(txtPreco.getText()));
            l.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            l.setIdEditora(Integer.parseInt(txtIDeditora.getText()));
            
            op.inserir(l);
            JOptionPane.showMessageDialog(this, "Inserido com sucesso!");
            txtTitulo.setText("");
            txtAutor.setText("");
            txtAno.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
            txtIDeditora.setText("");

        } catch (Exception e) {
            System.out.println("ERRO deu ruim: " + e.getMessage());
        }
        
                                         


    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            String titulo = txtPesquisarLivro.getText();
            
            Registry srv = LocateRegistry.getRegistry(ILivraria.SERVICE_HOST, ILivraria.SERVICE_PORT );

            ILivraria op = (ILivraria)srv.lookup(ILivraria.SERVICE_NAME);

            List<Livro> res = op.pesquisarPorTitulo(titulo);
            //limpa o campo
            txtPesquisarLivro.setText("");
            
            preencherTabelaLivro(res);
        } catch (Exception e) {
        }
               
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnInserirEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirEDActionPerformed
        try {
            Registry srv = LocateRegistry.getRegistry(ILivraria.SERVICE_HOST,
                    ILivraria.SERVICE_PORT
            );

            ILivraria op = (ILivraria)srv.lookup(ILivraria.SERVICE_NAME);

            Editora e = new Editora();
            e.setNome(txtNome.getText());
            op.inserir(e);
            JOptionPane.showMessageDialog(this, "Inserido com sucesso!");
            txtNome.setText("");
            

        } catch (Exception e) {
            System.out.println("ERRO deu ruim: " + e.getMessage());
        }
        
                                         

    }//GEN-LAST:event_btnInserirEDActionPerformed

    private void btnPesquisarEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarEdActionPerformed
        try {
            String nome = txtPesquisarEditora.getText();
            
            Registry srv = LocateRegistry.getRegistry(ILivraria.SERVICE_HOST, ILivraria.SERVICE_PORT );

            ILivraria op = (ILivraria)srv.lookup(ILivraria.SERVICE_NAME);

            List<Editora> res = op.pesquisarPorNome(nome);
            //limpa o campo
            txtPesquisarEditora.setText("");
            
            preencherTabelaEditora(res);
        } catch (Exception e) {
    }//GEN-LAST:event_btnPesquisarEdActionPerformed

    }
        
        
        
        
    private void btnEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLivroActionPerformed
        if (!txtID.getText().isEmpty()) {
            
        try {
            Registry srv = LocateRegistry.getRegistry(ILivraria.SERVICE_HOST,
                    ILivraria.SERVICE_PORT
            );

            ILivraria op = (ILivraria)srv.lookup(ILivraria.SERVICE_NAME);

            Livro l = new Livro();
            l.setTitulo(txtTitulo.getText());
            l.setAutor(txtAutor.getText());
            l.setAno(Integer.parseInt(txtAno.getText()));
            l.setPreco(Double.parseDouble(txtPreco.getText()));
            l.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            l.setIdEditora(Integer.parseInt(txtIDeditora.getText()));
            l.setId(Integer.parseInt(txtID.getText()));
            op.atualizar(l);
            JOptionPane.showMessageDialog(this, "Atualizado com sucesso!");
            txtTitulo.setText("");
            txtAutor.setText("");
            txtAno.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
            txtIDeditora.setText("");

        } catch (Exception e) {
            System.out.println("ERRO deu ruim: " + e.getMessage());
        }
        }
    }//GEN-LAST:event_btnEditarLivroActionPerformed

    private void tbLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLivrosMouseClicked
              if (evt.getClickCount() == 2){
            int linha = tbLivros.getSelectedRow();
           txtID.setText(tbLivros.getValueAt(linha, 0).toString());
            txtTitulo.setText(tbLivros.getValueAt(linha, 1).toString());
            txtAutor.setText(tbLivros.getValueAt(linha, 2).toString());
            txtAno.setText(tbLivros.getValueAt(linha, 3).toString());
            txtPreco.setText(tbLivros.getValueAt(linha, 4).toString());
            txtQuantidade.setText(tbLivros.getValueAt(linha, 5).toString());
            txtIDeditora.setText(tbLivros.getValueAt(linha, 6).toString());
            IDEDITORA = Integer.parseInt(txtID.getText());    
            
        }      
    }//GEN-LAST:event_tbLivrosMouseClicked

    private void tbEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEditoraMouseClicked
        if (evt.getClickCount() == 2){
            int linha = tbEditora.getSelectedRow();
           txtID.setText(tbEditora.getValueAt(linha, 0).toString());
            txtNome.setText(tbEditora.getValueAt(linha, 1).toString());     
           
    }//GEN-LAST:event_tbEditoraMouseClicked
    }
    
    private void btnEditarEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEDActionPerformed
        if (!txtID.getText().isEmpty()) {
            
        try {
            Registry srv = LocateRegistry.getRegistry(ILivraria.SERVICE_HOST,
                    ILivraria.SERVICE_PORT
            );

            ILivraria op = (ILivraria)srv.lookup(ILivraria.SERVICE_NAME);

            Editora e = new Editora();
            e.setNome(txtNome.getText());
            e.setId(Integer.parseInt(txtID.getText()));
            op.atualizar(e);
            JOptionPane.showMessageDialog(this, " Atualizada com sucesso!");
            
            txtNome.setText("");
            
                
        } catch (Exception e) {
            System.out.println("ERRO deu ruim: " + e.getMessage());
        }
        }
    }//GEN-LAST:event_btnEditarEDActionPerformed
    

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
            java.util.logging.Logger.getLogger(FormLivraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLivraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLivraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLivraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLivraria().setVisible(true);
            }
        });
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton btnEditarED;
    private javax.swing.JButton btnEditarLivro;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnInserirED;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarEd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblLivro;
    private javax.swing.JLabel lblLivro1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisarEditora;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel quantidade;
    private javax.swing.JTable tbEditora;
    private javax.swing.JTable tbLivros;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDeditora;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisarEditora;
    private javax.swing.JTextField txtPesquisarLivro;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
    
    
    private void ConfigurarFormulario(){
        this.setTitle("Livraria  ");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        txtID.setEnabled(false);
       

    }
    
    private void configurarTabelaLivro(){
       DefaultTableModel m = new DefaultTableModel(){
           @Override
           public boolean isCellEditable(int row, int column){
               return false;
           }
       };
       m.addColumn("id");
       m.addColumn("titulo");
       m.addColumn("autor");
       m.addColumn("ano");
       m.addColumn("preço");
       m.addColumn("quantidade");
       m.addColumn("Id Editora");
       tbLivros.setModel(m);
   }
        private void preencherTabelaLivro(List<Livro> lista){
        if(lista != null){
            configurarTabelaLivro();
            DefaultTableModel m = (DefaultTableModel)tbLivros.getModel();
            for(Livro aux : lista){
                
                m.addRow(new Object[]{
                aux.getId(),
                aux.getTitulo(),
                aux.getAutor(),
                aux.getAno(),
                aux.getPreco(),
                aux.getQuantidade(),
                aux.getIdEditora(),
                });
            }
            tbLivros.setModel(m);
        }  
    }
        
         private void preencherTabelaEditora(List<Editora> lista){
        if(lista != null){
            configurarTabelaEditora();
            DefaultTableModel j = (DefaultTableModel)tbEditora.getModel();
            for(Editora aux : lista){
                
                j.addRow(new Object[]{
                aux.getId(),
                aux.getNome(),
                
                });
            }
            tbEditora.setModel(j);
        }  
    }
         
     private void configurarTabelaEditora(){
       DefaultTableModel j = new DefaultTableModel(){
           @Override
           public boolean isCellEditable(int row, int column){
               return false;
           }
       };
       j.addColumn("id");
       j.addColumn("Nome");
       tbEditora.setModel(j);
   }    
       
     
}
    
