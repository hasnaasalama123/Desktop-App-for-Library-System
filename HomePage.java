import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    List<book> books;
    List<student> studentList;
    int CurrentIndex = 0;
    int maxBooks = 0;

    public HomePage() {
        initComponents();
        books = new ArrayList<book>();
        studentList = new ArrayList<student>();
        try {
            Connection cnn = MyConnection.getConnection();
            PreparedStatement query = cnn.prepareStatement("select * from `books`");
            ResultSet set = query.executeQuery();
            while (set.next()) {
                book newBook = new book();
                newBook.Id = set.getInt(1);
                newBook.Name = set.getString(2);
                newBook.Auther = set.getString(3);
                newBook.Publisher = set.getString(4);
                newBook.Category = set.getString(5);
                newBook.Abstract = set.getString(6);
                books.add(newBook);
                maxBooks++;
            }

            PreparedStatement studentQuery = cnn.prepareStatement("select * from `students`");
            ResultSet studentSet = studentQuery.executeQuery();
            studentsCmb.removeAllItems();
            while (studentSet.next()) {
                student std = new student();
                std.Id = studentSet.getInt(1);
                std.FName = studentSet.getString(2);
                std.LName = studentSet.getString(3);
                std.Address = studentSet.getString(4);
                std.CollegeYear = studentSet.getString(5);
                std.Section = studentSet.getString(6);
                studentList.add(std);
                studentsCmb.addItem(std.FName);
            }
        } catch (Exception ex) {

        }
        CurrentIndex = 0;
        Showbook(CurrentIndex);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vres = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        txtBookName = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txtBookPublisher = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        Abstract = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        studentsCmb = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAbstract = new javax.swing.JTextArea();
        txtBookAuther = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        currentBook = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(200, 20, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vres.setForeground(new java.awt.Color(255, 51, 51));
        vres.setText("                 ");
        getContentPane().add(vres, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 612, -1, -1));

        jPanel1.setBackground(new java.awt.Color(216, 208, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)), " New Book ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 36))); // NOI18N

        jButton7.setText("New Student");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txtBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookNameActionPerformed(evt);
            }
        });

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setText("Return");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setText("<");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        txtBookPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookPublisherActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Category");

        jButton10.setText(">>");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        Abstract.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Abstract.setText("Abstract");
        Abstract.setToolTipText("");

        jButton3.setText("Update/Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        studentsCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton8.setText(">");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton5.setText("New Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton11.setText("<<");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Books Borrowed By");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        txtAbstract.setColumns(20);
        txtAbstract.setRows(5);
        jScrollPane1.setViewportView(txtAbstract);

        txtBookAuther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookAutherActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Publisher");

        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel4.setText("Auther");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel7.setText("Student Name");

        jButton2.setText("Borrow");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel3.setText("Book Name");

        currentBook.setText(".....");
        currentBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(Abstract)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCategory)
                            .addComponent(txtBookName)
                            .addComponent(txtBookAuther)
                            .addComponent(txtBookPublisher)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(studentsCmb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jButton11)
                                    .addGap(7, 7, 7)
                                    .addComponent(jButton9)))
                            .addGap(12, 12, 12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(currentBook, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(60, 60, 60))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookAuther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Abstract, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentsCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton10)
                    .addComponent(jButton9)
                    .addComponent(jButton11)
                    .addComponent(currentBook))
                .addGap(76, 76, 76))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 627, 530));

        setSize(new java.awt.Dimension(672, 682));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        BooksBorrow b = new BooksBorrow();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        LoginForm frm = new LoginForm();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtBookNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtBookNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtBookNameActionPerformed

    private void txtBookAutherActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtBookAutherActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtBookAutherActionPerformed

    private void txtBookPublisherActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtBookPublisherActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtBookPublisherActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCategoryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        int studentId = -1;
        String selectedName = studentsCmb.getSelectedItem().toString();
        for (student std : studentList) {
            if (studentId != -1)
                return;
            if (selectedName == std.FName) {
                studentId = std.Id;
            }
        }
        try {
            Connection cnn = MyConnection.getConnection();
            book currentBook = books.get(CurrentIndex);
            PreparedStatement query = cnn.prepareStatement("Insert Into booksstudents(StudentId, BookId) values('"
                    + studentId + "','" + currentBook.Id + "')");
            query.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        if (txtBookName.getText().equals("")) {
            vres.setText("PLeas Enter Book Name");
            return ;
        }
        
        
        
        
        
        
        book currentBook = books.get(CurrentIndex);
        currentBook.Auther = txtBookAuther.getText();
        currentBook.Abstract = txtAbstract.getText();
        currentBook.Category = txtCategory.getText();
        currentBook.Name = txtBookName.getText();
        currentBook.Publisher = txtBookPublisher.getText();

        try {
            Connection cnn = MyConnection.getConnection();
            String command = "";
            if (currentBook.Id > -1) {
                command = "update books set name='" + currentBook.Name + "', auther='" + currentBook.Auther
                        + "', publisher='" + currentBook.Publisher
                        + "', category='" + currentBook.Category + "', abstract = '" + currentBook.Abstract
                        + "' where id ='" + currentBook.Id + "'";
            } else {
                command = "insert into books(name,auther,publisher, category, abstract) values('" + currentBook.Name
                        + "','" + currentBook.Auther + "','" + currentBook.Publisher
                        + "','" + currentBook.Category + "','" + currentBook.Abstract + "')";
            }
            PreparedStatement query = cnn.prepareStatement(command);
            query.execute();
        } catch (Exception ex) {

        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        int studentId = -1;
        String selectedName = studentsCmb.getSelectedItem().toString();
        for (student std : studentList) {
            if (studentId != -1)
                return;
            if (selectedName == std.FName) {
                studentId = std.Id;
            }
        }
        try {
            Connection cnn = MyConnection.getConnection();
            book currentBook = books.get(CurrentIndex);
            PreparedStatement query = cnn.prepareStatement("delete from booksstudents where studentId='"+ studentId + "' and bookId = '" + currentBook.Id + "'");
            query.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }   
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        txtAbstract.setText("");
        txtBookName.setText("");
        txtBookPublisher.setText("");
        txtCategory.setText("");
        txtBookAuther.setText("");
        book newbook = new book();
        newbook.Id = -1;
        books.add(newbook);
        maxBooks++;
        CurrentIndex = maxBooks - 1;
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
        RegisterForm rfrm = new RegisterForm();
        rfrm.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
        if (CurrentIndex < maxBooks - 1) // TODO add your handling code here:
            CurrentIndex++;
        Showbook(CurrentIndex);
    }// GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
        if (CurrentIndex > 0)
            CurrentIndex--;
        Showbook(CurrentIndex);// TODO add your handling code here:
    }// GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
        CurrentIndex = maxBooks - 1;
        Showbook(CurrentIndex);
    }// GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton11ActionPerformed
        CurrentIndex = 0;
        Showbook(CurrentIndex);
    }// GEN-LAST:event_jButton11ActionPerformed

    private void txtAbstractActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtAbstractActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtAbstractActionPerformed

    private void Showbook(int Index) {
        book cbook = books.get(Index);
        txtBookName.setText(cbook.Name);
        txtAbstract.setText(cbook.Abstract);
        txtBookAuther.setText(cbook.Auther);
        txtCategory.setText(cbook.Category);
        txtBookPublisher.setText(cbook.Publisher);
       currentBook.setText("Book " + (Index + 1) + " Of " + maxBooks);

        try {
            Connection cnn = MyConnection.getConnection();
            book currentBook = books.get(CurrentIndex);
            PreparedStatement query = cnn.prepareStatement("select studentId from booksstudents where bookId = '" + currentBook.Id + "'");

            ResultSet res = query.executeQuery();
            if (res.next()) {
                int stdId = res.getInt(1);
                for (student std : studentList) { 
                    if (stdId == std.Id) {
                        studentsCmb.setSelectedItem(std.FName);
                    }
                }
            }

        } catch (Exception ex) {

        }   

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Abstract;
    private javax.swing.JLabel currentBook;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> studentsCmb;
    private javax.swing.JTextArea txtAbstract;
    private javax.swing.JTextField txtBookAuther;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtBookPublisher;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JLabel vres;
    // End of variables declaration//GEN-END:variables
  
    private static class CurrentBook {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public CurrentBook() {
        }
    }
}
