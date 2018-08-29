
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
public class scbdb {
    String url="jdbc:mysql://localhost:3306/schoolsystem";
    String username="root";
    String password="";
    Connection con= null;
    PreparedStatement pst=null;
    studentEnrolldb deb1=new studentEnrolldb();
    
    boolean Enterscb (scbc ns){
        try{
           
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb111");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb112");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb113");
           pst.setString(3,"AB");
           pst.executeUpdate();
           if(ns.getScb114()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb114");
           pst.setString(3,"AB");
           pst.executeUpdate();}
           if(ns.getScb115()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb115");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getScb116()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb116");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getScb117()==1){
           query="INSERT INTO undergradscs VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb117");
           pst.setString(3,"AB");
           pst.executeUpdate();}
           //2nd sem
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb121");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb122");
           pst.setString(3,"AB");
           pst.executeUpdate();
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb123");
           pst.setString(3,"AB");
           pst.executeUpdate();
           if(ns.getScb124()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb124");
           pst.setString(3,"AB");
           pst.executeUpdate();}
           if(ns.getScb125()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb125");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getScb126()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb126");
           pst.setString(3,"AB");
           pst.executeUpdate();} 
           if(ns.getScb127()==1){
           query="INSERT INTO undergradscs2 VALUES (?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,Integer.parseInt(deb1.numb));
           pst.setString(2,"scb127");
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
