
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noob
 */
public class postgradqualdb {
    String url="jdbc:mysql://localhost:3306/schoolsystem";
    String username="root";
    String password="";
    Connection con= null;
    PreparedStatement pst=null;
    studentEnrolldb deb1=new studentEnrolldb();
    
    boolean EnterQual (postgradqualc ns){
        try{
           
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query="INSERT INTO poststudentqual VALUES (?,?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2, ns.getDegree());
           pst.setString(3, ns.getInstitute());
           pst.setInt(4, ns.getYoc());
           
           
           
           pst.executeUpdate(); 
           
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
