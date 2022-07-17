public class College {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.id = 121;
        professor1.name = "vijay";
        professor1.specialization = "Economics";
        professor1.experience = "3years";
        professor1.sex = 'M';
        professor1.contact_number = 60393501;
        Professor.college = "JNIT";
        Professor.department = "Business";
        System.out.println("Professor id = "+professor1.id);
        System.out.println("Professor name = "+professor1.name);
        System.out.println("Professor specialization = "+professor1.specialization);
        System.out.println("Professor experience = "+professor1.experience);
        System.out.println("Professor sex = "+professor1.sex);
        System.out.println("Professor contact number = "+professor1.contact_number);
        System.out.println("Professor department = "+professor1.department);
        System.out.println("Professor college = "+professor1.college);
        Professor professor2 = new Professor();
        professor2.id = 122;
        professor2.name = "nidhi";
        professor2.specialization = "Accounts";
        professor2.experience = "2years";
        professor2.sex = 'F';
        professor1.contact_number = 60393111;
        System.out.println("Professor id = "+professor2.id);
        System.out.println("Professor name = "+professor2.name);
        System.out.println("Professor specialization = "+professor2.specialization);
        System.out.println("Professor experience = "+professor2.experience);
        System.out.println("Professor sex = "+professor2.sex);
        System.out.println("Professor contact number = "+professor2.contact_number);
        System.out.println("Professor department = "+professor2.department);
        System.out.println("Professor college = "+professor2.college);
    }
}
    class Professor{
    int id;
    String name;
    String specialization;
    String experience;
    char sex;
    int contact_number;
    static String department = "Business";
    static String college = "JNIT";
    }

