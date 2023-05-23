import com.xsy.springioc.bean.AnnotationApplicationContext;
import com.xsy.springioc.controller.UserController;
import org.junit.jupiter.api.Test;

public class TestUser {
    @Test
    public void test(){
        AnnotationApplicationContext applicationContext = new AnnotationApplicationContext("com.xsy.springioc");
        UserController userController = (UserController) applicationContext.getBean(UserController.class);
        userController.add();
    }
}