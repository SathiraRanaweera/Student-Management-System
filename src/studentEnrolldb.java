
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noob
 */
public class studentEnrolldb {
    
    ResultSet IndexNum;
    public static String numb;//to get the indx and pass it forward
    
    String url="jdbc:mysql://localhost:3306/schoolsystem";
    String username="root";
    String password="";
    Connection con= null;
    PreparedStatement pst=null;
    
    boolean EnrollStd (studentEnrollc ns){
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query="INSERT INTO students VALUES (?,?,?,?,?,?,?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,0);
           pst.setString(2, ns.getNic());
           pst.setString(3, ns.getName());
           pst.setString(4, ns.getGender());
           pst.setString(5, ns.getDob());
           pst.setString(6, ns.getNic());
           pst.setString(7, ns.getTel());
           pst.setString(8, ns.getCourse());
           pst.setString(9, ns.getDegreetype());
           
           
           pst.executeUpdate();
           
           String query1="SELECT indx FROM students WHERE NIC = ?";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setString(1,ns.getNic());
           IndexNum =pst.executeQuery();
           while (IndexNum.next()) {
              numb = IndexNum.getString(1);
              
}
         
           
           
           return true;
           
           
        }catch(Exception e){System.out.print(e);
        return false;}
        
        finally{
            try{
                if (pst!=null){
                    pst.close();
                }
                if (con!=null){
                    con.close();
                }
            }catch(Exception e){}
        }
        
        
    }

    
    
    
    
}
