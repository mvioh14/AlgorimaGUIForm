/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectalgoritmauas;
//ini adalah package suatu package yang guna nya untuk pengelompokan paket dari source code

import java.util.LinkedList;
//untuk memanggil fungsi format dari Algo linkedlist
import java.util.Queue;
//untuk memanggil fungsi format dari Algo Queue
import javax.swing.JOptionPane;
//untuk memanggil fungsi format control pane dari desain java swing

/**
 *
 * @author LENOVO
 */
public class QueueAlgo extends javax.swing.JFrame {
//ini merupakan kelas extends yaitu kelas induk dari kelas ini

    /**
     * Creates new form QueueAlgo
     */
    Queue<Object> antrian = new LinkedList<>();
    //ini adalah proses membuat objek Queue baru dengan nama antrian pada fungsi Linkedlist yang sudah di import di awal
    int nomor = 0;
    //ini adalah cara kira mendeklarasikan sebuah variabel dengan nama nomor dengan type integer yang diisi dengan nilai default 0(kosong)
    //mengapa diisi dengan kosong? Karena ini akan berhubungan dengan algoritma queue yang ada di bawah kode program ini.
    
    
    // disini kita menginsialisasikan method yang telah buat
    //jadi method yang ada dipanggil dan diinisialsikan pada acceess modifier public queue
    public QueueAlgo() {
        initComponents();
        //ini merupakan method initComponents
        setTitle("Created by Muhammad Vio Hardiansyah");
        //ini merupakan tittle dari pembuat yg biasa berada di pojok kiri atas
        inisialisasi();
        //ini merupakan method inisialisai 
    }
    private void inisialisasi(){
    //ini adalah method inisialisasi dan hanya berisi text pada variabel text yang ada pada form
    
        /*pada lnJumlahAntrian berisikan nilai 0 karena ini adalah default ketika tidak ada aktivitas pada program antrian
        jika telah ada maka akan berisi nilai jumlah antrian yang sedang berjalan
        */
        ibjumlahantrian.setText("0");
        //di atas ini merupakan nilai default karena belum berisikan apa apa,prpgram ini akan berisi ketika program sudah dimulai
        //dan sudah beroperasi sehingga berisikan nomor antrian
        ibtotalantrian.setText("0");
        ibpanggilanantrian.setText("-----");
        
        //dibawah ini ada string dan huruf yang akan tampil pada aplikasi
        txtatas.setText("BANK BRI SYARIAH");
        txtatas1.setText("JL.JENDRAL SUDIRMAN");
        txtatas2.setText("KOTA BAGAN BATU");
        txtatas3.setText("JUM'AT,02 JULI 2021");
        txtatas4.setText("Nomor Antrian");
        txtatas5.setText("--------");
        txtatas6.setText("Silahkan menunggu");
        txtatas7.setText("--------");
    }
    
