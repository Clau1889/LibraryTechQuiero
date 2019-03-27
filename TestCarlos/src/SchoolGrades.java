public class SchoolGrades {
    private int age;

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    /*Control_sentences using conditions
     * First Example:  IF-ELSE IF- ELSE
     *  US-GRADES */
    public SchoolGrades (int age) {
        setAge(age);
    }

    public SchoolGrades () {
    }

    public void knowingMyGrade(int myAge) {
        setAge(myAge);
        if (getAge() < 3) {
            System.out.println("Sorry!, You cannot be in school yet.");
        } else if (getAge() >= 3 && getAge() <= 5) {
            System.out.println("Nice!, You are in Pre-school.");
        } else if (getAge() == 6) {
            System.out.println("Amazing!, You are officially in Kindergarten.");
        } else if (getAge() > 6 && getAge() <= 11) {
            System.out.println("Awesome!, You are in Elementary School");
        } else if (getAge() > 11 && getAge() <= 15) {
            System.out.println("Great!, You are a fantastic teenager and you are in Middle School");
        } else if (getAge() > 15 && getAge() <= 18) {
            System.out.println("Wow! You are almost done. You are in High School");
        } else if (getAge() > 18 && getAge() <= 22) {
            System.out.println("Nice Job!, Right now you are in College");
        } else {
            System.out.println("Wonderful!, You are at University.");
        }
    }


    public void knowingMyGrade() {
        if (getAge() < 3) {
            System.out.println("Sorry!, You cannot be in school yet.");
        } else if (getAge() >= 3 && getAge() <= 5) {
            System.out.println("Nice!, You are in Pre-school.");
        } else if (getAge() == 6) {
            System.out.println("Amazing!, You are officially in Kindergarten.");
        } else if (getAge() > 6 && getAge() <= 11) {
            System.out.println("Awesome!, You are in Elementary School");
        } else if (getAge() > 11 && getAge() <= 15) {
            System.out.println("Great!, You are a fantastic teenager and you are in Middle School");
        } else if (getAge() > 15 && getAge() <= 18) {
            System.out.println("Wow! You are almost done. You are in High School");
        } else if (getAge() > 18 && getAge() <= 22) {
            System.out.println("Nice Job!, Right now you are in College");
        } else {
            System.out.println("Wonderful!, You are at University.");
        }
    }


    public static void main(String[] args){
        SchoolGrades grades= new SchoolGrades();
        grades.knowingMyGrade(25);
        System.out.println(grades.getAge());

        SchoolGrades grades1= new SchoolGrades(11);
        grades1.knowingMyGrade();
        System.out.println(grades1.getAge());
    }

}
