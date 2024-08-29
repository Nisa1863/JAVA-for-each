//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "strawbery", "orange"};
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        /* baska bir yontem ama bu yontemde
        sayisal sayac bildirmemize gerek yok
         */
for (String x :fruits)
    /* usteki satir fruits dizisi uzerindeki her
    eleman icin dongunun calistirilacagini brlirtir
     */
    System.out.println(x);
    /*dongu her calistiginda x dizisindeki
    bir sonraki elemani alir ve elema ekrana yazdirilir
     */
        /*peki neden kullaniyoruz ve neden kullanmaliyiz
        Diziyi veya koleksiyonu dolaşmak için sayaç
        değişkeni (i gibi) kullanmanıza gerek yoktur.
         */

    }

}