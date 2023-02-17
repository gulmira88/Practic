import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        EducationCenter educationCenter = new University("BFET", "Kyrgyzstan",
                LocalDate.of(2005, 9, 12));
        {
            EducationCenter educationCenter1 = new University("Manas", "Kyrgyzstan",
                    LocalDate.of(1993, 4, 22));
            EducationCenter educationCenter2 = new University("KNU", "Kyrgyzstan",
                    LocalDate.of(1989, 5, 11));


        }

        Student[] students = {new Student("Asan", "Akmatov", "M",
                LocalDate.of(2005, 9, 01), educationCenter),
                new Student("Ayday", "Jumakova", "F",
                        LocalDate.of(2006, 9, 03), educationCenter),
                new Student("Kalys", "Kalykov", "M",
                        LocalDate.of(2003, 4, 04), educationCenter),
                new Student("Kayrat", "Bekov", "M",
                        LocalDate.of(2005, 4, 07), educationCenter),
                new Student("Elzat", "Tilekova", "F",
                        LocalDate.of(2003, 4, 04), educationCenter),
                new Student("Sanjar", "Kadyrov", "M",
                        LocalDate.of(2003, 1, 05), educationCenter),
                new Student("Asel", "Apyshova", "F",
                        LocalDate.of(2008, 3, 02), educationCenter),
                new Student("Rima", "Tolokova", "F",
                        LocalDate.of(2003, 4, 04), educationCenter),
                new Student("Samat", "Sydykov", "M",
                        LocalDate.of(2001, 4, 02), educationCenter),
                new Student("Asema", "Kanotova", "F",
                        LocalDate.of(2003, 4, 06), educationCenter)};

        myMethod(students);
    }
    public static void myMethod(Student[]students){
        for (Student s: students) {
            System.out.println("Year:"+ Period.between (s.getDateOfStart(),LocalDate.now()).getYears());
            System.out.println("name:"+s.getName()+ s.getGender());

        }




        }
    }