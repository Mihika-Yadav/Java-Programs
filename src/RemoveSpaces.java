public class RemoveSpaces {

    public static void main(String[] args) {
        String str="  M  i hi  k  a   ";
        // trim method only remove spaces from first and last
        String trimStr= str.trim();
        System.out.println(trimStr);

        // replace all whitespaces from the string
        String replaceStr=str.replaceAll("\\s","");
        System.out.println(replaceStr);
    }
}
