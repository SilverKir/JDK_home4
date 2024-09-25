import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 */
public class EmployeeDirectory {
    private  List<Employee> directory;

    public EmployeeDirectory(List<Employee> directory) {
        this.directory = directory;
    }
    public EmployeeDirectory() {
        this.directory = new ArrayList<>();
    }

    public void setEmployee(String phoneNumber, String name, int experience) {
        int id =getFreeID();
        this.directory.add(new Employee(id,phoneNumber,name,experience));
    }

    public int getFreeID() {
        Employee employee= this.directory.stream().max(Comparator.comparingInt(Employee::getId)).orElse(null);
        return employee != null ? employee.getId()+1:1;
    }

    @Override
    public String toString() {
       String result = "";
        for (Employee emp : directory) {
           result = result + "ID: " + emp.getId()
           + " name: "+ emp.getName()
           + " Phone number: " + emp.getPhoneNumber()
                   + " Experience: " + emp.getExperience() +"\n";
        }
        return result;
    }

    public List<Employee> getEmployeeByExperience(int exp){
        return directory.stream().filter(employee -> employee.getExperience()==exp).toList();
    }
    public List<String> getPhoneNumberByName(String name){
        return directory.stream().filter(employee -> employee.getName().equals(name)).map(Employee::getPhoneNumber).toList();
    }

    public Employee getEmployeeById(int id){
       return  directory.stream().filter(employee -> employee.getId()==id).findFirst().orElse(null);
    }
}
