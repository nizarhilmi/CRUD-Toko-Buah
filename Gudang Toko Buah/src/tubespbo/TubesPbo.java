package tubespbo;

import java.sql.SQLException;


public class TubesPbo {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        LoginView login = new LoginView();
        login.setVisible(true);
    }    
}
