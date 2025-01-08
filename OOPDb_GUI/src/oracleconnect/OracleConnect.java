package oracleconnect;


public class OracleConnect {

    
    public static void main(String[] args) {
      
        ConnectDB.Connect();
        MainScreen ms = new MainScreen();
        ms.setVisible(true);
    }
    
}
