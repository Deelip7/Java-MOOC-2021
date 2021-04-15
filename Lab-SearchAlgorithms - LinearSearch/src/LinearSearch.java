public class LinearSearch {
    public static void main(String[] args) {
        char letter = 'f';
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',

                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        LinearSearch l = new LinearSearch();

        System.out.println(l.findLetter(letter, letters));
    }

    public int findLetter(char target, char[] data) {

        try{
            for (int i = data.length - 1 ; i >= 0; i--) {
                if (data[i] == target) {
                    return i;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return -1;
    }
}
