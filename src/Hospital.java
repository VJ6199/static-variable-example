class Doctor{
    int Doctor_id;
    String Doctor_name;
    double Doctor_salary;
    double Doctor_experience;
    static String hospital;
    static String hospital_address;
}
public class Hospital{
    public static void main(String[] args){
    Doctor doc1 = new Doctor();
    doc1.Doctor_id = 6199;
    doc1.Doctor_name = "Vijay";
    doc1.Doctor_salary = 45000;
    doc1.Doctor_experience = 2.50;
    Doctor.hospital = "Yashoda";
    Doctor.hospital_address = "kukatpally";
    System.out.println("Doctor id = "+doc1.Doctor_id);
    System.out.println("Doctor name = "+doc1.Doctor_name);
    System.out.println("Doctor Salary = "+doc1.Doctor_salary);
    System.out.println("Doctor Experience in years = "+doc1.Doctor_experience);
    System.out.println("Doctor Hosptial = "+Doctor.hospital);
    System.out.println("Doctor hospital address = "+Doctor.hospital_address);
    //Doctor doc2 = new Doctor();
        doc1.Doctor_id = 6200;
        doc1.Doctor_name = "nitin";
        doc1.Doctor_salary = 55000;
        doc1.Doctor_experience = 3.50;
        System.out.println("Doctor1 id = "+doc1.Doctor_id);
        System.out.println("Doctor1 name = "+doc1.Doctor_name);
        System.out.println("Doctor1 Salary = "+doc1.Doctor_salary);
        System.out.println("Doctor1 Experience in years = "+doc1.Doctor_experience);
        System.out.println("Doctor1 Hosptial = "+Doctor.hospital);
        System.out.println("Doctor1 hospital address = "+Doctor.hospital_address);
    }
}