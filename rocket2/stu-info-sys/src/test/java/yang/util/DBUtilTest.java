package yang.util;

import org.junit.Assert;
import org.junit.Test;
import yang.util.DBUtil;

public class DBUtilTest {
    @Test
    public void testConnetion(){
        Assert.assertNotNull(DBUtil.getConnection());
    }
}
