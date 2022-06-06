
import java.io.*;
        import java.util.Properties;
public class PropertyUtils {
    private static final String propertiesName = "test.properties";
    private static Properties prop = new Properties();
    static {
        InputStream is = null;
        try {
            is = PropertyUtils.class.getClassLoader().getResourceAsStream(propertiesName);
            if (is != null){
                System.out.println("is is not null");
            } else{
                System.out.println("is ==null");
            }
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String getPropery(String key) {
        return prop.getProperty(key);
    }
    public void writeProperty(String key, String value) {
        InputStream is = null;
        OutputStream os = null;
        Properties p = new Properties();
        try {
            is = new FileInputStream(propertiesName);
            p.load(is);
            os = new FileOutputStream(PropertyUtils.class.getClassLoader().getResource(propertiesName).getFile());
            p.setProperty(key, value);
            p.store(os, key);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is)
                    is.close();
                if (null != os)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String getLogUrl(){
        String path=PropertyUtils.class.getClassLoader().getResource("").getPath();
        return path.substring(0,path.indexOf("QCMS"));
    }
    public static void main(String[] args) {
        System.out.println(PropertyUtils.getPropery("user.name"));
    }
}

