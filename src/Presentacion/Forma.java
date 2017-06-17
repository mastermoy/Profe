package Presentacion;
import Negocios.Calculos;
import javax.swing.DefaultListModel;

/**
 *
 * @author mastermoy
 */
public class Forma extends javax.swing.JFrame {
    
    int n1,n2,result;
    
    public Forma() {
        initComponents();
        pnl_client.setVisible(false);
        pnl_visitor.setVisible(false);
                 
    }
    Calculos op1= new Calculos();  
    DatosCliente fdatosCliente = new DatosCliente();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_radio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_tablamult = new javax.swing.JList<>();
        cbx_tabla = new javax.swing.JComboBox<>();
        pnl_login = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        cbx_usertype = new javax.swing.JComboBox<>();
        btn_getdata = new javax.swing.JButton();
        btn_showdata = new javax.swing.JButton();
        pnl_client = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        pnl_visitor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_visitName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_visitorAge = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_n1 = new javax.swing.JTextField();
        txt_n2 = new javax.swing.JTextField();
        pnl_cbx = new javax.swing.JPanel();
        cbx_operations = new javax.swing.JComboBox<>();
        lbl_cbxresult = new javax.swing.JLabel();
        Pnl_radio = new javax.swing.JPanel();
        rdo_resta = new javax.swing.JRadioButton();
        rdo_prod = new javax.swing.JRadioButton();
        rdo_div = new javax.swing.JRadioButton();
        rdo_suma = new javax.swing.JRadioButton();
        lbl_radioresult = new javax.swing.JLabel();
        btn_radiocalc = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("Principal"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas de Multiplicar"));

        lst_tablamult.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(lst_tablamult);

        cbx_tabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbx_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_tabla, 0, 136, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_login.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        lbl_name.setText("Nombre:");

        cbx_usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Visitante" }));

        btn_getdata.setText("Otener Datos");
        btn_getdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getdataActionPerformed(evt);
            }
        });

        btn_showdata.setText("Ver Datos");
        btn_showdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_getdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_usertype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_showdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name)
                .addGap(4, 4, 4)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_usertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_getdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_showdata)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnl_client.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        jLabel3.setText("Clave:");

        jLabel4.setText("Password:");

        txt_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_clientLayout = new javax.swing.GroupLayout(pnl_client);
        pnl_client.setLayout(pnl_clientLayout);
        pnl_clientLayout.setHorizontalGroup(
            pnl_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addGroup(pnl_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_clientLayout.setVerticalGroup(
            pnl_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_visitor.setBorder(javax.swing.BorderFactory.createTitledBorder("Visitantes"));

        jLabel5.setText("Nombre:");

        jLabel6.setText("Edad:");

        javax.swing.GroupLayout pnl_visitorLayout = new javax.swing.GroupLayout(pnl_visitor);
        pnl_visitor.setLayout(pnl_visitorLayout);
        pnl_visitorLayout.setHorizontalGroup(
            pnl_visitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_visitorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_visitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(2, 2, 2)
                .addGroup(pnl_visitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_visitName, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(txt_visitorAge))
                .addContainerGap())
        );
        pnl_visitorLayout.setVerticalGroup(
            pnl_visitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_visitorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_visitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_visitName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_visitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_visitorAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        jLabel1.setText("Numero1:");

        jLabel2.setText("Numero2:");

        pnl_cbx.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cbx_operations.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division" }));
        cbx_operations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_operationsActionPerformed(evt);
            }
        });

        lbl_cbxresult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout pnl_cbxLayout = new javax.swing.GroupLayout(pnl_cbx);
        pnl_cbx.setLayout(pnl_cbxLayout);
        pnl_cbxLayout.setHorizontalGroup(
            pnl_cbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cbxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_cbxresult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_cbxLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbx_operations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        pnl_cbxLayout.setVerticalGroup(
            pnl_cbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cbxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx_operations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_cbxresult, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pnl_radio.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        grp_radio.add(rdo_resta);
        rdo_resta.setText("Resta");

        grp_radio.add(rdo_prod);
        rdo_prod.setText("Multiplicacion");

        grp_radio.add(rdo_div);
        rdo_div.setText("Division");

        grp_radio.add(rdo_suma);
        rdo_suma.setText("Suma");

        lbl_radioresult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btn_radiocalc.setText("Calcular");
        btn_radiocalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_radiocalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_radioLayout = new javax.swing.GroupLayout(Pnl_radio);
        Pnl_radio.setLayout(Pnl_radioLayout);
        Pnl_radioLayout.setHorizontalGroup(
            Pnl_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_radioLayout.createSequentialGroup()
                .addComponent(btn_radiocalc)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Pnl_radioLayout.createSequentialGroup()
                .addGroup(Pnl_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_radioresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Pnl_radioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Pnl_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo_suma)
                            .addComponent(rdo_resta)
                            .addComponent(rdo_prod)
                            .addComponent(rdo_div))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Pnl_radioLayout.setVerticalGroup(
            Pnl_radioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_radioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdo_suma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdo_resta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdo_prod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdo_div)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_radiocalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_radioresult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txt_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txt_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Pnl_radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pnl_radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_visitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnl_visitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnl_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btn_exit)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codeActionPerformed

    private void btn_radiocalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_radiocalcActionPerformed
        n1 = Integer.parseInt(txt_n1.getText());
        n2 = Integer.parseInt(txt_n2.getText());
        
        if(rdo_suma.isSelected()){
            result = op1.suma(n1,n2);
        }
        if(rdo_resta.isSelected()){
            result = op1.resta(n1,n2);
        }
        if(rdo_prod.isSelected()){
            result = op1.multi(n1,n2);
        }
        if(rdo_div.isSelected()){
            result = op1.div(n1,n2);
        }
        
        lbl_radioresult.setText(""+result);
        
        
    }//GEN-LAST:event_btn_radiocalcActionPerformed

    private void cbx_operationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_operationsActionPerformed
        n1 = Integer.parseInt(txt_n1.getText());
        n2 = Integer.parseInt(txt_n2.getText()); 
      
        if (cbx_operations.getSelectedIndex()==0){            
            result = op1.suma(n1,n2);
            }
        
        if (cbx_operations.getSelectedIndex()==1){            
            result = op1.resta(n1,n2);
            }
        if (cbx_operations.getSelectedIndex()==2){            
            result = op1.multi(n1,n2);
            }
        
        if (cbx_operations.getSelectedIndex()==3){            
            result = op1.div(n1,n2);
            }
        
       lbl_cbxresult.setText(""+result); 
    }//GEN-LAST:event_cbx_operationsActionPerformed

    private void cbx_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tablaActionPerformed
        lst_tablamult.setListData(new String[0]);
        int multiplicador,result;
       // String resultado="";
        multiplicador = (cbx_tabla.getSelectedIndex())+1;
        DefaultListModel tabla = new DefaultListModel();
        
        for (int i=0;i<10;i++){
            result= multiplicador * (i+1);
            //resultado=multiplicador +" x "+ (i+1)+" = "+result;
            tabla.addElement(multiplicador +" x "+ (i+1)+" = "+result);
        }
        lst_tablamult.setModel(tabla);

    }//GEN-LAST:event_cbx_tablaActionPerformed

    private void btn_getdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getdataActionPerformed
      if (cbx_usertype.getSelectedItem()=="Cliente"){
        pnl_client.setVisible(true);
        pnl_visitor.setVisible(false);  
                  
      }
      else if (cbx_usertype.getSelectedItem()=="Visitante"){
         pnl_visitor.setVisible(true);  
         pnl_client.setVisible(false);
      }
    }//GEN-LAST:event_btn_getdataActionPerformed

    private void btn_showdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showdataActionPerformed
       if(cbx_usertype.getSelectedItem()=="Cliente"){
           
           fdatosCliente.jLabel2.setText(txt_name.getText());
           fdatosCliente.jLabel3.setText(txt_code.getText());
           fdatosCliente.jLabel4.setText(txt_password.getText());
         }
       else if (cbx_usertype.getSelectedItem()=="Visitante"){
           
           fdatosCliente.jLabel2.setText(txt_name.getText());
           fdatosCliente.jLabel3.setText(txt_visitName.getText());
           fdatosCliente.jLabel4.setText(txt_visitorAge.getText());
         }      
       super.dispose();
       fdatosCliente.show();
       
        
    }//GEN-LAST:event_btn_showdataActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_radio;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_getdata;
    private javax.swing.JButton btn_radiocalc;
    private javax.swing.JButton btn_showdata;
    private javax.swing.JComboBox<String> cbx_operations;
    private javax.swing.JComboBox<String> cbx_tabla;
    private javax.swing.JComboBox<String> cbx_usertype;
    private javax.swing.ButtonGroup grp_radio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cbxresult;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_radioresult;
    private javax.swing.JList<String> lst_tablamult;
    private javax.swing.JPanel pnl_cbx;
    private javax.swing.JPanel pnl_client;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JPanel pnl_visitor;
    private javax.swing.JRadioButton rdo_div;
    private javax.swing.JRadioButton rdo_prod;
    private javax.swing.JRadioButton rdo_resta;
    private javax.swing.JRadioButton rdo_suma;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_n1;
    private javax.swing.JTextField txt_n2;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_visitName;
    private javax.swing.JTextField txt_visitorAge;
    // End of variables declaration//GEN-END:variables
}
