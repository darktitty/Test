package cn;

class Test03 {
    boolean topHat = true;
    boolean snare = true;
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
}

class Test03Demo{
    public static void main(String[] args){
        Test03 d = new Test03();
        if(d.snare == true){
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();
    }
}
