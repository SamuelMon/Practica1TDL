/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1.tdl;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author monto
 */
public class GUI extends javax.swing.JFrame {
    
    private String simbolos;
    private String estadosTransiciones;
    private String[][] automataMatriz;
    private ArrayList<String[]> automataFilas;
    private String tipoAF;
    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        simbolosText = new javax.swing.JTextField();
        info1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        info2 = new javax.swing.JButton();
        estadosText = new javax.swing.JTextField();
        consAF = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tipoAFCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ingresa tu automata");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Simbolos de entrada");

        info1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        info1.setText("?");
        info1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Estados y transiciones");

        info2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        info2.setText("?");
        info2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info2ActionPerformed(evt);
            }
        });

        consAF.setText("Construir automata");
        consAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consAFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de automata");

        tipoAFCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deterministico", "No deterministico" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(39, 39, 39)
                            .addComponent(info1))
                        .addComponent(simbolosText)
                        .addComponent(estadosText)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(info2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(consAF))
                        .addComponent(tipoAFCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(info1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simbolosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(info2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estadosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoAFCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(consAF)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Provee informacion al usuario sobre el campo de texto "Simbolos"
    private void info1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info1ActionPerformed
        JOptionPane.showMessageDialog(this, "Ingrese los simbolos de entrada separados por coma cada uno.\nEl simbolo coma no esta permitido como silbolo de entrada");
    }//GEN-LAST:event_info1ActionPerformed

    //Provee informacion al usuario sobre el campo de texto "Estados y transiciones"
    private void info2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info2ActionPerformed
        JOptionPane.showMessageDialog(this,"Se recomienda leer el manual de usuario para conocer el formato\npara ingresar en el campo estados y transiciones ");
    }//GEN-LAST:event_info2ActionPerformed
    
    private void consAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consAFActionPerformed
        // TODO add your handling code here:
        this.simbolos = simbolosText.getText();
        this.estadosTransiciones = estadosText.getText();
        this.tipoAF = String.valueOf(tipoAFCB.getSelectedItem());
        
        simbolos.replace(" ", "");
        estadosTransiciones.replace(" ", "");
        
        if(simbolos.equals("") || (estadosTransiciones.equals(""))){
            JOptionPane.showMessageDialog(this,"Ambos campos deben ser llenados");
        }
        else{
            if(verificarEntradaSimbolos(simbolos)&& verificarEntradaEstados(estadosTransiciones)){
                if(construirAutomata(simbolos, estadosTransiciones)){
                    JOptionPane.showMessageDialog(rootPane, "Su automata se ha construido con exito");
                    GUI2 validacion =new GUI2(automataMatriz,automataFilas);
                    validacion.setVisible(true);
                    validacion.setLocationRelativeTo(null);
                    
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Hubo un error al construir el automata, es posible que el formato de ingreso le falten o sobren caracteres");
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Las hileras ingresaas no cumplen con el formato requerido.");
            }
        }    
    }//GEN-LAST:event_consAFActionPerformed

    /**
     * Utiliza los string procesados para contruir el automata expresado en estos
     * @param simbolosV String que contiene los simbolos del automata
     * @param estadosV String que contiene los estados y transiciones del automata
     */
    private boolean construirAutomata(String simbolosV, String estadosV){
        if(tipoAF.equals("Deterministico")){
            ArrayList<String[]> lista = new ArrayList();
            int comas = contarCaracter(simbolosV, ',');
            String[] vectorAux=new String[comas+3];

            vectorAux[0]=" ";
            vectorAux[vectorAux.length-1]=" ";

            vectorAux=simbolosVector(simbolosV, vectorAux);

            lista.add(vectorAux);


            while (true) {
                //Se encuentran las posicones de los parentesis
                vectorAux = new String[comas+3];
                int intAux1=estadosV.indexOf("(");          
                int intAux2=estadosV.indexOf(")");
                String stringAux="";
                
                //si depues del cierre parentesis hay un /, la ultima casilla del vector se hace 
                //1 y se borra el / del string
                if(intAux2!=estadosV.length()-1){
                    if(estadosV.charAt(intAux2+1)=='/'){
                        vectorAux[vectorAux.length -1]="1";
                        if(intAux2+1==estadosV.length()-1){
                            estadosV=estadosV.substring(0,intAux2+1);
                        }
                        else{
                            estadosV=estadosV.substring(0,intAux2+1) + estadosV.substring(intAux2+2);
                        }

                    }
                    else{
                    vectorAux[vectorAux.length -1]="0";
                    }    
                }
                else{
                    vectorAux[vectorAux.length -1]="0";
                } 

                vectorAux[0]=estadosV.substring(0,intAux1);
                estadosV=estadosV.substring(intAux1+1);

                intAux2=estadosV.indexOf(")");
                stringAux = estadosV.substring(0,intAux2);
                if(contarCaracter(stringAux, ',')!=vectorAux.length -3){
                    return(false);
                }
                //Casualmente este metodo que era para los simbolos tambien me sirve 
                //para esta parte de los estados y transiciones
                lista.add(simbolosVector(stringAux, vectorAux));


                if(intAux2==estadosV.length()-1){
                    arrayLToMatriz(lista);
                    return(true);
                }
                else{
                    estadosV = estadosV.substring(intAux2+2);
                }
            } 
        }
        else{
            return(construirAutomataND(simbolosV,estadosV));
        }
    }
    
    /**
     * Utiliza los string procesados para contruir el automata No Deterministico
     * expresado en estos
     * @param simbolosV String que contiene los simbolos del automata
     * @param estadosV String que contiene los estados y transiciones del automata
     * @return 
     */
    private boolean construirAutomataND(String simbolosV, String estadosV){
        ArrayList<String[]> lista = new ArrayList();
        int comas = contarCaracter(simbolosV, ',');
        int intAux=0;
        int intAux2=0;
        String[] vectorAux=new String[comas+3];

        vectorAux[0]=" ";
        vectorAux[vectorAux.length-1]=" ";

        vectorAux=simbolosVector(simbolosV, vectorAux);

        lista.add(vectorAux);
        estadosV = estadosV + "- ";

        while(true){
            //se encuentra la posicion de el -
            vectorAux = new String[comas+3];
            intAux =estadosV.indexOf("-");
            intAux2 =0;
            String stringAux = estadosV.substring(0,intAux);
            estadosV=estadosV.substring(intAux+1);

            //si depues del cierre parentesis hay un /, la ultima casilla del vector se hace 
            //1 y se borra el / del string
            if(stringAux.charAt(stringAux.length()-1)=='/'){
                vectorAux[vectorAux.length-1]="1";
                stringAux=stringAux.substring(0,stringAux.length()-1);
            }
            else{
                vectorAux[vectorAux.length-1]="0";
            }

            intAux = stringAux.indexOf("(");
            vectorAux[0]=stringAux.substring(0,intAux);
            stringAux= stringAux.substring(intAux+1,stringAux.length()-1);

            //se comprueba si hay mas parentesis para saber si es una transicion no deterministica
            if(stringAux.contains("(")&&stringAux.contains(")")){
                intAux = stringAux.indexOf("(");
                intAux2 = stringAux.indexOf(")");
                if(intAux2==stringAux.length()-1){
                    stringAux= stringAux.substring(0,intAux) +stringAux.substring(intAux+1, intAux2).replace(',', '-');
                }
                else{
                    stringAux= stringAux.substring(0,intAux) + stringAux.substring(intAux+1, intAux2).replace(',', '-') + stringAux.substring(intAux2+1);
                }
            }
            else if(stringAux.contains("(")||stringAux.contains(")")){
                return(false);
            }
            

            lista.add(simbolosVector(stringAux, vectorAux));
            if(estadosV.equals(" ")){
                arrayLToMatriz(lista);
                return(true);
            }
        }
    }
    /**
     * Con un ArrayList de vectores contruye una matriz que representa unautomata
     * donde estos vectores son las filas de la matriz.
     * @param lista 
     */
    private void arrayLToMatriz(ArrayList<String[]> lista){
        this.automataFilas = lista;
        this.automataMatriz = new String[lista.size()][lista.get(0).length];
        
        for (int i = 0; i <lista.size(); i++) {
            for (int j = 0; j <lista.get(0).length; j++) {
                automataMatriz[i][j]=lista.get(i)[j]; 
            }
            
        } 
    }
    
    /**
     * Separa los valores contenidos en el string y los convierte en valores del vector ingresado
     * @param simb
     * @param vector
     * @return Retorna un vector con los simbolos ingresados en string
     */
    public String[] simbolosVector(String simb,String[] vector){
        int intAux=vector.length -3;
        int contador=0;
        while (contador<=intAux) {  
            if(contador<intAux){
                vector[contador+1]=simb.substring(0, simb.indexOf(","));
                simb=simb.substring(simb.indexOf(",")+1);
                contador++;
            }
            else if(contador==intAux){
                vector[contador+1]=simb.substring(0);
                contador++;
            } 
        }
        return(vector);
    }
    
    /**
     * Controla algunos casos problematicos que se podria presentar a la hora de recibir 
     * el string requerido
     * @param inputSim
     * @return Retorna true si el string se acepta de lo contrario retorna false
     */
    private boolean verificarEntradaSimbolos(String inputSim){
        if(String.valueOf(inputSim.charAt(0)).equals(",")||String.valueOf(inputSim.charAt(inputSim.length()-1)).equals(",")||inputSim.contains(",,")){
            return(false);
        }
        return(true);
    }
    
    /**
     * Controla algunos casos problematicos que se podria presentar a la hora de recibir 
     * el string requerido
     * @param inputEst String ingresado
     * @return Retorna true si el string se acepta de lo contrario retorna false
     */
    private boolean verificarEntradaEstados(String inputEst){
        if(String.valueOf(inputEst.charAt(0)).equals(",")||String.valueOf(inputEst.charAt(0)).equals("-")||String.valueOf(inputEst.charAt(0)).equals("(")||String.valueOf(inputEst.charAt(0)).equals(")") ||String.valueOf(inputEst.charAt(inputEst.length()-1)).equals("-")||!(String.valueOf(inputEst.charAt(inputEst.length()-1)).equals(")")||String.valueOf(inputEst.charAt(inputEst.length()-1)).equals("/"))){
            return(false);
        }
        if(inputEst.contains("()")||inputEst.contains("(,")||inputEst.contains(",)")||inputEst.contains(",,")||inputEst.contains("--")||inputEst.contains("(-")||inputEst.contains("-)")){
            return(false);
        }
        if(contarCaracter(inputEst,'(')!=contarCaracter(inputEst, ')')){
            return(false);
        }
        return(true);
    }
    
    /**
     * Cuenta cuantas veces se repite el caracter ingresado en la hilera ingresada
     * @param hilera String en el que se busca el caracter
     * @param caracter Caracter que se busca
     * @return 
     */
    public int contarCaracter(String hilera, char caracter){
        int contador=0;
        for (int i = 0; i < hilera.length(); i++) {
            if(hilera.charAt(i)==caracter){
                contador++;
            }
        }
        return(contador);
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consAF;
    private javax.swing.JTextField estadosText;
    private javax.swing.JButton info1;
    private javax.swing.JButton info2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField simbolosText;
    private javax.swing.JComboBox<String> tipoAFCB;
    // End of variables declaration//GEN-END:variables
}
