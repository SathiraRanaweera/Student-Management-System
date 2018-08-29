
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
public class scsdb {
    String url="jdbc:mysql://localhost:3306/schoolsystem";
    String username="root";
    String password="";
    Connection con= null;
    PreparedStatement pst=null;
    studentEnrolldb deb1=new studentEnrolldb();
    
    boolean Enterscs (scsc ns){
        try{
           
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs111");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs112");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs113");
           pst.setString(3,"AB");
           pst.executeUpdate();
           if(ns.getScs114()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs114");
           pst.setString(3,"AB");
           pst.executeUpdate();}
           if(ns.getScs115()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs115");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getScs116()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs116");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getScs117()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs117");
           pst.setString(3,"AB");
           pst.executeUpdate();}
           //2nd sem
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs121");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs122");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs123");
           pst.setString(3,"AB");
           pst.executeUpdate();
           if(ns.getScs124()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs124");
           pst.setString(3,"AB");
           pst.executeUpdate();}
           if(ns.getScs125()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs125");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getScs126()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs126");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getScs127()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scs127");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           
           
           
           
           
           
           
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
