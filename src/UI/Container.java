package UI;

import Connection.DBConnect;
import Entities.*;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Container extends javax.swing.JFrame {
    ResultSet rs = null;
    ResultSet rs2 = null;
    
    private JTable table;
    private Point point;
    private int row;
    private int col;
    
    public Container() {
        initComponents();
        init();
        initToDoTable();
    }
    
    private void initToDoTable(){
        DefaultTableModel model = null;
        rs = DBConnect.getResultSet("SELECT todo.issueTitle, room.roomName, todo.updatedDate FROM todo INNER JOIN room ON room.roomId = todo.roomId");
        model = (DefaultTableModel) toDo_table.getModel();
        model.setRowCount(0);
        {
            try {
                while(rs.next()){
                    model.addRow(new Object[]{
                        rs.getString("issueTitle"),
                        rs.getString("roomName"),
                        rs.getString("updatedDate")
                    });
                }
            } catch (SQLException ex) {
                Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        toDo_table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                
                table =(JTable) mouseEvent.getSource();
                point = mouseEvent.getPoint();
                row = table.rowAtPoint(point);
                col = table.columnAtPoint(point);

                if (mouseEvent.getClickCount() == 2 ) {
                    resolve.show();
                }
            }
        });
    }
    
    private void init(){
        username.setText(Storage.ad.getAdminName());
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
        issueDesc = new javax.swing.JTextPane();
        newRoom = new javax.swing.JPanel();
        confirm_newRoom = new javax.swing.JButton();
        roomCapacity = new javax.swing.JTextField();
        roomName = new javax.swing.JTextField();
        roomRate = new javax.swing.JTextField();

        resolve.setTitle("Resolve Issue");
        resolve.setMaximumSize(new java.awt.Dimension(495, 281));
        resolve.setMinimumSize(new java.awt.Dimension(495, 281));
        resolve.setType(java.awt.Window.Type.POPUP);

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
        confirm_resolve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_resolveMouseClicked(evt);
            }
        });

        cancel_resolve.setText("Cancel");
        cancel_resolve.setFocusable(false);
        cancel_resolve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_resolveMouseClicked(evt);
            }
        });

        jTextArea1.setEditable(false);
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
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        toDo.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        toDo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        confirm_newIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_newIssueActionPerformed(evt);
            }
        });

        issueDesc.setBorder(null);
        issueDesc.setToolTipText("Issue Description");
        jScrollPane4.setViewportView(issueDesc);

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

        newRoom.setBackground(new java.awt.Color(255, 255, 255));

        confirm_newRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirm_newRoom.setText("Confirm");
        confirm_newRoom.setFocusable(false);
        confirm_newRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_newRoomMouseClicked(evt);
            }
        });

        roomCapacity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roomCapacity.setToolTipText("Room capacity");
        roomCapacity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        roomName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roomName.setToolTipText("Room name");
        roomName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        roomRate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roomRate.setToolTipText("Room rate");
        roomRate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout newRoomLayout = new javax.swing.GroupLayout(newRoom);
        newRoom.setLayout(newRoomLayout);
        newRoomLayout.setHorizontalGroup(
            newRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newRoomLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(newRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roomCapacity)
                    .addComponent(confirm_newRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(roomName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomRate, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(135, 135, 135))
        );
        newRoomLayout.setVerticalGroup(
            newRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roomName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roomCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roomRate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(confirm_newRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        menu.addTab("Add Room", newRoom);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void confirm_newIssueActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        String issuetitle = issueTitle.getText();
        String issuedesc = issueDesc.getText();
        String varnewIssue = room_newIssue.getItemAt(room_newIssue.getSelectedIndex());
        int roomID = 0;
        rs2 = DBConnect.getResultSet("SELECT (room.roomId) FROM room WHERE room.roomName LIKE '"+varnewIssue+"'");
        try {
            if(rs2.next()){
                roomID = rs2.getInt("roomId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = DBConnect.getConnection();
        Date currDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(currDate.getTime());
        String query = "INSERT INTO todo "
            + "(`userId`,`roomId`, `issueTitle`, `issueDesc`, `status`, `createdBy`, `updatedBy`, `createdDate`, `updatedDate`) "
            + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, Storage.ad.getAdminID());
            stmt.setInt(2, roomID); // Change room ID LATER
            stmt.setString(3, issuetitle);
            stmt.setString(4, issuedesc);
            stmt.setInt(5, 0);
            stmt.setInt(6, Storage.ad.getAdminID());
            stmt.setInt(7, Storage.ad.getAdminID());
            stmt.setDate(8, sqlDate);
            stmt.setDate(9, sqlDate);
            
            int insert = stmt.executeUpdate();
            System.out.println("Inserted "+insert+" rows.");
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
  
    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        String tabname = menu.getTitleAt(menu.getSelectedIndex());
        DBConnect db = new DBConnect();
        DefaultTableModel model = null;
        String vacancy = "";
        switch(tabname){
            case "Rooms": 
                    rs = DBConnect.getResultSet("SELECT * FROM room INNER JOIN reservations ON room.roomid = reservations.roomid INNER JOIN guest ON reservations.guestid = guest.guestid");
                    rs2 = DBConnect.getResultSet("SELECT * FROM room INNER JOIN reservations ON room.roomid != reservations.roomid");
                    model = (DefaultTableModel) rooms_table1.getModel();
                    model.setRowCount(0);
                    {
                        try {
                            while(rs.next()){
                                model.addRow(new Object[]{
                                    rs.getString("roomName"),
                                    vacancy = (rs.getBoolean("roomVacancy") == true)? "Vacant" : "Occupied",
                                    rs.getString("guestName")
                                    
                                });
                            }
                            while(rs2.next()){
                                model.addRow(new Object[]{
                                    rs2.getString("roomName"),
                                    vacancy = (rs2.getBoolean("roomVacancy") == true)? "Vacant" : "Occupied",
                                    null,
                                });
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    rooms_table1.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent mouseEvent) {
                            JTable table =(JTable) mouseEvent.getSource();
                            Point point = mouseEvent.getPoint();
                            int row = table.rowAtPoint(point);
                            int col = table.columnAtPoint(point);

                            if (mouseEvent.getClickCount() == 2 ) {
                                JOptionPane.showMessageDialog(rootPane,"PopUp");
                            }
                        }
                    });
                    break;
            case "Reservations":
                    rs = DBConnect.getResultSet("SELECT * FROM room INNER JOIN reservations ON room.roomid = reservations.roomid INNER JOIN guest ON reservations.guestid = guest.guestid");
                    model = (DefaultTableModel) reservations_table2.getModel();
                    model.setRowCount(0);
                    {
                        try {
                            while(rs.next()){
                                model.addRow(new Object[]{
                                    rs.getString("roomName"),
                                    rs.getDate("checkInDate"),
                                    rs.getDate("checkOutDate"),
                                    rs.getString("guestName")
                                });
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    reservations_table2.addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent mouseEvent) {
                            JTable table =(JTable) mouseEvent.getSource();
                            Point point = mouseEvent.getPoint();
                            int row = table.rowAtPoint(point);
                            int col = table.columnAtPoint(point);

                            if (mouseEvent.getClickCount() == 2 ) {
                                JOptionPane.showMessageDialog(rootPane,"PopUp");
                            }
                        }
                    });
                    break;
            case "To Do List": 
                    initToDoTable();
                    break;
            case "New Issue":
                    rs = DBConnect.getResultSet("SELECT * FROM room");
                    DefaultComboBoxModel combo = (DefaultComboBoxModel) room_newIssue.getModel();
                    combo.removeAllElements();
                    room_newIssue.setModel(combo);
                    {
                        try {
                            while(rs.next()){
                                room_newIssue.addItem(rs.getString("roomName"));
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
            default: break;
        }
        
    }//GEN-LAST:event_menuMouseClicked

    private void confirm_newRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm_newRoomMouseClicked
        Connection con = DBConnect.getConnection();
        Date currDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(currDate.getTime());
        String query = "INSERT INTO room "
            + "(`roomName`,`roomCapacity`, `roomVacancy`, `roomRate`, `createdBy`, `updatedBy`, `createdDate`, `updatedDate`) "
            + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, roomName.getText());
            stmt.setInt(2, Integer.parseInt(roomCapacity.getText()));
            stmt.setInt(3, 1);
            stmt.setFloat(4, Float.parseFloat(roomRate.getText()));
            stmt.setInt(5, Storage.ad.getAdminID());
            stmt.setInt(6, Storage.ad.getAdminID());
            stmt.setDate(7, sqlDate);
            stmt.setDate(8, sqlDate);
            
            int insert = stmt.executeUpdate();
            System.out.println("Added new room named " + roomName.getText());
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_confirm_newRoomMouseClicked

    private void confirm_resolveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm_resolveMouseClicked
        if(JOptionPane.showConfirmDialog(rootPane, "Resolve Issue?")==0){
            Connection con = DBConnect.getConnection();
            int issueID = 0;
            String varnewIssue = (String)table.getValueAt(table.getSelectedRow(), 0);
            String sql = "DELETE FROM todo WHERE todoId = ?";
            try {
                PreparedStatement stmt = con.prepareStatement(sql);
                rs2 = DBConnect.getResultSet("SELECT (todo.todoId) FROM todo WHERE todo.issueTitle LIKE '"+varnewIssue+"'");
                try {
                    if(rs2.next()){
                        issueID = rs2.getInt("todoId");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
                }
                stmt.setInt(1, issueID);
                stmt.executeUpdate();
                initToDoTable();
                resolve.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_confirm_resolveMouseClicked

    private void cancel_resolveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_resolveMouseClicked
        resolve.dispose();
    }//GEN-LAST:event_cancel_resolveMouseClicked

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
    private javax.swing.JButton confirm_newRoom;
    private javax.swing.JButton confirm_resolve;
    private javax.swing.JButton delete_guest;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JDialog guest;
    private javax.swing.JTextField guestName;
    private javax.swing.JTextPane issueDesc;
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
    private javax.swing.JButton logout;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JPanel newIssue;
    private javax.swing.JPanel newReservation;
    private javax.swing.JPanel newRoom;
    private javax.swing.JToggleButton pait_guest;
    private javax.swing.JTextField pax;
    private javax.swing.JLabel pax_guest;
    private javax.swing.JPanel reservations;
    private javax.swing.JTable reservations_table2;
    private javax.swing.JDialog resolve;
    private javax.swing.JComboBox<String> room;
    private javax.swing.JTextField roomCapacity;
    private javax.swing.JTextField roomName;
    private javax.swing.JTextField roomRate;
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
