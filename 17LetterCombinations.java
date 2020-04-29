class Solution {
    // DFS Recursive Method
    Map<String, String> phone = new HashMap<String, String>() {{
    put("2", "abc");
    put("3", "def");
    put("4", "ghi");
    put("5", "jkl");
    put("6", "mno");
    put("7", "pqrs");
    put("8", "tuv");
    put("9", "wxyz");
  }};
    List<String> output = new ArrayList<String>();
    
    public void getCombinations(String combination, String next_digit){
        if(next_digit.length() == 0){
            output.add(combination);
        }else{
            String digit = next_digit.substring(0,1);
            String letters = phone.get(digit);
            for(int i = 0; i<letters.length(); i++){
                String letter = phone.get(digit).substring(i, i+1);
                getCombinations(combination+letter, next_digit.substring(1));
            }
        }
    }
    public List<String> letterCombinations(String digits) { 
        if(digits.length() !=0){
            getCombinations("", digits);
        }
        return output;
    }
    
    // BFS: Iterative Method
public List<String> letterCombinations(String digits) {
    HashMap<Character, String> phone = new HashMap<>();
    phone.put('2', "abc");
    phone.put('3', "def");
    phone.put('4', "ghi");
    phone.put('5', "jkl");
    phone.put('6', "mno");
    phone.put('7', "pqrs");
    phone.put('8', "tuv");
    phone.put('9', "wxyz");
 
    List<String> output = new ArrayList<>();
    if (digits.length() == 0) {
        return output;
    }
 
    output.add("");
    for(int i = 0; i<digits.length(); i++){
        String letters = phone.get(digits.charAt(i));
        List<String> temp = new ArrayList<String>();
        for(int j = 0; j<output.size() ; j++){
            for(int k = 0; k<letters.length(); k++){
                temp.add(new StringBuilder(output.get(j)).append(letters.charAt(k)).toString());
            }
        }
        output.clear();
        output.addAll(temp);
    }
 
    return output;
}
    
    
}
