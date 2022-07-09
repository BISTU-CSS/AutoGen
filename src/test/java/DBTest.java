import com.Entity.Device;
import com.officeapi.ExportDevice;
import com.util.DBUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.*;

public class DBTest {
    @Before
    public void setUp() throws Exception {
        
    }

    @Test
    public void select521aTest() throws SQLException {
        String str = DBUtil.select521a("11-3XX0-2");
        System.out.println(str);
    }

    @Test
    public void select521listTest() throws SQLException {
        List<String> list = DBUtil.select521list("11-3XX0-1","12-3XX0-1","13-3XX0-1");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

    @Test
    public void exportExcelTest() {
        List<Device>deviceList = new ArrayList<>();
        Device device = new Device(1,"服务器密码机","奇安信","QuickHSM-HS1000","1、遵循GM/T 0030-2014《服务器密码机技术规范》、GM/T 0028-2014《密码模块安全技术要求》和GM/T 0059-2018《服务器密码机检测规范》；\n" +
                "2、支持SM1、SM2、SM3、SM4等国产密码算法；支持RSA、AES、3DES、MD5、SHA等国际算法；\n" +
                "3、具有商用密码产品认证证书；\n" +
                "4、密码运算：支持数据加密/解密、数字签名/验签、消息鉴别码的产生/验证、数字信封、密钥协商等类型的密码运算，并且支持多任务并发访问；\n" +
                "5、密钥管理：支持至少三层密钥结构，支持管理密钥、用户密钥、设备密钥、密钥加密密钥、会话密钥的管理，支持对称与非对称密钥的生成及管理；\n" +
                "6、密钥安全存储：支持100对SM2非对称密钥、100对RSA非对称密钥、200个对称密钥，并使用管理密钥加密存储；\n" +
                "7、随机数产生：采用双路国家密码管理局批准的物理噪声源随机数芯片；\n" +
                "8、访问控制：支持管理员、操作员角色，分别赋予不同的操作权限，并采用数字签名技术，实现对登录用户的强身份认证；\n" +
                "9、多种接口：同时支持SDF、JCE、PKCS11接口，具有良好的通用性。","硬件","标准2U机架式设备，128G SSD存储，2个10/100/1000Mbps自适应网口，1个Console口。\n" +
                "SM4加解密性能≥800Mbps\n" +
                "SM3杂凑性能≥400Mbps\n" +
                "SM2密钥对生产性能≥14000TPS\n" +
                "SM2签名性能≥12000TPS\n" +
                "最大并发连接数≥5000",2,"台","提供三年免费升级维保(超出维保期，维保期之后的维保费用为签订合同金额的12%）","单价","总价","备注");
        deviceList.add(device);
        deviceList.add(device);
        deviceList.add(device);
        deviceList.add(device);
        ExportDevice.exportExcel(deviceList);
    }


}
