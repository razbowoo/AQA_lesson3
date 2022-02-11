public class Lesson3 {

        public static void main(String[] args) {
            Employee[] empCorp = new Employee[5];
            empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "+3802312312",35000,42);
            empCorp[1] = new Employee("Petrov Petya", "Creator", "petrov@mailbox.com", "+3802312314",70000,41);
            empCorp[2] = new Employee("Evin Nikita", "DevOps", "evin22@mailbox.com", "+3802312315",25000,56);
            empCorp[3] = new Employee("Antonova Nadegda", "HR", "princesa7@mailbox.com", "+3802312316",15000,18);
            empCorp[4] = new Employee("Ujin Sagas", "GrinderPencil", "sagasvag@mailbox.com", "+3802312317",10000,22);
            for (Employee employee : empCorp)
                if (employee.getAge()>40)
                    System.out.println(employee);

        }
    }
    class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        @Override
        public String toString(){
            return(name+ "\n-"
                    +position+ "\n-"
                    +email+ "\n-"
                    +phone+ "\n-"
                    +salary+ "\n-"
                    +age);
        }
    }

