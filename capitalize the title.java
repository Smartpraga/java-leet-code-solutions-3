class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            
            if (word.length() > 2) {
                // Capitalize first letter, keep rest lowercase
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1));
            } else {
                // Keep the whole word lowercase
                result.append(word);
            }

            // Add space between words, but not after the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}