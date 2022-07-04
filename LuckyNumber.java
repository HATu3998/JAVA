import java.util.Random;
import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {


        new Scanner(System.in);
        System.out.println("người chơi sẽ được nhập vào một số bất kỳ:");
        play();

    }

    public static void play() {

        int soLanDoan = 0;
        int nhoHon = 0;
        int lonHon = 0;
        int doanDung = 0;
        int myNumber;
        int randomLucky;
        String b;
        Random myRandom = new Random();
        Scanner myScanner = new Scanner(System.in);

do {
    randomLucky = myRandom.nextInt(101); //random số may mắn
    do {
        System.out.print("Nhập số bạn chọn :");
        myNumber = myScanner.nextInt(); //số chọn
        ++soLanDoan;
        if (myNumber == randomLucky) {  //số đoán và số random giống nhau
            System.out.println("Chúc mừng bạn đã đoán đúng con số may mắn sau " + soLanDoan + " lần");
            ++doanDung;   break;
        } else if (myNumber > randomLucky) {
            System.out.println("số may mắn  là :" + randomLucky);
            System.out.println("số may mắn nhỏ hơn số dự đoán của bạn.");
            ++nhoHon;   break;
        } else {
            System.out.println("số may mắn  là :" + randomLucky);
            System.out.println("số may mắn lớn hơn số dự đoán của bạn. ");
            ++lonHon;   break;
        }

    } while (myNumber != randomLucky); //số đoán và số random khác nhau thì sẽ tiếp tục vòng lặp
    //hỏi người chơi tiếp tục không
    System.out.println("bạn có muốn tiếp tục không");
    System.out.println("nhập 'Yes,y,co' để tiếp tục, nhập phím bất kỳ để kết thúc games");
    b = myScanner.next();

}while (b.equals("Yes") || b.equals("yes") || b.equals("y") || b.equals("Y")|| b.equals("YES") || b.equals("co") );

//tổng kết
        System.out.println("Chúc mừng bạn đã kết thúc game sau " + soLanDoan+ " lần");
        System.out.println("số lần bạn đoán đúng là " + doanDung + " lần");
        System.out.println("số may mắn nhỏ hơn số dự đoán của bạn " + nhoHon + " lần");
        System.out.println("số may mắn lớn hơn số dự đoán của bạn " + lonHon + " lần");

    }

}
