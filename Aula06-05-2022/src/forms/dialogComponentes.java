
package forms;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class dialogComponentes extends javax.swing.JDialog {

 
    public dialogComponentes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        buttonVerificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textSalario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        comboSetor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        textCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Testando Componentes");
        setBackground(new java.awt.Color(255, 153, 153));
        setForeground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Nome");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        buttonVerificar.setText("Verificar");
        buttonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerificarActionPerformed(evt);
            }
        });

        jLabel2.setText("Salário");

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        comboSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "TI", "Gerência", "RH", "Zeladoria", "Produção" }));

        jLabel3.setText("Setor");

        try {
            textCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(buttonVerificar))
                    .addComponent(jLabel2)
                    .addComponent(textSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVerificar))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(textSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void buttonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerificarActionPerformed
        // TODO add your handling code here:
       // String nome = textNome.getText(); //Atribui no componente o que o usuário digirar - GetText = atribui a uma váriavel, trás de volta o que o usuário digitar
        if(textNome.getText().trim().isEmpty()){  //if (nome.trim()) //Se não digitar nada, mesmo tirando o espaço em branco, aparece a mensagem - Trim percorre todo o espaço
            JOptionPane.showMessageDialog(null, "Digite seu nome");
            textNome.requestFocus(); //Mesma coisa que o setFocus - voltar ao foco
            return; //Retorno de um valor - Se for Void, não continua - Tudo que for digitado depois, da erro. Nunca vai chegar
            //Encerra aqui - Se não foi digitado, aparece a mensagem e retorna
        }
        //Se validar igual de cima,pode digiatar letras e não da erro, porque não está nulo
        //Validação para números
        
        if (textSalario.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite seu salário");
            textSalario.requestFocus();
            return;
        }
        double salario = 0;
        try{ //Colocar o Try, porque pode dar errado // Java = trata exeção pelo nome
            salario = Double.parseDouble(textSalario.getText()); //Aquilo que pode causar problema = exeção - dentro do escopo
        }catch(NumberFormatException ex){ //Catch = Tratamento = Reconhece possíveis exeções
            JOptionPane.showMessageDialog(null, "Digite um número válido");
            textSalario.requestFocus();
            return;
        }
        
        if (textCPF.getText().equals("   .   .   -  ")){ //O Trim tira os espaços das laterais
            JOptionPane.showMessageDialog(null, "Digite um CPF válido");
            textSalario.requestFocus();
            return;           
        }
     
        //Máscara para formatar número
        DecimalFormat mascara = new DecimalFormat("R$#,##0.00"); //New = criando um objeto //Uma casa antes da , duas depois, é 0,50,não 50 - nem todo valor vai para o milhar,por isso não é 0, pode ir ou não
        
        salario = salario * 1.15;
        area.append(textNome.getText() + "\t" + comboSetor.getSelectedItem() + "\t" + "\t" + textCPF.getText() + "\t\t" + mascara.format(salario) + "\n"); //Variável declarada no campo
                             //Get = busca o que tem na variável - precisa do nome para mostar
                             
        textNome.setText(""); //Substituir o que tinha, pelo vazio
        textSalario.setText("");
        textNome.requestFocus();
    }//GEN-LAST:event_buttonVerificarActionPerformed

    
    
    
    
    
    
    
    
    
    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

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
            java.util.logging.Logger.getLogger(dialogComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogComponentes dialog = new dialogComponentes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton buttonVerificar;
    private javax.swing.JComboBox<String> comboSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField textCPF;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textSalario;
    // End of variables declaration//GEN-END:variables
}
