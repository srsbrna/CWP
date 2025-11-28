package scoreAnalyzer;

public class accounting {
     public static class Person {
        private String id;
        private String name;
        private String gender;
        private int age;

        public Person(String id, String name, String gender, int age) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }

        public String getInfo() {
            return name + " (" + gender + ", " + age + ")";
        }
    }
    
     public static class Employee extends Person {
        protected String role;

        public Employee(String id, String name, String gender, int age, String role) {
            super(id, name, gender, age);
            this.role = role;
        }

        public String getRole() {
            return role;
        }

        public String getEmployeeInfo() {
            return getInfo() + " | Role: " + role;
        }
    }

    public interface Payable {
        double calculateSalary(Employee emp);
        double calculateSalary(Employee emp, double bonusRate);
    }

    public static class Accounting extends Employee implements Payable {

        public Accounting(String id, String name, String gender, int age) {
            super(id, name, gender, age, "Accounting");
        }

        private boolean hasSpecialAccess() {
            return getId().equals("A001");
        }

        @Override
        public double calculateSalary(Employee emp) {
            if (!hasSpecialAccess()) return 0.0;

            switch (emp.getRole()) {
                case "Staff": return 5000.0;
                case "Manager": return 7000.0;
                default: return 0.0;
            }
        }

        @Override
        public double calculateSalary(Employee emp, double bonusRate) {
            if (!hasSpecialAccess()) return 0.0;

            double base = calculateSalary(emp);
            return base + (base * bonusRate);
        }

        @Override
        public String getEmployeeInfo() {
            return super.getEmployeeInfo() + " | Can calculate salaries for Staff & Manager";
        }
    }
}