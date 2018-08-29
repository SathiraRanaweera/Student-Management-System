
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
public class undergradQualdb {
    String url="jdbc:mysql://localhost:3306/schoolsystem";
    String username="root";
    String password="";
    Connection con= null;
    PreparedStatement pst=null;
    studentEnrolldb deb1=new studentEnrolldb();
    
    boolean EnterQual (undergradQualc ns){
        try{
           
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query="INSERT INTO understudentqual VALUES (?,?,?,?,?,?,?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setInt(2, ns.getIndex());
           pst.setString(3, ns.getStream());
           pst.setInt(4, ns.getRank());
           pst.setString(5, ns.getSub1());
           pst.setString(6, ns.getSub2());
           pst.setString(7, ns.getSub3());
           pst.setString(8, ns.getGE());
           pst.setString(9, ns.getGK());
           
           
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
