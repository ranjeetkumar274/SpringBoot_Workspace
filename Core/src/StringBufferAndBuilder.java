public class StringBufferAndBuilder {
    public static void main(String[] args){

        StringBuffer str = new StringBuffer("Hello Ashu");
        str = str.append(" Hhahaha");

        System.out.println(str);

        StringBuilder sb = new StringBuilder("Hahahahaha");
        sb.append(" ashu");
        System.out.println(sb);

    }
}
