package media.portal;

public class Main {
    public static void main(String[] args) {

        try{
        Runtime run = Runtime.getRuntime();
        int retval = run.exec("identify -verbose /stornext/PRIMARIO/WORK/HIRES/FOTOS/5020450.JPG").waitFor();

        if(retval == 0){
<<<<<<< HEAD
            System.out.println("terminou");
=======
            System.out.println("finalizou");
>>>>>>> 6d14bed8d0f7b6d860e3e58bda3648bdc7636bf4
        } else {
            System.out.println("retval = " + retval);
        }
    } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
