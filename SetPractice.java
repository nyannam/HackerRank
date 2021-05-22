import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        List<Character> characterList = new ArrayList<>();

        characterList.add('A');
        characterList.add('B');
        characterList.add('D');
        characterList.add('A');
        characterList.add('C');
        characterList.add('Z');
        characterList.add('F');
        characterList.add('C');
        System.out.println(characterList);

        Set<Character> treeSet = new TreeSet<>(characterList);
        System.out.println(treeSet);
        Set<Character> linkedHashSet = new LinkedHashSet<>(characterList);
        System.out.println(linkedHashSet);
        Set<Character> hashSet = new HashSet<>(characterList);
        System.out.println(hashSet);



    }
}
