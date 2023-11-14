
package simplecalculator;

public class calc extends javax.swing.JFrame {

    public calc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        equalsto1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        times = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        three = new javax.swing.JButton();
        two = new javax.swing.JButton();
        one = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        eyt = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        equalsto = new javax.swing.JButton();
        erase = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        zerow = new javax.swing.JButton();
        point = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        result = new javax.swing.JTextField();
        equation = new javax.swing.JLabel();
        and = new javax.swing.JButton();
        or = new javax.swing.JButton();
        equalsto2 = new javax.swing.JButton();
        equalsto3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        equalsto1.setBackground(new java.awt.Color(255, 153, 0));
        equalsto1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        equalsto1.setForeground(new java.awt.Color(255, 255, 255));
        equalsto1.setText("=");
        equalsto1.setMaximumSize(new java.awt.Dimension(44, 44));
        equalsto1.setMinimumSize(new java.awt.Dimension(44, 44));
        equalsto1.setPreferredSize(new java.awt.Dimension(44, 44));
        equalsto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsto1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");
        setPreferredSize(new java.awt.Dimension(280, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(255, 395));

        times.setBackground(new java.awt.Color(255, 204, 0));
        times.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        times.setForeground(new java.awt.Color(255, 255, 255));
        times.setText("x");
        times.setMaximumSize(new java.awt.Dimension(44, 44));
        times.setMinimumSize(new java.awt.Dimension(44, 44));
        times.setPreferredSize(new java.awt.Dimension(44, 44));
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(255, 204, 0));
        divide.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        divide.setForeground(new java.awt.Color(255, 255, 255));
        divide.setText("/");
        divide.setMaximumSize(new java.awt.Dimension(44, 44));
        divide.setMinimumSize(new java.awt.Dimension(44, 44));
        divide.setPreferredSize(new java.awt.Dimension(44, 44));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(255, 204, 0));
        minus.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setText("-");
        minus.setMaximumSize(new java.awt.Dimension(44, 44));
        minus.setMinimumSize(new java.awt.Dimension(44, 44));
        minus.setPreferredSize(new java.awt.Dimension(44, 44));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(255, 204, 0));
        plus.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 255, 255));
        plus.setText("+");
        plus.setMaximumSize(new java.awt.Dimension(44, 44));
        plus.setMinimumSize(new java.awt.Dimension(44, 44));
        plus.setPreferredSize(new java.awt.Dimension(44, 44));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        three.setText("3");
        three.setMaximumSize(new java.awt.Dimension(42, 42));
        three.setMinimumSize(new java.awt.Dimension(42, 42));
        three.setPreferredSize(new java.awt.Dimension(42, 42));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        two.setText("2");
        two.setMaximumSize(new java.awt.Dimension(42, 42));
        two.setMinimumSize(new java.awt.Dimension(42, 42));
        two.setPreferredSize(new java.awt.Dimension(42, 42));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        one.setText("1");
        one.setMaximumSize(new java.awt.Dimension(42, 42));
        one.setMinimumSize(new java.awt.Dimension(42, 42));
        one.setPreferredSize(new java.awt.Dimension(42, 42));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        four.setText("4");
        four.setMaximumSize(new java.awt.Dimension(42, 42));
        four.setMinimumSize(new java.awt.Dimension(42, 42));
        four.setPreferredSize(new java.awt.Dimension(42, 42));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        five.setText("5");
        five.setMaximumSize(new java.awt.Dimension(42, 42));
        five.setMinimumSize(new java.awt.Dimension(42, 42));
        five.setPreferredSize(new java.awt.Dimension(42, 42));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        six.setText("6");
        six.setMaximumSize(new java.awt.Dimension(42, 42));
        six.setMinimumSize(new java.awt.Dimension(42, 42));
        six.setPreferredSize(new java.awt.Dimension(42, 42));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        nine.setText("9");
        nine.setMaximumSize(new java.awt.Dimension(42, 42));
        nine.setMinimumSize(new java.awt.Dimension(42, 42));
        nine.setPreferredSize(new java.awt.Dimension(42, 42));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        eyt.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        eyt.setText("8");
        eyt.setMaximumSize(new java.awt.Dimension(42, 42));
        eyt.setMinimumSize(new java.awt.Dimension(42, 42));
        eyt.setPreferredSize(new java.awt.Dimension(42, 42));
        eyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eytActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        seven.setText("7");
        seven.setMaximumSize(new java.awt.Dimension(42, 42));
        seven.setMinimumSize(new java.awt.Dimension(42, 42));
        seven.setPreferredSize(new java.awt.Dimension(42, 42));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        equalsto.setBackground(new java.awt.Color(255, 153, 0));
        equalsto.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        equalsto.setForeground(new java.awt.Color(255, 255, 255));
        equalsto.setText("=");
        equalsto.setMaximumSize(new java.awt.Dimension(44, 44));
        equalsto.setMinimumSize(new java.awt.Dimension(44, 44));
        equalsto.setPreferredSize(new java.awt.Dimension(44, 44));
        equalsto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalstoActionPerformed(evt);
            }
        });

        erase.setBackground(new java.awt.Color(204, 153, 0));
        erase.setForeground(new java.awt.Color(255, 255, 255));
        erase.setText("⌫");
        erase.setMaximumSize(new java.awt.Dimension(44, 44));
        erase.setMinimumSize(new java.awt.Dimension(44, 44));
        erase.setPreferredSize(new java.awt.Dimension(44, 44));
        erase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 153, 0));
        reset.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("C");
        reset.setMaximumSize(new java.awt.Dimension(44, 44));
        reset.setMinimumSize(new java.awt.Dimension(44, 44));
        reset.setPreferredSize(new java.awt.Dimension(44, 44));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        zerow.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        zerow.setText("0");
        zerow.setMaximumSize(new java.awt.Dimension(42, 42));
        zerow.setMinimumSize(new java.awt.Dimension(42, 42));
        zerow.setPreferredSize(new java.awt.Dimension(42, 42));
        zerow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zerowActionPerformed(evt);
            }
        });

        point.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        point.setText(".");
        point.setMaximumSize(new java.awt.Dimension(42, 42));
        point.setMinimumSize(new java.awt.Dimension(42, 42));
        point.setPreferredSize(new java.awt.Dimension(42, 42));
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        result.setText("0");
        result.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 204, 0), null, new java.awt.Color(204, 204, 0)));

        equation.setForeground(new java.awt.Color(255, 0, 0));
        equation.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(equation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        and.setBackground(new java.awt.Color(255, 204, 0));
        and.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        and.setForeground(new java.awt.Color(255, 255, 255));
        and.setText("&");
        and.setMaximumSize(new java.awt.Dimension(44, 44));
        and.setMinimumSize(new java.awt.Dimension(44, 44));
        and.setPreferredSize(new java.awt.Dimension(44, 44));
        and.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                andAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        and.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andActionPerformed(evt);
            }
        });

        or.setBackground(new java.awt.Color(255, 204, 0));
        or.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        or.setForeground(new java.awt.Color(255, 255, 255));
        or.setText("|");
        or.setMaximumSize(new java.awt.Dimension(44, 44));
        or.setMinimumSize(new java.awt.Dimension(44, 44));
        or.setPreferredSize(new java.awt.Dimension(44, 44));
        or.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                orAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        or.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orActionPerformed(evt);
            }
        });

        equalsto2.setBackground(new java.awt.Color(255, 153, 0));
        equalsto2.setFont(new java.awt.Font("Tw Cen MT", 1, 8)); // NOI18N
        equalsto2.setForeground(new java.awt.Color(255, 255, 255));
        equalsto2.setText("TO BINARY");
        equalsto2.setMaximumSize(new java.awt.Dimension(44, 44));
        equalsto2.setMinimumSize(new java.awt.Dimension(44, 44));
        equalsto2.setPreferredSize(new java.awt.Dimension(44, 44));
        equalsto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsto2ActionPerformed(evt);
            }
        });

        equalsto3.setBackground(new java.awt.Color(255, 153, 0));
        equalsto3.setFont(new java.awt.Font("Tw Cen MT", 1, 8)); // NOI18N
        equalsto3.setForeground(new java.awt.Color(255, 255, 255));
        equalsto3.setText("%");
        equalsto3.setMaximumSize(new java.awt.Dimension(44, 44));
        equalsto3.setMinimumSize(new java.awt.Dimension(44, 44));
        equalsto3.setPreferredSize(new java.awt.Dimension(44, 44));
        equalsto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsto3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(equalsto2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equalsto3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(erase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(zerow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eyt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(and, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equalsto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equalsto2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalsto3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(equalsto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eyt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zerow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(and, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(erase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double number, answer;
    int intNumber = (int) number;
    int event;
    public void operations(){
        
        switch (event){
            case 1: 
                answer = intNumber + Double.parseDouble(result.getText());
                result.setText(Double.toString(answer));
                break;
            case 2: 
                answer = intNumber - Double.parseDouble(result.getText());
                result.setText(Double.toString(answer));
                break;
            case 3: 
                answer = intNumber / Double.parseDouble(result.getText());
                result.setText(Double.toString(answer));
                break;
            case 4: 
                answer = intNumber * Double.parseDouble(result.getText());
                result.setText(Double.toString(answer));
                break;    
            case 5: 
                answer = intNumber | (int)Double.parseDouble(result.getText());
                result.setText(Double.toString(answer));
                break;
            case 6: 
                answer = intNumber & (int)Double.parseDouble(result.getText());
                result.setText(Double.toString(answer));
                break;   
            case 7: 
                answer = intNumber % (int)Double.parseDouble(result.getText());
                result.setText(Double.toString(answer));
                break;         
                
        }
    }
     
    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
     result.setText(result.getText() + "6");
    }//GEN-LAST:event_sixActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
    intNumber = (int)Double.parseDouble(result.getText());
    event = 1;
    result.setText("");
    equation.setText(intNumber + "+");
    }//GEN-LAST:event_plusActionPerformed

    private void eytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eytActionPerformed
     result.setText(result.getText() + "8");
    }//GEN-LAST:event_eytActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
     result.setText(result.getText() + "9");
    }//GEN-LAST:event_nineActionPerformed

    private void eraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseActionPerformed
        int size = result.getText().length();
        int erasee = result.getText().length() - 1;
        String eerase;
        
        if(size > 0 ){
        StringBuilder back = new StringBuilder(result.getText());
        back.deleteCharAt(erasee);
        eerase=back.toString();
        result.setText(eerase);
        }
    }//GEN-LAST:event_eraseActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       int zero = 0;
        result.setText(String.valueOf(zero));
       
    }//GEN-LAST:event_resetActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        result.setText(result.getText() + "1");
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
     result.setText(result.getText() + "2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
    result.setText(result.getText() + "3");
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
     result.setText(result.getText() + "4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
     result.setText(result.getText() + "5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
     result.setText(result.getText() + "7");
    }//GEN-LAST:event_sevenActionPerformed

    private void zerowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zerowActionPerformed
     result.setText(result.getText() + "0");
     
    }//GEN-LAST:event_zerowActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
    intNumber = (int)Double.parseDouble(result.getText());
    event = 2;
    result.setText("");
    equation.setText(intNumber + "-");
    }//GEN-LAST:event_minusActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
    intNumber = (int)Double.parseDouble(result.getText());
    event = 3;
    result.setText("");
    equation.setText(intNumber + "/");
    }//GEN-LAST:event_divideActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
    intNumber = (int)Double.parseDouble(result.getText());
    event = 4;
    result.setText("");
    equation.setText(intNumber + "*");
    }//GEN-LAST:event_timesActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
    result.setText(result.getText() + ".");
    }//GEN-LAST:event_pointActionPerformed

    private void equalstoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalstoActionPerformed
        operations();    
    }//GEN-LAST:event_equalstoActionPerformed

    private void andActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andActionPerformed
    intNumber = (int)Double.parseDouble(result.getText());
    event = 6;
    result.setText("");
    equation.setText(intNumber + " & ");
    }//GEN-LAST:event_andActionPerformed

    private void andAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_andAncestorMoved
    
    }//GEN-LAST:event_andAncestorMoved

    private void orAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_orAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_orAncestorMoved

    private void orActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orActionPerformed
    intNumber = (int)Double.parseDouble(result.getText());
    event = 5;
    result.setText("");
    equation.setText(intNumber + " | ");
    }//GEN-LAST:event_orActionPerformed

    private void equalsto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equalsto1ActionPerformed

    private void equalsto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsto2ActionPerformed
    
        equation.setText(Integer.toBinaryString(intNumber));
    }//GEN-LAST:event_equalsto2ActionPerformed

    private void equalsto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsto3ActionPerformed
    intNumber = (int)Double.parseDouble(result.getText());
    event = 7;
    result.setText("");
    equation.setText(intNumber + " % ");
    }//GEN-LAST:event_equalsto3ActionPerformed
   
    
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
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton and;
    private javax.swing.JButton divide;
    private javax.swing.JButton equalsto;
    private javax.swing.JButton equalsto1;
    private javax.swing.JButton equalsto2;
    private javax.swing.JButton equalsto3;
    private javax.swing.JLabel equation;
    private javax.swing.JButton erase;
    private javax.swing.JButton eyt;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton minus;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton or;
    private javax.swing.JButton plus;
    private javax.swing.JButton point;
    private javax.swing.JButton reset;
    private javax.swing.JTextField result;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton times;
    private javax.swing.JButton two;
    private javax.swing.JButton zerow;
    // End of variables declaration//GEN-END:variables
}
