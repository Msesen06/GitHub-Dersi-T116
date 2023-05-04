package day01;

public class C01 {
    public static void main(String[] args) {

        //C:\Users\HP\Desktop\GithubDersi
        System.out.println("merhaba");
        System.out.println("merhaba ");


        // git init komutu ile birlikte bir workindirectory i git ile irtibatlandirir
        // bu komut her proje icin bir kez calıstırılır. bu komutla beraber git icinde bulunulan klasoru kontrol
        // etmeye baslar

        // bu klasorde her yedek almak istedigimizde commit yapmalıyız.
        // asagıdaki  3 komut bizim dosyalarımızı yedekler.
        /*
        1 . ( git add . ) son kaydedilen versiyondan sonra projede yapılan degisiklikleri belirler
        2.  ( git commit -m "commit ismi") :  projenin son durumunu bir versiyon olarak kaydeder."" tırnak icinde
        yazılan commit isminin anlamlı olmasında fayda vardır.
        ilerleyen asamalarda hangi commite donmek isteyecegimizi acıklamalardan bulabiliriz.

        git ile ilisiklendiridigimiz dosyadaki class isimleri git durumuna gore renklenir

        kırmızı : bu class herhangi  bir versiyona eklenmedi
        mavi : bu dosya bir versiyona eklendi ama sonradan degisklik yapılmıs
        siyah :bu class bir versiyonda son haliyle yedeklendi
        sonrasında bir degisklik yapılmadi.

        3. git push : local repoda depo commit ettigimiz dosyalarımızı uzak masaustune yollamak icin
        githuba kullanılır


            Local bilgisayarda olusturdugumuz repoyu bir repoyu githuba yollamak ve orda yedeklemek istersek
            oncelikle Github hesabı olusturmamiz ve sonrasında proejemizi gonderecegimiz github reposunu
            hazirlamak gerekiyor

            Githubda yeni bir repository olusturdugumuzda ilk kullanımda local repo ile remote repo arasında
            baglantı kurmamız gerekir

         */
    }
}
