

abstract class Iphone {
    abstract void fingerprint();

    abstract void facelock();

    void storage(){
        System.out.println("It has 512GB of storage capacity");
    }

    void camera(){
        System.out.println("It has 12MP of camera Quality");
    }

    void getDisplay(){
        facelock();
        fingerprint();
        storage();
        camera();
    }
}

class Iphone15 extends Iphone{
    void fingerprint(){
        System.out.println("It has 7th generation Biometrics technology");
    }

    void facelock(){
        System.out.println("It has apple AI integrated facelock functionality");
    }

    public static void main(String args[]){
        Iphone15 i15 = new Iphone15();
        i15.getDisplay();
    }
}
