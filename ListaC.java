/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ListaC extends javax.swing.JFrame {


    public ListaC() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(177, 206, 177));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Item:");

        jLabel3.setText("Categoria:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(189, 249, 189));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alimentos", "Higiene", "Outros" }));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Gerar Lista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(137, 173, 146));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(123, 149, 110));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel2.setText("Lista de Compras");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Visualizar Lista");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
private List<String> alimentos = new ArrayList<>();
 private List<String> higiene = new ArrayList<>();
 private List<String> outros = new ArrayList<>();
 StringBuilder ListaAtual = new StringBuilder();
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

            String item = jTextField1.getText();
            //jComboBox1 categoria = jComboBox1.getSelectedItem();
            
            
            if (jTextField1.getText().equals("") || jComboBox1.getSelectedItem().equals("")){
                    //|| jTextField3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos",
                        "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
            
            
                StringBuilder CriarLista = new StringBuilder();
                try {
                    if (jComboBox1.getSelectedItem().equals("Alimentos")) {
                        alimentos.add(item);
                        ListaAtual.append(item + "\n");
                        JOptionPane.showMessageDialog(null, "Item adicionado",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                    
                    } else if (jComboBox1.getSelectedItem().equals("Higiene")) {
                        higiene.add(item);
                        ListaAtual.append(item + "\n");
                        JOptionPane.showMessageDialog(null, "Item adicionado",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    else if (jComboBox1.getSelectedItem().equals("Outros")) {
                        outros.add(item);
                        ListaAtual.append(item + "\n");
                        JOptionPane.showMessageDialog(null, "Item adicionado",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                    
                        //CriarLista.append(item + "\n")

                } catch (Exception ex){
                    System.out.println("Erro para obter resultados");
                }
                if (jComboBox1.getSelectedItem().equals("Selecione")) {
                        JOptionPane.showMessageDialog(null, "Escolha a categoria",
                            "Aviso", JOptionPane.WARNING_MESSAGE);;
                    }
            }
        
            
        
    }                                        
StringBuilder CriarLista = new StringBuilder();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String caminho = System.getProperty("user.home") + "\\Desktop\\lista_compras.txt";
        Path Caminho = Paths.get(caminho);
        //StringBuilder CriarLista = new StringBuilder();
        
        if (Caminho.toFile().exists()){
            Caminho.toFile().delete();
            JOptionPane.showMessageDialog(null, "Um arquivo com o mesmo nome já existe"
                    + " e foi substituido.",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        if (jTextField1.getText().equals("") || jComboBox1.getSelectedItem().equals("")){
                   // || jTextField3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos",
                        "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
            // fazer uma função para escrever os novos itens apos a categoria
                try{    
                    Files.createFile(Caminho);

                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Aviso, um erro no caminho do arquivo" +
                            " foi detectado, verifique se está correto ou se ele já existe.",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }

                CriarLista.append("------- LISTA DE COMPRAS ------");
                    int index1 = alimentos.indexOf("- ALIMENTOS: \n");
                    if (alimentos.contains("- ALIMENTOS: \n")){
                        for (int i=0; i < alimentos.size(); i++){
                                CriarLista.append(alimentos.get(i)).append("\n");
                            }
                        alimentos.add(index1 + 1, CriarLista.toString());
                        System.out.println("Valor encontrado na lista");

                        }else {
                            CriarLista.append("\n\n");
                            CriarLista.append("- ALIMENTOS: \n");
                            for (int i=0; i < alimentos.size(); i++){
                                CriarLista.append(alimentos.get(i)).append("\n");
                            }
                            alimentos.add(index1 + 1, CriarLista.toString());
                        }
                    int index = higiene.indexOf("- HIGIENE: \n");
                    if (higiene.contains("- HIGIENE: \n")){
                        for (int i=0; i < higiene.size(); i++){
                                CriarLista.append(higiene.get(i)).append("\n");
                            }
                        higiene.add(index + 1, CriarLista.toString());
                        System.out.println("Valor encontrado na lista");

                        }else {
                            CriarLista.append("\n\n");
                            CriarLista.append("- HIGIENE: \n");
                            for (int i=0; i < higiene.size(); i++){
                                CriarLista.append(higiene.get(i)).append("\n");
                            }
                            higiene.add(index + 1, CriarLista.toString());
                        }
                    int index2 = outros.indexOf("- OUTROS: \n");
                    if (index2 != -1){
                        for (int i=0; i < outros.size(); i++){
                            CriarLista.append(outros.get(i)).append("\n");
                        }

                    } else {
                        CriarLista.append("\n\n");
                        CriarLista.append("- OUTROS: \n");
                        for (int i=0; i < outros.size(); i++){
                            CriarLista.append(outros.get(i)).append("\n");
                        }
                        outros.add(CriarLista.toString());
                    }
                try {
                    Files.write(Caminho, CriarLista.toString().getBytes(), StandardOpenOption.APPEND);
                    //JOptionPane.showMessageDialog(null, "Lista criada com sucesso!",
                    //        "Aviso", JOptionPane.WARNING_MESSAGE);
                } catch (IOException ex) {
                    Logger.getLogger(ListaC.class.getName()).log(Level.SEVERE, null, ex);
                }
                        //JOptionPane.showMessageDialog(null, "Lista criada com sucesso!",
                         //   "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Lista Atual:\n" + ListaAtual,
                            "Aviso", JOptionPane.WARNING_MESSAGE);
        
    }                                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
