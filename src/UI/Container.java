package UI;

public class Container extends javax.swing.JFrame {

    public Container() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resolve = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        issue_name = new javax.swing.JLabel();
        room_id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        confirm_resolve = new javax.swing.JButton();
        cancel_resolve = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        guest = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        issue_name1 = new javax.swing.JLabel();
        delete_guest = new javax.swing.JButton();
        pait_guest = new javax.swing.JToggleButton();
        pax_guest = new javax.swing.JLabel();
        checkout = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        menu = new javax.swing.JTabbedPane();
        toDo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        toDo_table = new javax.swing.JTable();
        rooms = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rooms_table1 = new javax.swing.JTable();
        newReservation = new javax.swing.JPanel();
        room = new javax.swing.JComboBox<>();
        from = new javax.swing.JComboBox<>();
        to = new javax.swing.JComboBox<>();
        confirm = new javax.swing.JButton();
        pax = new javax.swing.JTextField();
        guestName = new javax.swing.JTextField();
        reservations = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reservations_table2 = new javax.swing.JTable();
        newIssue = new javax.swing.JPanel();
        issueTitle = new javax.swing.JTextField();
        room_newIssue = new javax.swing.JComboBox<>();
        confirm_newIssue = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        resolve.setTitle("Resolve Issue");
        resolve.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        issue_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        issue_name.setForeground(new java.awt.Color(255, 255, 255));
        issue_name.setText("Broken vase");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(issue_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(issue_name)
                .addGap(30, 30, 30))
        );

        room_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        room_id.setText("12B");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mark as ressolved?");

        confirm_resolve.setText("Confirm");
        confirm_resolve.setFocusable(false);

        cancel_resolve.setText("Cancel");
        cancel_resolve.setFocusable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("The guest's 4 ear old kid accidentally dropped it.");
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room_id, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cancel_resolve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirm_resolve)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(room_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_resolve)
                    .addComponent(cancel_resolve))
                .addContainerGap())
        );

        javax.swing.GroupLayout resolveLayout = new javax.swing.GroupLayout(resolve.getContentPane());
        resolve.getContentPane().setLayout(resolveLayout);
        resolveLayout.setHorizontalGroup(
            resolveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        resolveLayout.setVerticalGroup(
            resolveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        guest.setTitle("Guest");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        issue_name1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        issue_name1.setForeground(new java.awt.Color(255, 255, 255));
        issue_name1.setText("Kasey Cuyos @ 47M");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(issue_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(issue_name1)
                .addGap(30, 30, 30))
        );

        delete_guest.setText("Delete");
        delete_guest.setFocusable(false);

        pait_guest.setText("Paid");
        pait_guest.setFocusable(false);

        pax_guest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pax_guest.setText("2 people");

        checkout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkout.setText("Will checkout on July-3-2018");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pax_guest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(delete_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(pait_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_guest)
                    .addComponent(pait_guest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pax_guest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkout)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout guestLayout = new javax.swing.GroupLayout(guest.getContentPane());
        guest.getContentPane().setLayout(guestLayout);
        guestLayout.setHorizontalGroup(
            guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        guestLayout.setVerticalGroup(
            guestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blanket");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("User_name");

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setForeground(new java.awt.Color(0, 204, 204));
        logout.setText("Log out");
        logout.setToolTipText("");
        logout.setFocusable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addComponent(logout))
        );

        menu.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        menu.setFocusable(false);

        toDo.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        toDo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Broken vase", "12B", "3hrs ago"},
                {"Oven wont turn on", "47T", "13hrs ago"},
                {"Lost TV remote", "47M", "2days ago"},
                {"Lost key card", "47M", "2days ago"}
            },
            new String [] {
                "Issue", "Room", "Reported"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(toDo_table);

        javax.swing.GroupLayout toDoLayout = new javax.swing.GroupLayout(toDo);
        toDo.setLayout(toDoLayout);
        toDoLayout.setHorizontalGroup(
            toDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        toDoLayout.setVerticalGroup(
            toDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        menu.addTab("To Do List", toDo);

        rooms.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(null);

        rooms_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12B", "Occupied", "Renz Bernados"},
                {"47T", "Vacant", "Next guest in 24hrs"},
                {"47M", "Occupied", "Kasey Cuyos"}
            },
            new String [] {
                "Room ID", "Status", "Guest"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(rooms_table1);

        javax.swing.GroupLayout roomsLayout = new javax.swing.GroupLayout(rooms);
        rooms.setLayout(roomsLayout);
        roomsLayout.setHorizontalGroup(
            roomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        roomsLayout.setVerticalGroup(
            roomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        menu.addTab("Rooms", rooms);

        newReservation.setBackground(new java.awt.Color(255, 255, 255));

        room.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12B", "47T", "47M" }));
        room.setToolTipText("Room");
        room.setBorder(null);
        room.setFocusable(false);

        from.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "July-1-2018", "July-2-2018", "July-3-2018" }));
        from.setToolTipText("Checkin date");
        from.setBorder(null);
        from.setFocusable(false);

        to.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "July-2-2018", "July-3-2018", "July-4-2018" }));
        to.setToolTipText("Checkout date");
        to.setBorder(null);
        to.setFocusable(false);

        confirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirm.setText("Confirm");
        confirm.setFocusable(false);

        pax.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pax.setToolTipText("Number of People");
        pax.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        guestName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guestName.setToolTipText("Guest Name");
        guestName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout newReservationLayout = new javax.swing.GroupLayout(newReservation);
        newReservation.setLayout(newReservationLayout);
        newReservationLayout.setHorizontalGroup(
            newReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newReservationLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(newReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pax)
                    .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(from, javax.swing.GroupLayout.Alignment.LEADING, 0, 480, Short.MAX_VALUE)
                    .addComponent(to, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guestName, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(135, 135, 135))
        );
        newReservationLayout.setVerticalGroup(
            newReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newReservationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guestName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pax, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        menu.addTab("New Reservation", newReservation);

        reservations.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBorder(null);

        reservations_table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12B", "June-30-2018", "July-4-2018", "Joshua Ty"},
                {"47T", "June-30-2018", "July-10-2018", "Joshua Isanan"},
                {"47M", "July-3-2018", "July-7-2018", "Marvin Lim"}
            },
            new String [] {
                "Room ID", "From", "To", "Guest"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(reservations_table2);

        javax.swing.GroupLayout reservationsLayout = new javax.swing.GroupLayout(reservations);
        reservations.setLayout(reservationsLayout);
        reservationsLayout.setHorizontalGroup(
            reservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        reservationsLayout.setVerticalGroup(
            reservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        menu.addTab("Reservations", reservations);

        newIssue.setBackground(new java.awt.Color(255, 255, 255));

        issueTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        issueTitle.setToolTipText("Issue Title");
        issueTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        issueTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueTitleActionPerformed(evt);
            }
        });

        room_newIssue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        room_newIssue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12B", "47T", "47M" }));
        room_newIssue.setToolTipText("Room");
        room_newIssue.setBorder(null);
        room_newIssue.setFocusable(false);

        confirm_newIssue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirm_newIssue.setText("Confirm");
        confirm_newIssue.setFocusable(false);

        jTextPane1.setBorder(null);
        jTextPane1.setToolTipText("Issue Description");
        jScrollPane4.setViewportView(jTextPane1);

        javax.swing.GroupLayout newIssueLayout = new javax.swing.GroupLayout(newIssue);
        newIssue.setLayout(newIssueLayout);
        newIssueLayout.setHorizontalGroup(
            newIssueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newIssueLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(newIssueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(issueTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(room_newIssue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirm_newIssue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(148, 148, 148))
        );
        newIssueLayout.setVerticalGroup(
            newIssueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newIssueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(issueTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(room_newIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirm_newIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu.addTab("New Issue", newIssue);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issueTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueTitleActionPerformed

    public void open() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Container.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            this.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_resolve;
    private javax.swing.JLabel checkout;
    private javax.swing.JButton confirm;
    private javax.swing.JButton confirm_newIssue;
    private javax.swing.JButton confirm_resolve;
    private javax.swing.JButton delete_guest;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JDialog guest;
    private javax.swing.JTextField guestName;
    private javax.swing.JTextField issueTitle;
    private javax.swing.JLabel issue_name;
    private javax.swing.JLabel issue_name1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JPanel newIssue;
    private javax.swing.JPanel newReservation;
    private javax.swing.JToggleButton pait_guest;
    private javax.swing.JTextField pax;
    private javax.swing.JLabel pax_guest;
    private javax.swing.JPanel reservations;
    private javax.swing.JTable reservations_table2;
    private javax.swing.JDialog resolve;
    private javax.swing.JComboBox<String> room;
    private javax.swing.JLabel room_id;
    private javax.swing.JComboBox<String> room_newIssue;
    private javax.swing.JPanel rooms;
    private javax.swing.JTable rooms_table1;
    private javax.swing.JComboBox<String> to;
    private javax.swing.JPanel toDo;
    private javax.swing.JTable toDo_table;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
