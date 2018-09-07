package cn;

public class Test01 {
    public static void main(String[] args){
        String[] wordListOne = {"23/3", "multi-Tier", "30,000", "B-to-B", "jfiaosj", "oiwero", "asdf2134adf"};
        String[] wordListTwo = {"23/3", "multi-Tier", "30,000", "B-to-B", "jfiaosj", "oiwero", "asdf2134adf", "30,000", "B-to-B", "oiwero"};
        String[] wordListThree = {"23/3",  "30,000", "B-to-B", "jfiaosj"};

        int rand1 = (int) (Math.random()*wordListOne.length);
        int rand2 = (int) (Math.random()*wordListTwo.length);
        int rand3 = (int) (Math.random()*wordListThree.length);

        String phrase = wordListOne[rand1] + "---"+wordListTwo[rand2] + "---" + wordListThree[rand3];

        System.out.println(phrase);
    }
}
