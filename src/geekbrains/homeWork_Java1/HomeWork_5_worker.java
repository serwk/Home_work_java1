package geekbrains.homeWork_Java1;

/**
 Java. Level 1. Home work 5.

 @author Sergey Bondarenko
 @version dated Jan 28, 2019
 */

public class HomeWork_5_worker {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private int salaryEarned;
    private int age;

    HomeWork_5_worker(String fio, String position,String email, String phoneNumber, int salaryEarned,int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salaryEarned = salaryEarned;
        this.age = age;
    }

    void setFio(String fio) {
        if (fio != null) {
            this.fio = fio;
        }
    }

    String getFio() {
        return fio;
    }

    void setPosition(String position) {
        if (position != null) {
            this.position = position;
        }
    }

    String getPosition() {
        return position;
    }

    void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    String getEmail() {
        return email;
    }

    void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        }
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setSalaryEarned(int salaryEarned) {
        this.salaryEarned = salaryEarned;
    }

    int getSalaryEarned() {
        return salaryEarned;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "fio: " + fio + ", " + position + ", " + " email: " + email + ", " + "tel.: " + phoneNumber + ", "
                + "salary earned: " + salaryEarned + ", " + "age: " + age;
    }
}
