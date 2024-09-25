public class main {
    public static void main(String[] args) {

        EmployeeDirectory list=new EmployeeDirectory();
        list.setEmployee("75757","Иван", 6);
        list.setEmployee("1175757","Алексей", 6);
        list.setEmployee("7575755","Сергей", 4);

        System.out.println(list);

        System.out.println(list.getEmployeeByExperience(6));
        System.out.println(list.getPhoneNumberByName("Aleks"));
        System.out.println(list.getPhoneNumberByName("Сергей"));
        System.out.println(list.getEmployeeById(2));
    }
}
