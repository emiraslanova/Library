public class Kitabxana {
    private String kitabAdi;
    private String yaziciAdi;
    boolean oxunur ;


    public  Kitabxana(String kitabadi, String yaziciAdi) {
        this.kitabAdi = kitabadi;
        this.yaziciAdi = yaziciAdi;
        this.oxunur = oxunur;

    }

    public boolean oxu() {


        if(oxunur){System.out.println("Kitab hal hazirda oxucu terefinden oxunur");
       }else {
         oxunur  = true;
           }
        return false;
    }
          public void tehvilVer() {
            oxunur = false;
            System.out.println("Kitab tehvil alindi");

        }

    public String getKitabAdi() {
       return kitabAdi;
    }
    public void setKitabAdi(String kitabAdi) {
        this.kitabAdi = kitabAdi;
    }
    public String getYaziciAdi() {
        return yaziciAdi;
   }

    public void setYaziciAdi(String yaziciAdi) {
        this.yaziciAdi = yaziciAdi;
    }

   public boolean isOxunur() {
        return oxunur;

        }
    public void setOxunur(boolean oxunur) {
        this.oxunur = oxunur;
       }

        }

