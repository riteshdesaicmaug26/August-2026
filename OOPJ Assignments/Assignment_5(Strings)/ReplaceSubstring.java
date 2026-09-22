
public class ReplaceSubstring {

	public static void main(String[] args) {

        String sample = "\"The quick brown fox jumps over the lazy dog";
        String replace = "fox";
        String replaceWith = "cat";
        
        System.out.println("Original string: " + sample);
        
        String result = sample.replace(replace, replaceWith);
        
        System.out.println("New String: " + result);
	}

}
