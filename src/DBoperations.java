
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noob
 */

public class DBoperations {
    String url="jdbc:mysql://localhost:3306/schoolsystem";
    String username="root";
    String password="";
    Connection con= null;
    PreparedStatement pst=null;
    
    ArrayList searchStudent(int data1){
        ArrayList <StudentDetailsShow> arrList=new ArrayList();
        ResultSet rs = null;
        
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="SELECT * FROM students WHERE Indx=?";
           pst= (PreparedStatement)con.prepareStatement(query1);
           
           pst.setInt(1,data1 );
           rs =pst.executeQuery();
           while (rs.next()) {
               
                
               StudentDetailsShow u1=new StudentDetailsShow(Integer.toString(rs.getInt(1)),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
               arrList.add(u1);
               
                }
            
    }catch(Exception e){System.out.print(e);
        }

    
    return(arrList);    
    }
    ArrayList searchStudent(String data1){
        ArrayList <StudentDetailsShow> arrList=new ArrayList();
        ResultSet rs = null;
        
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="SELECT * FROM students WHERE Name=?";
           pst= (PreparedStatement)con.prepareStatement(query1);
           
           pst.setString(1,data1 );
           rs =pst.executeQuery();
           while (rs.next()) {
               
                
               StudentDetailsShow u1=new StudentDetailsShow(Integer.toString(rs.getInt(1)),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
               arrList.add(u1);
               
                }
            
    }catch(Exception e){System.out.print(e);
        }

    
    return(arrList);    
    }
    
    ArrayList viewStudent(){
        ArrayList <StudentDetailsShow> arrList=new ArrayList();
        ResultSet rs = null;
        
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="SELECT * FROM students";
           pst= (PreparedStatement)con.prepareStatement(query1);
           
           
           rs =pst.executeQuery();
           while (rs.next()) {
               
                
               StudentDetailsShow u1=new StudentDetailsShow(Integer.toString(rs.getInt(1)),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
               arrList.add(u1);
               
                }
            
    }catch(Exception e){System.out.print(e);
        }

    
    return(arrList);    
    }
    
    String admin(String user){
        String password1 = null;
        ResultSet rs = null;
         try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="SELECT password FROM admin Where username = ?";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setString(1, user);
           rs =pst.executeQuery();
           while (rs.next()) {
             
               password1 = rs.getString(1);
               
               
                }
            }catch(Exception e){System.out.print(e);
        }; 
        return(password1);
    }
    boolean deleteStudent(int ind){
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="DELETE FROM students WHERE Indx=?";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setInt(1,ind );
           pst.executeUpdate();
           return(true); 
          }catch(Exception e){System.out.print(e);
        return false;
    }}
    boolean UpdateStudent(int ind,String item,String nv){
        if( item=="Name"){
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="UPDATE students SET Name=? WHERE Indx=?";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setString(1,nv);
           pst.setInt(2,ind );
           pst.executeUpdate();
           return(true); 
          }catch(Exception e){System.out.print(e);
        return false;}
        }
        if( item=="Home"){
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="UPDATE students SET HomeTown=? WHERE Indx=?";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setString(1,nv);
           pst.setInt(2,ind );
           pst.executeUpdate();
           return(true); 
          }catch(Exception e){System.out.print(e);
        return false;}
        }
        if( item=="Tel"){
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="UPDATE students SET Tel=? WHERE Indx=?";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setString(1,nv);
           pst.setInt(2,ind );
           pst.executeUpdate();
           return(true); 
          }catch(Exception e){System.out.print(e);
        return false;}
        }
    return false;
        
    }
    ArrayList viewStudentSub(int ind){
        ArrayList <showSubjects> arrList=new ArrayList();
        ResultSet rs = null;
         try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="SELECT * FROM undergradscs WHERE indx=? ";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setInt(1,ind);
           rs =pst.executeQuery();
           while (rs.next()) {
               showSubjects u1=new showSubjects(Integer.toString(rs.getInt(1)),rs.getString(2));
               arrList.add(u1);
               
                }
            }catch(Exception e){System.out.print(e);
        }return(arrList);    
    }
    boolean editsubjects(int ind,String sub, String subnew){
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="UPDATE undergradscs SET subject=? WHERE indx=? and subject=?";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setString(1,subnew);
           pst.setInt(2,ind );
           pst.setString(3,sub);
           pst.executeUpdate();
           return(true); 
          }catch(Exception e){System.out.print(e);
        return false;}
        }
    boolean addLecturer(lecturerc lec){
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="INSERT INTO lectures VALUES (?,?,?,?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setString(1,lec.getId());
           pst.setString(2,lec.getName() );
           pst.setString(3,lec.getAddress());
           pst.setString(4,lec.getTel());
           pst.setString(5,lec.getRno());
           pst.setString(6,lec.getSpecialization());
           pst.executeUpdate();
           return(true); 
          }catch(Exception e){System.out.print(e);
        return false;}
        }
    ArrayList viewLecturer(){
        ArrayList <lecturerc> arrList=new ArrayList();
        ResultSet rs = null;
         try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="SELECT * FROM lectures";
           pst= (PreparedStatement)con.prepareStatement(query1);
           rs =pst.executeQuery();
           while (rs.next()) {
               
               lecturerc lec = new lecturerc();
               lec.setId(rs.getString(1));
               lec.setName(rs.getString(2));
               lec.setAddress(rs.getString(3));
               lec.setTel(rs.getString(4));
               lec.setRno(rs.getString(5));
               lec.setSpecialization(rs.getString(6));
               
               arrList.add(lec);
               
                }
            }catch(Exception e){System.out.print(e);
        }return(arrList);    
    }
    ArrayList viewLecSub(){
        ArrayList <String []> arrList=new ArrayList();
        ResultSet rs = null;
         try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="SELECT lectures.name, undergardsubjects.subname FROM lectures,undergardsubjects,lecsub WHERE lecsub.subCODE=undergardsubjects.subcode AND lecsub.lecID = lectures.id ";
           pst= (PreparedStatement)con.prepareStatement(query1);
           rs =pst.executeQuery();
           while (rs.next()) {
               String lecsub []= new String[2];
               lecsub[0]=rs.getString(1);
               lecsub[1]=rs.getString(2);
               
               
               
               arrList.add(lecsub);
               
                }
            }catch(Exception e){System.out.print(e);
        }return(arrList);    
    }
    boolean enterMarks(String marks[],ArrayList <showSubjects> sub){
        boolean result=true;
        for (int i=0;i<sub.size();i++){
        try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="INSERT INTO 1st_sem_marks_scs VALUES(?,?,?)";
           pst= (PreparedStatement)con.prepareStatement(query1);
           pst.setInt(1,Integer.parseInt(sub.get(0).getIndx() ));
           pst.setString(2, sub.get(i).getSub());
           pst.setString(3, marks[i]);
           pst.executeUpdate();
            
          }catch(Exception e){System.out.print(e);
          result=false;}
        
    }return result;
    }
    ArrayList getResults(){
        ArrayList <getResults> arrList=new ArrayList();
        ResultSet rs = null;
         try{
           con=(Connection)DriverManager.getConnection(url,username,password);
           String query1="SELECT * FROM 1st_sem_marks_scs";
           pst= (PreparedStatement)con.prepareStatement(query1);
           rs =pst.executeQuery();
           while (rs.next()) {
               
               getResults grs = new getResults();
               grs.setIndex(rs.getString(1));
               grs.setSubCode(rs.getString(2));
               grs.setGrade(rs.getString(3));
               arrList.add(grs);
               
                }
            }catch(Exception e){System.out.print(e);
        }return(arrList);    
    }
}
