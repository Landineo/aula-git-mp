package media.portal;

public class Main {
    public static void main(String[] args) {

        try{
        Runtime run = Runtime.getRuntime();
        int retval = run.exec("identify -verbose /stornext/PRIMARIO/WORK/HIRES/FOTOS/5020450.JPG").waitFor();

        if(retval == 0){
            System.out.println("terminou");
        } else {
            System.out.println("retval = " + retval);
        }
    } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}