    //ini adalah method tambahan yaitu tambah antrian
    //method ini di gunakan karena adanya tambahan antrian pada aplikasi
    //disini kita menggunakan access modeifier private karena dengan menggunakan access ini
    //kita hanya dapat mengakes method ini hanya pada class queue ini saja tidak dapat diakses pada class lainnya.
    private void tambahAntrian(){
        //pada kode ini kita nanti akan melakukan perulangan pada nomor antrian, karena 
        //setiap ada data yang masuk/ nilai baru yang keluar kode ini akan melakukan perulangan pada 
        //nomor selanjutnya
        nomor++;
        //pada bagian ini kita membuat variabel dengan nama antr yang berisi type data String
        //lalu digabuung/dimasukkan dengan variable nomor diatas
        String antr = "Antrian "+nomor;
        //pada bagian kode ini kita menambhakn nilai pada variable antr yang sudah dibuat diatas tadi
        //pada bagian kode ini kita menggunakan algo linkedlist
        //yaitu add ,jadi add berfungsi untuk menambahkan sebuah nilai ke variable
        antrian.add(antr);
        //pada kode di bawah ini kita membuat kode baru lagi dengan nama cvt yang dengan menggunakan type data String
        //lalu mengembalikan nilai awal tadi dengan integer
        //dan mendapat kan panjang string yang telah di convert pada method valueOf sebelumnya
        String cvt = String.valueOf(antrian.size());
        //kode di bawah ini mengubah secara langsung pada setText nilai jumlah antrian yang didapat tadi
        ibjumlahantrian.setText(cvt);
        //pada program ini sudah terdapat algoritma stack,ketika di check kengan peek maka queue juga
        ibpanggilanantrian.setText(""+antrian.peek());
        //mengubah nilai antrian pada gui
        ibtotalantrian.setText(""+nomor);
        //ini merupakan salah satu method yang gunanya untuk mengupdate sebuah kode sehingga memiliki hasil terupdate
        //dan setiap ada perubahan/penambahan data pada source code
        txtantrian.append(antr + "\n");
        
        //di bawah ini adalah isi dari gui form jika sudah di Run Files
        txtatas3.setText("JUM'AT, 02 JULI 2021");
        txtatas4.setText("Nomor Antrian");
        txtatas5.setText("  " + nomor);
        //".." di atas ini akan berisi nomor antrian
        txtatas6.setText("Silahkan menunggu " + cvt + " Antrian Lagi ");
        txtatas7.setText("Mohon untuk bersabar ini cobaan");
    }
    
