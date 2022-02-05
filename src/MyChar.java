public class MyChar {
    private char ch;

    MyChar(char ch){
        this.ch = ch;
    }

    public boolean isVowel(){
        if(ch == 'a' || ch =='A')
            return  true;
        if(ch == 'e' || ch =='E')
            return  true;
        if(ch == 'i' || ch =='I')
            return  true;
        if(ch == 'o' || ch =='O')
            return  true;
        if(ch == 'u' || ch =='U')
            return  true;
        return  false;
    }

    public boolean isDigit(){
        if(ch >= 48 && ch <= 57)
            return  true;
        return false;
    }

    public  boolean isConsonant(){
        if(!isVowel() && !isDigit())
            return true;
        return  false;
    }

    public  static void printLowerAlphabet(){
        for(char ch = 'a'; ch <= 'z'; ch++)
            System.out.println(ch);
    }
}
