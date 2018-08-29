
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
public class scedb {
    String url="jdbc:mysql://localhost:3306/schoolsystem";
    String username="root";
    String password="";
    Connection con= null;
    PreparedStatement pst=null;
    studentEnrolldb deb1=new studentEnrolldb();
    
    boolean Entersce (scec ns){
        try{
           
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce111");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce112");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce113");
           pst.setString(3,"AB");
           pst.executeUpdate();
           if(ns.getSce114()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce114");
           pst.setString(3,"AB");
           pst.executeUpdate();}
           if(ns.getSce115()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce115");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getSce116()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce116");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getSce117()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce117");
           pst.setString(3,"AB");
           pst.executeUpdate();}
           //2nd sem
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce121");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce122");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce123");
           pst.setString(3,"AB");
           pst.executeUpdate();
           if(ns.getSce124()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce124");
           pst.setString(3,"AB");
           pst.executeUpdate();}
           if(ns.getSce125()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce125");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getSce126()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce126");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getSce127()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"sce127");
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