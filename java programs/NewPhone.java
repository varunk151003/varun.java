interface Android {
    void display();
    void camera();
    void processor();
    void UI(); 
    void security();   
}

interface Ios{
    void display();
    void camera();
    void processor();
    void UI();
    void security();
}

class Oneplus implements Android{
    public void display(){
        System.out.println("It has 6.14 inch AMOLED Display");
    }

    public void camera(){
        System.out.println("It has 64MP Enhanced AI integrated camera by Hazzleblade");
    }

    public void processor(){
        System.out.println("It has Quallcom Snapgragon 8502 processor");
    }

    public void UI(){
        System.out.println("It has Android 12 User Interface");
    }

    public void security(){
        System.out.println("It has Enhanced Face lock capability and version 5.1.1 Biometrics security and several other facilities like Find my Device and Nearby share etc");
    }

    public void getDetails(){
        display();
        camera();
        processor();
        UI(); 
        security();   
    }

    

}

class Nothing implements Android{

    public void display(){
        System.out.println("It has 6.58 inch AMOLED Display");
    }

    public void camera(){
        System.out.println("It has 108MP Enhanced AI integrated camera by Harman Kardon");
    }

    public void processor(){
        System.out.println("It has Quallcom Snapgragon 5302 gaming processor");
    }

    public void UI(){
        System.out.println("It has Android 11 User Interface");
    }

    public void security(){
        System.out.println("It has AI integrated Face lock capability and version 3.1 Biometrics security and several other facilities like Find my Device and Nearby share etc");
    }

    public void getDetails(){
        display();
        camera();
        processor();
        UI(); 
        security();   
    }



}

class Nokia implements Android{

    public void display(){
        System.out.println("It has 6.24 inch AMOLED Display");
    }

    public void camera(){
        System.out.println("It has 86MP Enhanced AI integrated camera by Hazzleblade");
    }

    public void processor(){
        System.out.println("It has Quallcom Snapgragon 8504 processor");
    }

    public void UI(){
        System.out.println("It has Android 12 User Interface in addition with Nokia Interface");
    }

    public void security(){
        System.out.println("It has Face lock capability and version 5.1.1 Biometrics security and several other facilities like Find my Device Nokia cloud Storage Facilities etc");
    }

    public void getDetails(){
        display();
        camera();
        processor();
        UI(); 
        security();   
    }



}

class S12 implements Ios{

    public void display(){
        System.out.println("It has 5.30 inch Low precision OLED Display");
    }

    public void camera(){
        System.out.println("It has 12MP Enhanced AI integrated camera along with sony Sensors");
    }

    public void processor(){
        System.out.println("It has Apple M2 version 2 processor");
    }

    public void UI(){
        System.out.println("It has Ios 16 User Interface");
    }

    public void security(){
        System.out.println("It has Enhanced Face lock capability and voice lock intrgrated with siri and several other facilities like Find my Device, icloud extended storage etc");
    }

    public void getDetails(){
        display();
        camera();
        processor();
        UI(); 
        security();   
    }



}

class M31 implements Ios{

    public void display(){
        System.out.println("It has 6.08 inch Low precision OLED Display along with the pop-up Displat notch at the top");
    }

    public void camera(){
        System.out.println("It has 12MP Enhanced AI integrated camera with sony sensors and has additional features such as Cinematic mode,slow-motin in 4K etc");
    }

    public void processor(){
        System.out.println("It has Apple M2 processor");
    }

    public void UI(){
        System.out.println("It has ios 17 User Interface");
    }

    public void security(){
        System.out.println("It has Enhanced Face lock capability,Type c charging functions and several other facilities like Find my Device, Nearby share and extended icloud storage etc");
    }

    public void getDetails(){
        display();
        camera();
        processor();
        UI(); 
        security();   
    }



}

class Lambo implements Android,Ios{

    public void display() {
        System.out.println("It has 6.08 inch Low precision OLED Display along with the pop-up Displat notch at the top");
    }

    public void camera() {
        System.out.println("It has 12MP Enhanced AI integrated camera with sony sensors and has additional features such as Cinematic mode,slow-motin in 4K etc");
    }

    public void processor() {
        System.out.println("It has Quallcom Snapgragon 5302 gaming processor");
    }

    public void UI() {
        System.out.println("It has ios 17 User Interface");
    }

    public void security() {
        System.out.println("It has Enhanced Face lock capability and voice lock intrgrated with siri and several other facilities like Find my Device, icloud extended storage etc");
    }

    public void getDetails(){
        display();
        camera();
        processor();
        UI(); 
        security();   
    }

}

public class NewPhone {
    public static void main(String[] args) {

        Oneplus op = new Oneplus();
        op.getDetails();

        System.out.println();
        
        Lambo lb = new Lambo();
        lb.getDetails();
        
        System.out.println();
    }


}


    


