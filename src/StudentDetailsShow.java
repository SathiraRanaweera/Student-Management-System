
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noob
 */
public class StudentDetailsShow {
    private String Indx;
    private String nic;
    private String name;
    private String dob;
    private String hometown;
    private String tel;
    private String course;
    private String degreetype;
    private String gender;
    
    public StudentDetailsShow(String Indx ,String nic,String name,String dob ,String hometown,String tel,String course,String degreetype,String gender )
    {
        this.Indx=Indx;
        this.nic=nic;
        this.name=name;
        this.dob=dob;
        this.hometown=hometown;
        this.tel=tel;
        this.course=course;
        this.degreetype=degreetype;
        this.gender=gender;
    }
    public ArrayList ListUsers(){
        ArrayList <StudentDetailsShow> list=new ArrayList<StudentDetailsShow>();
        //StudentDetailsShow u1=new StudentDetailsShow("dsc","dcds","f","gg","ee","ww","ee","ll","pp");
        //list.add(u1);
        
        return list;
    }

    public String getIndx() {
        return Indx;
    }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getHometown() {
        return hometown;
    }

    public String getTel() {
        return tel;
    }

    public String getCourse() {
        return course;
    }

    public String getDegreetype() {
        return degreetype;
    }

    public String getGender() {
        return gender;
    }

  
    
    
    
}
