package trash;

//import java.sql.Connection;
//import java.sql.Savepoint;
//
//public class Postgres<ConnectionUtil> {
//
//
//
//
//
//        import java.sql.Connection;
//        import java.sql.PreparedStatement;
//        import java.sql.SQLException;
//        import java.sql.Savepoint;
//        import java.sql.Statement;
//
//
//    private ConnectionUtil connUtil = new ConnectionUtil();
//
//    public void setConnUtil(ConnectionUtil connUtil) {
//        this.connUtil = connUtil;
//    }
//
//    @Override
//    public void createAccount(User user) {
//
//        String sql = "insert into guest (firstName, lastName, ssn, account) "
//                + "values('"
//                + user.getFirstName()
//                + "', '"
//                + user.userLastName()
//                + "', '"
//                + user.getssn()
//                + "', "
//                + user.getintialpayment()
//                + ")";
//
//        try (Connection conn = connUtil.createConnection()) {
//            Statement statement = conn.createStatement();
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//    }
//
//    @Override
//    public Guest readGuest(int guestId) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    @Override
//    public Guest readAllGuests() {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    @Override
//    public Guest updateGuest(int guestId, Guest guest) throws GuestUpdateException {
//        /*
//         * String sql = "update guest set " + "guest_first_name = '" +
//         * guest.getName().split(" ")[0] + "', guest_last_name = '" +
//         * guest.getName().split(" ")[1] + "', phone_number = '" +
//         * guest.getPhoneNumber() + "', payment = " + guest.getPayment() +
//         * "where guest_id = " + guestId;
//         *
//         * try (Connection conn = connUtil.createConnection()) { statement =
//         * conn.createStatement(); statement.executeUpdate(sql); } catch (SQLException
//         * e) { // TODO Auto-generated catch block e.printStackTrace(); }
//         */
//
//        String sql = "update guest set guest_first_name = ?, guest_last_name = ?, phone_number = ?, payment = ? where guest_id = ?";
//
//        try (Connection conn = connUtil.createConnection()) {
//
//            conn.setAutoCommit(false);
//
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, User.getfirstname());
//            pstmt.setString(2, User.getlastname());
//            pstmt.setString(3, User.getPhoneNumber());
//            pstmt.setDouble(4, User.getintialpayment());
//            pstmt.setInt(5, userId);
//
//            Savepoint s1 = conn.setSavepoint();
//
//            int rowsEffected = pstmt.executeUpdate();
//
//            if (rowsEffected != 1) {
//                conn.rollback(s1);
//                throw new GuestUpdateException("Too many guests updated");
//            } else {
//                conn.commit();
//            }
//
//            conn.setAutoCommit(true);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    @Override
//    public void deleteGuest(Guest guest) {
//        // TODO Auto-generated method stub
//
//    }
//
//}
