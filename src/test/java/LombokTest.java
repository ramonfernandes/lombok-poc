import com.Student;
import com.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LombokTest {

    @Test
    public void shouldHaveGetterAndSetter() {
        Student student = new Student();

        Assertions.assertNull(student.getName());
        Assertions.assertNull(student.getAge());

        student.setName("Ramon");
        student.setAge("25");

        Assertions.assertNotNull(student.getName());
        Assertions.assertNotNull(student.getAge());
    }

    @Test
    public void shouldHaveAllArgsConstructor() {
        Student student = new Student("Ramon", "25");

        Assertions.assertNotNull(student.getName());
        Assertions.assertNotNull(student.getAge());
    }

    @Test
    public void shouldHaveGetterAndSetterOnDataAnnotation() {
        Teacher teacher = new Teacher();

        Assertions.assertNull(teacher.getName());
        Assertions.assertNull(teacher.getAge());

        teacher.setName("Ramon");
        teacher.setAge("25");

        Assertions.assertNotNull(teacher.getName());
        Assertions.assertNotNull(teacher.getAge());
    }

}
