/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.funafisio.view;

/**
 *
 * @author ldor1
 */
public class JFInicial extends javax.swing.JFrame {

    /**
     * Creates new form JFInicial
     */
    public JFInicial() {
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

        jmbMenu = new javax.swing.JMenuBar();
        jmFundacao = new javax.swing.JMenu();
        jmiMetodologiaEnsino = new javax.swing.JMenuItem();
        jmiHistorico = new javax.swing.JMenuItem();
        jmCursos = new javax.swing.JMenu();
        jmAgendaMatriculas = new javax.swing.JMenu();
        jmContato = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmFundacao.setText("Fundação");

        jmiMetodologiaEnsino.setText("Metodologia de Ensino");
        jmFundacao.add(jmiMetodologiaEnsino);

        jmiHistorico.setText("Histórico");
        jmFundacao.add(jmiHistorico);

        jmbMenu.add(jmFundacao);

        jmCursos.setText("Cursos");
        jmbMenu.add(jmCursos);

        jmAgendaMatriculas.setText("Agenda e Matrículas");
        jmbMenu.add(jmAgendaMatriculas);

        jmContato.setText("Contato");
        jmbMenu.add(jmContato);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmAgendaMatriculas;
    private javax.swing.JMenu jmContato;
    private javax.swing.JMenu jmCursos;
    private javax.swing.JMenu jmFundacao;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiHistorico;
    private javax.swing.JMenuItem jmiMetodologiaEnsino;
    // End of variables declaration//GEN-END:variables
}
