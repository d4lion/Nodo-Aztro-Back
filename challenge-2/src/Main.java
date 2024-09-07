import models.Teacher;
import models.teachers.TitularTeacher;
import models.teachers.TeacherMeanTime;
import models.AdminPersonal;
import models.volunteers.VolunteerMember;
import models.volunteers.VolunteerExternal;

public class Main {
    public static void main(String[] args) {
        VolunteerExternal volunteerExternal = new VolunteerExternal("Juan", "Perez", "123456", "Calle 123", "Bogota");

        System.out.println(volunteerExternal.getVolunteerCity());

        System.out.println("It Works!");
    }
}