    //dibawah ini juga menggunakan method private agar data hanya bisa di gunakan di class ini dan tidak dapat di gunakan di class lainnya
    private void prosesAntrian(){
        //isEmpty disini digunakan untuk pengecekan data apakah nilai antrian tersebut bernilai kosong
        if(antrian.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ambil Nomor antrian terlebih dahulu !");
        }
        //di bawah ini terdapat txtantrian yang di mana txtantrian ini kosong,karena nntinya akan di inputkan saat pertama
        txtantrian.setText("");
        //pada nilai antrian dibawah digunakan method bawaan queue itu sendiri
        //yakni poll untuk mengatur banyaknya antrian yang dibuat sehingga dapat mengeksekusi 
        //hingga task antrian yang paling akhir
        antrian.poll();
        //selanjutnya antrian tadi yang sudah berisi akan dilakukan looping dengan menggunakan forEach loop
        //maka semakin banyak antrian maka akan terjadi looping sebanyak data yang masuk diawal nntinya
        antrian.forEach((Object element) -> {
        //pada proses ini nilai yang ada di forEach itu sendiri akan di prosesn dan menambahkan data secara otomatis
        //sebanyak nilai antrian yang dimasukkan
            txtantrian.append("" + element + "n");
        });
        
        //disini masih terdapat pengecekan apakah antrian masih kosong dengan method bawaan queue itu yakni empty
        if(antrian.isEmpty()){
        //jika kosong /empty akan menampilkan "-----"
            ibpanggilanantrian.setText("-----");
        }else{
        //jika data berisi atau tidak kosong maka program akan menggunakan fungsi peek kembali
        //gunanya untuk mengecek data yang sudah masuk ke sistem Queue tersebut yaitu FIFO(First in First Out)
        //jadi queue itu dapat di simpulkan dari prinsip antrian ia yang pertama masuk dan ia juga yang pertama keluar
            ibpanggilanantrian.setText(""+antrian.peek());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtantrian = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        ibtotalantrian = new javax.swing.JLabel();
        ibjumlahantrian = new javax.swing.JLabel();
        ibpanggilanantrian = new javax.swing.JLabel();
        btnProsesAntrian = new javax.swing.JButton();
        btnAmbilNomorAntrian = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtatas2 = new javax.swing.JLabel();
        txtatas = new javax.swing.JLabel();
        txtatas1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtatas4 = new javax.swing.JLabel();
        txtatas3 = new javax.swing.JLabel();
        txtatas5 = new javax.swing.JLabel();
        txtatas6 = new javax.swing.JLabel();
        txtatas7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Daftar Antrian");

        txtantrian.setColumns(20);
        txtantrian.setRows(5);
        jScrollPane1.setViewportView(txtantrian);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        ibtotalantrian.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ibtotalantrian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibtotalantrian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ibjumlahantrian.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ibjumlahantrian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibjumlahantrian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ibpanggilanantrian.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ibpanggilanantrian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibpanggilanantrian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnProsesAntrian.setBackground(new java.awt.Color(0, 255, 204));
        btnProsesAntrian.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProsesAntrian.setText("PROSES ANTRIAN");
        btnProsesAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesAntrianActionPerformed(evt);
            }
        });

        btnAmbilNomorAntrian.setBackground(new java.awt.Color(0, 255, 204));
        btnAmbilNomorAntrian.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAmbilNomorAntrian.setText("AMBIL NOMOR ANTRIAN");
        btnAmbilNomorAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbilNomorAntrianActionPerformed(evt);
            }
        });

        jLabel5.setText("LOKET");

        jLabel6.setText("Mesin Antrian");

        jLabel7.setText("Jumlah Antrian");

        jLabel8.setText("Total Antrian");

        jLabel9.setText("Panggilan Nomor Antrian");

        txtatas2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtatas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtatas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtatas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtatas1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtatas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtatas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtatas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtatas, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtatas1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtatas2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(txtatas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 83, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)))
        );

        txtatas4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtatas4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtatas3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtatas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtatas5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtatas5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtatas6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtatas6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtatas7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtatas7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtatas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtatas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtatas5, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
            .addComponent(txtatas6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtatas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtatas3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtatas4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtatas5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtatas6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtatas7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("KELUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ibpanggilanantrian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(ibjumlahantrian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(ibtotalantrian, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel8))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnProsesAntrian)))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addComponent(btnAmbilNomorAntrian)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(149, 149, 149))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ibtotalantrian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibjumlahantrian, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibpanggilanantrian, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProsesAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAmbilNomorAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jButton1)
                .addGap(112, 112, 112))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesAntrianActionPerformed
        // TODO add your handling code here:
        //ini merupakan action prosesAntrian yang digunakan dalam button Proses Anrian
        //pada proses ini ketika tombol ditekan maka langsung menuju method yang sudah diinisialisasikan di program tadinya
        prosesAntrian();
    }//GEN-LAST:event_btnProsesAntrianActionPerformed

    private void btnAmbilNomorAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbilNomorAntrianActionPerformed
        // TODO add your handling code here:
        //ini merupakan action tambahAntrian yang digunakan dalam button Proses Antrian
        //pada proses ini juga sama seperti di atas saat di tekan maka langsung menuju ke method yang sudah di inisialisasikan
        tambahAntrian();
    }//GEN-LAST:event_btnAmbilNomorAntrianActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int answer= JOptionPane.showConfirmDialog(null," Anda yakin ingin keluar?", "KELUAR", JOptionPane.OK_OPTION);
        //ini adalah action keluar yang di gunakan untuk keluar dari aplikasi ,dan sudah di inisialisasikan ke method
        if(answer==JOptionPane.OK_OPTION){
            dispose();
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueueAlgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QueueAlgo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmbilNomorAntrian;
    private javax.swing.JButton btnProsesAntrian;
    private javax.swing.JLabel ibjumlahantrian;
    private javax.swing.JLabel ibpanggilanantrian;
    private javax.swing.JLabel ibtotalantrian;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtantrian;
    private javax.swing.JLabel txtatas;
    private javax.swing.JLabel txtatas1;
    private javax.swing.JLabel txtatas2;
    private javax.swing.JLabel txtatas3;
    private javax.swing.JLabel txtatas4;
    private javax.swing.JLabel txtatas5;
    private javax.swing.JLabel txtatas6;
    private javax.swing.JLabel txtatas7;
    // End of variables declaration//GEN-END:variables
}