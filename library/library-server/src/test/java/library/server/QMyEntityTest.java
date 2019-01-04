package library.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import library.server.MyEntity;

/**
 * Problem when introducing buildship. This helps to check if eclipse can access the generated classes.
 */
@RunWith(MockitoJUnitRunner.class)
public class QMyEntityTest {

    @Test
    public void testQueryDsl() {
        // check compilation
        System.out.println(QMyEntity.myEntity);
        System.out.println(new MyEntity().getField1());
        System.out.println(new QMyEntity("test").field1);
    }

}

